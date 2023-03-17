
package com.example.obejercicio4.controller;

import com.example.obejercicio4.entities.Laptop;
import com.example.obejercicio4.repository.LaptopRepository;
import java.util.List;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LaptopController {
    
    // atributos
    private LaptopRepository laptopRepository;
    
    // constructores
    public LaptopController(LaptopRepository laptopRepository){
        this.laptopRepository = laptopRepository;
    }
    
    @GetMapping("/api/laptops")
    public List<Laptop> findAll(){
        // recuperar y devolver las laptos de base de datos
        return laptopRepository.findAll();
    }
    
    //Crear una nueva laptop en base de datos
    @PostMapping("/api/laptops")
    public Laptop create(@RequestBody Laptop laptop, @RequestHeader HttpHeaders headers){
        
        System.out.println(headers.get("user-agent"));
        return laptopRepository.save(laptop);
    }
    
}
