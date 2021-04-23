package chapter06.demos.demo02;

import java.util.ArrayList;

/**
 * Fehler- und Ausnahmenbehandlung
 * 
 * @author Daniel Appenmaier
 *
 */
public class Demo0602 {

	public static void main(String[] args) {

		LightBulb redLightBulb = new LightBulb(Colour.RED);
		TableLamp tableLamp = new TableLamp(redLightBulb);

		try {
			// Anwendungslogik
			tableLamp.plugIn();
			tableLamp.plugIn();
		} catch (AlreadyPluggedInException e) {
			// Fehlerbehandlung
			System.err.println(e.getMessage());
		}

		tableLamp.print();

	}

}
