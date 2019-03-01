/**
 * @Project Name:shiro-demo
 * @Package Name:cn.hoofungson.shiro.demo.repositories.user
 * @Since JDK 1.8
 */
package cn.hoofungson.shiro.demo.repositories.user;

import cn.hoofungson.shiro.demo.model.po.user.UserPO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * @Description: 用户库
 * @Author 胡松 hoofungson@163.com
 * @Date 2018-09-13 15:19
 * @Version V1.0
 */
@Repository
public interface UserRepository extends JpaRepository<UserPO, Long> {

    /**
     * 根据用户名返回实体
     *
     * @param username
     * @return UserPO
     **/
    @Query(value = "from UserPO where userName =:username")
    UserPO findByUsername(@Param(value = "username") String username);
}
