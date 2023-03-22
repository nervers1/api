package com.hanwhawm.api.mapper;

import com.hanwhawm.api.domains.CurrentTime;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ApiMapper {
    public CurrentTime currentTime();
}
