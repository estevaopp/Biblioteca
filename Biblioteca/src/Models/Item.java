package Models;

import java.util.Scanner;

public class Item {
	//<c�digo>;<autor(es)>;<t�tulo>;<tipo>;<issn>
	private int codigo;
	private String autor;
	private String titulo;
	private char tipo;
	private String issn;
	
	public Item() {

	}
	
	public Item(int codigo, String autor, String titulo, char tipo, String issn) {
		this.codigo = codigo;
		this.autor = autor;
		this.titulo = titulo;
		this.tipo = tipo;
		this.issn = issn;
	}
	
	public Item(Scanner escreva) {
		System.out.print("Digite a matricula: ");
		this.codigo = escreva.nextInt();
		escreva.nextLine();
		System.out.print("Digite o autor: ");
		this.autor = escreva.nextLine();
		System.out.print("Digite o titulo: ");
		this.titulo = escreva.nextLine();
		System.out.print("Digite o tipo: ");
		this.tipo = escreva.nextLine().charAt(0);
		System.out.print("Digite o issn: ");
		this.issn = escreva.nextLine();
	}
	
	public void Reescrever(Scanner escreva) {
		System.out.print("Digite a matricula: ");
		this.codigo = escreva.nextInt();
		escreva.nextLine();
		System.out.print("Digite o autor: ");
		this.autor = escreva.nextLine();
		System.out.print("Digite o titulo: ");
		this.titulo = escreva.nextLine();
		System.out.print("Digite o tipo: ");
		this.tipo = escreva.nextLine().charAt(0);
		System.out.print("Digite o issn: ");
		this.issn = escreva.nextLine();
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String getAutor() {
		return this.autor;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public void setTipo(char tipo) {
		this.tipo = tipo;
	}
	
	public char getTipo() {
		return this.tipo;
	}
	
	public void setIssn(String issn) {
		this.issn = issn;
	}
	
	public String getIssn() {
		return this.issn;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public String toArquivo() {
		String nomeToArquivo = String.format("%d;%s;%s;%c;%s",this.codigo,this.autor,
				this.titulo,this.tipo,this.issn);
        return nomeToArquivo;
    }
	
	@Override
    public String toString() {
		String nomeToString = String.format("\nCódigo: %s\nTitulo: %s\nAutor: %s\nTipo: %c\nISSN: %s",
				this.codigo, this.titulo, this.autor, this.tipo, this.issn);
        return nomeToString;
    }
}
