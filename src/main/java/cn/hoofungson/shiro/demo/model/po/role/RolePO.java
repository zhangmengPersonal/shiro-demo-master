/**
 * @Project Name:shiro-demo
 * @Package Name:cn.hoofungson.shiro.demo.model.po.role
 * @Since JDK 1.8
 */
package cn.hoofungson.shiro.demo.model.po.role;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @Description: 角色PO
 * @Author 胡松 hoofungson@163.com
 * @Date 2018-09-13 15:14
 * @Version V1.0
 */
@Data
@Entity
@Table(name = "sys_role")
public class RolePO implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Date createTime;
    private Date updateTime;
}
