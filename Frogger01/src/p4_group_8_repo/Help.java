package p4_group_8_repo;

import javafx.scene.image.Image;

public class Help extends Actor{
	
	Image help;
	@Override
	public void act(long now) {
		// TODO
	}
	public Help(int n) {
		help = new Image("file:src/p4_group_8_repo/img/froggerhelpscreen.png", 600,800, true, true);
				setImage(help);
	}
}
