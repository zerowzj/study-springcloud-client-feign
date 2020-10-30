package study.springcloud.consumer.feign.support.feign;

import feign.Request;
import feign.Retryer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class FeignClientCfg {

    public static int CONNECT_TIMEOUT_MS = 3 * 1000;

    public static int READ_TIMEOUT_MS = 3 * 1000;

    /**
     * 超时配置
     */
//    @Bean
    public Request.Options options() {
        log.info("");
        return new Request.Options(CONNECT_TIMEOUT_MS, READ_TIMEOUT_MS);
    }

    /**
     * 重试配置
     */
//    @Bean
    public Retryer feignRetryer() {
        Retryer retryer = new Retryer.Default(100, 1000, 4);
        return retryer;
    }
}
