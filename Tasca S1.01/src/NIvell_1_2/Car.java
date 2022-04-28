package NIvell_1_2;

public class Car {
	
	static final String  BRAND="Toyota";//Al ser static final, la constante, se tiene que declarar en la cabecera de la clase. No se puede inicializar en el constructor.
	static String model;
	final int power;
	
	public Car( String model, int power) {
		
		Car.model=model;//Todos los objetos tendrán el mismo valor.Se podrá modificar, pero tendrán el mismo.
		this.power=power;//Al ser final si se puede inicializar en el constructor. No se podrá modificar después de la creación (Constante), pero cada objeto tiene un valor.
	}
	
	public static String getModel() {
		return model;
	}

	public static void setModel(String model) {
		Car.model = model;
	}
	
	/*public void setPower(int power) {  No podemos crear un metodo setPower ya que no podemos asignar nuevos valores a un atributo con modificador final.
		this.power=power;
		
	}*/

	public static String getBrand() {
		return BRAND;
	}

	public int getPower() {
		return power;
	}
	
	public static void brake() {
		
		System.out.println("El vehicle està frenant");
	}

	public void accelerate() {
		
		System.out.println("El vehicle està accelerant");
	}

	@Override
	public String toString() {
		return "Car [brand="+BRAND+", model="+model + ", power=" + power +"]";
	}


}
