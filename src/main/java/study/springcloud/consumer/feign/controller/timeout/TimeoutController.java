package study.springcloud.consumer.feign.controller.timeout;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import study.springcloud.consumer.feign.support.Results;
import study.springcloud.provider.timeout.TimeoutService;

import java.util.Map;

@Slf4j
@RestController
public class TimeoutController {

    @Autowired
    private TimeoutService timeoutService;

    @RequestMapping("/timeout")
    public Map<String, Object> timeout(@RequestParam Long timeout) {
        timeoutService.timeout(timeout);
        Map<String, Object> data = Results.data();
        data.put("timeout", timeout);
        return Results.ok(data);
    }
}
