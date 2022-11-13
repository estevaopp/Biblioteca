import Models.Funcionario;
import Models.Aluno;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario steve = new Funcionario(11111111, "steve", "praia da costa","Adm","Adm","Adm");
		System.out.print(steve.toString());
		Aluno roberto = new Aluno(11111111, "roberto", "praia da costa",
				"Sistemas de Informação","28/07/2005",2222.3);
		System.out.print(roberto.toString());
	}

}
