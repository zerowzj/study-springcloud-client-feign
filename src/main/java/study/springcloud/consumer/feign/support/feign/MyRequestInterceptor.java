package study.springcloud.consumer.feign.support.feign;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.ribbon.LoadBalancerFeignClient;

@Slf4j
public class MyRequestInterceptor implements RequestInterceptor {

    @Autowired
    LoadBalancerFeignClient loadBalancerFeignClient;

    @Override
    public void apply(RequestTemplate requestTemplate) {
        log.info("你好11111111111");
        String url = requestTemplate.url();
        log.info(">>>>>> {}", url);
    }
}
