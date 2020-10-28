package study.springcloud.consumer.feign.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.springcloud.provider.greeting.GreetingService;

@Slf4j
@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    @RequestMapping("/sayHi")
    public String sayHi() {
        greetingService.sayHi();
        return "hello";
    }

    @RequestMapping("/sayBye")
    public String sayBye() {
        greetingService.sayBye();
        return "byebye";
    }
}
