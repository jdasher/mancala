package mancala.textview;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBar extends JMenuBar implements ActionListener {

	private static final long serialVersionUID = -8309774919470324238L;
	
	private JMenu gameMenu = new JMenu();
	private JMenuItem newGame = new JMenuItem();
	private JMenuItem saveGame = new JMenuItem();
	private JMenuItem loadGame = new JMenuItem();
	private JMenuItem exitGame = new JMenuItem();
	private JMenu optionsMenu = new JMenu();
	private JMenuItem graphics = new JMenuItem();
	private JMenuItem text = new JMenuItem();
	private JMenuItem twoPlayer = new JMenuItem();
	private JMenuItem AI = new JMenuItem();
	private JMenu spacer = new JMenu();
	
	public MenuBar() {
	// Set text for buttons
			newGame.setText("New");
			saveGame.setText("Save");
			loadGame.setText("Load");
			exitGame.setText("Exit");
			gameMenu.setText("Game");
			
			optionsMenu.setText("Options");
			graphics.setText("Graphics");
			text.setText("Text");
			twoPlayer.setText("2 player");
			AI.setText("Play AI");
			
			// Add new and save game options to game menu
			gameMenu.add(newGame);
			gameMenu.add(saveGame);
			gameMenu.add(loadGame);
			gameMenu.add(exitGame);
					
			optionsMenu.add(text);
			optionsMenu.add(graphics);
			optionsMenu.add(twoPlayer);
			optionsMenu.add(AI);
			
			// Add Options menu to main bar
			this.add(gameMenu);
			spacer.setText("    ");
			spacer.setEnabled(false);
			this.add(spacer);
			this.add(optionsMenu);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
