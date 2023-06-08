package br.com.gestaocontratos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class GestaoContratosApplication {
	@GetMapping
	public String getHomeTeste(){return "Cliente-contrato- API HOME";}
	public static void main(String[] args) {
		SpringApplication.run(GestaoContratosApplication.class, args);
	}

}
