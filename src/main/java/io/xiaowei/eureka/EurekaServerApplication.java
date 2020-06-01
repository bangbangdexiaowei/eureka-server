package io.xiaowei.eureka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@Slf4j
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(EurekaServerApplication.class, args);
            log.info("Eureka Server Start Success");
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            log.info("Eureka Server Start Fail:{}", e.getMessage());
        }
    }

}
