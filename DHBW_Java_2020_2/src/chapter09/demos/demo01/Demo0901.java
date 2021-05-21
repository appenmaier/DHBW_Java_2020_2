package chapter09.demos.demo01;

/**
 * Generische Programmierung mit und ohne Java Generics
 * 
 * @author Daniel Appenmaier
 *
 */
public class Demo0901 {

	public static void main(String[] args) {

		String text;
		
		/*
		 * Generische Programmierung ohne Java Generics
		 */
		Box box1 = new Box();
		box1.setContent("Hallo Welt");
		text = (String) box1.getContent();

		Box box2 = new Box();
		box2.setContent(5);
		text = (String) box2.getContent(); // Laufzeitfehler

		/*
		 * Generische Programmierung mit Java Generics
		 */
		GenericBox<String> genericBox1 = new GenericBox<>();
		genericBox1.setContent("Hallo Welt");
		text = genericBox1.getContent();

		GenericBox<Integer> genericBox2 = new GenericBox<>();
		genericBox2.setContent(5);
		// text = genericBox2.getContent(); // Kompilierungsfehler

		/*
		 * Namenskonventionen
		 */
		// GenericBox<T>: formaler Typparameter (T)
		// ArrayList<E>: Element (E)
		// Hashtable<K, V>: Schlüssel (K), Wert (V)
		// GenericSixPack<T, U, V, W, X, Y>

	}

}
