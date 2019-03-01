/**
 * @Project Name:shiro-demo
 * @Package Name:cn.hoofungson.shiro.demo.service.role.impl
 * @Since JDK 1.8
 */
package cn.hoofungson.shiro.demo.service.role.impl;

import cn.hoofungson.shiro.demo.model.po.role.RolePO;
import cn.hoofungson.shiro.demo.repositories.role.RoleRepository;
import cn.hoofungson.shiro.demo.service.role.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @Description: 角色业务实现
 * @Author 胡松 hoofungson@163.com
 * @Date 2018-09-13 15:26
 * @Version V1.0
 */
@Transactional
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    /**
     * 保存实体
     *
     * @param rolePO
     **/
    @Override
    public void save(RolePO rolePO) {
        Assert.notNull(rolePO, "保存实体不能为空");
        this.roleRepository.save(rolePO);
    }

    /**
     * 更新实体
     *
     * @param id
     * @param rolePO
     **/
    @Override
    public void update(Long id, RolePO rolePO) {
        Assert.notNull(this.roleRepository.getOne(id), "更新时该实体不存在");
        this.roleRepository.save(rolePO);
    }

    /**
     * 删除实体
     *
     * @param rolePO
     **/
    @Override
    public void delete(RolePO rolePO) {
        this.roleRepository.delete(rolePO);
    }

    /**
     * 获取实体列表
     *
     * @return List<RolePO>
     **/
    @Override
    public List<RolePO> findAll() {
        return this.roleRepository.findAll();
    }

    /**
     * 根据ID返回实体
     *
     * @param id
     * @return RolePO
     **/
    @Override
    public RolePO get(Long id) {
        return this.roleRepository.getOne(id);
    }
}
