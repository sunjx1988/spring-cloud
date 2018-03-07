package cloud.feign.controller;

import cloud.feign.client.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sunjx on 2018/3/7.
 */
@RestController
public class UserController {

    @Autowired
    private UserClient userClient;

    @RequestMapping(value = "user",method = RequestMethod.GET)
    public String getUserName(){
        return userClient.queryUserInfo("feign").toString();
    }
}
