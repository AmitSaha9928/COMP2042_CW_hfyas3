package p4_group_8_repo;

import javafx.scene.image.Image;

public class Menu extends Actor{
		
	Image mainmenu; //need this for making menu appear
	@Override
		public void act(long now) {
			
		}
		public Menu() {
			mainmenu = new Image("file:src/p4_group_8_repo/img/froggermainmenu.png", 600,800, true, true);
					setImage(mainmenu);
		}
}
		