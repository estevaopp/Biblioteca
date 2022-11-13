package Models;

public class Professor extends Pessoa{
	//<matrícula>;<nome>;<endereço>;<data-ingresso>;<setor>
	
	private String dataIngresso;
	private String setor;

	
	public Professor(int matricula, String nome, String endereco, String dataIngresso,
			String setor) {
		super(matricula, nome, endereco);
		this.dataIngresso = dataIngresso;
		this.setor = setor;
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
	
	@Override
    public String toString() {
		String nomeToString = super.toString() + String.format("Setor: %s\n",this.setor);
        return nomeToString;
    }

}
