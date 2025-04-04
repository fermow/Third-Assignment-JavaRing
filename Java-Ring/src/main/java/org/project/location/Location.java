package org.project.location;

import org.project.entity.enemies.Enemy;

import java.util.ArrayList;

public class Location {
    private String name;
    private ArrayList<Enemy> enemies;

    public Location(String name, ArrayList<Enemy> enemies) {
        this.name = name;
        this.enemies = enemies;
    }

    /*
    TODO: (BONUS) RESET EACH LOCATION AFTER PLAYER LEAVES
    */
    public void reset() {

        for (Enemy enemy : enemies) {
            enemy.reset();
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<Enemy> getEnemies() {
        return enemies;
    }
}
