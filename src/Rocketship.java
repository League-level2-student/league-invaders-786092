import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class Rocketship extends GameObject {
	boolean left = false;
	boolean right = false;
	boolean up = false;
	boolean down = false;
	
	public static BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;

	public Rocketship(int x, int y, int width, int height) {
		super(x, y, width, height);
		speed = 10;
		// TODO Auto-generated constructor stub
		if(needImage) {
			loadImage("rocket.png");
		}
	}
	
	void loadImage(String imageFile) {
		if(needImage) {
			try {
				image = ImageIO.read(this.getClass().getResourceAsStream(imageFile));
				gotImage = true;
			}
			catch(Exception e) {
				
			}
			needImage = false;
		}
	}
	void draw(Graphics g) {
		if(gotImage) {
			g.drawImage(image, x, y, width, height, null);
		}
		else {
			g.setColor(Color.BLUE);
			g.fillRect(x, y, width, height);
		}
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
