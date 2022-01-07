package fr.dawan.rpg.models;

public abstract class Monstres extends Personnages {

    public Monstres() {
    }

    public Monstres(String name, int health, int power, int defense, int critical, int sex, boolean isAlive) {
        super(name, health, power, defense, critical, sex, isAlive);
    }

    public Monstres(String name) {
    }

    public abstract int spell1(Monstres monstres);
}
