package chapter05.demos.demo05;

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
