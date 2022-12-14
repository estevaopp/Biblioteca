package Models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Funcionario extends Pessoa{
	//<matr�cula>;<nome>;<endere�o>;<data-ingresso>;<setor>;<senha>;<login>
	
	private String dataIngresso;
	private String setor;
	private String senha;
	private String login;
	
	public Funcionario(int matricula, String nome, String endereco,
			String setor, String senha, String login) {
		super(matricula, nome, endereco);
		this.dataIngresso = LocalDate.now().toString();
		this.setor = setor;
		this.senha = senha;
		this.login = login;
	}
	
	public Funcionario(int matricula, String nome, String endereco, String dataIngresso,
			String setor, String senha, String login) {
		super(matricula, nome, endereco);
		this.dataIngresso = dataIngresso;
		this.setor = setor;
		this.senha = senha;
		this.login = login;
	}
	
	public Funcionario(Scanner escreva) {
		super(escreva);
		System.out.print("Digite a data ingresso: ");
		this.dataIngresso = escreva.nextLine();
		System.out.print("Digite o setor: ");
		this.setor = escreva.nextLine();
		System.out.print("Digite o senha: ");
		this.senha = escreva.nextLine();
		System.out.print("Digite o login: ");
		this.login = escreva.nextLine();
	}
	
	public Funcionario() {
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

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getSenha() {
		return this.senha;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}

	public String getLogin() {
		return this.login;
	}
	
	public static Funcionario ProcurarLogin(ArrayList<Funcionario> listaDeFuncionario, String login) {
		Funcionario funcionario = listaDeFuncionario.stream()
				  .filter((f) -> f.getLogin().compareTo(login) == 0)
				  .findFirst()
				  .orElse(null);
		return funcionario;
	}
	
	@Override
	public void Reescrever(Scanner escreva) {
		super.Reescrever(escreva);;
		System.out.print("Digite a data ingresso: ");
		this.dataIngresso = escreva.nextLine();
		System.out.print("Digite o setor: ");
		this.setor = escreva.nextLine();
		System.out.print("Digite o senha: ");
		this.senha = escreva.nextLine();
		System.out.print("Digite o login: ");
		this.login = escreva.nextLine();
	}
	
	//<matr�cula>;<nome>;<endere�o>;<data-ingresso>;<setor>;<senha>;<login>
	@Override
	public String toArquivo() {
		String nomeToArquivo = String.format("%d;%s;%s;%s;%s;%s;%s",this.getMatricula(),this.getNome(),
				this.getEndereco(),this.dataIngresso,this.setor,this.senha, this.login);
        return nomeToArquivo;
    }
	
	@Override
    public String toString() {
		String nomeToString = super.toString() + String.format("Setor: %s\n Data Ingresso: %s",
				this.setor, this.dataIngresso);
        return nomeToString;
    }
	
}
