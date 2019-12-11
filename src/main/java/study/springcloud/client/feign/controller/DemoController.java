package study.springcloud.client.feign.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.springcloud.provider.DemoService;

@RestController
@RequestMapping("/feign")
public class DemoController {

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoController.class);

    @Autowired
    private DemoService demoService;

    @PostMapping("/getServerInfo")
    public String getServerInfo() {
        return demoService.getServerInfo();
    }
}
