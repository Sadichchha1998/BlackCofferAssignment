package com.blackCoffer.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.blackCoffer.entities.DataEntity;
import com.blackCoffer.repositories.DataRepository;

@Service
public class DataService {

    private final DataRepository dataRepository;

    public DataService(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }


    public List<DataEntity> getAllData() {
        return dataRepository.findAll();
    }
}