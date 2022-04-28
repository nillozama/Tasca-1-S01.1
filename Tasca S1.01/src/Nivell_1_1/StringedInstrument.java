package Nivell_1_1;

public class StringedInstrument extends MusicInstrument{
	
	
	public StringedInstrument() {
		super();
	}
	
	public StringedInstrument(String name, float price) {
		
		super(name, price);
	}
	
	public String play(){
		
		return "Està sonant un instrument de corda.";
	}


	public String toString() {
		return "StringedInstrument [name=" + name + ", price=" + price + "]";
	}
}