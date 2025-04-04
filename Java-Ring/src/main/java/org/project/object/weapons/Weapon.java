package org.project.object.weapons;

import org.project.entity.Entity;

import java.util.ArrayList;

public abstract class Weapon {
    private int damage;
    private int manaCost;

    public Weapon(int damage, int manaCost) {
        this.damage = damage;
        this.manaCost = manaCost;
    }

    public Weapon() {

    }

    public int getDamage() {
        return damage;
    }

    public int getManaCost() {
        return manaCost;
    }


    public abstract void uniqueAbility(ArrayList<Entity> targets);
}
