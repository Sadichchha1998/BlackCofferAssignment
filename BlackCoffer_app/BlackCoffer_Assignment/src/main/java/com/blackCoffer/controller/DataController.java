package com.blackCoffer.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blackCoffer.entities.DataEntity;
import com.blackCoffer.service.DataService;

@RestController
@CrossOrigin("http://localhost:5173")
@RequestMapping(path = "/api/data")
public class DataController {

    private final DataService dataService;

    public DataController(DataService dataService) {
        this.dataService = dataService;
    }

    @GetMapping(path = "/each")
    public List<DataEntity> getEach() {
        return dataService.getAllData();
    }
}