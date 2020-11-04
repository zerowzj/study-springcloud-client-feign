package study.springcloud.consumer.feign.controller.retry;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import study.springcloud.provider.timeout.TimeoutService;

@Slf4j
@RestController
@RequestMapping("/retry")
public class RetryController {

    @Autowired
    private TimeoutService timeoutService;

    @GetMapping("/timeoutByGet")
    public void timeoutByGet(@RequestParam long timeout) {
        timeoutService.timeoutByGet(timeout);
    }

    @PostMapping("/timeoutByPost")
    public void timeoutByPost(@RequestParam long timeout) {
        timeoutService.timeoutByPost(timeout);
    }
}
