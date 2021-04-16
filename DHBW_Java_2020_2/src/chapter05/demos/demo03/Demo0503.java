package chapter05.demos.demo03;

import java.util.ArrayList;

/**
 * Downcast
 * 
 * @author Daniel Appenmaier
 *
 */
public class Demo0503 {

	public static void main(String[] args) {

		LightBulb redLightBulb = new LightBulb(Colour.RED);
		LightBulb blueLightBulb = new LightBulb(Colour.BLUE);

		FlashLight f1 = new FlashLight();
		FlashLight f2 = new FlashLight();
		FlashLight f3 = new FlashLight();

		TableLamp t1 = new TableLamp(redLightBulb);
		TableLamp t2 = new TableLamp(blueLightBulb);
		TableLamp t3 = new TableLamp(redLightBulb);

		ArrayList<Light> lights = new ArrayList<>();
		lights.add(t1);
		lights.add(f1);
		lights.add(f2);
		lights.add(t2);
		lights.add(f3);
		lights.add(t3);

		for (Light l : lights) {
			if (l instanceof TableLamp) {
				TableLamp t;
				t = (TableLamp) l; // Downcast
				t.plugIn();
			}
			l.switchOn();
			l.print();
			l.switchOff();
		}

	}

}
