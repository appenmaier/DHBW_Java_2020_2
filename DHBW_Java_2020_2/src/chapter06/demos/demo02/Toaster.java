package chapter06.demos.demo02;

public class Toaster implements WiredDevice {

	@Override
	public void switchOn() {
		System.out.println("Der Toaster ist jetzt an");
	}

	@Override
	public void switchOff() {
		System.out.println("Der Toaster ist jetzt aus");
	}

}
