package study.springcloud.client.feign;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import study.springcloud.client.feign.support.SpringBootCfg;

public class Startup {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCfg.class, args);
    }
}
