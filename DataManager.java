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

/**
 * The DataManager class should never depend on the GUI, but rather the reverse.
 * So the DataManager methods should not use the GUI directly. If you want data
 * to get from the user to the manager, have the GUI get the data, and call the
 * manager with the data that the GUI got from a text field or other data
 * structure.
 * 
 * @author ralexander
 *
 */
public class DataManager {

	DataManager() {
	}

	/**
	 * This method illustrates how the GUI can interact with the manager
	 */
	public String getHello() {
		return "Hello World";
	}

	public String getHowdy() {
		return "Howdy y'all";
	}

	public String getChinese() {
		return "Ni hau";
	}

}
