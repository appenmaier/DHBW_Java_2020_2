package chapter05.exercises.exercise02;

public class Exercise0502 {

	public static void main(String[] args) {

		Rental rental = new Rental("Fahrzeugvermietung Müller");
		Car c1 = new Car("Porsche", "911", Engine.ELECTRO, 2);
		Truck t1 = new Truck("MAN", "TGX", Engine.DIESEL, 40);
		Car c2 = new Car("Opel", "Zafira Life", Engine.DIESEL, 7);

		rental.addVehicle(c1); // Upcast
		rental.addVehicle(t1); // Upcast
		rental.addVehicle(c2); // Upcast

		rental.print();

	}

}
