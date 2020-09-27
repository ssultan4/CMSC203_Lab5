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

import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FXDriver extends Application {

	/**
	 * The main method for the GUI example program JavaFX version
	 * 
	 * @param args not used
	 * @throws IOException
	 */
	public static void main(String[] args) {

		launch(args);
	}

	@Override
	public void start(Stage stage) throws IOException {
		// student Task #1:
		// instantiate the FXMainPane, name it root
		FXMainPane root = new FXMainPane();
		// set the scene to hold root
		stage.setScene(new Scene(root, 500, 250));
		// set stage title
		stage.setTitle("Hello World GUI");
		// display the stage
		stage.show();

	}
}
