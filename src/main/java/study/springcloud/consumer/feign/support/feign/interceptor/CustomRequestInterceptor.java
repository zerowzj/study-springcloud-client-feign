package study.springcloud.consumer.feign.support.feign.interceptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.ribbon.LoadBalancerFeignClient;

/**
 * 可以在构造RequestTemplate 请求时，增加或者修改Header, Method, Body 等信息
 */
@Slf4j
public class CustomRequestInterceptor implements RequestInterceptor {

    @Autowired
    LoadBalancerFeignClient loadBalancerFeignClient;

    @Override
    public void apply(RequestTemplate requestTemplate) {
        log.info("global Interceptor");
        String url = requestTemplate.url();
        log.info(">>>>>> {}", url);
    }
}
