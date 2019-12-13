package study.springcloud.client.feign.support.feign;

import feign.Request;
import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignCfg {

    public static int CONNECT_TIME_OUT_MS = 12 * 1000;

    public static int READ_TIME_OUT_MS = 12 * 1000;

    @Bean
    public Request.Options options() {
        return new Request.Options(CONNECT_TIME_OUT_MS, READ_TIME_OUT_MS);
    }

    @Bean
    public Retryer feignRetryer() {
        Retryer retryer = new Retryer.Default(100, 1000, 4);
        return retryer;
    }
}
