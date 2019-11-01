package br.com.codenation.solid.ocp.certo;

public class Produto {

	private String nome;
	private double valor;
	private String estado;
	private int meioPagamento;

	public Produto(String nome, double valor, String estado) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.estado = estado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getMeioPagamento() {
		return meioPagamento;
	}

	public void setMeioPagamento(int meioPagamento) {
		this.meioPagamento = meioPagamento;
	}
	
	
	
}
