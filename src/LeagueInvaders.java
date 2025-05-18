import javax.swing.JFrame;

public class LeagueInvaders {
	GamePanel panel = new GamePanel();
	JFrame frame = new JFrame();
	static final int WIDTH = 500;
	static final int HEIGHT = 800;
	public LeagueInvaders() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(WIDTH,HEIGHT);
		frame.add(panel);
		}
	public void setup() {
		
	}
}
