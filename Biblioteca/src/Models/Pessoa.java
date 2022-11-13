package Models;

public class Pessoa {
	private String nome;
	private String endereco;
	private int matricula;
	
	public Pessoa(int matricula, String nome, String endereco) {
		this.matricula = matricula;
		this.nome = nome;
		this.endereco = endereco;
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
	
	@Override
    public String toString() {
		String nomeToString = String.format("\nMatricula: %s\nNome: %s\n",this.matricula,this.nome);
        return nomeToString;
    }
}
