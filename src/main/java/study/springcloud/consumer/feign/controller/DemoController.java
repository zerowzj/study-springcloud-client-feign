package study.springcloud.consumer.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import study.springcloud.provider.greeting.GreetingService;

@RestController
public class DemoController {

    @Autowired
    private GreetingService greetingService;

    @PostMapping("/sayHi")
    public void sayHi() {
    }
}
