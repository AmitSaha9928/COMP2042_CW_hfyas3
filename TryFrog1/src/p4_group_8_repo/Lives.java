package p4_group_8_repo;

import javafx.scene.image.Image;
/**
 * A basic class for lives
 * @author Amit Saha
 *
 */
public class Lives extends Actor{
    Image lives;
/**
 * 
 */
    @Override
    public void act(long now) {
        // TODO Auto-generated method stub

    }
    /**
     * getting the score pictures for counting lives
     * @param n
     */
    public Lives(int n) {
        lives = new Image("file:src/p4_group_8_repo/img/"+n+".png", 110, 30, true, true);
        setImage(lives);
        setX(560);
        setY(55);
}

}