package cloud.eureka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sunjx on 2018/3/6.
 */
@RestController
public class UserController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "user/{username}", method = RequestMethod.GET)
    public Map<String,Object> queryUserInfo(@PathVariable("username")String userName){
        ServiceInstance serviceInstance = discoveryClient.getLocalServiceInstance();

        Map<String,Object> result = new HashMap<>();
        result.put("username",userName);
        result.put("host", serviceInstance.getHost());
        result.put("service-id", serviceInstance.getServiceId());
        result.put("meta-data", serviceInstance.getMetadata());
        return result;
    }

}
