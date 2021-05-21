package chapter09.demos.demo02;

import java.util.ArrayList;

import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.Region;

/**
 * Varianz
 * 
 * @author Daniel Appenmaier
 *
 */
public class Demo0902 {

	public static void main(String[] args) {

		// Invarianz
		ArrayList<Parent> invariantList;
//		invariantList = new ArrayList<Node>();
		invariantList = new ArrayList<Parent>();
//		invariantList = new ArrayList<Region>();

		// Bivarianz
		ArrayList<?> bivariantList;
		bivariantList = new ArrayList<Node>();
		bivariantList = new ArrayList<Parent>();
		bivariantList = new ArrayList<Region>();

		// Kovarianz
		ArrayList<? extends Parent> covariantList;
//		covariantList = new ArrayList<Node>();
		covariantList = new ArrayList<Parent>();
		covariantList = new ArrayList<Region>();

		// Kontravarianz
		ArrayList<? super Parent> contravariantList;
		contravariantList = new ArrayList<Node>();
		contravariantList = new ArrayList<Parent>();
//		contravariantList = new ArrayList<Region>();

	}

}
