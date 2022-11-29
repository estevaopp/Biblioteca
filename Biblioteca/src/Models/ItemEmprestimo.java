package Models;

import java.util.ArrayList;
import java.util.Scanner;

public class ItemEmprestimo {
	//<código-item>;<código-empréstimo>;<código-livro>;<código-periódico>;<data-devolução>
	private int codigoItem;
	private int codigoEmprestimo;
	private int codigoLivro;
	private int codigoPeriodico;
	private String dataDevolucao;
	
	public ItemEmprestimo(int codigoItem, int codigoEmprestimo, int codigoLivro,
			int codigoPeriodico, String dataDevolucao) {
		this.codigoItem = codigoItem;
		this.codigoEmprestimo = codigoEmprestimo;
		this.codigoLivro = codigoLivro;
		this.codigoPeriodico = codigoPeriodico;
		this.dataDevolucao = dataDevolucao;
	}
	
	public ItemEmprestimo(Scanner escreva) {
		System.out.print("Digite a data codigo item: ");
		this.codigoItem =Integer.parseInt(escreva.nextLine());
		System.out.print("Digite a data matricula codigo emprestimo: ");
		this.codigoEmprestimo =Integer.parseInt(escreva.nextLine());
		System.out.print("Digite a data matricula codigo livro: ");
		this.codigoLivro =Integer.parseInt(escreva.nextLine());
		System.out.print("Digite o data codigo periodico: ");
		this.codigoPeriodico = Integer.parseInt(escreva.nextLine());
		System.out.print("Digite o data devolucao: ");
		this.dataDevolucao = escreva.nextLine();
	}
	
	public ItemEmprestimo() {
		// TODO Auto-generated constructor stub
	}

	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	
	public String getDataDevolucao() {
		return this.dataDevolucao;
	}
		
	public int getCodigoItem() {
		return this.codigoItem;
	}

	public int getCodigoEmprestimo() {
		return this.codigoEmprestimo;
	}
	
	public int getCodigoLivro() {
		return this.codigoLivro;
	}
	
	public int getCodigoPeriodico() {
		return this.codigoPeriodico;
	}
	
	public static ItemEmprestimo ProcurarCodigoEmprestimo(ArrayList<ItemEmprestimo> listaDeItensEmprestimo, int codigoEmprestimo){
		ItemEmprestimo itemEmprestimo = listaDeItensEmprestimo.stream()
				  .filter((i) -> i.getCodigoEmprestimo() == codigoEmprestimo)
				  .findFirst()
				  .orElse(null);
		return itemEmprestimo;
	}
	
	public void Reescrever(Scanner escreva) {
		System.out.print("Digite a data codigo item: ");
		this.codigoItem =Integer.parseInt(escreva.nextLine());
		System.out.print("Digite a data matricula codigo emprestimo: ");
		this.codigoEmprestimo =Integer.parseInt(escreva.nextLine());
		System.out.print("Digite a data matricula codigo livro: ");
		this.codigoLivro =Integer.parseInt(escreva.nextLine());
		System.out.print("Digite o data codigo periodico: ");
		this.codigoPeriodico = Integer.parseInt(escreva.nextLine());
		System.out.print("Digite o data devolucao: ");
		this.dataDevolucao = escreva.nextLine();
	}
	
	//<código>;<matrícula-cliente>;<matrícula-funcionário>;<data-empréstimo>;<data-devolução>
	public String toArquivo() {
		String nomeToArquivo = String.format("%d;%d;%d;%d;%s",this.codigoItem,this.codigoEmprestimo,
				this.codigoLivro,this.codigoPeriodico, this.dataDevolucao);
        return nomeToArquivo;
    }
	
	@Override
    public String toString() {
		String nomeToString = String.format("Curso: %d\n Matricula Cliente: %d\n Matricula Funcionario: %d\n"
				+ "Data de Emprestimo: %d\n Data de Devolução: %s\n\n",
				this.codigoItem, this.codigoEmprestimo,this.codigoLivro,
				this.codigoPeriodico, this.dataDevolucao);
        return nomeToString;
    }
}
