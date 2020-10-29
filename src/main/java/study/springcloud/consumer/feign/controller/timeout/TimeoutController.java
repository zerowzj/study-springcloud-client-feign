package study.springcloud.consumer.feign.controller.timeout;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import study.springcloud.provider.timeout.TimeoutService;

@Slf4j
@RestController
public class TimeoutController {

    @Autowired
    private TimeoutService timeoutService;

    @PostMapping("/timeout")
    public String timeout(@RequestParam Long timeout) {
        timeoutService.timeout(timeout);
        return "ok";
    }
}
