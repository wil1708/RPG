package fr.dawan.rpg.models;

public abstract class Aventuriers extends Personnages {

    private boolean isFighting;

    public Aventuriers() {
    }

    public Aventuriers(String name, int health, int power, int defense, int critical, int sex, boolean isAlive) {
        super(name, health, power, defense, critical, sex, isAlive);
        this.isFighting = false;
    }

    public Aventuriers(String name, int sex) {
    }

    public void escape(Aventuriers aventuriers){
        int resultRandom = (int) (Math.random() * 2 + 1);
        if (resultRandom == 1) {
            aventuriers.isFighting = false;
            System.out.println("L'aventurier a réussi à s'échapper");
        } else {
            System.out.println("L'aventurier  n'a pas réussi à s'échapper");
        }
    }

    public boolean isFighting() {
        return isFighting;
    }

    public void setFighting(boolean fighting) {
        isFighting = fighting;
    }

    public abstract int spell1(Aventuriers aventuriers);

    public abstract void spell2(Aventuriers aventuriers);

    public abstract int spell3(Aventuriers aventuriers);
}
