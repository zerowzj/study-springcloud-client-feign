package study.springcloud.client.feign.support;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import study.springcloud.client.feign.support.ribbon.RibbonCfg;

@EnableFeignClients(basePackages = {"study.springcloud.provider"},
        defaultConfiguration = {RibbonCfg.class})
@EnableEurekaClient
@SpringBootApplication(scanBasePackages = "study.springcloud.client.feign")
public class SpringBootCfg {
}
