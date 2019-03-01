/**
 * @Project Name:shiro-demo
 * @Package Name:cn.hoofungson.shiro.demo.service.permission.impl
 * @Since JDK 1.8
 */
package cn.hoofungson.shiro.demo.service.permission.impl;

import cn.hoofungson.shiro.demo.model.po.permission.PermissionPO;
import cn.hoofungson.shiro.demo.repositories.permission.PermissionRepository;
import cn.hoofungson.shiro.demo.service.permission.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @Description: 权限业务实现
 * @Author 胡松 hoofungson@163.com
 * @Date 2018-09-13 15:29
 * @Version V1.0
 */
@Transactional
@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionRepository permissionRepository;

    /**
     * 保存实体
     *
     * @param permissionPO
     **/
    @Override
    public void save(PermissionPO permissionPO) {
        Assert.notNull(permissionPO, "保存实体不能为空");
        this.permissionRepository.save(permissionPO);
    }

    /**
     * 更新实体
     *
     * @param id
     * @param permissionPO
     **/
    @Override
    public void update(Long id, PermissionPO permissionPO) {
        Assert.notNull(this.permissionRepository.getOne(id), "更新时实体不能为空");
        this.permissionRepository.save(permissionPO);
    }

    /**
     * 删除实体
     *
     * @param permissionPO
     **/
    @Override
    public void delete(PermissionPO permissionPO) {
        this.permissionRepository.delete(permissionPO);
    }

    /**
     * 获取实体列表
     *
     * @return List<PermissionPO>
     **/
    @Override
    public List<PermissionPO> findAll() {
        return this.permissionRepository.findAll();
    }

    /**
     * 根据ID返回实体
     *
     * @param id
     * @return PermissionPO
     **/
    @Override
    public PermissionPO get(Long id) {
        return this.permissionRepository.getOne(id);
    }
}
