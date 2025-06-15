import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject {
boolean left = false;
boolean right = false;
boolean up = false;
boolean down = false;
	public Rocketship(int x, int y, int width, int height) {
		super(x, y, width, height);
		speed = 10;
		// TODO Auto-generated constructor stub
	}
	void draw(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(x, y, width, height);
	}
	public void update() {
		super.update();
		if(right) {
			x+=speed;
		}
		if(left) {
			x-=speed;
		}
		if(up) {
			y-=speed;
		}
		if(down) {
			y+=speed;
		}
	}
}
