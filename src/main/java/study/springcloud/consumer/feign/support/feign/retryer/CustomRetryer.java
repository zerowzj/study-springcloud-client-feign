package study.springcloud.consumer.feign.support.feign.retryer;

import feign.RetryableException;
import feign.Retryer;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CustomRetryer implements Retryer {

    @Override
    public void continueOrPropagate(RetryableException ex) {
        log.info("aaaaaaaaaaa");
       throw ex;
    }

    @Override
    public Retryer clone() {
        log.info("ssssssssssss");
        return this;
    }
}
