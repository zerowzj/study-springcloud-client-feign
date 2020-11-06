package study.springcloud.consumer.feign.support;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

//
@EnableFeignClients(basePackages = {"study.springcloud.provider"})

@EnableEurekaClient
@SpringBootApplication(scanBasePackages = "study.springcloud.consumer.feign")
public class SpringBootCfg {
}
