package Models;

import java.util.ArrayList;
import java.util.Scanner;

public class Aluno extends Pessoa {
	//<matr�cula>;<nome>;<endere�o>;<curso>;<data-ingresso>;<multa>
	private String dataIngresso;
	private String curso;
	private double multa;
	
	public Aluno(int matricula, String nome, String endereco,
			String curso, String dataIngresso, double multa) {
		super(matricula, nome, endereco);
		this.curso = curso;
		this.multa = multa;
		this.dataIngresso = dataIngresso;
	}
	
	public Aluno(Scanner escreva) {
		super(escreva);
		System.out.print("Digite a data ingresso: ");
		this.dataIngresso = escreva.nextLine();
		System.out.print("Digite o curso: ");
		this.curso = escreva.nextLine();
		System.out.print("Digite o multa: ");
		this.multa = escreva.nextDouble();
		escreva.nextLine();
	}
	
	public Aluno() {
		// TODO Auto-generated constructor stub
	}

	public void setDataIngresso(String dataIngresso) {
		this.dataIngresso = dataIngresso;
	}
	
	public String getDataIngresso() {
		return this.dataIngresso;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public String getCurso() {
		return this.curso;
	}

	public void setMulta(double multa) {
		this.multa = multa;
	}

	public double getMulta() {
		return this.multa;
	}
	
	public boolean hasMulta() {
		if (this.multa > 0) {
			return true;
		}
		return false;
	}
	
	public static Aluno ProcurarMatricula(ArrayList<Aluno> listaDeAluno, int matricula) {
		Aluno aluno = listaDeAluno.stream()
				  .filter((a) -> a.getMatricula() == matricula)
				  .findFirst()
				  .orElse(null);
		return aluno;
	}
	
	public void EmitirMulta() {
		String nomeToString = String.format("Nome: %s\nMulta: %.2f\n",
				this.getNome(), this.multa);
		System.out.println(nomeToString);
	}
	
	@Override
	public void Reescrever(Scanner escreva) {
		super.Reescrever(escreva);
		System.out.print("Digite a data ingresso: ");
		this.dataIngresso = escreva.nextLine();
		System.out.print("Digite o curso: ");
		this.curso = escreva.nextLine();
		System.out.print("Digite o multa: ");
		this.multa = escreva.nextDouble();
		escreva.nextLine();
	}
	
	@Override
	public String toArquivo() {
		String nomeToArquivo = String.format("%d;%s;%s;%s;%s;%.2f",this.getMatricula(),this.getNome(),
				this.getEndereco(),this.curso, this.dataIngresso,this.multa);
        return nomeToArquivo;
    }
	
	
	@Override
    public String toString() {
		String nomeToString = super.toString() + String.format("Curso: %s\n Data Ingresso: %s\nMulta: %.2f\n",
				this.curso, this.dataIngresso, this.multa);
        return nomeToString;
    }
}
