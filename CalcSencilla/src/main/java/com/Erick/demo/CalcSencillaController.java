package com.Erick.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcSencillaController {

    @GetMapping("/")
    public String inicio() {
        return "Calculadora sencilla con Spring Boot";
    }
}
