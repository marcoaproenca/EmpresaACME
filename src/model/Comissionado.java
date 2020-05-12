package model;

public class Comissionado extends Funcionario {
	public float salario;
	public float comissao;
	public float beneficioTerno;
	
	public Comissionado(String nome, int registro, float salario, float comissao) {
		super(nome, registro);
		// TODO Auto-generated constructor stub
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

	public float getBeneficioTerno() {
		return beneficioTerno;
	}

	public void setBeneficioTerno(float beneficioTerno) {
		this.beneficioTerno = beneficioTerno;
	}

	@Override
	public String toString() {
		return "Comissionado [salario=" + salario + ", comissao=" + comissao + ", beneficioTerno=" + beneficioTerno
				+ ", nome=" + nome + ", registro=" + registro + "]";
	}



}
