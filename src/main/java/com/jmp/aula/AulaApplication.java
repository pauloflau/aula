package com.jmp.aula;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jmp.aula.entities.Empregado;
import com.jmp.aula.service.SalarioService;

@SpringBootApplication
public class AulaApplication implements CommandLineRunner{

	private SalarioService salarioService;
	
	public AulaApplication(SalarioService salarioService) {
		super();
		this.salarioService = salarioService;
	}

	public static void main(String[] args) {
		SpringApplication.run(AulaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Empregado f = new Empregado("Maria", 4000);
		
		System.out.println("O salario liquido e "+ salarioService.salarioLiquido(f));
		
	}

}
