package Nivell_1_1;

public class WindInstrument extends MusicInstrument{
	
	public WindInstrument() {
		super();
	}
	
	public WindInstrument(String name, float price) {
		
		super(name, price);
	}
	
	public String play(){
		
		return "Està sonant un instrument de vent.";
	}

	public String toString() {
		return "WindInstrument [name=" + name + ", price=" + price + "]";
	}
}
