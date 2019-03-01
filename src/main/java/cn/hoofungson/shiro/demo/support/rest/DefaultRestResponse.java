/**
 * @Project Name:shiro-demo
 * @Package Name:cn.hoofungson.shiro.demo.support.rest
 * @Since JDK 1.8
 */
package cn.hoofungson.shiro.demo.support.rest;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Description: 默认Rest响应
 * @Author 胡松 hoofungson@163.com
 * @Date 2018-09-13 16:37
 * @Version V1.0
 */
@Data
public class DefaultRestResponse<T extends Serializable> extends RestResponse<T> {

    private List<T> result;
}
