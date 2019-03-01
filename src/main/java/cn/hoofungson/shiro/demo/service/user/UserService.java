/**
 * @Project Name:shiro-demo
 * @Package Name:cn.hoofungson.shiro.demo.service.user
 * @Since JDK 1.8
 */
package cn.hoofungson.shiro.demo.service.user;

import cn.hoofungson.shiro.demo.model.po.user.UserPO;

import java.util.List;

/**
 * @Description: 用户业务
 * @Author 胡松 hoofungson@163.com
 * @Date 2018-09-13 15:24
 * @Version V1.0
 */
public interface UserService {

    /********* 常用CURD *******/

    /**
     * 保存实体
     *
     * @param userPO
     **/
    void save(UserPO userPO);

    /**
     * 更新实体
     *
     * @param id
     * @param userPO
     **/
    void update(Long id, UserPO userPO);

    /**
     * 删除实体
     *
     * @param userPO
     **/
    void delete(UserPO userPO);

    /**
     * 获取实体列表
     *
     * @return List<UserPO>
     **/
    List<UserPO> findAll();

    /**
     * 根据ID返回实体
     *
     * @param id
     * @return UserPO
     **/
    UserPO get(Long id);

    /**
     * 根据用户名返回实体
     *
     * @param username
     * @return UserPO
     **/
    UserPO findByUsername(String username);
}
