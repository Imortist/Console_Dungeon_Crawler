package com.home;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class MonstersTest {
    private Monster monster = new Monster("");

    @Test
    // OH NO! And I thought it was a fantasy!
    public void monstersExist(){
        assertNotNull("There is no such things as monsters !!!", monster);
    }

    @Test
    public void monstersHaveName(){
        assertNotNull("There is no name for this monster", monster.getName());
    }

}
