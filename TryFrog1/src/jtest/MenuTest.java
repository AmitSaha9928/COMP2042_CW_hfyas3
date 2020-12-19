package jtest;


import javafx.embed.swing.JFXPanel; //to hold all my JavaFX
import org.junit.Test;

import p4_group_8_repo.Menu;

import static org.junit.Assert.*;

/**
 * Menu Test Class
 * @author POSEIDON
 *
 */
public class MenuTest {

    private JFXPanel panel = new JFXPanel();
    private  Menu menu = new Menu();

    @Test

/**
 * sets Menu test method
 */
    public void MenusTest() {
        assertEquals(menu.getHeight(), 800, 0.01);
        assertEquals(menu.getWidth(), 600, 0.01);
    }

}