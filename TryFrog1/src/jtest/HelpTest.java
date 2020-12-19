package jtest;


import javafx.embed.swing.JFXPanel; //to hold all my JavaFX
import org.junit.Test;

import p4_group_8_repo.Help;

import static org.junit.Assert.*;
/**
 * Help Test Class
 * @author Amit Saha
 *
 */
public class HelpTest {

    private JFXPanel panel = new JFXPanel();
    private Help help = new Help(1000);
/**
 * sets Help test method
 */
    @Test
    public void TestSize() {
        assertEquals(help.getHeight(), 800, 0.01);
        assertEquals(help.getWidth(), 600, 0.01);
    }
}