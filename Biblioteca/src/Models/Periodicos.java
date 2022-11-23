package Models;

public class Periodicos extends Item{
	//<c�digo>;<autor(es)>;<t�tulo>;<tipo>;<fator-de-impacto>;<issn>
		private double fatorDeImpacto;

		
		public Periodicos(int codigo, String autor, String titulo, 
				char tipo, double fatorDeImpacto,String issn) {
			super(codigo, autor, titulo, tipo, issn);
			this.fatorDeImpacto = fatorDeImpacto;
		}
		
		public void setFatorDeImpacto(double fatorDeImpacto) {
			this.fatorDeImpacto = fatorDeImpacto;
		}
		
		public double getFatorDeImpacto() {
			return this.fatorDeImpacto;
		}
		
		//<c�digo>;<autor(es)>;<t�tulo>;<tipo>;<fator-de-impacto>;<issn>
		@Override
		public String toArquivo() {
			String nomeToArquivo = String.format("%d;%s;%s;%c;%d;%s\n",this.getCodigo(),this.getAutor(),
					this.getTitulo(),this.getTipo(),this.fatorDeImpacto,this.getIssn());
	        return nomeToArquivo;
	    }
		
		@Override
	    public String toString() {
			String nomeToString = super.toString() + String.format("Fator de impacto: %.2f\n",this.fatorDeImpacto);
	        return nomeToString;
	    }
}
