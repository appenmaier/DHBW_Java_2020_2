package chapter05.exercises.exercise03;

public class Exercise0503 {

	public static void main(String[] args) {

		Rental rental = new Rental("Fahrzeugvermietung Müller");
		Car c1 = new Car("Porsche", "911", Engine.ELECTRO, 2);
		Truck t1 = new Truck("MAN", "TGX", Engine.DIESEL, 40);
		Truck t2 = new Truck("Mercedes", "Actros", Engine.DIESEL, 40);
		Car c2 = new Car("Opel", "Zafira Life", Engine.DIESEL, 7);

		rental.addVehicle(c1);
		rental.addVehicle(t1);
		rental.addVehicle(c2);
		rental.addVehicle(t2);

		rental.print();
		System.out.println();

		rental.transformAllTrucks();

	}

}
