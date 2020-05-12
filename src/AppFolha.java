import model.Funcionario;
import model.Chefe;
import model.Comissionado;
import model.Horista;
import model.Empreitero;
import java.util.ArrayList;

public class AppFolha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Funcionario> folha = new ArrayList<Funcionario>();
		
		folha.add(new Chefe("Marco", 0001, 5000.0f, 10.0f, 1000.0f));
		folha.add(new Horista("Amanda", 0002, 50.0f, 10));
		folha.add(new Comissionado("Maria", 0003, 2500.0f, 50.0f));
		folha.add(new Empreitero("Arthur", 0004, 25000.0f));
		
		for(Funcionario f : folha) {
			System.out.println(f.calculaSalario());
		}
	}

}
