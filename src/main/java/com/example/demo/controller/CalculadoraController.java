package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {

    @GetMapping("/")
    public String saludito(){
        return "<b> Holiis!!</b><br>" +
                "<div style=\"color:red\">" +
                "Bienvenido al purgatorio </div>";
    }

    @GetMapping("/suma")
    public double suma(@RequestParam(value = "NumA") double a,
                       @RequestParam(value = "NumB") double b){
        return a + b;
    }
    @GetMapping("/resta")
    public double resta(@RequestParam(value = "NumA") double a,
                        @RequestParam(value = "NumB") double b){
        return a - b;
    }

    @GetMapping("/division")
    public double division(@RequestParam(value = "NumA") double a,
                        @RequestParam(value = "NumB") double b){

        return a/b;
    }
    @GetMapping("/multiplicacion")
    public double multiplicacion(@RequestParam(value = "NumA") double a,
                           @RequestParam(value = "NumB") double b){

        return a * b;
    }

    @GetMapping("/porcentaje")
    public double porcentaje(@RequestParam(value = "NumA") double a,
                           @RequestParam(value = "NumB") double b){

        return a*(b/100);

    }

    @GetMapping("/cuadrado")
    public double cuadrado(@RequestParam(value = "NumA") double a){

        return a * a;
    }
}
