package cloud.eureka.service;

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
@EnableAutoConfiguration
@ComponentScan("cloud.eureka.controller")
public class ServiceApplicationRun {

    public static void main(String[] args) {
        SpringApplication.run(ServiceApplicationRun.class, args);
    }
}
