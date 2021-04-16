package chapter05.demos.demo05;

import java.util.ArrayList;

/**
 * Schnittstellen/Interfaces
 * 
 * @author Daniel Appenmaier
 *
 */
public class Demo0505 {

	public static void main(String[] args) {

		LightBulb redLightBulb = new LightBulb(Colour.RED);
		Toaster toaster = new Toaster();
		TableLamp tableLamp = new TableLamp(redLightBulb);

		ArrayList<WiredDevice> wiredDevices = new ArrayList<>();
		wiredDevices.add(toaster); // Upcast
		wiredDevices.add(tableLamp); // Upcast

		// Polymorphie
		for (WiredDevice w : wiredDevices) {
			w.switchOn();
			if (w instanceof TableLamp) {
				TableLamp t = (TableLamp) w; // Downcast
				t.plugIn();
				t.print();
			}
		}

	}

}
