package org.project.entity.players;

import org.project.object.armors.KnightArmor;
import org.project.object.weapons.Sword;

public class Knight extends Player {

    public Knight(String name, int i, int i1, Sword sword, KnightArmor knightArmor) {
        super(name, 100, 50, new Sword(), new KnightArmor(10));
    }

    public void defend() {

    }

}
