package chapter07.demos.demo05;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.event.ActionEvent;

public class Controller {

	@FXML
	private TextField inputTextField;

	@FXML
	private Button inputToOutputButton;

	@FXML
	private Label outputLabel;

	@FXML
	private ImageView javaFxImageView;

	@FXML
	public void inputToOutput(ActionEvent event) {
		// Eingabe auslesen
		String text = inputTextField.getText();
		// Eingabe anzeigen
		outputLabel.setText(text);
		// Nachrichtendialog anzeigen
		Alert alert = new Alert(AlertType.ERROR, text);
		alert.show();
	}

}
