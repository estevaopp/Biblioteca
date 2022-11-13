package Models;

public class Item {
	//<c�digo>;<autor(es)>;<t�tulo>;<tipo>;<issn>
	private int codigo;
	private String autor;
	private String titulo;
	private char tipo;
	private String issn;
	
	
	public Item(int codigo, String autor, String titulo, char tipo, String issn) {
		this.codigo = codigo;
		this.autor = autor;
		this.titulo = titulo;
		this.tipo = tipo;
		this.issn = issn;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String getAutor() {
		return this.autor;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public void setTipo(char tipo) {
		this.tipo = tipo;
	}
	
	public char getTipo() {
		return this.tipo;
	}
	
	public void setIssn(String issn) {
		this.issn = issn;
	}
	
	public String getIssn() {
		return this.issn;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	@Override
    public String toString() {
		String nomeToString = String.format("\nC�digo: %s\nTitulo: %s\nAutor: %s\n",
				this.codigo, this.titulo, this.autor);
        return nomeToString;
    }
}