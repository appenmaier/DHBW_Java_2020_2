package chapter06.exercises.exercise01;

public class InvalidValueException extends Exception {

	public InvalidValueException(int value) {
		super("Ungültiger Wert: " + value);
	}

}
