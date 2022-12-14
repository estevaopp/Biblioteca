package Arquivos;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileReader;
import Models.*;

public class LerArquivo {
	
	public static void ArquivoDeLivro(ArrayList<Livro> lista){
		Scanner arquivo = null;
		try {
			String linha = "";
			FileReader nomeArq = new FileReader("livros.txt");
			arquivo = new Scanner(nomeArq);
			//Fazemos um loop linha a linha no arquivo,
			// enquanto existir uma pr�xima linha.
			while(arquivo.hasNext())			
			{
				//faz algo com a linha
				linha = arquivo.nextLine();
				String array[] = new String[7];
				array = linha.split(";");
				//<c�digo>;<autor(es)>;<t�tulo>;<editora>;<tipo>;<ano de publica��o>;<issn>
				Livro livro = new Livro(Integer.parseInt(array[0]), array[1], array[2], array[3],
						array[4].charAt(0), Integer.parseInt(array[5]), array[6]);
				lista.add(livro);
			}
		} catch (Exception e) { 
			System.out.println(e);
		} finally { 
			arquivo.close();
		}
	}
	
	public static void ArquivoDePeriodicos(ArrayList<Periodicos> lista){
		Scanner arquivo = null;
		try {
			String linha = "";
			FileReader nomeArq = new FileReader("periodicos.txt");
			arquivo = new Scanner(nomeArq);
			//Fazemos um loop linha a linha no arquivo,
			// enquanto existir uma pr�xima linha.
			while(arquivo.hasNext())			
			{
				//faz algo com a linha
				linha = arquivo.nextLine();
				String array[] = new String[6];
				array = linha.split(";");
				//<c�digo>;<autor(es)>;<t�tulo>;<tipo>;<fator-de-impacto>;<issn>
				Periodicos periodico = new Periodicos(Integer.parseInt(array[0]), array[1], array[2],
						array[3].charAt(0), Double.parseDouble(array[4].replace(",", ".")), array[5]);
				lista.add(periodico);
			}
		} catch (Exception e) { 
			System.out.println(e);
		} finally { 
			arquivo.close();
		}
	}
	
	public static void ArquivoDeFuncionario(ArrayList<Funcionario> lista){
		Scanner arquivo = null;
		try {
			String linha = "";
			FileReader nomeArq = new FileReader("funcionarios.txt");
			arquivo = new Scanner(nomeArq);
			//Fazemos um loop linha a linha no arquivo,
			// enquanto existir uma pr�xima linha.
			while(arquivo.hasNext())			
			{
				//faz algo com a linha
				linha = arquivo.nextLine();
				String array[] = new String[7];
				array = linha.split(";");
				//<matr�cula>;<nome>;<endere�o>;<data-ingresso>;<setor>;<senha>;<login>
				Funcionario funcionario = new Funcionario(Integer.parseInt(array[0]), array[1], array[2], array[3],
						array[4], array[5], array[6]);
				lista.add(funcionario);
			}
		} catch (Exception e) { 
			System.out.println(e);
		} finally { 
			arquivo.close();
		}
	}
	
	public static void ArquivoDeProfessor(ArrayList<Professor> lista){
		Scanner arquivo = null;
		try {
			String linha = "";
			FileReader nomeArq = new FileReader("professores.txt");
			arquivo = new Scanner(nomeArq);
			//Fazemos um loop linha a linha no arquivo,
			// enquanto existir uma pr�xima linha.
			while(arquivo.hasNext())			
			{
				//faz algo com a linha
				linha = arquivo.nextLine();
				String array[] = new String[5];
				array = linha.split(";");
				//<matr�cula>;<nome>;<endere�o>;<data-ingresso>;<setor>
				Professor professor = new Professor(Integer.parseInt(array[0]), array[1], array[2], array[3],
						array[4]);
				lista.add(professor);
			}
		} catch (Exception e) { 
			System.out.println(e);
		} finally { 
			arquivo.close();
		}
	}
	
	public static void ArquivoDeAluno(ArrayList<Aluno> lista){
		Scanner arquivo = null;
		try {
			String linha = "";
			FileReader nomeArq = new FileReader("alunos.txt");
			arquivo = new Scanner(nomeArq);
			//Fazemos um loop linha a linha no arquivo,
			// enquanto existir uma pr�xima linha.
			while(arquivo.hasNext())			
			{
				//faz algo com a linha
				linha = arquivo.nextLine();
				String array[] = new String[6];
				array = linha.split(";");
				//<matr�cula>;<nome>;<endere�o>;<curso>;<data-ingresso>;<multa>
				Aluno aluno = new Aluno(Integer.parseInt(array[0]), array[1], array[2], array[3],
						array[4], Double.parseDouble(array[5].replace(",", ".")));
				lista.add(aluno);
			}
		} catch (Exception e) { 
			System.out.println(e);
		} finally { 
			arquivo.close();
		}
	}
	
	public static void ArquivoDeEmprestimo(ArrayList<Emprestimo> lista){
		Scanner arquivo = null;
		try {
			String linha = "";
			FileReader nomeArq = new FileReader("emprestimo.txt");
			arquivo = new Scanner(nomeArq);
			//Fazemos um loop linha a linha no arquivo,
			// enquanto existir uma pr�xima linha.
			while(arquivo.hasNext())			
			{
				//faz algo com a linha
				linha = arquivo.nextLine();
				String array[] = new String[6];
				array = linha.split(";");
				//<código>;<matrícula-cliente>;<matrícula-funcionário>;<data-empréstimo>;<data-devolução>
				Emprestimo emprestimo = new Emprestimo(Integer.parseInt(array[0]), Integer.parseInt(array[1]), 
						Integer.parseInt(array[2]), array[3], array[4]);
				lista.add(emprestimo);
			}
		} catch (Exception e) { 
			System.out.println(e);
		} finally { 
			arquivo.close();
		}
	}
	
	public static void ArquivoDeItemEmprestimo(ArrayList<ItemEmprestimo> lista){
		Scanner arquivo = null;
		try {
			String linha = "";
			FileReader nomeArq = new FileReader("itensDeEmprestimo.txt");
			arquivo = new Scanner(nomeArq);
			//Fazemos um loop linha a linha no arquivo,
			// enquanto existir uma pr�xima linha.
			while(arquivo.hasNext())			
			{
				//faz algo com a linha
				linha = arquivo.nextLine();
				String array[] = new String[6];
				array = linha.split(";");
				//<código-item>;<código-empréstimo>;<código-livro>;<código-periódico>;<data-devolução>
				ItemEmprestimo emprestimo = new ItemEmprestimo(Integer.parseInt(array[0]), Integer.parseInt(array[1]), 
						Integer.parseInt(array[2]), Integer.parseInt(array[3]), array[4]);
				lista.add(emprestimo);
			}
		} catch (Exception e) { 
			System.out.println(e);
		} finally { 
			arquivo.close();
		}
	}
}
