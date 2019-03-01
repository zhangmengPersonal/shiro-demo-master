/**
 * @Project Name:shiro-demo
 * @Package Name:cn.hoofungson.shiro.demo.repositories.permission
 * @Since JDK 1.8
 */
package cn.hoofungson.shiro.demo.repositories.permission;

import cn.hoofungson.shiro.demo.model.po.permission.PermissionPO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Description: 权限库
 * @Author 胡松 hoofungson@163.com
 * @Date 2018-09-13 15:21
 * @Version V1.0
 */
@Repository
public interface PermissionRepository extends JpaRepository<PermissionPO, Long> {
}
