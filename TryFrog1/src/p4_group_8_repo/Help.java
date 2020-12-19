package p4_group_8_repo;

import javafx.scene.image.Image;
/**
 * A basic class for the Help Screen
 * @author POSEIDON
 *
 */
public class Help extends Actor{
	
	Image help;
	@Override
	public void act(long now) {
		// TODO
	}
	/**
	 * stating the screen picture location and its parameters
	 */
	public Help(int n) {
		help = new Image("file:src/p4_group_8_repo/img/froggerhelpscreen.png", 600,800, true, true);
				setImage(help);
	}
}
