package chapter06.demos.demo02;

public class AlreadyPluggedInException extends Exception {

	public AlreadyPluggedInException() {
		super("Die Tischleuchte ist bereits eingesteckt");
	}

}
