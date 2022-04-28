package NIvell_1_2;

public class Principal {
	
	public static void main(String[] args) {
		
		Car car1=new Car("Corolla", 125);
		System.out.println(car1);		
		Car.brake();//Al ser static la llamada se hace a través del nombre de la clase y no del objeto.
		car1.accelerate();
		//car1.power=100; No se puede volver a asignar un valor al atributo power del objeto car1 porqué es final.
		

		
		Car car2=new Car("Auris", 110);
		
		System.out.println(car2);
		
		car2.brake();// Se debería de llamar al método de la siguiente manera Car.brake() ya que es estático.
		

		System.out.println(car1);// Se modifica el valor del atributo modelo del objeto car1. Al crear el objeto car2 hemos llamado al constructor de la clase Car pasando un parametro modelo y  hemos modificado el valor de la propiedad.

	}
}
