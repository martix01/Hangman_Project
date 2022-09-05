package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Panel;

 

public class GamePanel extends JPanel{
	//Komponenten
	private JLabel labelLetter;
	private JLabel labelGuessedLetter;
	private JTextField textfieldInputLetter;
	private JLabel labelWrongLetter;
	private JButton btnGuessLetter;
	private JButton btnSolve;
	private JLabel labelHiddenSolution;
	private JLabel labelCorrectLetter;
	private JLabel labelCountGuesses;

	
	
	
//Konstruktor
	public GamePanel() {
		this.setBounds(0, 0, 500, 600);
		this.setBackground(new Color(240,248,255));
		this.setLayout(null);

		//Komponenten hinzufügen
		this.setLabelCorrectLetter(new JLabel());
		this.getLabelCorrectLetter().setBounds(40, 74, 397, 48);
		this.add(this.getLabelCorrectLetter());
				
	
		this.setLabelLetter(new JLabel("Buchstabe raten:"));
		this.getLabelLetter().setBounds(40, 384, 145, 30);
		this.add(this.getLabelLetter());
		
		this.setTextfieldInputLetter(new JTextField(" "));
		this.getTextfieldInputLetter().setBounds(195, 385, 100, 30);
		this.add(this.getTextfieldInputLetter());
		
		this.setBtnGuessLetter(new JButton("OK"));
		this.getBtnGuessLetter().setBounds(305, 385, 69, 30);
		this.add(this.getBtnGuessLetter());
		
		this.setBtnSolve(new JButton("Lösen"));
		this.getBtnSolve().setBounds(195, 446, 100, 30);
		this.add(this.getBtnSolve());
		
		this.setLabelGuessedLetter(new JLabel("geratene Buchstaben:"));
		this.getLabelGuessedLetter().setBounds(40, 510, 145, 30);
		this.add(this.getLabelGuessedLetter());
		
		this.setLabelWrongLetter(new JLabel(""));
		this.getLabelWrongLetter().setBounds(195, 509, 120, 30);
		this.add(this.getLabelWrongLetter());
		
		this.setLabelCountGuesses(new JLabel("Verbleibende Versuche: 3"));
		this.getLabelCountGuesses().setBounds(134, 229, 240, 48);
		this.add(this.getLabelCountGuesses());

	}
//fehlerhaft	
//	public void paint(Graphics g) {
//		g.drawLine(10, 20, 100, 20);
//		
//	}
	
	//Methoden
	public void addActionListenertoBtnSolve(ActionListener al) {
		this.getBtnSolve().addActionListener(al);
	
	}
	public void addActionListenertoBtnGuessLetter(ActionListener al) {
		this.getBtnGuessLetter().addActionListener(al);
	
	}

	
	//Getter Setter
	public JLabel getLabelLetter() {
		return labelLetter;
	}

	public void setLabelLetter(JLabel labelLetter) {
		this.labelLetter = labelLetter;
		labelLetter.setFont(new Font("Tahoma", Font.PLAIN, 12));
		labelLetter.setHorizontalAlignment(SwingConstants.LEFT);
	}




	public JLabel getLabelGuessedLetter() {
		return labelGuessedLetter;
	}




	public void setLabelGuessedLetter(JLabel labelGuessedLetter) {
		this.labelGuessedLetter = labelGuessedLetter;
		labelGuessedLetter.setFont(new Font("Tahoma", Font.PLAIN, 12));
	}




	public JTextField getTextfieldInputLetter() {
		return textfieldInputLetter;
	}




	public void setTextfieldInputLetter(JTextField textfieldInputLetter) {
		this.textfieldInputLetter = textfieldInputLetter;
		textfieldInputLetter.setFont(new Font("Tahoma", Font.PLAIN, 14));
	}




	public JLabel getLabelWrongLetter() {
		return labelWrongLetter;
	}




	public void setLabelWrongLetter(JLabel labelWrongLetter) {
		this.labelWrongLetter = labelWrongLetter;
		labelWrongLetter.setFont(new Font("Tahoma", Font.PLAIN, 14));
	}




	public JButton getBtnGuessLetter() {
		return btnGuessLetter;
	}




	public void setBtnGuessLetter(JButton btnGuessLetter) {
		this.btnGuessLetter = btnGuessLetter;
		btnGuessLetter.setFont(new Font("Tahoma", Font.BOLD, 12));
	}




	public JButton getBtnSolve() {
		return btnSolve;
	}




	public void setBtnSolve(JButton btnSolve) {
		this.btnSolve = btnSolve;
		btnSolve.setFont(new Font("Tahoma", Font.BOLD, 12));
	}
	public JLabel getLabelHiddenSolution() {
		return labelHiddenSolution;
	}
	public void setLabelHiddenSolution(JLabel labelHiddenSolution) {
		this.labelHiddenSolution = labelHiddenSolution;
		labelHiddenSolution.setHorizontalAlignment(SwingConstants.CENTER);
	}

	public JLabel getLabelCorrectLetter() {
		return labelCorrectLetter;
	}

	public void setLabelCorrectLetter(JLabel labelCorrectLetter) {
		this.labelCorrectLetter = labelCorrectLetter;
		labelCorrectLetter.setHorizontalAlignment(SwingConstants.CENTER);
		labelCorrectLetter.setFont(new Font("Tahoma", Font.PLAIN, 32));
	}

	public JLabel getLabelCountGuesses() {
		return labelCountGuesses;
	}

	public void setLabelCountGuesses(JLabel labelCountGuesses) {
		this.labelCountGuesses = labelCountGuesses;
		labelCountGuesses.setHorizontalAlignment(SwingConstants.CENTER);
		labelCountGuesses.setFont(new Font("Tahoma", Font.ITALIC, 16));
	}
}
