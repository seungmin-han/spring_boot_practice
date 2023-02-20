package com.example.demo.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.TempDTO;

@Mapper
@Repository
public interface TempMapper {
    ArrayList<TempDTO> findAll();    
}
