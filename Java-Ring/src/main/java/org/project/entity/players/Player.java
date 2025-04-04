package org.project.entity.players;

import org.project.entity.Entity;
import org.project.object.armors.Armor;
import org.project.object.weapons.Weapon;

public class Player implements Entity {
    protected String name;
    Weapon weapon;
    Armor armor;
    private int hp;
    private int maxHP;
    private int mp;
    private int maxMP;

    public Player(String name, int hp, int mp, Weapon weapon, Armor armor) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.weapon = weapon;
        this.armor = armor;
        this.maxHP = hp;
        this.maxMP = mp;
    }

    @Override
    public void attack(Entity target) {
        target.takeDamage(weapon.getDamage());
    }

    @Override
    public void defend() {
        // Defend method that reduces damage
        System.out.println(name + " is defending with armor!");
    }

    @Override
    public void takeDamage(int damage) {
        hp -= Math.max(damage - armor.getDefense(), 0);  // Ensure no negative damage
        System.out.println(name + " took " + damage + " damage. Remaining HP: " + hp);
    }

    @Override
    public void heal(int health) {
        hp += health;
        if (hp > maxHP) {
            hp = maxHP;
        }
        System.out.println(name + " healed " + health + " HP. Current HP: " + hp);
    }

    @Override
    public void fillMana(int mana) {
        mp += mana;
        if (mp > maxMP) {
            mp = maxMP;
        }
        System.out.println(name + " filled " + mana + " mana. Current Mana: " + mp);
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public int getMp() {
        return mp;
    }

    public int getMaxMP() {
        return maxMP;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Armor getArmor() {
        return armor;
    }
}
