package com.home;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class NavigationTests {
    private Navigation navigation = new Navigation();

    @Test
    public void playerCanMove(){
        var oldPosition = navigation.getPosition();
        navigation.move();
        var currentPosition = navigation.getPosition();
        assertTrue("player has not moved", oldPosition < currentPosition);
    }
}
