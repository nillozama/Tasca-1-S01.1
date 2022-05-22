package Nivell_3_1;

public class NoticiaTenis extends Noticia{
	
	private String refCompeticio;
	private String refTenista;

	public NoticiaTenis(String titular, String esport, String refCompeticio, String refTenista) {
		super(titular, esport);
		this.refCompeticio=refCompeticio;
		this.refTenista=refTenista;
		puntuacio=calcularPuntuacioNoticia();
		preu=calcularPreuNoticia();

	}

	public String getRefCompeticio() {
		return refCompeticio;
	}

	public void setRefCompeticio(String refCompeticio) {
		this.refCompeticio = refCompeticio;
	}

	public String getRefTenista() {
		return refTenista;
	}

	public void setRefTenista(String refTenista) {
		this.refTenista = refTenista;
	}
	
	public int calcularPreuNoticia() {
		
		int preuBase=150;
		int preuTenista=0;
		
		if (refTenista.equalsIgnoreCase("Nadal")||refTenista.equalsIgnoreCase("Federer")||refTenista.equalsIgnoreCase("Djokovic")) {
			
			preuTenista=100;
		}
		
		preu=preuBase+preuTenista;
		
		return preu;
	}
	
	public int calcularPuntuacioNoticia() {
		
		int puntsBase=4;
		int puntsTenista=0;
		
		if (refTenista.equalsIgnoreCase("Nadal")||refTenista.equalsIgnoreCase("Federer")||refTenista.equalsIgnoreCase("Djokovic")) {
			
			puntsTenista=3;
		}
		
		puntuacio=puntsBase+puntsTenista;
		
		return puntuacio;
	}

}
