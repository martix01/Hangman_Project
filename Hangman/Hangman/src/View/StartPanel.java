package View;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;

public class StartPanel extends JPanel{
	
	//Variablen
	private JButton btnNewGame;
	private JButton btnExit;
	BufferedImage imageStart;
	
	public StartPanel() {
		this.setBounds(0, 0, 500, 600);
		
		//Backgroundfarbe nicht veränderbar? 
		this.setBackground(new Color(240,248,255));		
		this.setLayout(null);
		
		
		try {
			this.imageStart = ImageIO.read(this.getClass().getResource("/hangman01.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		this.setBtnNewGame(new JButton("Neues Spiel"));
		this.getBtnNewGame().setBounds(179, 395, 142, 44);
		this.add(this.getBtnNewGame());
		
		
		this.setBtnExit(new JButton("Spiel verlassen"));
		this.getBtnExit().setBounds(179, 450, 142, 44);
		this.add(this.getBtnExit());
		
	}
	
	
	//Methoden
	protected void paintComponent(Graphics g) 
	{
		g.drawImage(imageStart, 130, 25, 213, 427, null);
	}
	public void addActionListenerToNewGameButton(ActionListener al) {
		this.getBtnNewGame().addActionListener(al);		
	}
	

	
	//Getter Setter
	public JButton getBtnExit() {
		return btnExit;
	}
	public void setBtnExit(JButton btnExit) {
		this.btnExit = btnExit;
	}
	public JButton getBtnNewGame() {
		return btnNewGame;
	}
	public void setBtnNewGame(JButton btnNewGame) {
		this.btnNewGame = btnNewGame;
	}
	


}
