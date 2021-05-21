package chapter09.demos.demo02;

import java.util.Random;

/**
 * Würfel
 * 
 * @author Daniel Appenmaier
 *
 */
public class Dice {

	/*
	 * Attribute
	 */
	private int value;

	/*
	 * Methoden
	 */
	public Dice() {
		rollTheDice();
	}

	public void rollTheDice() {
		Random random = new Random();
		value = random.nextInt(6) + 1;
	}

	public int getValue() {
		return value;
	}

}
