/**
 * @Project Name:shiro-demo
 * @Package Name:cn.hoofungson.shiro.demo.model.po.user
 * @Since JDK 1.8
 */
package cn.hoofungson.shiro.demo.model.po.user;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @Description: 用户PO
 * @Author 胡松 hoofungson@163.com
 * @Date 2018-09-13 15:07
 * @Version V1.0
 */
@Data
@Entity
@Table(name = "sys_user")
public class UserPO implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "user_name")
    private String userName;
    private String password;
    private String nickName;
    private String realName;
    private String email;
    private String callNumber;
    private String address;
    private String salt;
    private Date createTime;
    private Date updateTime;
}
