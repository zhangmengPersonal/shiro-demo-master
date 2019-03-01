/**
 * @Project Name:shiro-demo
 * @Package Name:cn.hoofungson.shiro.demo.service.user.impl
 * @Since JDK 1.8
 */
package cn.hoofungson.shiro.demo.service.user.impl;

import cn.hoofungson.shiro.demo.model.po.user.UserPO;
import cn.hoofungson.shiro.demo.repositories.user.UserRepository;
import cn.hoofungson.shiro.demo.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @Description: 用户业务实现
 * @Author 胡松 hoofungson@163.com
 * @Date 2018-09-13 15:24
 * @Version V1.0
 */
@Transactional
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    /**
     * 保存实体
     *
     * @param userPO
     **/
    @Override
    public void save(UserPO userPO) {
        Assert.notNull(userPO, "保存实体不能为空");
        this.userRepository.save(userPO);
    }

    /**
     * 更新实体
     *
     * @param id
     * @param userPO
     **/
    @Override
    public void update(Long id, UserPO userPO) {
        Assert.notNull(this.userRepository.getOne(id), "更新时该实体不存在");
        this.userRepository.save(userPO);
    }

    /**
     * 删除实体
     *
     * @param userPO
     **/
    @Override
    public void delete(UserPO userPO) {
        this.userRepository.delete(userPO);
    }

    /**
     * 获取实体列表
     *
     * @return List<UserPO>
     **/
    @Override
    public List<UserPO> findAll() {
        return this.userRepository.findAll();
    }

    /**
     * 根据ID返回实体
     *
     * @param id
     * @return UserPO
     **/
    @Override
    public UserPO get(Long id) {
        return this.userRepository.getOne(id);
    }

    /**
     * 根据用户名返回实体
     *
     * @param username
     * @return UserPO
     **/
    @Override
    public UserPO findByUsername(String username) {
//        UserPO userPO = new UserPO();
//        userPO.setUserName(username);
//        Example<UserPO> userPOExample = Example.of(userPO);
//        return this.userRepository.findOne(userPOExample).get();
        return this.userRepository.findByUsername(username);
    }
}
