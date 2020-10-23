package study.springcloud.consumer.feign;

import org.springframework.boot.SpringApplication;
import study.springcloud.consumer.feign.support.SpringBootCfg;

public class Startup {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCfg.class, args);
    }
}
