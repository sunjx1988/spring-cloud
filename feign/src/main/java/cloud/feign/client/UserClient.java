package cloud.feign.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * Created by sunjx on 2018/3/7.
 */
@FeignClient("query-username")
public interface UserClient {

    @RequestMapping(value = "user/{username}",method = RequestMethod.GET)
    Map<String,Object> queryUserInfo(@PathVariable("username")String userName);

}
