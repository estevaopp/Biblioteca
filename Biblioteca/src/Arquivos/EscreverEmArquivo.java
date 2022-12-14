package Arquivos;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import Models.*;

public class EscreverEmArquivo {
	
	public static void Cadastrar(Aluno cadastro) {
		PrintWriter arquivo = null;
		try {
			FileWriter out = new FileWriter("alunos.txt",true); 
			arquivo = new PrintWriter(out);
			arquivo.println(cadastro.toArquivo());

			System.out.printf("Cadastro realizado com sucesso\n");  
			
		}catch (Exception e){ 
			System.out.println(e);
		}finally{ 
			arquivo.close();
		}
	}
	
	public static void Cadastrar(Professor cadastro) {
		PrintWriter arquivo = null;
		try {
			FileWriter out = new FileWriter("professores.txt",true); 
			arquivo = new PrintWriter(out);

			arquivo.println(cadastro.toArquivo());

			System.out.printf("Cadastro realizado com sucesso\n");  
			
		}catch (Exception e){ 
			System.out.println(e);
		}finally{ 
			arquivo.close();
		}
	}
	
	public static void Cadastrar(Funcionario cadastro) {
		PrintWriter arquivo = null;
		try {
			FileWriter out = new FileWriter("funcionarios.txt",true); 
			arquivo = new PrintWriter(out);

			arquivo.println(cadastro.toArquivo());

			System.out.printf("Cadastro realizado com sucesso\n");  
			
		}catch (Exception e){ 
			System.out.println(e);
		}finally{ 
			arquivo.close();
		}
	}
	
	public static void Cadastrar(Livro cadastro) {
		PrintWriter arquivo = null;
		try {
			FileWriter out = new FileWriter("livros.txt",true); 
			arquivo = new PrintWriter(out);

			arquivo.println(cadastro.toArquivo());

			System.out.printf("Cadastro realizado com sucesso\n");  
			
		}catch (Exception e){ 
			System.out.println(e);
		}finally{ 
			arquivo.close();
		}
	}
	
	public static void Cadastrar(Periodicos cadastro) {
		PrintWriter arquivo = null;
		try {
			FileWriter out = new FileWriter("periodicos.txt",true); 
			arquivo = new PrintWriter(out);

			arquivo.println(cadastro.toArquivo());

			System.out.printf("Cadastro realizado com sucesso\n");  
			
		}catch (Exception e){ 
			System.out.println(e);
		}finally{ 
			arquivo.close();
		}
	}
	
	public static void Cadastrar(Emprestimo cadastro) {
		PrintWriter arquivo = null;
		try {
			FileWriter out = new FileWriter("emprestimo.txt",true); 
			arquivo = new PrintWriter(out);

			arquivo.println(cadastro.toArquivo());

			System.out.printf("Cadastro realizado com sucesso\n");  
			
		}catch (Exception e){ 
			System.out.println(e);
		}finally{ 
			arquivo.close();
		}
	}
	
	public static void Cadastrar(ItemEmprestimo cadastro) {
		PrintWriter arquivo = null;
		try {
			FileWriter out = new FileWriter("itensDeEmprestimo.txt",true); 
			arquivo = new PrintWriter(out);

			arquivo.println(cadastro.toArquivo());

			System.out.printf("Cadastro realizado com sucesso\n");  
			
		}catch (Exception e){ 
			System.out.println(e);
		}finally{ 
			arquivo.close();
		}
	}
	
	public static void EscreverDoInicioItemEmprestimo(ArrayList<ItemEmprestimo> lista) {
		PrintWriter arquivo = null;
		try {
			FileWriter out = new FileWriter("itensDeEmprestimo.txt"); 
			arquivo = new PrintWriter(out);
			
			for(ItemEmprestimo cadastro : lista) {
				arquivo.println(cadastro.toArquivo());
			}
			

			System.out.printf("Finaliza????o do emprestimo concluida");  
			
		}catch (Exception e){ 
			System.out.println(e);
		}finally{ 
			arquivo.close();
		}
	}
	
	public static void EscreverDoInicioAluno(ArrayList<Aluno> lista) {
		PrintWriter arquivo = null;
		try {
			FileWriter out = new FileWriter("alunos.txt"); 
			arquivo = new PrintWriter(out);
			
			for(Aluno cadastro : lista) {
				arquivo.println(cadastro.toArquivo());
			}
			

			System.out.printf("Altera????o de multa concluida");  
			
		}catch (Exception e){ 
			System.out.println(e);
		}finally{ 
			arquivo.close();
		}
	}
}
	
