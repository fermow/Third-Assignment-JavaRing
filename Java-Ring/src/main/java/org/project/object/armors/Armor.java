package org.project.object.armors;

public abstract class Armor {
    private int defense;

    public Armor(int defense) {
        this.defense = defense;
    }

    public int getDefense() {
        return defense;
    }
}
