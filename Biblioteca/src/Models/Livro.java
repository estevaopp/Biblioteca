package Models;

import java.util.Scanner;

public class Livro extends Item{
	//<c�digo>;<autor(es)>;<t�tulo>;<editora>;<tipo>;<ano de publica��o>;<issn>
	private String editora;
	private int anoDePublicacao;

	public Livro() {
		
	}
	
	public Livro(int codigo, String autor, String titulo, 
			String editora,char tipo, int anoDePublicacao,String issn) {
		super(codigo, autor, titulo, tipo, issn);
		this.editora = editora;
		this.anoDePublicacao = anoDePublicacao;
	}
	
	public Livro(Scanner escreva) {
		super(escreva);
		System.out.print("Digite a editora: ");
		this.editora = escreva.nextLine();
		System.out.print("Digite o ano de publicacao: ");
		this.anoDePublicacao = escreva.nextInt();
		escreva.nextLine();
	}
	
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	public String getEditora() {
		return this.editora;
	}
	
	public void setAnoDePublicacao(int anoDePublicacao) {
		this.anoDePublicacao = anoDePublicacao;
	}

	public int getAnoDePublicacao() {
		return this.anoDePublicacao;
	}
	
	@Override
	public void Reescrever(Scanner escreva) {
		super.Reescrever(escreva);;
		System.out.print("Digite a editora: ");
		this.editora = escreva.nextLine();
		System.out.print("Digite o ano de publicacao: ");
		this.anoDePublicacao = escreva.nextInt();
		escreva.nextLine();
	}
	
	//<c�digo>;<autor(es)>;<t�tulo>;<editora>;<tipo>;<ano de publica��o>;<issn>
	@Override
	public String toArquivo() {
		String nomeToArquivo = String.format("%d;%s;%s;%s;%c;%s;%s",this.getCodigo(),this.getAutor(),
				this.getTitulo(),this.editora,this.getTipo(),this.anoDePublicacao,this.getIssn());
        return nomeToArquivo;
    }
	
	@Override
    public String toString() {
		String nomeToString = super.toString() + String.format("Ano de Publicão: %s\nEditora: %s\n",
				this.anoDePublicacao, this.editora);
        return nomeToString;
    }
}
