package br.com.codenation.solid.isp.errado;

public class Desenvolvedor extends Funcionario{

	private double salario;
	
	public Desenvolvedor(double salario) {
		this.salario = salario;
	}
	
	@Override
	public double getSalario() {
		return this.salario;
	}

	@Override
	public double getComissao() {
		return 0d;
	}
}
