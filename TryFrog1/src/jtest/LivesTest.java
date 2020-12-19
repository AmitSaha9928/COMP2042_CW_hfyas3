package jtest;


import javafx.embed.swing.JFXPanel; //to hold all my JavaFX
import org.junit.Test;

import p4_group_8_repo.Lives;

import static org.junit.Assert.*;

/**
 * Lives Test Class
 * @author Amit Saha
 *
 */
public class LivesTest {

    private JFXPanel panel = new JFXPanel();
    private  Lives lives = new Lives(1000);
    /**
     * sets Lives test method
     */
    @Test
    public void LivesTest() {
        assertEquals(lives.getHeight(), 0.0, 0.01);
        assertEquals(lives.getWidth(), 0.0, 0.01);
    }

}
