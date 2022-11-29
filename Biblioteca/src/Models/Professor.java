package Models;

import java.util.Scanner;

public class Professor extends Pessoa{
	//<matr�cula>;<nome>;<endere�o>;<data-ingresso>;<setor>
	
	private String dataIngresso;
	private String setor;

	
	public Professor(int matricula, String nome, String endereco, String dataIngresso,
			String setor) {
		super(matricula, nome, endereco);
		this.dataIngresso = dataIngresso;
		this.setor = setor;
	}
	
	public Professor(Scanner escreva) {
		super(escreva);
		System.out.print("Digite a data ingresso: ");
		this.dataIngresso = escreva.nextLine();
		System.out.print("Digite o setor: ");
		this.setor = escreva.nextLine();
	}
	
	public Professor() {
		// TODO Auto-generated constructor stub
	}

	public void setDataIngresso(String dataIngresso) {
		this.dataIngresso = dataIngresso;
	}
	
	public String getDataIngresso() {
		return this.dataIngresso;
	}
	
	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	public String getSetor() {
		return this.setor;
	}
	
	@Override
	public void Reescrever(Scanner escreva) {
		super.Reescrever(escreva);;
		System.out.print("Digite a data ingresso: ");
		this.dataIngresso = escreva.nextLine();
		System.out.print("Digite o setor: ");
		this.setor = escreva.nextLine();
	}
	
	@Override
	public String toArquivo() {
		String nomeToArquivo = String.format("%d;%s;%s;%s;%s;%.2f",this.getMatricula(),this.getNome(),
				this.getEndereco(),this.dataIngresso,this.setor);
        return nomeToArquivo;
    }
	
	@Override
    public String toString() {
		String nomeToString = super.toString() + String.format("Setor: %s\nData Ingresso: %s\n",
				this.setor, this.dataIngresso);
        return nomeToString;
    }

}
