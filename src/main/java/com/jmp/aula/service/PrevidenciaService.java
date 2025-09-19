package com.jmp.aula.service;

import org.springframework.stereotype.Service;

@Service
public class PrevidenciaService {
	
	public double descontar(double valor){
		return valor * 0.1;
	}
}
