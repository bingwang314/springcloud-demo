package com.wb.springcloud.controller;

import com.wb.springcloud.client.DataClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("consumer")
public class DataFeignController {

    @Resource
    private DataClient dataClient;

    @RequestMapping("feignGet")
    public String get(){
        return dataClient.getData();
    }
}
