package jtest;


import javafx.embed.swing.JFXPanel;
import org.junit.Test;

import p4_group_8_repo.BackgroundImage;

import static org.junit.Assert.*;
/**
 * Background Image Test Class
 * @author Amit Saha
 *
 */
public class BackgroundImageTest {

    private JFXPanel panel = new JFXPanel();
    private BackgroundImage backgroundimage = new BackgroundImage("file:src/p4_group_8_repo/img/iKogsKW.png");
/**
 * sets Background Image test method
 */
    @Test
    public void TestSize() {
        assertEquals(backgroundimage.getHeight(), 848, 0.01);
        assertEquals(backgroundimage.getWidth(), 600, 0.01);
    }

}
