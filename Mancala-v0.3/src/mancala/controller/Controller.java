/**
 * 
 */
package mancala.controller;

import mancala.model.AI;
import mancala.model.BoardModel;
import mancala.textview.Frame;

/**
 * @author jonathan
 *
 */
public class Controller {
	// M and V from MVC
	private BoardModel model;
	private Frame frame;
	// Internal variables
	private int playerTurn;		// Needed for save/resume game
	private AI ai = new AI();

	public void setModel(BoardModel model) {
		this.model = model;
	}

	public void setView(Frame frame) {
		this.frame = frame;
		
		// TODO add actionListeners and derivatives to MenuBar and Panel
	}


}