package chapter05.demos.demo01;

/**
 * Lampe
 * 
 * @author Daniel Appenmaier
 *
 */
public class Light {

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

	public void switchOn() {
		isOn = true;
		isShining = true;
	}

	public void switchOff() {
		isOn = false;
		isShining = false;
	}

	public void print() {
		System.out.println(isOn + " - " + isShining);
	}

}
