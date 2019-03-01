/**
 * @Project Name:shiro-demo
 * @Package Name:cn.hoofungson.shiro.demo.service.permission
 * @Since JDK 1.8
 */
package cn.hoofungson.shiro.demo.service.permission;

import cn.hoofungson.shiro.demo.model.po.permission.PermissionPO;

import java.util.List;

/**
 * @Description: 权限业务
 * @Author 胡松 hoofungson@163.com
 * @Date 2018-09-13 15:27
 * @Version V1.0
 */
public interface PermissionService {

    /********* 常用CURD *******/

    /**
     * 保存实体
     *
     * @param permissionPO
     **/
    void save(PermissionPO permissionPO);

    /**
     * 更新实体
     *
     * @param id
     * @param permissionPO
     **/
    void update(Long id, PermissionPO permissionPO);

    /**
     * 删除实体
     *
     * @param permissionPO
     **/
    void delete(PermissionPO permissionPO);

    /**
     * 获取实体列表
     *
     * @return List<PermissionPO>
     **/
    List<PermissionPO> findAll();

    /**
     * 根据ID返回实体
     *
     * @param id
     * @return PermissionPO
     **/
    PermissionPO get(Long id);
}
