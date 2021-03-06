package com.example.Ex11_Model.controller;

import com.example.Ex11_Model.model.Cat;
import com.example.Ex11_Model.repository.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatController {

    @Autowired
    private CatRepository catRepository;

    @GetMapping("api/v1/test")
    public String test() {
        catRepository.save(new Cat("test"));
        return "ok";
    }
}