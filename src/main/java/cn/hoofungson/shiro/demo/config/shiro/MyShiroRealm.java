/**
 * @Project Name:shiro-demo
 * @Package Name:cn.hoofungson.shiro.demo.config.shiro
 * @Since JDK 1.8
 */
package cn.hoofungson.shiro.demo.config.shiro;

import cn.hoofungson.shiro.demo.model.po.user.UserPO;
import cn.hoofungson.shiro.demo.service.permission.PermissionService;
import cn.hoofungson.shiro.demo.service.role.RoleService;
import cn.hoofungson.shiro.demo.service.user.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description: 自定义ShiroRealm
 * @Author 胡松 hoofungson@163.com
 * @Date 2018-09-13 15:04
 * @Version V1.0
 */
@Slf4j
public class MyShiroRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private PermissionService permissionService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) authenticationToken;
        String username = usernamePasswordToken.getUsername();
        UserPO userPO = this.userService.findByUsername(username);
        if (null == userPO) {
            throw new AuthenticationException("用户:" + username + " 不存在！");
        }
        //这里盐值可以自定义
        ByteSource credentialsSalt = ByteSource.Util.bytes(userPO.getUserName() + userPO.getSalt());
        //String newPassword = new SimpleHash("MD5", userPO.getPassword(), credentialsSalt, 1024).toHex();
        //log.info("新密码：" + newPassword);
        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(userPO.getUserName(), userPO.getPassword(), credentialsSalt, getName());
        return simpleAuthenticationInfo;
    }
}
