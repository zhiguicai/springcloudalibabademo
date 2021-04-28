package com.roundyuan.usermanager.openfeigndemo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Component
@FeignClient("ordermanager")//对应在nacos中注册的服务名称
public interface OrderManager {
    @RequestMapping("/user")
    public String getConfig();
}
