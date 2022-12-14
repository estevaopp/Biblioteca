package Models;

import java.util.Scanner;

public class Pessoa {
	private String nome;
	private String endereco;
	private int matricula;
	
	public Pessoa() {
		
	}
	
	public Pessoa(int matricula, String nome, String endereco) {
		this.matricula = matricula;
		this.nome = nome;
		this.endereco = endereco;
	}
	
	public Pessoa(Scanner escreva) {
		System.out.print("Digite a matricula: ");
		this.matricula = escreva.nextInt();
		escreva.nextLine();
		System.out.print("Digite o nome: ");
		this.nome = escreva.nextLine();
		System.out.print("Digite o endereço: ");
		this.endereco = escreva.nextLine();
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public int getMatricula() {
		return this.matricula;
	}
	
	public void Reescrever(Scanner escreva) {
		System.out.print("Digite a matricula: ");
		this.matricula = escreva.nextInt();
		escreva.nextLine();
		System.out.print("Digite o nome: ");
		this.nome = escreva.nextLine();
		System.out.print("Digite o endereço: ");
		this.endereco = escreva.nextLine();
	}
	
	public String toArquivo() {
		String nomeToArquivo = String.format("%d;%s;%s",this.getMatricula(),this.getNome(),
				this.getEndereco());
        return nomeToArquivo;
    }
	
	
	@Override
    public String toString() {
		String nomeToString = String.format("\nMatricula: %s\nNome: %s\nEndereço %s\n",
				this.matricula,this.nome, this.endereco);
        return nomeToString;
    }
}
