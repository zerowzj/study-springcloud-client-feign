package study.springcloud.consumer.feign.support;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = {"study.springcloud.provider"})
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "study.springcloud.client.feign")
public class SpringBootCfg {
}
