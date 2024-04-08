package com.cursojava.curso.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuariosControllers {
    @RequestMapping(value = "prueba")
    public List<String> prueba(){
        return List.of("1", "2", "3");
    }
}
