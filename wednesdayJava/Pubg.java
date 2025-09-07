package wednesdayJava;

import java.util.Scanner;

public class Pubg {
    int playerId;
    String playerName;
    int kills;
    int health = 100;
    static String gameName = "PUBG";

    public void attackPlayer(Pubg enemy, int damage) {
        System.out.println(playerName + " attacked " + enemy.playerName + " with " + damage + " damage.");
        enemy.health -= damage;
        if (enemy.health <= 0) {
            enemy.health = 0;
            System.out.println(enemy.playerName + " is defeated!");
            addKill();
        } else {
            System.out.println(enemy.playerName + " has " + enemy.health + " health left.");
        }
    }

    public void addKill() {
        kills++;
        System.out.println(playerName + " now has " + kills + " kills.");
    }

    public void displayStats() {
        System.out.println("Player ID: " + playerId);
        System.out.println("Player Name: " + playerName);
        System.out.println("Kills: " + kills);
        System.out.println("Health: " + health);
        System.out.println("Game Name: " + gameName);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pubg p1 = new Pubg();
        p1.playerId = 1;
        System.out.print("Enter Player 1 Name: ");
        p1.playerName = sc.nextLine();

        Pubg p2 = new Pubg();
        p2.playerId = 2;
        System.out.print("Enter Player 2 Name: ");
        p2.playerName = sc.nextLine();

        System.out.println("\n=== PUBG Match Start ===");
        p1.displayStats();
        p2.displayStats();

        while (p1.health > 0 && p2.health > 0) {
            System.out.print("\nEnter damage by " + p1.playerName + ": ");
            int damageByP1 = sc.nextInt();
            p1.attackPlayer(p2, damageByP1);
            if (p2.health <= 0)
                break;

            System.out.print("\nEnter damage by " + p2.playerName + ": ");
            int damageByP2 = sc.nextInt();
            p2.attackPlayer(p1, damageByP2);
        }

        System.out.println("\n=== Final Match Stats ===");
        p1.displayStats();
        p2.displayStats();

        if (p1.health > 0) {
            System.out.println(p1.playerName + " Wins the Match!");
        } else {
            System.out.println(p2.playerName + " Wins the Match!");
        }

        sc.close();
    }
}
