package View;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class GameOverPanel extends JPanel{
	//Komponenten
	private JLabel labelGameOver;
	private JLabel labelWhoWon;
	private JButton btnNewGame;
	private JButton btnExit;
	
	
	//Konstruktor
	public GameOverPanel() {
		
		this.setBounds(0, 0, 500, 600);
		this.setBackground(new Color(240,248,255));
		this.setLayout(null);
		
		//Komponenten hinzufügen
		this.setLabelGameOver(new JLabel("Game Over"));
		this.getLabelGameOver().setBounds(205, 75, 79, 20);
		this.add(this.getLabelGameOver());
		
		this.setLabelWhoWon(new JLabel("DefaultName hat gewonnen"));
		this.getLabelWhoWon().setBounds(66, 213, 380, 55);
		this.add(this.getLabelWhoWon());
		
		this.setBtnNewGame(new JButton("Neues Spiel"));
		this.getBtnNewGame().setBounds(194, 404, 117, 30);
		this.add(this.getBtnNewGame());
		
		this.setBtnExit(new JButton("Spiel beenden"));
		this.getBtnExit().setBounds(194, 445, 117, 30);
		this.add(this.getBtnExit());
		
		
		
	}

	
	public void addActionListenertoBtnNewGame(ActionListener al) {
		this.getBtnNewGame().addActionListener(al);
	
	}
	
	
	
	
	
	
	
	//Getter Setter
	public JLabel getLabelGameOver() {
		return labelGameOver;
	}


	public void setLabelGameOver(JLabel labelGameOver) {
		this.labelGameOver = labelGameOver;
		labelGameOver.setFont(new Font("Tahoma", Font.BOLD, 11));
		labelGameOver.setHorizontalAlignment(SwingConstants.CENTER);
	}


	public JButton getBtnNewGame() {
		return btnNewGame;
	}


	public void setBtnNewGame(JButton btnNewGame) {
		this.btnNewGame = btnNewGame;
	}


	public JLabel getLabelWhoWon() {
		return labelWhoWon;
	}


	public void setLabelWhoWon(JLabel labelWhoWon) {
		this.labelWhoWon = labelWhoWon;
		labelWhoWon.setHorizontalAlignment(SwingConstants.CENTER);
		labelWhoWon.setFont(new Font("Tahoma", Font.ITALIC, 22));
	}


	public JButton getBtnExit() {
		return btnExit;
	}


	public void setBtnExit(JButton btnExit) {
		this.btnExit = btnExit;
	}

}
