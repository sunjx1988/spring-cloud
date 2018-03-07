package cloud.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by sunjx on 2018/3/7.
 */
@RestController
public class RibbonController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "u/{username}", method = RequestMethod.GET)
    public String user(@PathVariable("username")String username){
        return restTemplate.getForEntity("http://localhost:8001/user/info", String.class).getBody();
    }
}
