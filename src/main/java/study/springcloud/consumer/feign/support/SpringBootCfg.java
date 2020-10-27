package study.springcloud.consumer.feign.support;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

//FeignClient
@EnableFeignClients(basePackages = {"study.springcloud.provider"})
//服务注册和发现
@EnableEurekaClient

@SpringBootApplication(scanBasePackages = "study.springcloud.consumer.feign")
public class SpringBootCfg {
}
