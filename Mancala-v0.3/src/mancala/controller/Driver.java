package mancala.controller;

import mancala.model.BoardModel;

/**
 * @author jonathan
 * @version 0.2
 */

public class Driver {

	/** Static MVC variables */
	static BoardModel model = new BoardModel();
	static BoardView view = new BoardView();
	static Controller controller = new Controller();

	/** Linking everything together */
	public static void main(String[] args) {
		// Linking model to controller
		controller.setModel(model);
		// Linking view to controller
		controller.setView(view);
	}
}