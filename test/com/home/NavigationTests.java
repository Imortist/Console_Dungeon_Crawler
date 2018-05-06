package com.home;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;


public class NavigationTests {
    Navigation navigation = new Navigation();

    @Test
    public void playerHasPosition(){
        var position = navigation.getPosition();
        assertNotNull("there is no position on map", position);
    }

    @Test
    public void playerCanMove(){
        var oldPosition = navigation.getPosition();
        navigation.move();
        var currentPosition = navigation.getPosition();
        assertTrue("player has not moved", oldPosition < currentPosition);
    }
}
