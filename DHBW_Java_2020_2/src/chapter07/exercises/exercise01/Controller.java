package chapter07.exercises.exercise01;

import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {

	@FXML
	private Label diceValueLabel;

	@FXML
	private void rollTheDice(ActionEvent event) {
		Random random = new Random();
		Integer randomNumber = random.nextInt(6) + 1;
		diceValueLabel.setText(randomNumber.toString());
	}

}
