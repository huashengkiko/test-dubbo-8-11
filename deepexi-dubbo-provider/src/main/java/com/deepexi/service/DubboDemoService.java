package com.deepexi.service;

import com.deepexi.api.model.PageDemo;
import com.deepexi.api.model.dto.DubboDemoDTO;
import com.deepexi.api.model.query.DubboDemoQuery;

public interface DubboDemoService {

    PageDemo<DubboDemoDTO> listPage(DubboDemoQuery query);

    DubboDemoDTO get(String id);

}
