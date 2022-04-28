package Nivell_1_1;

public abstract class MusicInstrument {
	
	protected String name;
	protected float price;
	static int count=0;
	
	public MusicInstrument() {
		
		System.out.println("Heu cridat al constructor buit.");
	}
	
	public MusicInstrument(String name, float price) {
		
		this.name=name;
		this.price=price;
		System.out.println("Heu cridat al constructor amb paràmetres i sobreescriuré les variables name i price amb el valor obtingut per paràmetres.");
	}
	
	//Code block constructor.
	{
		System.out.println("Codi de bloc constructor o d'instància. Inicialitza les variables name i price.");
		
		this.name="Undefined";
		this.price=0; 
	}
	
	//Code block static. Solo se ejecuta una vez.
	static {
		
		System.out.println("Codi de bloc estàtic. Només s'executa un cop.");
		count=10;
	}
	
	public abstract String play();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
}
