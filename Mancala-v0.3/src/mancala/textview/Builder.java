package mancala.textview;

import javax.swing.JFrame;

/**
 * @author jonathan
 */
public class Builder {
	
	public static Frame mainFrame = new Frame();
	private static Panel mainPanel = new Panel();
	private static MenuBar mainMenu = new MenuBar();
	
	public static void main(String[] args) {
		mainFrame.setJMenuBar(mainMenu);
		mainFrame.add(mainPanel);
		mainFrame.setTitle("CustomGUI");
		mainFrame.pack();
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}	