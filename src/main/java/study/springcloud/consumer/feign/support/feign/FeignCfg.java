package study.springcloud.consumer.feign.support.feign;

import feign.Request;
import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignCfg {

    public static int CONNECT_TIME_OUT_MS = 3 * 1000;

    public static int READ_TIME_OUT_MS = 3 * 1000;

    /**
     * 超时配置
     */
    @Bean
    public Request.Options options() {
        return new Request.Options(CONNECT_TIME_OUT_MS, READ_TIME_OUT_MS);
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
