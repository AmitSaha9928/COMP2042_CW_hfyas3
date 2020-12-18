package jtest;


import javafx.embed.swing.JFXPanel; //to hold all my JavaFX
import org.junit.Test;

import p4_group_8_repo.BackgroundImage;

import static org.junit.Assert.*;

public class BackgroundImageTest {

    private JFXPanel panel = new JFXPanel();
    private BackgroundImage gamebg = new BackgroundImage("file:src/p4_group_8_repo/img/iKogsKW.png");

    @Test
    public void TestSize() {
        assertEquals(gamebg.getHeight(), 848, 0.01);
        assertEquals(gamebg.getWidth(), 600, 0.01);
    }

}
