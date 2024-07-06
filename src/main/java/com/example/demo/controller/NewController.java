package com.example.demo.controller;

import com.example.demo.entity.EstudianteEntity;
import com.example.demo.model.estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.repository.EstudianteRepository;

@Controller
public class NewController {

    @Autowired
    private EstudianteRepository estudianteRepository;

    @GetMapping("/registro")
public String formulario(){
    return "form";

    }
    @PostMapping("/guardado")
    public String success(@ModelAttribute estudiante request){
        System.out.println(request);

        EstudianteEntity estudiante = new EstudianteEntity();

                estudiante.setNombre(request.getName());
        estudiante.setApellido(request.getLastname());
        estudianteRepository.save(estudiante);

        estudiante.setApellido(request.getLastname());


        return "success";
 }

}