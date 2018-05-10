package com.home;

class Monsters {

    private String name;
    private int hp;

    Monsters(String name, int HealthPoints){
        this.name = name;
        this.hp = HealthPoints;
    }

    String getName() {
        return name;
    }

    int getHp() {
        return hp;
    }

}
