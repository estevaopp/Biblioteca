package Models;

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
	
	@Override
	public String toArquivo() {
		String nomeToArquivo = String.format("%d;%s;%s;%s;%s;%.2f\n",this.getMatricula(),this.getNome(),
				this.getEndereco(),this.curso, this.dataIngresso,this.multa);
        return nomeToArquivo;
    }
	
	
	@Override
    public String toString() {
		String nomeToString = super.toString() + String.format("Curso: %s\n Multa: %.2f\n",this.curso, this.multa);
        return nomeToString;
    }
}
