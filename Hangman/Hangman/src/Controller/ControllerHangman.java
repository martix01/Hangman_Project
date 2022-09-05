package Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Model.Model;
import View.MainViewHangman;

public class ControllerHangman {

	private MainViewHangman mainView;
	private Model model;
	

	//Konstruktor
	public ControllerHangman() {
		
		this.setMainView(new MainViewHangman());
		this.setModel(new Model());
		this.getMainView().getStartView().addActionListenerToNewGameButton(this::startPlayersName);
		
		this.getMainView().getPlayersNamesView().addActionListenertoBtnStartGame(this::startGame);
		this.getMainView().getPlayersNamesView().addActionListenertoBtnStartGame(this::setGame);
		this.getMainView().getGamePanel().addActionListenertoBtnSolve(this::startGameOver);
		this.getMainView().getGamePanel().addActionListenertoBtnGuessLetter(this::playGame);
		this.getMainView().getStartView().getBtnExit().addActionListener(al1);
		this.getMainView().getGameOverPanel().getBtnExit().addActionListener(al1);
		this.getMainView().getGamePanel().addActionListenertoBtnSolve(this::solve);
		this.getMainView().getGameOverPanel().addActionListenertoBtnNewGame(this::startPlayersName);

	}
	
	
	//Methoden
	public void setNames() {
		this.getModel().setNameHost(this.getMainView().getPlayersNamesView().getTextFieldNameHost().getText());
		this.getModel().setNamePlayer(this.getMainView().getPlayersNamesView().getTextFieldNamePlayer().getText());

	}
	
	public void chooseSolution() {
		this.getModel().solutionString = JOptionPane.showInputDialog(this.getMainView().getPlayersNamesView().getBtnStartGame(), "Lösungswort von " +this.getModel().getNameHost()+":", "Eingabe des Lösungswort", JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(this.getMainView().getGamePanel(), "Das Lösungswort lautet: "+model.solutionString, "Gleich gehts los!", JOptionPane.INFORMATION_MESSAGE);			
	}
	
	public void setGame(ActionEvent e) {
		this.setNames();
		this.chooseSolution();		
		this.getModel().convertSolutionToHidden();
		//Ausgabe Unterstriche
		this.getMainView().getGamePanel().getLabelCorrectLetter().setText(this.getModel().hiddenSolution);
		
	}
	
	
	public void playGame(ActionEvent e) {
		//Char Variablen zuweisen
		this.getModel().solutionChar = this.getModel().solutionString.toCharArray();
		this.getModel().guessChar = this.getMainView().getGamePanel().getTextfieldInputLetter().getText().toCharArray();

		this.getModel().checkGuess();
		this.getModel().countWrongGuesses();
		this.printGuess();

			
	}
	
	
	public void printGuess() {
		//richtige Buchstaben ausgeben
		if(this.getModel().checkGuess()==true) {
			
			this.getMainView().getGamePanel().getLabelCorrectLetter().setText(String.valueOf(this.getModel().revealSolutionChar));

		}else {			
			//falsche Buchstaben ausgeben
			this.getModel().getCollectWrongLetters().append(this.getModel().guessChar);
			this.getMainView().getGamePanel().getLabelWrongLetter().setText(this.getModel().getCollectWrongLetters().toString());
			
			//Anzahl Versuche reduzieren
			this.getMainView().getGamePanel().getLabelCountGuesses().setText("Verbleibende Versuche: "+(3-this.getModel().getCountWrongGuesses()));
			
			//Prüft ob Spieler alle Versuche verbraucht hat
			if(this.getModel().getCountWrongGuesses()==3) {
				this.startGameOver(null);
				this.getMainView().getGameOverPanel().getLabelWhoWon().setText(this.getModel().getNameHost()+" gewinnt.");				
			}			
		}
	}
	
	
	public void solve(ActionEvent e) {
		
		this.getModel().solutionGuess = JOptionPane.showInputDialog(this.getMainView().getGamePanel().getBtnSolve(), this.getModel().getNamePlayer()+" möchte lösen.", "Eingabe des Lösungswort", JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(this.getMainView().getGamePanel(), "Geraten wurde:  "+model.solutionGuess, "Spielende!", JOptionPane.INFORMATION_MESSAGE);		
	//Prüfen auf GLeichheit der Lösungswortes und Gewinner ausgeben
		if(this.getModel().solutionGuess.equals(this.getModel().solutionString)) {
			this.getMainView().getGameOverPanel().getLabelWhoWon().setText(this.getModel().getNamePlayer()+" gewinnt.");
		}
		else {
			this.getMainView().getGameOverPanel().getLabelWhoWon().setText(this.getModel().getNameHost()+" gewinnt.");
		}
	}
	
	
	//Methoden ActionListener
	ActionListener al1 = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			
			System.exit(0);
		}
	};

	//Methoden Panel Switches
	public void startGameOver(ActionEvent e) {
		this.getMainView().showGameOverView();
		

	}
	public void startPlayersName(ActionEvent e) {
		
		this.getMainView().showPlayerNamesView();
		
		
		
	}
	public void startGame(ActionEvent e) {
		
		this.getMainView().showGameView();	
	}

	
	//Getter Setter
	public MainViewHangman getMainView() {
		return mainView;
	}

	public void setMainView(MainViewHangman mainView) {
		this.mainView = mainView;
	}


	public Model getModel() {
		return model;
	}


	public void setModel(Model model) {
		this.model = model;
	}
	
	
}
