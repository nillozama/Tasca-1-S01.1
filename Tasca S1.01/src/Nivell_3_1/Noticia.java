package Nivell_3_1;

public class Noticia {
	
	protected String titular;
	protected String text;
	protected String esport;
	protected int puntuacio;
	protected int preu;
	
	public Noticia(String titular, String esport){
		
		this.titular=titular;
		this.esport=esport;
		text="";
		puntuacio=0;
		preu=0;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getEsport() {
		return esport;
	}

	public void setEsport(String esport) {
		this.esport = esport;
	}

	public int getPuntuacio() {
		return puntuacio;
	}

	public void setPuntuacio(int puntuacio) {
		this.puntuacio = puntuacio;
	}

	public int getPreu() {
		return preu;
	}

	public void setPreu(int preu) {
		this.preu = preu;
	}

	@Override
	public String toString() {
		return "Noticia [titular=" + titular + "]";
	}

}
