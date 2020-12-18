package p4_group_8_repo;

import javafx.scene.image.Image;
/**
 * A base class of Digits for score
 * @author POSEIDON
 *
 */
public class Digit extends Actor{
	int dim;
	Image im1;
	@Override
	public void act(long now) {
		// TODO Auto-generated method stub
		
	}
/**
 * 	getting image details
 *
 */
	public Digit(int n, int dim, int x, int y) {
		im1 = new Image("file:src/p4_group_8_repo/img/"+n+".png", dim, dim, true, true);
		setImage(im1);
		setX(x);
		setY(y);
	}
	
}
