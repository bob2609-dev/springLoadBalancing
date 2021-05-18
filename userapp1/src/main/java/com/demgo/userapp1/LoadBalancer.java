package com.demgo.userapp1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RibbonClient(name = "chatbook2", configuration = RibbonConfiguration.class)
//@RequestMapping("/")
public class LoadBalancer {

    @Autowired
    private RestTemplate template1;

    @GetMapping("/invoke2")
    public String invokeChatbook()
    {
        String url = "http://chatbook/chatbook-app/chat";

        return template1.getForObject(url, String.class);
    }

    @Bean
    @LoadBalanced
    public RestTemplate template1()
    {
        return new RestTemplate();
    }


}
