/**
 * @Project Name:shiro-demo
 * @Package Name:cn.hoofungson.shiro.demo.model.po.permission
 * @Since JDK 1.8
 */
package cn.hoofungson.shiro.demo.model.po.permission;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @Description: 权限PO
 * @Author 胡松 hoofungson@163.com
 * @Date 2018-09-13 15:16
 * @Version V1.0
 */
@Data
@Entity
@Table(name = "sys_permission")
public class PermissionPO implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    private String url;
    private Long pid;
    private Date createTime;
    private Date updateTime;
}
