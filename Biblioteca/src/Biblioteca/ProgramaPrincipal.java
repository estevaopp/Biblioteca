package Biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

import Arquivos.*;
import Models.*;

public class ProgramaPrincipal {
	// Estêvão Paulo Pereira, Mayra, Matheus dos Santos Neto
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		Livro novoLivro = new Livro();
		Periodicos novoPeriodico = new Periodicos();
		Funcionario novoFuncionario = new Funcionario();
		Professor novoProfessor = new Professor();
		Aluno novoAluno = new Aluno();
		Emprestimo novoEmprestimo = new Emprestimo();
		ItemEmprestimo novoItemEmprestimo = new ItemEmprestimo();
		int matricula;
		int codigoEmprestimo;
		ArrayList<Livro> listaDeLivros = new ArrayList<Livro>();
		ArrayList<Periodicos> listaDePeriodicos = new ArrayList<Periodicos>();
		ArrayList<Funcionario> listaDeFuncionario = new ArrayList<Funcionario>();
		ArrayList<Professor> listaDeProfessor = new ArrayList<Professor>();
		ArrayList<Aluno> listaDeAluno = new ArrayList<Aluno>();
		ArrayList<Emprestimo> listaDeEmprestimo = new ArrayList<Emprestimo>();
		ArrayList<ItemEmprestimo> listaDeItemEmprestimo = new ArrayList<ItemEmprestimo>();
		String opcao = "";
		String senha;
		String login;
		Funcionario funcionario;
		
		
		do{
			System.out.print("Digite o login: ");
			login = ler.nextLine();
			LerArquivo.ArquivoDeFuncionario(listaDeFuncionario);
			funcionario = Funcionario.ProcurarLogin(listaDeFuncionario, login);
			System.out.print("Digite a senha: ");
			senha = ler.nextLine();
			
			
			if (senha.compareTo("admin") == 0 && login.compareTo("admin") == 0) {
				break;
			}
			if (funcionario != null) {
				if (funcionario.getSenha().compareTo(senha) == 0 && funcionario.getLogin().compareTo(login) == 0) {
					break;
				}
			}
			
			System.out.println("Senha invalida ou login invalido");
		}while(true);
		
		listaDeFuncionario.clear();
		
