package cloud.hystrix.hystrix;

import cloud.hystrix.feign.UserClient;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sunjx on 2018/3/7.
 */
@Component
public class HystrixUserClient implements UserClient {

    @Override
    public Map<String, Object> queryUserInfo(String userName) {
        Map<String,Object> result = new HashMap<>();
        result.put("error","该服务异常了");
        return result;
    }
}
