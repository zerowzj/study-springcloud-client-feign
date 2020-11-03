package study.springcloud.consumer.feign.controller.lbalance;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.springcloud.consumer.feign.support.Results;
import study.springcloud.provider.server.ServerService;

import java.util.Map;

@Slf4j
@RestController
public class LBalanceController {

    @Autowired
    private ServerService serverService;

    @RequestMapping("/getServerInfo")
    public Map<String, Object> getServerInfo() {
        Map<String, Object> data = serverService.getServerInfo();
        log.info(">>>>>> {}", data);
        return Results.ok(data);
    }
}
