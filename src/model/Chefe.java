package model;

public class Chefe extends Funcionario {
	public float salario;
	public float adicionalFuncao;
	public float beneficioTerno;

	public Chefe(String nome, int registro, float salario, float adicionalFuncao, float beneficioTerno) {
		super(nome, registro);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calculaSalario() {
		// TODO Auto-generated method stub
		return this.salario += salario * (adicionalFuncao/100) + beneficioTerno;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public float getAdicionalFuncao() {
		return adicionalFuncao;
	}

	public void setAdicionalFuncao(float adicionalFuncao) {
		this.adicionalFuncao = adicionalFuncao;
	}

	public float getBeneficioTerno() {
		return beneficioTerno;
	}

	public void setBeneficioTerno(float beneficioTerno) {
		this.beneficioTerno = beneficioTerno;
	}

	@Override
	public String toString() {
		return "Chefe [salario=" + salario + ", adicionalFuncao=" + adicionalFuncao + ", beneficioTerno="
				+ beneficioTerno + ", nome=" + nome + ", registro=" + registro + "]";
	}

}
