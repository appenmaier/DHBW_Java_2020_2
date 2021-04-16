package chapter05.demos.demo05;

/**
 * Lampe
 * 
 * @author Daniel Appenmaier
 *
 */
public abstract class Light {

	/*
	 * Attribute
	 */
	protected boolean isOn;
	protected boolean isShining;

	/*
	 * Methoden
	 */
	public Light() {

	}

	// Light.switchOn: abstrakte Methode
	public abstract void switchOn();

	public final void switchOff() {
		isOn = false;
		isShining = false;
	}

	// Light.print: abstrakte Methode
	public abstract void print();

}
