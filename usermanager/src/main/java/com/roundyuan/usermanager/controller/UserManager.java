package com.roundyuan.usermanager.controller;

import com.roundyuan.usermanager.openfeigndemo.OrderManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: springcloudalibabademo
 * @description:
 * @author: Mr.Zhangmy
 * @create: 2020-08-06 17:00
 **/
@RestController
public class UserManager {
    Logger logger = LoggerFactory.getLogger(UserManager.class);
    @Resource
    private OrderManager orderManager;

    //http://localhost:8083/getConfig
    //通过Feign调用在nacos中注册的ordermanager服务中的/user,具体查看OrderManager接口
    //ordermanager/user
    @RequestMapping("getConfig")
    public String getConfig(){


        String config = orderManager.getConfig();
        logger.info("comsumer to call orderManager provider result = ",config);
        return config;
    }

}
