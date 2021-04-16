package chapter05.demos.demo03;

/**
 * Taschenlampe
 * 
 * @author Daniel Appenmaier
 *
 */
public class FlashLight extends Light {

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

//	public void switchOn() {
//		isOn = true;
//		isShining = true;
//	}

//	public void switchOff() {
//		isOn = false;
//		isShining = false;
//	}

	@Override
	public void print() {
		super.print();
//		System.out.println(isOn + " - " + isShining);
		System.out.println("Ich bin eine Taschenlampe");
		System.out.println();
	}

}
