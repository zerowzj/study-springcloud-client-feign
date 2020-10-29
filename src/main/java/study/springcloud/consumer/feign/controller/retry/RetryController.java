package study.springcloud.consumer.feign.controller.retry;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import study.springcloud.provider.retry.RetryService;

@Slf4j
@RestController
public class RetryController {

    @Autowired
    private RetryService retryService;

    @PostMapping("/retry")
    public void retry(@RequestParam int code) {
        retryService.retry(code);
    }
}
