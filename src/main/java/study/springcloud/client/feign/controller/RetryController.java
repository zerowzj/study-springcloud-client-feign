package study.springcloud.client.feign.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import study.springcloud.provider.RetryService;

@RestController
public class RetryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(RetryController.class);

    @Autowired
    private RetryService retryService;

    @PostMapping("/retry")
    public void retry(@RequestParam int code) {
        retryService.retry(code);
    }
}
