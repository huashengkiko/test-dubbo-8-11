package com.deepexi.service;

import com.deepexi.model.dto.MQDemoDTO;

public interface MQDemoService {

    void produce(MQDemoDTO dto);

    void consume(MQDemoDTO dto);

}
