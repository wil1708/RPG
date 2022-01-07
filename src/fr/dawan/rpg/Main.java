package fr.dawan.rpg;

import fr.dawan.rpg.models.*;

import java.util.Scanner;

public class Main {

    public static void fight(Aventuriers s, Monstres z){
        s.setFighting(true);
        System.out.println("La dame blessée était en fait un zombie, vous entrez en combat !");
        if(s.getHealth() == 0 || z.getHealth() == 0){
            s.setFighting(false);
            System.out.println("Le combat est terminé");
        }else {
            do{
            System.out.println("Choisissez votre action :");
            int dmg = 0;
            //String[] skills = {"fireBall", "autoHeal", "iceBall"};
            System.out.println("1 = attaque ; 2 = guérison ; 3 = piège");
            Scanner sc = new Scanner(System.in);
            int res = sc.nextInt();
            switch(res){
                case 1 :
                    dmg = s.spell1(s);
                    System.out.println("L'attaque fait " + (dmg / z.getDefense()) + " points de dégats");
                    break;
                case 2 :
                    s.spell2(s);
                    break;
                case 3 :
                    dmg = s.spell3(s);
                    System.out.println();
                    break;
                default: break;
            }

            z.setHealth(z.getHealth() - (dmg / z.getDefense()));

            s.setHealth(s.getHealth() - (z.spell1(z) / s.getDefense()));
                System.out.println("La morsure du zombie vous inflige " + (z.spell1(z) / s.getDefense()) + " points de dégats");
            System.out.println("Vie de l'aventurier : " + s.getHealth());
            System.out.println("Vie du zombie : " + z.getHealth());
            }while(s.getHealth() > 0 && z.getHealth() > 0);


        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenue dans le royaume de Destrelar");

        System.out.println("Créez votre personnage : 1 - Guerrier ; 2 - Sorcier ; 3 - Chasseur");

        int res1 = sc.nextInt();
        Aventuriers aventuriers = null;
        switch (res1){
            case 1:
                 aventuriers = new Guerriers();
                System.out.println("Vous avez choisi la classe Guerrier");
                break;
            case 2:
                 aventuriers = new Sorciers();
                System.out.println("Vous avez choisi la classe Sorcier");
                break;
            case 3:
                 aventuriers = new Chasseurs();
                System.out.println("Vous avez choisi la classe Chasseur");
                break;
            default: break;
        }

        System.out.println("Choisissez votre sexe - 1 = female ; 2 = male");
        int res3 = sc.nextInt();
        aventuriers.setSex(res3);

        System.out.println("Choisissez votre nom");
        String res4 = sc.next();
        aventuriers.setName(res4);

        System.out.println("Caractéristiques du personnage :\n points de vie : " + aventuriers.getHealth() +
                "\n power : " + aventuriers.getPower() +
                "\n defense : " + aventuriers.getDefense() +
                        "\n nom : " + aventuriers.getName() );







        System.out.println("Le seigneur de Destrelar vous a chargé de sauver les paysans du royaume");

        System.out.println("Vous partez en dehors du château pour sauver la population...");

        System.out.println("Vous rencontrez une dame blessée sur votre chemin qui appelle à l'aide...");

        System.out.println("Que voulez-vous faire ?");

        System.out.println("Choix 1 - Lui venir en aide,  Choix 2 - L'ignorer");


        int res2 = sc.nextInt();
        switch(res2){
            case 1:
                Main.fight(aventuriers, new Zombies());
                break;
            default: break;

        }

    }
}
