package study.springcloud.consumer.feign.support.feign;

import feign.RetryableException;
import feign.Retryer;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SimpleRetryer implements Retryer {

    @Override
    public void continueOrPropagate(RetryableException ex) {
        ex.printStackTrace();
    }

    @Override
    public Retryer clone() {
        return null;
    }
}
