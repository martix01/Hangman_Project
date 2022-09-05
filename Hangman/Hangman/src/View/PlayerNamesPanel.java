package View;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PlayerNamesPanel extends JPanel{
	//Komponenten
	private JLabel labelHost;
	private JLabel labelPlayer;
	private JTextField textFieldNameHost;
	private JTextField textFieldNamePlayer;
	private JButton btnStartGame;

	
	

	//Konstruktor
	public PlayerNamesPanel() {
		this.setBounds(0, 0, 500, 600);
		this.setBackground(new Color(240,248,255));
		this.setLayout(null);
		
		
		//KOmponenten hinzufügen
		this.setLabelHost(new JLabel("Spielleiter: "));
		this.getLabelHost().setBounds(104, 221, 64, 30);
		this.add(this.getLabelHost());
		
		this.setLabelPlayer(new JLabel("Spieler: "));
		this.getLabelPlayer().setBounds(104, 264, 50, 30);
		this.add(this.getLabelPlayer());
		
		this.setTextFieldNameHost(new JTextField());
		this.getTextFieldNameHost().setBounds(178, 221 , 145,30);
		this.add(this.getTextFieldNameHost());
		
		this.setTextFieldNamePlayer(new JTextField());
		this.getTextFieldNamePlayer().setBounds(178, 264 , 145,30);
		this.add(this.getTextFieldNamePlayer());
		
		this.setBtnStartGame(new JButton("Spiel beginnen"));
		this.getBtnStartGame().setBounds(178, 421, 142, 44);
		this.add(this.getBtnStartGame());
		
			
		
	
	}
	
	//Methoden
	public void addActionListenertoBtnStartGame(ActionListener al) {
		this.getBtnStartGame().addActionListener(al);
	}

	
	//Getter Setter
	
	public JButton getBtnStartGame() {
		return btnStartGame;
	}
	public void setBtnStartGame(JButton btnStartGame) {
		this.btnStartGame = btnStartGame;
	}

	public JTextField getTextFieldNameHost() {
		return textFieldNameHost;
	}

	public void setTextFieldNameHost(JTextField textFieldNameHost) {
		this.textFieldNameHost = textFieldNameHost;
	}

	public JTextField getTextFieldNamePlayer() {
		return textFieldNamePlayer;
	}

	public void setTextFieldNamePlayer(JTextField textFieldNamePlayer) {
		this.textFieldNamePlayer = textFieldNamePlayer;
	}

	public JLabel getLabelHost() {
		return labelHost;
	}

	public void setLabelHost(JLabel labelHost) {
		this.labelHost = labelHost;
	}

	public JLabel getLabelPlayer() {
		return labelPlayer;
	}

	public void setLabelPlayer(JLabel labelPlayer) {
		this.labelPlayer = labelPlayer;
	}
	

}
