package org.project.object.weapons;

import org.project.entity.Entity;
import java.util.ArrayList;

public class Sword extends Weapon {
    int abilityCharge;

    public Sword() {
        super(20, 10);
        this.abilityCharge = 0;
    }

    public Sword(int i, int i1) {
        super();
    }

    @Override
    public void uniqueAbility(ArrayList<Entity> targets) {
        abilityCharge += 2;
        for (Entity target : targets) {
            target.takeDamage(getDamage());
        }
        System.out.println("Sword's unique ability activated!");
    }
}
