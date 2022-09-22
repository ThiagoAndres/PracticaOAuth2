package com.example.PracticaOAuth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class PracticaOAuth2Application {
	/*@RequestMapping("/")
	String LoadPage(){
		return "Mensaje de salida por servidor local";
	}*/

	public static void main(String[] args) {
		SpringApplication.run(PracticaOAuth2Application.class, args);
		System.out.print("Prueba de aplicación");

	}

}
