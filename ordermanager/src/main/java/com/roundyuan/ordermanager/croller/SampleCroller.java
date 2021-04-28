package com.roundyuan.ordermanager.croller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springcloudalibabademo
 * @description:
 * @author: Mr.Zhangmy
 * @create: 2020-08-05 19:41
 **/
@RestController
@RefreshScope
public class SampleCroller {
    Logger logger = LoggerFactory.getLogger(SampleCroller.class);

    @Value("${user.name}")
    String userName;

    //配置在nacos中 data id =ordermanager.properties  (可以在nacos中导入配置信息)
    @Value("${user.age}")
    int age;

    //http://localhost:8080/user
    @RequestMapping("/user")
    public String simple() {
        logger.info("orderManager server provider . Hello Nacos Config! Hello username ={},age ={}",userName,age);


        return "Hello Nacos Config!" + "Hello " + userName + " " + age ;
    }

}
