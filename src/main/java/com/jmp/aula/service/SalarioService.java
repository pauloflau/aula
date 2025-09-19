package com.jmp.aula.service;

import org.springframework.stereotype.Service;

import com.jmp.aula.entities.Empregado;

@Service
public class SalarioService {
	ImpostoService imposto ;
	PrevidenciaService previdencia;

	//crio o construtor com parametros pra injetar a dependencia
	public SalarioService(ImpostoService imposto, PrevidenciaService previdencia){
		this.imposto = imposto;
		this.previdencia = previdencia;
	}
	
	public double salarioLiquido(Empregado empregado){
		return empregado.getSalarioBruto() - imposto.taxar(empregado.getSalarioBruto()) - previdencia.descontar(empregado.getSalarioBruto());
	}
}
