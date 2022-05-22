package Nivell_2_1;

public class Telefon {
	
	protected String marca;
	protected String model;
	
	public Telefon(String marca, String model) {
		
		this.marca=marca;
		this.model=model;
	}
	
	public void trucar(String numTelefon) {
		
		System.out.println("Estàs trucant al número "+numTelefon);
	}

}
