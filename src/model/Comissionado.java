package model;

public class Comissionado extends Funcionario {
	private float salario;
	private float comissao;
	
	public Comissionado(String nome, int registro, float salario, float comissao) {
		super(nome, registro);
		// TODO Auto-generated constructor stub
		this.salario  = salario;
		this.comissao = comissao;
	}
	
	@Override
	public float calculaSalario() {
		// TODO Auto-generated method stub
		return this.salario += this.salario * comissao/100;
	}
	
	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}

	@Override
	public String toString() {
		return "Comissionado [salario=" + salario + ", comissao=" + comissao + ", nome=" + nome + ", registro=" + registro + "]";
	}



}
