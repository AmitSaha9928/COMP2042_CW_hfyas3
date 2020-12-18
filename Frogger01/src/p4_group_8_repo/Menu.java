package p4_group_8_repo;

import javafx.scene.image.Image;
/**
 * A base class to define the main menu
 * @author Amit Saha
 *
 */
public class Menu extends Actor{
		
	Image mainmenu; 
	@Override
		public void act(long now) {
			
		}
/**
 * setting the background image location and size
 */
		public Menu() {
			mainmenu = new Image("file:src/p4_group_8_repo/img/froggermainmenu.png", 600,800, true, true);
					setImage(mainmenu);
		}
}
		