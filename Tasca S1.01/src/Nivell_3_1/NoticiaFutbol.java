package Nivell_3_1;

public class NoticiaFutbol extends Noticia{
	
	private String refCompeticio;
	private String refClub;
	private String refJugador;

	public NoticiaFutbol(String titular, String esport, String refCompeticio, String refClub, String refJugador) {
		super(titular, esport);
		this.refCompeticio=refCompeticio;
		this.refClub=refClub;
		this.refJugador=refJugador;
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

	public String getRefJugador() {
		return refJugador;
	}

	public void setRefJugador(String refJugador) {
		this.refJugador = refJugador;
	}
	
	public int calcularPreuNoticia() {
		
		int preuInicial=300;
		int preuCompeticio=0;
		int preuEquip=0;
		int preuJugador=0;
		
		if(refCompeticio.equalsIgnoreCase("Lliga de Campions")) {
			
			preuCompeticio=100;
		}
		
		if (refClub.equalsIgnoreCase("Barça")||refClub.equalsIgnoreCase("Madrid")) {
			
			preuEquip=100;
		}
		
		if (refJugador.equalsIgnoreCase("Ferran Torres")||refJugador.equalsIgnoreCase("Benzema")) {
			
			preuJugador=50;
		}
		
		preu= preuInicial+preuCompeticio+preuEquip+preuJugador;;
		return preu;
	}
	
	public int calcularPuntuacioNoticia() {
		
		int puntsBase=5;
		int puntsCompeticio=0;
		int puntsEquip=0;
		int puntsJugador=0;
		
		if(refCompeticio.equalsIgnoreCase("Lliga de Campions")) {
			
			puntsCompeticio=3;
		}
		
		else if(refCompeticio.equalsIgnoreCase("Lliga")) {
			
			puntsCompeticio=2;
		}
		
		if (refClub.equalsIgnoreCase("Barça")||refClub.equalsIgnoreCase("Madrid")) {
			
			puntsEquip=1;
		}
		
		if (refJugador.equalsIgnoreCase("Ferran Torres")||refJugador.equalsIgnoreCase("Benzema")) {
			
			puntsJugador=1;
		}
		
		puntuacio=puntsBase+puntsCompeticio+puntsEquip+puntsJugador;
		
		return puntuacio;
	}

}
