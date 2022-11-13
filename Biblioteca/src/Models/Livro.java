package Models;

public class Livro extends Item{
	//<código>;<autor(es)>;<título>;<editora>;<tipo>;<ano de publicação>;<issn>
	private String editora;
	private int anoDePublicacao;

	
	public Livro(int codigo, String autor, String titulo, 
			String editora,char tipo, int anoDePublicacao,String issn) {
		super(codigo, autor, titulo, tipo, issn);
		this.editora = editora;
		this.anoDePublicacao = anoDePublicacao;
	}
	
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	public String getEditora() {
		return this.editora;
	}
	
	public void setAnoDePublicacao(int anoDePublicacao) {
		this.anoDePublicacao = anoDePublicacao;
	}

	public int getAnoDePublicacao() {
		return this.anoDePublicacao;
	}
	
	@Override
    public String toString() {
		String nomeToString = super.toString() + String.format("Ano de Publicação: %s\n",this.anoDePublicacao);
        return nomeToString;
    }
}
