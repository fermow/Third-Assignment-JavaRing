package org.project.entity.enemies;

import org.project.object.weapons.Weapon;
import org.project.object.armors.Armor;

public abstract class Skeleton extends Enemy {
    private final Armor armor;


    public Skeleton(int hp, int mp, Weapon weapon, Armor armor) {
        super(hp, mp, weapon);
        this.armor = armor;
    }
}
