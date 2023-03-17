package com.example.obejercicio4;

import com.example.obejercicio4.entities.Laptop;
import com.example.obejercicio4.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObEjercicio4Application {

	public static void main(String[] args) {
	//SpringApplication.run(ObEjercicio4Application.class, args);
            
            ApplicationContext context = SpringApplication.run(ObEjercicio4Application.class, args);
            
            LaptopRepository repository = context.getBean(LaptopRepository.class);
            
            // Crear una laptop
            Laptop laptop1 = new Laptop(null, "Asus", 4500.00, true);
            Laptop laptop2 = new Laptop(null, "Toshiba", 3500.00, true);
            
            // almacenar una laptop
            repository.save(laptop1);
            repository.save(laptop2);
            System.out.println("Num laptops en base de datos: " + repository.findAll().size());
	}

}
