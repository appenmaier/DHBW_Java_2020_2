package chapter07.demos.demo04;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

public class Controller {

	@FXML
	private TextField inputTextField;

	@FXML
	private Button inputToOutputButton;

	@FXML
	private Label outputLabel;

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
