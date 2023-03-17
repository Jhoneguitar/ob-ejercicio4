
package com.example.obejercicio4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping("/hola")
    public String holaMundo(){
        return "Hola desde el ejercicio 4 de SpringBoot";
    }
    
}
