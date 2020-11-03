package study.springcloud.consumer.feign.controller.client;

import feign.Client;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.ribbon.LoadBalancerFeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.springcloud.consumer.feign.support.Results;

import java.util.Map;

@Slf4j
@RestController
public class ClientController {

    @Autowired
    private Client client;

    @RequestMapping("/client")
    public Map<String, Object> client() {
        String name = null;
        if (client instanceof LoadBalancerFeignClient) {
            LoadBalancerFeignClient myClient = (LoadBalancerFeignClient) client;
            name = myClient.getDelegate().getClass().getSimpleName();
        } else {
            name = client.getClass().getSimpleName();
        }
        Map<String, Object> data = Results.data();
        data.put("name", name);
        return Results.ok(data);
    }
}
