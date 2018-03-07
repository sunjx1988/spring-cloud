package cloud.hystrix.controller;

import cloud.hystrix.feign.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sunjx on 2018/3/7.
 */
@RestController
public class HystrixController {

    @Autowired
    private UserClient userClient;

    @RequestMapping(value = "user/{username}", method = RequestMethod.GET)
    public String queryUserInfo(@PathVariable("username")String userName){
        return userClient.queryUserInfo("hystrix").toString();
    }
}
