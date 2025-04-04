package org.project.entity.enemies;

import org.project.entity.Entity;
import org.project.object.weapons.Weapon;

public abstract class Enemy implements Entity {
    Weapon weapon;
    private int hp;
    private int mp;

    public Enemy(int hp, int mp, Weapon weapon) {
        this.hp = hp;
        this.mp = mp;
        this.weapon = weapon;
    }

    public Enemy() {

    }

    @Override
    public void takeDamage(int damage) {
        hp -= damage;
        System.out.println("Enemy took " + damage + " damage. Remaining HP: " + hp);
    }

    @Override
    public void attack(Entity target) {
        target.takeDamage(weapon.getDamage());
    }

    public int getHp() {
        return hp;
    }

    public int getMp() {
        return mp;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void reset() {
    }
}
