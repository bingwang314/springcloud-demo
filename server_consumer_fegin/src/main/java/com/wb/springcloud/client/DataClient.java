package com.wb.springcloud.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "TEST-PROVIDER")
@RequestMapping("provider")
public interface DataClient {

    //和调用服务controller的一致
    @RequestMapping("get")
    public String getData();
}