		while(opcao != "13") {
			
			System.out.println("-------------------");
			System.out.println("1- Cadastrar livro"); // feito
			System.out.println("2- Cadastrar periodico"); // feito
			System.out.println("3- Cadastrar funcionario"); // feito
			System.out.println("4- Cadastrar professor"); // feito
			System.out.println("5- Cadastrar Aluno"); // feito
			System.out.println("6- Fazer emprestimo"); // feito
			System.out.println("7- Emitir relatório de livros"); // feito
			System.out.println("8- Emitir relatório de emprestimos"); // feito
			System.out.println("9- Emitir relatório de funcionarios"); // feito
			System.out.println("10- Emitir relatório de alunos"); // feito
			System.out.println("11- Emitir multa individual"); // feito
			System.out.println("12- Devolver Item aqui foi pelo git"); // feito
			System.out.println("13- Sair do programa alterei aqui de novo"); // feito
			System.out.print("Digite um numero: ");
			opcao = ler.nextLine();
			System.out.println("-------------------");
			System.out.println("");
			System.out.println("");
			// coloquei aqui
			switch (opcao) {
			case "1":
				novoLivro.Reescrever(ler);
				System.out.println("");
				EscreverEmArquivo.Cadastrar(novoLivro);
				break;
			case "2":
				novoPeriodico.Reescrever(ler);
				System.out.println("");
				EscreverEmArquivo.Cadastrar(novoPeriodico);
				break;
			case "3":
				novoFuncionario.Reescrever(ler);
				System.out.println("");
				EscreverEmArquivo.Cadastrar(novoFuncionario);
				break;
			case "4":
				novoProfessor.Reescrever(ler);
				System.out.println("");
				EscreverEmArquivo.Cadastrar(novoProfessor);
				break;
			case "5":
				novoAluno.Reescrever(ler);
				System.out.println("");
				EscreverEmArquivo.Cadastrar(novoAluno);
				break;
			case "6":
				LerArquivo.ArquivoDeAluno(listaDeAluno);
				System.out.print("Digite a matricula do aluno que quer procurar: ");
				matricula = ler.nextInt();
				ler.nextLine();
				novoAluno = Aluno.ProcurarMatricula(listaDeAluno, matricula);
				listaDeAluno.clear();
				
				if (novoAluno.hasMulta()) {
					System.out.println("Tem que pagar a multa antes de pegar um livro emprestado");
				}else {
					novoEmprestimo.Reescrever(ler);
					System.out.println("");
					EscreverEmArquivo.Cadastrar(novoEmprestimo);
					System.out.println("");
					novoItemEmprestimo.Reescrever(ler);
					System.out.println("");
					EscreverEmArquivo.Cadastrar(novoItemEmprestimo);
				}
				break;
			case "7":
				LerArquivo.ArquivoDeLivro(listaDeLivros);
				EmitirRelatorio.Relatorio(listaDeLivros);
				listaDeLivros.clear();
				System.out.println("");
				break;
			case "8":
				LerArquivo.ArquivoDeEmprestimo(listaDeEmprestimo);
				EmitirRelatorio.Relatorio(listaDeEmprestimo);
				listaDeEmprestimo.clear();
				System.out.println("");
				break;
			case "9":
				LerArquivo.ArquivoDeFuncionario(listaDeFuncionario);
				EmitirRelatorio.Relatorio(listaDeFuncionario);
				listaDeFuncionario.clear();
				System.out.println("");
				break;
			case "10":
				LerArquivo.ArquivoDeAluno(listaDeAluno);
				EmitirRelatorio.Relatorio(listaDeAluno);
				listaDeAluno.clear();
				System.out.println("");
				break;
			case "11":
				//emitir multa individual
				LerArquivo.ArquivoDeAluno(listaDeAluno);
				System.out.print("Digite a matricula do aluno que quer procurar: ");
				matricula = ler.nextInt();
				ler.nextLine();
				novoAluno = Aluno.ProcurarMatricula(listaDeAluno, matricula);
				novoAluno.EmitirMulta();
				listaDeAluno.clear();
				break;
			case "12":
				//devolver item
				LerArquivo.ArquivoDeItemEmprestimo(listaDeItemEmprestimo);
				System.out.print("Digite o codigo do emprestimo que quer procurar: ");
				codigoEmprestimo = ler.nextInt();
				ler.nextLine();
				novoItemEmprestimo = ItemEmprestimo.ProcurarCodigoEmprestimo(listaDeItemEmprestimo, codigoEmprestimo);
				listaDeItemEmprestimo.remove(listaDeItemEmprestimo.indexOf(novoItemEmprestimo));
				EscreverEmArquivo.EscreverDoInicioItemEmprestimo(listaDeItemEmprestimo);
				System.out.println();
				System.out.print("Aluno entregou o livro atrasado (S/N)? ");
				opcao = ler.nextLine().toUpperCase();
				if(opcao.compareTo("S") == 0 || opcao.compareTo("SIM") == 0) {
					LerArquivo.ArquivoDeAluno(listaDeAluno);
					System.out.print("Digite a matricula do aluno que quer procurar: ");
					matricula = ler.nextInt();
					ler.nextLine();
					novoAluno = Aluno.ProcurarMatricula(listaDeAluno, matricula);
					listaDeAluno.remove(listaDeAluno.indexOf(novoAluno));
					System.out.print("Adicione uma nova multa ao aluno: ");
					novoAluno.setMulta(ler.nextDouble());
					listaDeAluno.add(novoAluno);
					EscreverEmArquivo.EscreverDoInicioAluno(listaDeAluno);
				}
				break;
			case "13":
				System.out.println("Programa finalizado!!!");
				return;
			default:
				System.out.println("Opção invalida");
				break;
			}
			ler.nextLine();
		}
	}
}
