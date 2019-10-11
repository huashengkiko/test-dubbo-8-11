package com.deepexi.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.deepexi.api.DubboDemoRemoteServiceApi;
import com.deepexi.api.model.PageDemo;
import com.deepexi.api.model.dto.DubboDemoDTO;
import com.deepexi.api.model.query.DubboDemoQuery;
import com.deepexi.service.DubboDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Service(version = "1.0")
public class DubboDemoRemoteServiceApiImpl implements DubboDemoRemoteServiceApi {

    @Autowired
    DubboDemoService service;

    @Override
    public PageDemo<DubboDemoDTO> listPage(DubboDemoQuery query) {
        return service.listPage(query);
    }

    @Override
    public DubboDemoDTO get(String id) {
        return service.get(id);
    }

}
