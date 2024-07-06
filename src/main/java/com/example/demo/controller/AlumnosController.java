package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class AlumnosController {

    @GetMapping("/univer/alumnos")
    public List<String> alumnos(){
     return Arrays.asList("Pedro","Daniel","Laura");
    }
}