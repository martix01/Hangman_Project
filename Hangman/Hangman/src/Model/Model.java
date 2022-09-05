package Model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Model {
	public String solutionString;
	public String hiddenSolution;
	public String solutionGuess;
	private String namePlayer;
	private String nameHost;
	private int wrongGuessesInt;
	public char[] revealSolutionChar;
	public char[] solutionChar;
	public char guessChar[];
	public boolean isGuessCorrect;
	private StringBuilder collectWrongLetters = new StringBuilder();
	
	
	//Konstruktor
	public Model() {
	this.solutionString = "";
	this.hiddenSolution = "";
	this.solutionGuess = "";
	this.nameHost = "JohnDoe";
	this.namePlayer = "JaneDoe";
	this.setCountWrongGuesses(0);
	this.isGuessCorrect = false;
		
	}
	
	//Methoden
	public void convertSolutionToHidden() {
		
		for(int i=0;i< this.solutionString.length();i++) {
			this.hiddenSolution += " _";
			revealSolutionChar = hiddenSolution.toCharArray();
			
		}
		
		
		
	}
	public int countWrongGuesses() {
		if(checkGuess()==false) {
			this.wrongGuessesInt++;
		}
		return wrongGuessesInt;
	}

	public boolean checkGuess() {
		isGuessCorrect = false;
		
		for(int i=0; i<solutionChar.length;i++) {
			
			if(guessChar[0] == solutionChar[i]) {				
				this.revealSolutionChar[2*i+1]=solutionChar[i];
				isGuessCorrect = true;
				
			}
		}
		
		return isGuessCorrect;		
	}

	public String getNamePlayer() {
		return namePlayer;
	}

	public void setNamePlayer(String namePlayer) {
		this.namePlayer = namePlayer;
	}

	public String getNameHost() {
		return nameHost;
	}

	public void setNameHost(String nameHost) {
		this.nameHost = nameHost;
	}

	public StringBuilder getCollectWrongLetters() {
		return collectWrongLetters;
	}

	public void setCollectWrongLetters(StringBuilder collectWrongLetters) {
		this.collectWrongLetters = collectWrongLetters;
	}

	public int getCountWrongGuesses() {
		return wrongGuessesInt;
	}

	public void setCountWrongGuesses(int countWrongGuesses) {
		this.wrongGuessesInt = countWrongGuesses;
	}
	
	
	
	
	
}
