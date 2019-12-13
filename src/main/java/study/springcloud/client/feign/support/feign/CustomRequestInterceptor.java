package study.springcloud.client.feign.support.feign;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomRequestInterceptor implements RequestInterceptor {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomRequestInterceptor.class);

    @Override
    public void apply(RequestTemplate requestTemplate) {
        LOGGER.info("=======================");
        LOGGER.info("你好");
        LOGGER.info("=======================");
    }
}
