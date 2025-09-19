package com.jmp.aula.entities;

public class Empregado {
	private String nome;
	private double salarioBruto;
	public Empregado() {
		// TODO Auto-generated constructor stub
	}
	public Empregado(String nome, double salarioBruto) {
		super();
		this.nome = nome;
		this.salarioBruto = salarioBruto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalarioBruto() {
		return salarioBruto;
	}
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
}
