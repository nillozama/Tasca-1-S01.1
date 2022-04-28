package Nivell_1_1;

public class Principal {
	
	public static void main(String[] args) {
		
		System.out.println(MusicInstrument.count);
		
		WindInstrument flute= new WindInstrument("flute", 200);
		
		System.out.println(flute);
		
		System.out.println(flute.play());
		
		WindInstrument flute2=new WindInstrument();
		System.out.println(flute2);

	}
}
