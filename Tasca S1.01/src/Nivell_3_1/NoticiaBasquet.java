package Nivell_3_1;

public class NoticiaBasquet extends Noticia{

	private String refCompeticio;
	private String refClub;
	
	public NoticiaBasquet(String titular, String esport, String refCompeticio, String refClub) {
		
		super(titular, esport);
		this.refCompeticio=refCompeticio;
		this.refClub=refClub;
		puntuacio=calcularPuntuacioNoticia();
		preu=calcularPreuNoticia();
	}

	public String getRefCompeticio() {
		return refCompeticio;
	}

	public void setRefCompeticio(String refCompeticio) {
		this.refCompeticio = refCompeticio;
	}

	public String getRefClub() {
		return refClub;
	}

	public void setRefClub(String refClub) {
		this.refClub = refClub;
	}
	
	public int calcularPreuNoticia() {
		
		int preuBase=250;
		int preuCompeticio=0;
		int preuClub=0;

		
		if(refCompeticio.equalsIgnoreCase("Eurolliga")) {
			
			preuCompeticio=75;
		}
		
		if (refClub.equalsIgnoreCase("Barça")||refClub.equalsIgnoreCase("Madrid")) {
			
			preuClub=75;
		}
		
		preu=preuBase+preuCompeticio+preuClub;
		
		return preu;
	}
	
	public int calcularPuntuacioNoticia() {
		
		int puntsBase=4;
		int puntsCompeticio=0;
		int puntsClub=0;

		
		if(refCompeticio.equalsIgnoreCase("Eurolliga")) {
			
			puntsCompeticio=3;
		}
		
		else if(refCompeticio.equalsIgnoreCase("ACB")) {
			
			puntsCompeticio=2;
		}
		
		if (refClub.equalsIgnoreCase("Barça")||refClub.equalsIgnoreCase("Madrid")) {
			
			puntsClub=1;
		}
		
		puntuacio=puntsBase+puntsCompeticio+puntsClub;
		
		return puntuacio;
	}

}
