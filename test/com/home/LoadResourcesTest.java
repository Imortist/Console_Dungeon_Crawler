package com.home;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class LoadResourcesTest {


    @Test
    public void loadMonstersCreatesMap(){
        assertNotNull(LoadResources.loadMonstersData());
    }

    @Test
    public void loadMonstersHasValuesInMap(){
        assertTrue(LoadResources.loadMonstersData().size() > 0);
    }
}
