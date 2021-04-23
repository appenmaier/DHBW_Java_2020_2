package chapter06.demos.demo01;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Fehlerarten
 * 
 * @author Daniel Appenmaier
 *
 */
public class Demo0601 {

	public static void main(String[] args) {

		/*
		 * Compiler-Fehler aka Syntax-Fehler
		 */
		// string x;
		// "Hallo Welt"

		/*
		 * Logische Fehler
		 */
		System.out.println("4 + 5 = " + add(4, 5));

		/*
		 * Laufzeitfehler aka Ausnahmen/Exceptions
		 */
		// InputMismatchException
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("Bitte ganze Zahl eingeben: ");
				int i = sc.nextInt();
				System.out.println("i: " + i);
				break;
			} catch (InputMismatchException e) {
				sc.nextLine();
				System.err.println("Das war leider keine ganze Zahl");
			}
		}
		sc.close();

		// ArrayIndexOutOfBoundsException
		try {
			int[] numbers = { 3, 5, 2, 1 };
			int number = numbers[4];
			System.out.println("number: " + number);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
		}

		// NullPointerException
		try {
			String text = null;
			char c = text.charAt(0);
			System.out.println("c: " + c);
		} catch (NullPointerException e) {
			System.err.println(e.getMessage());
		}

		// ClassCastException
		try {
			SuperClass superClass;
			SubClassA subClassA = new SubClassA();
			SubClassB subClassB;

			superClass = subClassA; // Upcast
			subClassB = (SubClassB) superClass; // Downcast
		} catch (ClassCastException e) {
			System.err.println(e.getMessage());
		}

	}

	public static int add(int a, int b) {
		return a - b;
	}

}
