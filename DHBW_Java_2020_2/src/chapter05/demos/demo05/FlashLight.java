package chapter05.demos.demo05;

/**
 * Taschenlampe
 * 
 * @author Daniel Appenmaier
 *
 */
public final class FlashLight extends Light {

	/*
	 * Attribute
	 */
//	private boolean isOn;
//	private boolean isShining;

	/*
	 * Methoden
	 */
	public FlashLight() {
		super();
	}

	@Override
	public void switchOn() {
		isOn = true;
		isShining = true;
	}

	// Light.switchOff: finale Methode
	// public void switchOff() {
	// isOn = false;
	// isShining = false;
	// }

	@Override
	public void print() {
		// super.print();
		System.out.println(isOn + " - " + isShining);
		System.out.println("Ich bin eine Taschenlampe");
		System.out.println();
	}

}
