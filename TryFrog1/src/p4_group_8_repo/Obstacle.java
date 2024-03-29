package p4_group_8_repo;

import javafx.scene.image.Image;
/**
 * A base class for defining car obstacle parameters 
 * @author Amit Saha
 *
 */
public class Obstacle extends Actor {
/**
 * setting obstacle speed	
 */
	private int speed;
	@Override
	public void act(long now) {
		move(speed , 0);
		if (getX() > 600 && speed>0)
			setX(-200);
		if (getX() < -50 && speed<0)
			setX(600);
	}
/**
 * obstacle speed	
 * @param imageLink
 * @param xpos
 * @param ypos
 * @param s
 * @param w
 * @param h
 */
	public Obstacle(String imageLink, int xpos, int ypos, int s, int w, int h) {
		setImage(new Image(imageLink, w,h, true, true));
		setX(xpos);
		setY(ypos);
		speed = s;
	}

}
