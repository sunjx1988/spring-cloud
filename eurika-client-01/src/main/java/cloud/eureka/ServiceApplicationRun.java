package cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by sunjx on 2018/3/6.
 */
@SpringBootApplication
@EnableEurekaClient
public class ServiceApplicationRun {

    public static void main(String[] args) {
        SpringApplication.run(ServiceApplicationRun.class, args);
    }
}
