package com.hanwhawm.api.service.impl;

import com.hanwhawm.api.mapper.ApiMapper;
import com.hanwhawm.api.domains.CurrentTime;
import com.hanwhawm.api.service.ApiService;
import org.springframework.stereotype.Service;

@Service
public class ApiServiceImpl implements ApiService {
    public ApiServiceImpl(ApiMapper mapper) {
        this.mapper = mapper;
    }

    ApiMapper mapper;

    @Override
    public CurrentTime getTime() {
        return mapper.currentTime();
    }
}
