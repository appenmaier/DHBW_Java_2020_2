package chapter08.demos.demo01;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Standard-Ein- und Ausgabeströme
 * 
 * @author Daniel Appenmaier
 *
 */
public class Demo0801 {

	public static void main(String[] args) {

		// Standard-Eingabestrom mit Hilfe der Klasse Scanner
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ganze Zahl eingeben: ");
		int i = scanner.nextInt();
		System.out.println("i: " + i);
		scanner.close();

		// Standard-Eingabestrom
		byte[] input = new byte[50];
		int numberOfBytes = 0;
		try {
			System.out.print("Eingabe: ");
			numberOfBytes = System.in.read(input);
		} catch (IOException e) {
		}

		String output = new String(input);

		System.out.println("Eingabe: " + input);
		System.out.println("Eingabe (als String): " + Arrays.toString(input));
		System.out.println("Anzahl Bytes: " + numberOfBytes);
		System.out.println("Ausgabe: " + output);

		// Standard-Ausgabestrom
		System.out.println("Hallo Welt!");

	}

}
