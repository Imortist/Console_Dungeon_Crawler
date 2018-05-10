package com.home;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class LoadResources {
    private static final String FILENAME = "D:\\Coding\\Java\\Projects\\Console_Dungeon_Crawler\\res\\Monsters.txt";

    static List<Monsters> loadMonstersData() {
        List<Monsters> monsters = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(FILENAME))){
            String currentLine;
            while((currentLine = bufferedReader.readLine()) != null){
                String monsterName = currentLine.split(" ")[0];
                Integer monsterHP = Integer.valueOf(currentLine.split(" ")[1]);
                Monsters monster = new Monsters(monsterName,monsterHP);
                monsters.add(monster);
            }
        }
        catch (IOException e){
            System.out.println("File not found: " + FILENAME);
        }
        return monsters;
    }
}
