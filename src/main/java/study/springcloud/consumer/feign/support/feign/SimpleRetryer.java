package study.springcloud.consumer.feign.support.feign;

import feign.RetryableException;
import feign.Retryer;

public class SimpleRetryer implements Retryer {

    @Override
    public void continueOrPropagate(RetryableException ex) {

    }

    @Override
    public Retryer clone() {
        return null;
    }
}
