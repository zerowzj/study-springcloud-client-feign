package study.springcloud.consumer.feign.controller.greeting;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.springcloud.consumer.feign.support.Results;
import study.springcloud.provider.greeting.GreetingService;

import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    @RequestMapping("/sayHi")
    public Map<String, Object> sayHi() {
        String msg = greetingService.sayHi();
        Map<String, Object> data = Results.data();
        data.put("msg", msg);
        return Results.ok(data);
    }

    @RequestMapping("/sayBye")
    public Map<String, Object> sayBye() {
        String msg = greetingService.sayBye();
        Map<String, Object> data = Results.data();
        data.put("msg", msg);
        return Results.ok(data);
    }
}
