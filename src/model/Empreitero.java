package model;

public class Empreitero extends Funcionario {
	
	private float valorEmpreitada;

	public Empreitero(String nome, int registro, float valorEmpreitada) {
		super(nome, registro);
		// TODO Auto-generated constructor stub
		this.valorEmpreitada = valorEmpreitada;
	}

	@Override
	public float calculaSalario() {
		// TODO Auto-generated method stub
		return valorEmpreitada;
	}

	@Override
	public String toString() {
		return "Empreitero [valorEmpreitada=" + valorEmpreitada + ", nome=" + nome + ", registro=" + registro + "]";
	}

	public float getValorEmpreitada() {
		return valorEmpreitada;
	}

	public void setValorEmpreitada(float valorEmpreitada) {
		this.valorEmpreitada = valorEmpreitada;
	}

}
