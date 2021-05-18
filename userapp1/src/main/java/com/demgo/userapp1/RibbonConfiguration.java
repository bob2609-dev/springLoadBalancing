package com.demgo.userapp1;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class RibbonConfiguration {

    @Autowired
    IClientConfig ribbonClient;

    @Bean
    public IPing ping(IClientConfig ribbonClient)
    {
        return new PingUrl();
    }
/*

    @Bean
    public IRule rule(IClientConfig ribbonClient)
    {
        return new AvailabilityFilteringRule();
    }
*/



}
