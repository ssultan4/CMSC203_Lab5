/*
 * Class: CMSC203 CRN 25800
 * Instructor: Greg Grinberg
 * Description: GUI that displays different ways to say hello.
 * Due: 9/27/2020
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: _Sereen Sultana_
*/

package GUI;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed. Before
 * beginning to implement, design the structure of your GUI in order to
 * understand what panels go inside which ones, and what buttons or other
 * components go in which panels.
 * 
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

	// student Task #2:
	Button button1, button2, button3, button4, button5;
	Label label1;
	TextField textField1;

	// declare two HBoxes
	HBox hBox1, hBox2;

	// student Task #4:
	// declare an instance of DataManager
	DataManager DataManagerInstance;

	/**
	 * The MainPanel constructor sets up the entire GUI in this approach. Remember
	 * to wait to add a component to its containing component until the container
	 * has been created. This is the only constraint on the order in which the
	 * following statements appear.
	 */
	FXMainPane() {
		// student Task #2:
		// instantiate the buttons, label, and textfield
		button1 = new Button("Hello");
		button1.setOnAction(new ButtonHandler());
		button2 = new Button("Howdy");
		button2.setOnAction(new ButtonHandler());
		button3 = new Button("Chinese");
		button3.setOnAction(new ButtonHandler());
		button4 = new Button("Clear");
		button4.setOnAction(new ButtonHandler());
		button5 = new Button("Exit");
		button5.setOnAction(new ButtonHandler());

		label1 = new Label("Feedback");

		textField1 = new TextField();

		// instantiate the HBoxes
		hBox1 = new HBox();
		hBox2 = new HBox();

		// student Task #4:
		// instantiate the DataManager instance
		DataManagerInstance = new DataManager();
		// set margins and set alignment of the components
		HBox.setMargin(button1, new Insets(10));
		HBox.setMargin(button2, new Insets(10));
		HBox.setMargin(button3, new Insets(10));
		HBox.setMargin(button4, new Insets(10));
		HBox.setMargin(button5, new Insets(10));

		hBox1.setAlignment(Pos.CENTER);
		hBox2.setAlignment(Pos.CENTER);

		// student Task #3:
		// add the label and textfield to one of the HBoxes
		hBox1.getChildren().addAll(label1, textField1);

		// add the buttons to the other HBox
		hBox2.getChildren().addAll(button1, button2, button3, button4, button5);

		// add the HBoxes to this FXMainPanel (a VBox)
		getChildren().addAll(hBox1, hBox2);
	}

	// Task #4:
	// create a private inner class to handle the button clicks
	private class ButtonHandler implements EventHandler<ActionEvent> {
		public void handle(ActionEvent event) {
			if (event.getTarget() == button1) {
				textField1.setText(DataManagerInstance.getHello());
			}
			if (event.getTarget() == button2) {
				textField1.setText(DataManagerInstance.getHowdy());
			}
			if (event.getTarget() == button3) {
				textField1.setText(DataManagerInstance.getChinese());
			}
			if (event.getTarget() == button4) {
				textField1.setText("");
			}
			if (event.getTarget() == button5) {
				Platform.exit();
				System.exit(0);
			}
		}
	}
}
