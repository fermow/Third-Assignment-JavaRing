package org.project;

import org.project.entity.players.Knight;
import org.project.entity.enemies.Skeleton;
import org.project.object.armors.KnightArmor;
import org.project.object.weapons.Sword;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Sword playerWeapon = new Sword(30, 10);
        KnightArmor playerArmor = new KnightArmor(15);


        Knight player = new Knight("Arthur", 100, 50, playerWeapon, playerArmor);


        Sword enemyWeapon = new Sword(20, 5);
        KnightArmor enemyArmor = new KnightArmor(10);
        Skeleton enemy = new Skeleton(80, 0, enemyWeapon, enemyArmor) {
            @Override
            public void defend() {

            }

            @Override
            public void heal(int health) {

            }

            @Override
            public void fillMana(int mana) {

            }

            @Override
            public int getMaxHP() {
                return 0;
            }

            @Override
            public int getMaxMP() {
                return 0;
            }
        };


        Scanner scanner = new Scanner(System.in);
        while (player.getHp() > 0 && enemy.getHp() > 0) {
            System.out.println("\nYour turn! Choose an action: ");
            System.out.println("1. Attack");
            System.out.println("2. Heal");
            System.out.println("3. Defend");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    player.attack(enemy);
                    System.out.println(player.getName() + " attacked " + enemy.getClass().getSimpleName());
                    break;
                case 2:
                    player.heal(20);
                    System.out.println(player.getName() + " healed himself!");
                    break;
                case 3:
                    player.defend();
                    System.out.println(player.getName() + " defended!");
                    break;
                default:
                    System.out.println("Invalid choice! Please choose 1, 2, or 3.");
                    continue;
            }


            if (enemy.getHp() > 0) {
                enemy.attack(player);
                System.out.println("Enemy " + enemy.getClass().getSimpleName() + " attacked " + player.getName());
            }


            System.out.println(player.getName() + " HP: " + player.getHp());
            System.out.println("Enemy HP: " + enemy.getHp());


            if (player.getHp() <= 0) {
                System.out.println(player.getName() + " has been defeated. Game Over!");
            } else if (enemy.getHp() <= 0) {
                System.out.println("You defeated the enemy!");
            }
        }
    }
}
