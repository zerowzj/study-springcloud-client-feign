package study.springcloud.client.feign.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import study.springcloud.provider.TimeoutService;

@RestController
public class TimeoutController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TimeoutController.class);

    @Autowired
    private TimeoutService timeoutService;

    @PostMapping("/getNextServer")
    public String getNextServer(@RequestParam Long timeout) {
        timeoutService.await(timeout);
        return "";
    }
}
