package Models;

import java.util.Scanner;

public class Emprestimo {
	//<código>;<matrícula-cliente>;<matrícula-funcionário>;<data-empréstimo>;<data-devolução>
	private int codigo;
	private int matriculaCliente;
	private int matriculaFuncionario;
	private String dataEmprestimo;
	private String dataDevolucao;
	
	public Emprestimo(int codigo, int matriculaCliente, int matriculaFuncionario,
			String dataEmprestimo, String dataDevolucao) {
		this.codigo = codigo;
		this.matriculaCliente = matriculaCliente;
		this.matriculaFuncionario = matriculaFuncionario;
		this.dataEmprestimo = dataEmprestimo;
		this.dataDevolucao = dataDevolucao;
	}
	
	public Emprestimo(Scanner escreva) {
		System.out.print("Digite o codigo do emprestimo: ");
		this.codigo =Integer.parseInt(escreva.nextLine());
		System.out.print("Digite a matricula cliente: ");
		this.matriculaCliente =Integer.parseInt(escreva.nextLine());
		System.out.print("Digite a matricula funcionario: ");
		this.matriculaFuncionario =Integer.parseInt(escreva.nextLine());
		System.out.print("Digite o emprestimo: ");
		this.dataEmprestimo = escreva.nextLine();
		System.out.print("Digite a data devolucao: ");
		this.dataDevolucao = escreva.nextLine();
	}
	
	public Emprestimo() {
		// TODO Auto-generated constructor stub
	}

	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	
	public String getDataDevolucao() {
		return this.dataDevolucao;
	}
	
	public void setDataEmprestimo(String dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}
	
	public String getDataEmprestimo() {
		return this.dataEmprestimo;
	}

	public int getCodigo() {
		return this.codigo;
	}
	
	public int getMatriculaCliente() {
		return this.matriculaCliente;
	}
	
	public int getMatriculaFuncionario() {
		return this.matriculaFuncionario;
	}
	
	public void Reescrever(Scanner escreva) {
		System.out.print("Digite o codigo do emprestimo: ");
		this.codigo =Integer.parseInt(escreva.nextLine());
		System.out.print("Digite a matricula cliente: ");
		this.matriculaCliente =Integer.parseInt(escreva.nextLine());
		System.out.print("Digite a matricula funcionario: ");
		this.matriculaFuncionario =Integer.parseInt(escreva.nextLine());
		System.out.print("Digite o emprestimo: ");
		this.dataEmprestimo = escreva.nextLine();
		System.out.print("Digite a data devolucao: ");
		this.dataDevolucao = escreva.nextLine();
	}
	
	//<código>;<matrícula-cliente>;<matrícula-funcionário>;<data-empréstimo>;<data-devolução>
	public String toArquivo() {
		String nomeToArquivo = String.format("%d;%d;%d;%s;%s",this.codigo,this.matriculaCliente,
				this.matriculaFuncionario,this.dataEmprestimo, this.dataDevolucao);
        return nomeToArquivo;
    }
	
	@Override
    public String toString() {
		String nomeToString = String.format("Curso: %d\n Matricula Cliente: %d\n Matricula Funcionario: %d\n"
				+ "Data de Emprestimo: %s\n Data de Devolução: %s\n\n",
				this.codigo, this.matriculaCliente,this.matriculaFuncionario,
				this.dataEmprestimo, this.dataDevolucao);
        return nomeToString;
    }
}
