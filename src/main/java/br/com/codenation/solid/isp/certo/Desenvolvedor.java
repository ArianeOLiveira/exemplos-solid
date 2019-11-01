package br.com.codenation.solid.isp.certo;

public class Desenvolvedor extends Funcionario {

	private double salario;

	public Desenvolvedor(double salario) {
		this.salario = salario;
	}

	@Override
	public double getSalario() {
		return this.salario;
	}

}
