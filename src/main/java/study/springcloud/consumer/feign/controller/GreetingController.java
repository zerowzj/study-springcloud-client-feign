package study.springcloud.consumer.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.springcloud.provider.greeting.GreetingService;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    @RequestMapping("/sayHi")
    public String sayHi() {
        greetingService.sayBye();
        return "hello";
    }

    @RequestMapping("/sayBye")
    public String sayBye() {
        greetingService.sayBye();
        return "byebye";
    }
}
