package model;

public class Chefe extends Funcionario {
	private float salario;
	private float adicionalFuncao;
	private float beneficioTerno;

	public Chefe(String nome, int registro, float salario, float adicionalFuncao, float beneficioTerno) {
		super(nome, registro);
		// TODO Auto-generated constructor stub
		this.salario         = salario;
		this.adicionalFuncao = adicionalFuncao;
		this.beneficioTerno  = beneficioTerno; 
	}

	@Override
	public float calculaSalario() {
		// TODO Auto-generated method stub
		return this.salario + (this.salario * this.adicionalFuncao/100) + this.beneficioTerno;
	}

	public float getSalario() {
		return this.salario;
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
