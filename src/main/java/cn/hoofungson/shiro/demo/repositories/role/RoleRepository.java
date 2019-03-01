/**
 * @Project Name:shiro-demo
 * @Package Name:cn.hoofungson.shiro.demo.repositories.role
 * @Since JDK 1.8
 */
package cn.hoofungson.shiro.demo.repositories.role;

import cn.hoofungson.shiro.demo.model.po.role.RolePO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Description: 角色库
 * @Author 胡松 hoofungson@163.com
 * @Date 2018-09-13 15:20
 * @Version V1.0
 */
@Repository
public interface RoleRepository extends JpaRepository<RolePO, Long> {
}
