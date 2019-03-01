/**
 * @Project Name:shiro-demo
 * @Package Name:cn.hoofungson.shiro.demo.controller.auth
 * @Since JDK 1.8
 */
package cn.hoofungson.shiro.demo.controller.auth;

import cn.hoofungson.shiro.demo.support.rest.DefaultRestResponse;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * @Description: 认证控制器
 * @Author 胡松 hoofungson@163.com
 * @Date 2018-09-13 16:32
 * @Version V1.0
 */
@RequestMapping(value = "/rest/api/auth")
@RestController
public class AuthController {

    @PostMapping(value = "login")
    public DefaultRestResponse<String> doLogin(
            @RequestParam(name = "username") String username,
            @RequestParam(value = "password") String password) {
        DefaultRestResponse<String> defaultRestResponse = new DefaultRestResponse<>();
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(username, password);
        subject.login(usernamePasswordToken);
        defaultRestResponse.setStatus(true);
        defaultRestResponse.setStatusCode(HttpStatus.OK.value());
        defaultRestResponse.setResult(new ArrayList<>());
        return defaultRestResponse;
    }
}
