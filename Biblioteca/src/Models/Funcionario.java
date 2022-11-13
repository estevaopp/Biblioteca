package Models;

import java.time.LocalDate;

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
	
	@Override
    public String toString() {
		String nomeToString = super.toString() + String.format("Setor: %s\n",this.setor);
        return nomeToString;
    }
	
}