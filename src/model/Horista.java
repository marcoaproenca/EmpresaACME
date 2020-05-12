package model;

public class Horista extends Funcionario {
	
	public float valorHora;
	public int   numeroHoras;

	
	public Horista(String nome, int registro, float valorHora, int numeroHoras) {
		super(nome, registro);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calculaSalario() {
		// TODO Auto-generated method stub
		return valorHora * numeroHoras;

	}

	@Override
	public String toString() {
		return "Horista [valorHora=" + valorHora + ", numeroHoras=" + numeroHoras + ", nome=" + nome + ", registro="
				+ registro + "]";
	}

	public float getValorHora() {
		return valorHora;
	}

	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}

	public int getNumeroHoras() {
		return numeroHoras;
	}

	public void setNumeroHoras(int numeroHoras) {
		this.numeroHoras = numeroHoras;
	}

	
}
