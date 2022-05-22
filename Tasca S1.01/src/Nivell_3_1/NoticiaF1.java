package Nivell_3_1;

public class NoticiaF1 extends Noticia{
	
	private String refEscuderia;

	public NoticiaF1(String titular, String esport, String refEscuderia) {
		super(titular, esport);
		this.refEscuderia=refEscuderia;
		puntuacio=calcularPuntuacioNoticia();
		preu=calcularPreuNoticia();

	}

	public String getRefEscuderia() {
		return refEscuderia;
	}

	public void setRefEscuderia(String refEscuderia) {
		this.refEscuderia = refEscuderia;
	}
	
	public int calcularPreuNoticia() {
		
		int preuBase=100;
		int preuEscuderia=0;
		
		if (refEscuderia.equalsIgnoreCase("Ferrari")||refEscuderia.equalsIgnoreCase("Mercedes")) {
			
			preuEscuderia=50;
		}
		
		preu=preuBase+preuEscuderia;
		
		return preu;
	}
	
	public int calcularPuntuacioNoticia() {
		
		int puntsBase=4;
		int puntsEscuderia=0;
		
		if (refEscuderia.equalsIgnoreCase("Ferrari")||refEscuderia.equalsIgnoreCase("Mercedes")) {
			
			puntsEscuderia=2;
		}
		
		puntuacio=puntsBase+puntsEscuderia;
		
		return puntuacio;
	}

}
