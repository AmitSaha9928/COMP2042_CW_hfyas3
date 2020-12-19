package p4_group_8_repo;

import javafx.scene.image.Image;
/**
 * A base class containing the log obstacle details
 * @author Amit Saha
 *
 */
public class Log extends Actor {
/*
 * setting speed parameters for log
 */
	private double speed;
/**
 * speed	
 */
	@Override
	public void act(long now) {
		move(speed , 0);
		if (getX()>600 && speed>0)
			setX(-180);
		if (getX()<-300 && speed<0)
			setX(700);
	}
/**
 * setting image position
 * @param imageLink
 * @param size
 * @param xpos
 * @param ypos
 * @param s
 */
	public Log(String imageLink, int size, int xpos, int ypos, double s) {
		setImage(new Image(imageLink, size,size, true, true));
		setX(xpos);
		setY(ypos);
		speed = s;
		
	}
/**
 * speed
 * @return integer
 */
	public boolean getLeft() {
		return speed < 0;
	}
}
