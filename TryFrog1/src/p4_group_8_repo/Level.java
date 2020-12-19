package p4_group_8_repo;

import javafx.scene.image.Image;
/**
 * A basic class for lives
 * @author Amit Saha
 *
 */
public class Level extends Actor{
    Image level;

    @Override
    public void act(long now) {
        // TODO Auto-generated method stub

    }
    /**
     * getting the score pictures for counting lives
     */
    public Level() {
        level = new Image("file:src/p4_group_8_repo/img/froggermainmenu2.png", 600,800, true, true);
        setImage(level);
       
}

}