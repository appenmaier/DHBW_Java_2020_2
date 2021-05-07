package chapter07.exercises.exercise02;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * Controller für View.fxml
 * 
 * @author Daniel Appenmaier
 *
 */
public class Controller {

	/*
	 * Attribute
	 */
	@FXML
	private TextField initialCapitalTextField;

	@FXML
	private TextField interestRateTextField;

	@FXML
	private TextField runningTimeTextField;

	@FXML
	private Label interestLabel;

	/*
	 * Methoden
	 */
	public void calculateInterest(ActionEvent event) {
		try {
			Double initialCapital = Double.valueOf(initialCapitalTextField.getText());
			Double interestRate = Double.valueOf(interestRateTextField.getText());
			Integer runningTime = Integer.valueOf(runningTimeTextField.getText());
			Double interest = initialCapital * Math.pow((1 + interestRate / 100), runningTime) - initialCapital;
			interestLabel.setText(interest.toString());
		} catch (NumberFormatException e) {
			Alert alert = new Alert(AlertType.ERROR, "Ungültige oder fehlende Eingabe");
			alert.show();
		}
	}

}
