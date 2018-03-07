package cloud.hystrix.feign;

import cloud.hystrix.hystrix.HystrixUserClient;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * Created by sunjx on 2018/3/7.
 */
@FeignClient(value = "query-username" ,fallback = HystrixUserClient.class)
public interface UserClient {

    @RequestMapping(value = "user/{username}", method = RequestMethod.GET)
    Map<String,Object> queryUserInfo(@PathVariable("username")String userName);
}
