package br.com.codenation.solid.srp.certo;

public class RegraVinteDoisEMeioPorcento implements RegraDeCalculo{

	@Override
	public double calcula(Funcionario funcionario) {
		return funcionario.getSalario() - (funcionario.getSalario() * 0.225);
	}

}