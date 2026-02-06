package com.Erick.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcSencillaController {

    @GetMapping("/")
    public String inicio() {
        return "Calculadora sencilla solo sumas, restas y multiplicaciones";
    }
    
    @GetMapping("/sum/{a}/{b}")
    public String suma(@PathVariable int a, @PathVariable int b) {
        int resultado = a + b;
        return "El resultado de la suma es... " + resultado;
    }
    
    @GetMapping("/res/{a}/{b}")
    public String resta(@PathVariable int a, @PathVariable int b) {
        int resultado = a - b;
        return "El resultado de la resta es... " + resultado;
    }

    @GetMapping("/mul/{a}/{b}")
    public String multiplicacion(@PathVariable int a, @PathVariable int b) {
        int resultado = a * b;
        return "El resultado de la multiplicacion es... " + resultado;
    }
}
