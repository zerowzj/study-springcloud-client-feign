package study.springcloud.consumer.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import study.springcloud.provider.DemoService;

@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @PostMapping("/sayHi")
    public void sayHi() {
       String name= demoService.sayHi("safdasf");
       System.out.println(name);
    }
}
