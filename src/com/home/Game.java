package com.home;

class Game {
    private Monster monster = null;

    Monster spawnMonster(){
        return monster = new Monster("");
    }

     void move() {
        Navigation navigation = new Navigation();
        navigation.move();
        spawnMonster();
    }

     Monster getMonster() {
        return monster;
    }
}
