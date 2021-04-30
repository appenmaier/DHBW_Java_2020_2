package chapter07.demos.demo05;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Bereichscontainer und Bilderrahmen
 * 
 * @author Daniel Appenmaier
 *
 */
public class Demo0705 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("View.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setTitle("Demo 7.5");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
