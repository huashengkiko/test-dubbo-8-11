package com.deepexi.api;

import com.deepexi.api.model.PageDemo;
import com.deepexi.api.model.dto.DubboDemoDTO;
import com.deepexi.api.model.query.DubboDemoQuery;

public interface DubboDemoRemoteServiceApi {

    PageDemo<DubboDemoDTO> listPage(DubboDemoQuery query);

    DubboDemoDTO get(String id);

}
