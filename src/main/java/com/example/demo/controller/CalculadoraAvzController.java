package com.example.demo.controller;

import com.example.demo.model.Operacion;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraAvzController {

    @PostMapping(name = "ops")
    public Operacion operaciones(@RequestParam(name = "operacion") Operacion operacion) {

        switch  (operacion.getOp()) {
            case SUMA:
    operacion.setResultado(operacion.getNumeroA()+
            operacion.getNumeroB());
                break;
            case RESTA:
                operacion.setResultado(operacion.getNumeroA()-
                        operacion.getNumeroB());
                break;
            case DIVISION:
                if(operacion.getNumeroA() != 0&& operacion.getNumeroB() != 0) {
                    operacion.setResultado(operacion.getNumeroA() /
                            operacion.getNumeroB());
                }else{

                }
                break;
            case MULTIPLICACION:
                operacion.setResultado(operacion.getNumeroA()*
                        operacion.getNumeroB());
                break;
        }
        return operacion;


    }
}
