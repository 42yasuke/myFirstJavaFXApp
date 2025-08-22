package org.openjfx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class AppController {

	@FXML
	private TextField textFieldFruit;

	@FXML
	private ListView<String> listViewFruit;

	private ObservableList<String> fruits;

	@FXML
	public void initialize() {
		// Initialize the list with default values
		fruits = FXCollections.observableArrayList("orange", "pomme");
		listViewFruit.setItems(fruits);
	}

	@FXML
	private void handleClick() {
		// Add the text from the TextField to the ListView
		String newFruit = textFieldFruit.getText();
		if (newFruit != null && !newFruit.trim().isEmpty()) {
			fruits.add(newFruit.trim());
			textFieldFruit.clear();
		}
	}
}
