package com.jmp.aula.service;

import org.springframework.stereotype.Service;

@Service
public class ImpostoService {
	public double taxar(double valor){
		return valor * 0.2;
	}
}
