package Nivell_3_1;

public class NoticiaMotociclisme extends Noticia{
	
	private String refEquip;

	public NoticiaMotociclisme(String titular, String esport, String refEquip) {
		super(titular, esport);
		this.refEquip=refEquip;
		puntuacio=calcularPuntuacioNoticia();
		preu=calcularPreuNoticia();

	}

	public String getRefEquip() {
		return refEquip;
	}

	public void setRefEquip(String refEquip) {
		this.refEquip = refEquip;
	}
	
	public int calcularPreuNoticia() {
		
		int preuBase=100;
		int preuEquip=0;
		
		if (refEquip.equalsIgnoreCase("Yamaha")||refEquip.equalsIgnoreCase("Honda")) {
			
			preuEquip=50;
		}
		
		preu=preuBase+preuEquip;
		
		return preu;
	}
	
	public int calcularPuntuacioNoticia() {
		
		int puntsBase=3;
		int puntsEquip=0;
		
		if (refEquip.equalsIgnoreCase("Yamaha")||refEquip.equalsIgnoreCase("Honda")) {
			
			puntsEquip=3;
		}
		
		puntuacio=puntsBase+puntsEquip;
		
		return puntuacio;
	}

}
