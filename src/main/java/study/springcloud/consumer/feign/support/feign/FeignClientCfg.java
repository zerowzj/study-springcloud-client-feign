package study.springcloud.consumer.feign.support.feign;

import feign.Logger;
import feign.Request;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class FeignClientCfg {

    public static int CONNECT_TIMEOUT_MS = 5 * 1000;

    public static int READ_TIMEOUT_MS = 3 * 1000;

    /**
     * 超时配置
     */
//    @Bean
    public Request.Options options() {
        return new Request.Options(CONNECT_TIMEOUT_MS, READ_TIMEOUT_MS);
    }

    /**
     * 重试配置
     * period: 初始重试时间间隔，当请求失败后，重试器将会暂停 初始时间间隔(线程 sleep 的方式)后再开始，避免强刷请求，浪费性能
     * maxPeriod:
     * maxAttempts: 最大重试次数
     */
//    @Bean
//    public Retryer retryer() {
//        Retryer retryer = new Retryer.Default(100, 1000, 2);
//        return retryer;
//    }

    /**
     * 打印请求日志
     * <p>
     * NONE: 不记录任何信息
     * BASIE:仅记录请求方法，URL以及响应状态码和执行时间
     * HEADERS:除了记录BASIE级别得信息之外，还会记录请求和响应得头信息
     * FULL：记录所有请求与响应得明细，包括头信息，请求体，元数据等。
     */
    @Bean
    public Logger.Level loggerLevel() {
        return feign.Logger.Level.FULL;
    }
}
