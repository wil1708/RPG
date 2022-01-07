package fr.dawan.rpg.models;

public class Zombies extends Monstres{

    public Zombies() {
        this.setHealth(50);
        this.setPower(10);
        this.setDefense(5);
        this.setCritical(2);
        this.setAlive(true);
    }

    public Zombies(String name, int health, int power, int defense, int critical, int sex, boolean isAlive) {
        super(name, health, power, defense, critical, sex, isAlive);
    }

    public Zombies(String name) {
        super(name);
        this.setHealth(50);
        this.setPower(10);
        this.setDefense(5);
        this.setCritical(2);
        this.setAlive(true);
    }
    @Override
    public int spell1(Monstres zombies){
        return (int) (Math.random() * 3 + 1) * zombies.getPower();
    }

    public static void main(String[] args) {

        System.out.println((int) (Math.random() * 4 + 1));

    }
}
