package mancala.textview;

import javax.swing.JFrame;

/**
 * @author jonathan
 */
public class Build {
	
	public static Frame mainFrame = new Frame();
	private Panel mainPanel = new Panel();
	private MenuBar mainMenu = new MenuBar();
	
	public Build() {
		mainFrame.setJMenuBar(mainMenu);
		mainFrame.add(mainPanel);
		mainFrame.setTitle("CustomGUI");
		mainFrame.pack();
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}	