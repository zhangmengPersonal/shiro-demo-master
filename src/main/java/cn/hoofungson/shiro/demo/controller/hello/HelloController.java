/**
 * @Project Name:shiro-demo
 * @Package Name:cn.hoofungson.shiro.demo.controller.hello
 * @Since JDK 1.8
 */
package cn.hoofungson.shiro.demo.controller.hello;

import cn.hoofungson.shiro.demo.support.rest.DefaultRestResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: Hello控制器
 * @Author 胡松 hoofungson@163.com
 * @Date 2018-09-13 18:04
 * @Version V1.0
 */
@RequestMapping(value = "/rest/api/hello")
@RestController
public class HelloController {

    @GetMapping
    public DefaultRestResponse<String> hello() {
        DefaultRestResponse<String> defaultRestResponse = new DefaultRestResponse<>();
        defaultRestResponse.setStatus(true);
        defaultRestResponse.setStatusCode(HttpStatus.OK.value());
        defaultRestResponse.setMessage("数据查询成功");
        List<String> result = new ArrayList<>();
        result.add("Hello World!");
        defaultRestResponse.setResult(result);
        return defaultRestResponse;
    }
}
