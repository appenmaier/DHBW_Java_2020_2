package chapter05.demos.demo02;

import java.util.ArrayList;

/**
 * Upcast und Polymorphie
 * 
 * @author Daniel Appenmaier
 *
 */
public class Demo0502 {

	public static void main(String[] args) {

		LightBulb redLightBulb = new LightBulb(Colour.RED);
		LightBulb blueLightBulb = new LightBulb(Colour.BLUE);

		/*
		 * ohne Vererbung
		 */
		ArrayList<FlashLight> flashLights = new ArrayList<>();
		FlashLight f1 = new FlashLight();
		FlashLight f2 = new FlashLight();
		FlashLight f3 = new FlashLight();
		flashLights.add(f1);
		flashLights.add(f2);
		flashLights.add(f3);

		ArrayList<TableLamp> tableLamps = new ArrayList<>();
		TableLamp t1 = new TableLamp(redLightBulb);
		TableLamp t2 = new TableLamp(blueLightBulb);
		TableLamp t3 = new TableLamp(redLightBulb);
		tableLamps.add(t1);
		tableLamps.add(t2);
		tableLamps.add(t3);

//		for (FlashLight f : flashLights) {
//			f.print();
//		}
//
//		for (TableLamp t : tableLamps) {
//			t.print();
//		}

		/*
		 * mit Vererbung
		 */
		ArrayList<Light> lights = new ArrayList<>();
		lights.add(t1); // Upcast
		lights.add(f1); // Upcast
		lights.add(f2); // Upcast
		lights.add(t2); // Upcast
		lights.add(f3); // Upcast
		lights.add(t3); // Upcast

		// Polymorphie
		for (Light l : lights) {
			l.switchOn();
			l.print();
			l.switchOff();
		}

	}

}
