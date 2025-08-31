import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
	Rocketship rocket;
	ArrayList<Projectile> project = new ArrayList<Projectile>();
	ArrayList<Alien> alien = new ArrayList<Alien>();
	Random rand = new Random();
	 public ObjectManager(Rocketship r) {
	        this.rocket = r;
	    }
	 void addProjectile(Projectile p) {
		 project.add(p);
	 }
	 public void addAlien() {
		 alien.add(new Alien(rand.nextInt(LeagueInvaders.WIDTH),0,50,50));
	 }
	 public void update() {
		 for (int i = 0; i < alien.size(); i++) {
		        Alien a = alien.get(i);
		        a.update();
		        if (a.y > LeagueInvaders.HEIGHT) {
		            a.isActive = false;
		        }
		        
		 }
		 for (int i = 0; i < project.size(); i++) {
			 Projectile p = project.get(i);
			 p.update();
			 
			 if(p.y < 0 || p.y > LeagueInvaders.HEIGHT) {
				 p.isActive = false;
			 }
		 }
		 
	 }
	 public void draw(Graphics g) {
		rocket.draw(g);
		for(Alien a : alien) {
	        a.draw(g);
	    }
		for(Projectile p : project) {
			p.draw(g);
		}
	 }
	 public void purgeObjects() {
		 for(int i = alien.size() - 1; i>= 0; i--) {
			 if(!alien.get(i).isActive) {
				 alien.remove(i);
			 }
		 }
		 for (int i = project.size() - 1; i >= 0; i--) {
		        if (!project.get(i).isActive) {
		            project.remove(i);
		        }
		    }
	 }
}
