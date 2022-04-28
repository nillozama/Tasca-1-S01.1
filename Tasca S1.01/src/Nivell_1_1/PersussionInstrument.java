package Nivell_1_1;

public class PersussionInstrument extends MusicInstrument{
	
	
	public PersussionInstrument() {
		super();
	}
	
	public PersussionInstrument(String name, float price) {
		
		super(name, price);
	}
	
	public String play(){
		
		return "Està sonant un instrument de percussió.";
	}

	public String toString() {
		return "PersussionInstrument [name=" + name + ", price=" + price + "]";
	}
}
