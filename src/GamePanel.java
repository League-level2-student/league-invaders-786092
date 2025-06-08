import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	final int MENU = 0;
	final int GAME = 1;
	final int END = 2;
	int currentState = MENU;
	Font titleFont;
	Font startFont;
	Timer frameDraw;
	public GamePanel() {
	    titleFont = new Font("Arial", Font.PLAIN, 48);
	    startFont = new Font("Arial", Font.PLAIN, 30);
	    frameDraw = new Timer(1000/60, this);
	    frameDraw.start();
	}
	@Override
	public void paintComponent(Graphics g){
		if(currentState==MENU) {
			drawMenuState(g);
		}
		else if(currentState == GAME){
		    drawGameState(g);
		}
		else if(currentState == END){
		    drawEndState(g);
		}

	}
	public void updateMenuState() {
		
	}
	public void updateGameState() {
		
	}
	public void updateEndState() {
		
	}
	public void drawMenuState(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		g.setFont(titleFont);
		g.setColor(Color.YELLOW);
		g.drawString("League Invaders", 60, 50);
		g.setFont(startFont);
		g.setColor(Color.YELLOW);
		g.drawString("Press ENTER to Start!", 85, 300);
		g.drawString("Press SPACE for Instructions", 40, 475);
	    
	}
	public void drawGameState(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
	}
	public void drawEndState(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		g.setFont(titleFont);
		g.setColor(Color.YELLOW);
		g.drawString("Game Over", 110, 50);
		g.setFont(startFont);
		g.setColor(Color.YELLOW);
		g.drawString("You killed enemies", 100, 300);
		g.drawString("Press ENTER to Restart", 75, 475);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(currentState==MENU) {
			updateMenuState();
		}
		else if(currentState==GAME) {
			updateGameState();
		}
		else if(currentState==END) {
			updateEndState();
		}
		System.out.println("Action");
		repaint();
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode()==KeyEvent.VK_ENTER) {
			if(currentState==END) {
				currentState = MENU;
			}
			else {
				currentState++;
			}
		}
		if(e.getKeyCode()==KeyEvent.VK_UP) {
			System.out.println("UP");
		}
		if(e.getKeyCode()==KeyEvent.VK_DOWN) {
			System.out.println("DOWN");
		}
		if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			System.out.println("RIGHT");
		}
		if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			System.out.println("LEFT");
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
