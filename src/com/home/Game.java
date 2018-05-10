package com.home;

import java.util.List;
import java.util.Random;

class Game {
    private Monsters monster = null;
    private Random rnd = new Random();
    private List<Monsters> allMonsters = LoadResources.loadMonstersData();

    Monsters spawnMonster(){
        return monster = allMonsters.get(rnd.nextInt(allMonsters.size()));
    }

    public Monsters getMonster() {
        System.out.println(monster.getName());
        return monster;
    }
}
