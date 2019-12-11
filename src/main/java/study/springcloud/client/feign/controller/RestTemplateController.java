package study.springcloud.client.feign.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest")
public class RestTemplateController {

    private static final Logger LOGGER = LoggerFactory.getLogger(RestTemplateController.class);

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/ribbon")
    public String ribbon() {
        String str = restTemplate.postForObject("http://study-springcloud-provider/getServerInfo", null, String.class);
//        String str = restTemplate.postForObject("http://study-springcloud-provider/getServerInfo", null, String.class);
        return str;
    }

    @GetMapping("/sayHi")
    public void sayHi() {
        String str = restTemplate.getForObject("http://www.sohu.com", String.class);
        System.out.println(str);
    }
}
