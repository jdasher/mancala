package mancala.textview;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import mancala.controller.Controller;

public class Panel extends JPanel {

	private static final long serialVersionUID = -5931426239657239552L;

	private GridBagConstraints gridCon = new GridBagConstraints();

	// Buttons to represent game board
	private JButton pit1 = new JButton("4");
	private JButton pit2 = new JButton("4");
	private JButton pit3 = new JButton("4");
	private JButton pit4 = new JButton("4");
	private JButton pit5 = new JButton("4");
	private JButton pit6 = new JButton("4");
	private JButton pit7 = new JButton("4");
	private JButton pit8 = new JButton("4");
	private JButton pit9 = new JButton("4");
	private JButton pit10 = new JButton("4");
	private JButton pit11 = new JButton("4");
	private JButton pit12 = new JButton("4");
	// Buttons for player values
	private JLabel player1Score = new JLabel("0");
	private JLabel player2Score = new JLabel("0");
	// Labels for player scores
	private JLabel player1Label = new JLabel("Player 1");
	private JLabel player2Label = new JLabel("Player 2");





	public Panel() {
		this.setLayout(new GridBagLayout());
		// Buttons 1-12
		gridCon.gridx = 1;
		gridCon.gridy = 1;
		gridCon.insets = new Insets(10,10,10,10);
		this.add(pit12,gridCon);

		gridCon.gridx = 2;
		gridCon.gridy = 1;
		gridCon.insets = new Insets(10,10,10,10);
		this.add(pit11,gridCon);

		gridCon.gridx = 3;
		gridCon.gridy = 1;
		gridCon.insets = new Insets(10,10,10,10);
		this.add(pit10,gridCon);

		gridCon.gridx = 4;
		gridCon.gridy = 1;
		gridCon.insets = new Insets(10,10,10,10);
		this.add(pit9,gridCon);

		gridCon.gridx = 5;
		gridCon.gridy = 1;
		gridCon.insets = new Insets(10,10,10,10);
		this.add(pit8,gridCon);

		gridCon.gridx = 6;
		gridCon.gridy = 1;
		gridCon.insets = new Insets(10,10,10,10);
		this.add(pit7,gridCon);

		gridCon.gridx = 1;
		gridCon.gridy = 4;
		gridCon.insets = new Insets(10,10,10,10);
		this.add(pit1,gridCon);

		gridCon.gridx = 2;
		gridCon.gridy = 4;
		gridCon.insets = new Insets(10,10,10,10);
		this.add(pit2,gridCon);

		gridCon.gridx = 3;
		gridCon.gridy = 4;
		gridCon.insets = new Insets(10,10,10,10);
		this.add(pit3,gridCon);

		gridCon.gridx = 4;
		gridCon.gridy = 4;
		gridCon.insets = new Insets(10,10,10,10);
		this.add(pit4,gridCon);

		gridCon.gridx = 5;
		gridCon.gridy = 4;
		gridCon.insets = new Insets(10,10,10,10);
		this.add(pit5,gridCon);

		gridCon.gridx = 6;
		gridCon.gridy = 4;
		gridCon.insets = new Insets(10,10,10,10);
		this.add(pit6,gridCon);

		// Player pit scores
		gridCon.gridx = 0;
		gridCon.gridy = 2;
		gridCon.insets = new Insets(10,10,10,10);
		this.add(player2Score, gridCon);

		gridCon.gridx = 7;
		gridCon.gridy = 2;
		gridCon.insets = new Insets(10,10,10,10);
		this.add(player1Score, gridCon);

		// Player pit labels
		gridCon.gridx = 0;
		gridCon.gridy = 3;
		gridCon.insets = new Insets(10,10,10,10);
		this.add(player2Label, gridCon);

		gridCon.gridx = 7;
		gridCon.gridy = 3;
		gridCon.insets = new Insets(10,10,10,10);
		this.add(player1Label, gridCon);
	}

}