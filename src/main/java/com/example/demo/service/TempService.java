package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.TempDTO;
import com.example.demo.mapper.TempMapper;

@Service
public class TempService {

    @Autowired
    TempMapper tempMapper;

    public ArrayList<TempDTO> getItems() {
        return tempMapper.findAll();
    }
}
