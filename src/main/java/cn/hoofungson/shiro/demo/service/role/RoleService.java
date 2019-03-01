/**
 * @Project Name:shiro-demo
 * @Package Name:cn.hoofungson.shiro.demo.service.role
 * @Since JDK 1.8
 */
package cn.hoofungson.shiro.demo.service.role;

import cn.hoofungson.shiro.demo.model.po.role.RolePO;

import java.util.List;

/**
 * @Description: 角色业务
 * @Author 胡松 hoofungson@163.com
 * @Date 2018-09-13 15:25
 * @Version V1.0
 */
public interface RoleService {

    /********* 常用CURD *******/

    /**
     * 保存实体
     *
     * @param rolePO
     **/
    void save(RolePO rolePO);

    /**
     * 更新实体
     *
     * @param id
     * @param rolePO
     **/
    void update(Long id, RolePO rolePO);

    /**
     * 删除实体
     *
     * @param rolePO
     **/
    void delete(RolePO rolePO);

    /**
     * 获取实体列表
     *
     * @return List<RolePO>
     **/
    List<RolePO> findAll();

    /**
     * 根据ID返回实体
     *
     * @param id
     * @return RolePO
     **/
    RolePO get(Long id);
}
