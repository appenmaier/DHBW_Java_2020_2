package chapter05.demos.demo01;

/**
 * Aufzählungen
 * 
 * @author Daniel Appenmaier
 *
 */
public class Demo0501 {

	public static void main(String[] args) {

		LightBulb redLightBulb = new LightBulb(Colour.RED);
		LightBulb blueLightBulb = new LightBulb(Colour.BLUE);

		FlashLight f = new FlashLight();
		f.switchOn();
		f.print();
		f.switchOff();
		f.print();

		TableLamp t = new TableLamp(blueLightBulb);
		t.switchOn();
		t.print();
		t.plugIn();
		t.print();
		t.switchOff();
		t.print();

	}

}
