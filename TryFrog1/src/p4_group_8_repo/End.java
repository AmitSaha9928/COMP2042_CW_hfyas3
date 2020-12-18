package p4_group_8_repo;

import javafx.scene.image.Image;
/**
 * A base class for initial and final image of the "finish box"
 * @author Amit Saha
 *
 */
public class End extends Actor{
	boolean activated = false;
	@Override
	public void act(long now) {
	
	}
	/**
	 * image for initial state
	 * 
	 */
	public End(int x, int y) {
		setX(x);
		setY(y);
		setImage(new Image("file:src/p4_group_8_repo/img/End.png", 60, 60, true, true));
	}
	/**
	 * image for final state
	 * 
	 */
	public void setEnd() {
		setImage(new Image("file:src/p4_group_8_repo/img/FrogEnd.png", 70, 70, true, true));
		activated = true;
	}
	
	public boolean isActivated() {
		return activated;
	}
	

}
