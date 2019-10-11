package com.deepexi.service.impl;

import com.deepexi.model.dto.DemoDTO;
import com.deepexi.service.DemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello() {
        return "welcome!";
    }

    @Override
    public DemoDTO get() {
        return new DemoDTO("1","demo","demo-desc");
    }

}
