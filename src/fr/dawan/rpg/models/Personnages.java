package fr.dawan.rpg.models;

public abstract class Personnages {

    private String name;
    private int health;
    private int power;
    private int defense;
    private int critical;
    private int sex;
    private boolean isAlive;


    public Personnages() {
    }

    public Personnages(String name, int health, int power, int defense, int critical, int sex, boolean isAlive) {
        this.name = name;
        this.health = health;
        this.power = power;
        this.defense = defense;
        this.critical = critical;
        this.sex = sex;
        this.isAlive = isAlive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getCritical() {
        return critical;
    }

    public void setCritical(int critical) {
        this.critical = critical;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
