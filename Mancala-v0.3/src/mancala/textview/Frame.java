package mancala.textview;

import javax.swing.JFrame;

import mancala.controller.Controller;

public class Frame extends JFrame {

	private static final long serialVersionUID = -8696870709035575541L;


	private Panel mainPanel = new Panel();
	private MenuBar mainMenu = new MenuBar();
	
	public Frame() {
		this.setJMenuBar(mainMenu);
		this.add(mainPanel);
		this.pack();
		this.setVisible(true);
		this.setResizable(true);
		this.setTitle("CustomGUI");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}