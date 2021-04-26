package chapter07.demos.demo01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Aufbau einer JavaFX-Anwendung
 * 
 * @author Daniel Appenmaier
 *
 */
public class Demo0701 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	public void init() throws Exception {
		// Auslesen und Verarbeiten der Eingabeparameter
		System.out.println("init()");
	}

	public void start(Stage primaryStage) throws Exception {
		// Aufbau der Bühne und Aufruf der ersten Szene
		System.out.println("start()");
		View view = new View();
		Scene scene = new Scene(view.getRoot());
		primaryStage.setTitle("Demo 7.1");
		primaryStage.setHeight(500);
		primaryStage.setWidth(500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public void stop() throws Exception {
		// "Aufräumarbeiten"
		System.out.println("stop()");
	}

}
