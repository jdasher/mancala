package mancala.controller;

import mancala.model.BoardModel;
import mancala.textview.Build;

/**
 * @author jonathan
 * @version 0.2
 */

public class Driver {

	/** Static MVC variables */
	static BoardModel model = new BoardModel();
	static Build view = new Build();
	static Controller controller = new Controller();

	/** Linking everything together */
	public static void main(String[] args) {
		// Linking model to controller
		controller.setModel(model);
		// Linking view to controller
		controller.setView(view);
	}
}