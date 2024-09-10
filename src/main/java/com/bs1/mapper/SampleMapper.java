package com.bs1.mapper;

import com.bs1.dto.SampleDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface SampleMapper {
    void insert(SampleDto dto);

    List<SampleDto> selectAll();

    int delete(String id);
}

