package View;

import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MainViewHangman extends JFrame{
	//Klassen
	private StartPanel startPanel;
	private PlayerNamesPanel playersNamesView;
	private GamePanel gamePanel;
	private GameOverPanel gameOverPanel;
	
	
	//Konstruktor
	public MainViewHangman() {
				
		this.setTitle("Hangman");
		this.setBounds(300, 50, 500, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Views
		this.setStartView(new StartPanel());
		this.setPlayersNamesView(new PlayerNamesPanel());
		this.setGamePanel(new GamePanel());
		this.setGameOverPanel(new GameOverPanel());
		
		

		this.setContentPane(this.getStartView());
		this.setVisible(true);
		
	}
	
	//Methoden
	//ActionListener für Buttons
	public void addActionListenerToNewGameButton(ActionListener al) {
		this.getStartView().addActionListenerToNewGameButton(al);	
	}
	public void addActionListenertoBtnStartGame(ActionListener al) {
		this.getPlayersNamesView().addActionListenertoBtnStartGame(al);
	}
	public void addActionListenertoBtnSolve(ActionListener al) {
		this.getGamePanel().addActionListenertoBtnSolve(al);
	}
	
	//Methoden zum Switchen der Panels
	public void showGameOverView() {
		this.setContentPane(this.getGameOverPanel());

	}
		
	public void showPlayerNamesView() {			
		
		this.setContentPane(this.getPlayersNamesView());	
		
	}
	
	public void showGameView() {
		this.setContentPane(this.getGamePanel());
	}



	//Getter Setter
	public StartPanel getStartView() {
		return startPanel;
	}

	public void setStartView(StartPanel startPanel) {
		this.startPanel = startPanel;
	}

	public PlayerNamesPanel getPlayersNamesView() {
		return playersNamesView;
	}

	public void setPlayersNamesView(PlayerNamesPanel playersNamesView) {
		this.playersNamesView = playersNamesView;
	}

	public GamePanel getGamePanel() {
		return gamePanel;
	}

	public void setGamePanel(GamePanel gamePanel) {
		this.gamePanel = gamePanel;
	}

	public GameOverPanel getGameOverPanel() {
		return gameOverPanel;
	}

	public void setGameOverPanel(GameOverPanel gameOverPanel) {
		this.gameOverPanel = gameOverPanel;
	}

}
