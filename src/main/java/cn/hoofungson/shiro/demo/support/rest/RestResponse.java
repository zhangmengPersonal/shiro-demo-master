/**
 * @Project Name:shiro-demo
 * @Package Name:cn.hoofungson.shiro.demo.support.rest
 * @Since JDK 1.8
 */
package cn.hoofungson.shiro.demo.support.rest;

import lombok.Data;

/**
 * @Description: Rest响应
 * @Author 胡松 hoofungson@163.com
 * @Date 2018-09-13 16:35
 * @Version V1.0
 */
@Data
public abstract class RestResponse<T> {

    private Boolean status;
    private Integer statusCode;
    private String message;
}
