package fr.dawan.rpg.models;

public class Guerriers extends Aventuriers{

    public Guerriers(String name, int sex) {
        super(name, sex);
        this.setPower(10);
        this.setDefense(15);
        this.setCritical(2);
        this.setAlive(true);
        this.setHealth(100);
    }

    public Guerriers() {
        this.setPower(10);
        this.setDefense(15);
        this.setCritical(2);
        this.setAlive(true);
        this.setHealth(100);
    }

    @Override
    public int spell1(Aventuriers aventuriers) {
        int critical = (int) (Math.random() * 10 + 1);
        if (critical == 10){
            return ((int) (Math.random() * 2 + 1) * aventuriers.getPower()) * aventuriers.getCritical();
        }else {
            return ((int) (Math.random() * 2 + 1) * aventuriers.getPower());
        }
    }

    @Override
    public void spell2(Aventuriers aventuriers) {
        System.out.println("Le guerrier boit de l'alcool");
        if(aventuriers.getHealth() == 100 ){
            System.out.println("PV : " + aventuriers.getHealth());
        } else if(aventuriers.getHealth() >= 91 && aventuriers.getHealth()<= 99){
            aventuriers.setHealth(100);
            System.out.println("PV : " + aventuriers.getHealth());
        } else{
            aventuriers.setHealth(aventuriers.getHealth() + 10);
            System.out.println("PV : " + aventuriers.getHealth());
        }
    }

    @Override
    public int spell3(Aventuriers aventuriers) {
        int iceball = (int) (Math.random() * 3 + 1);
        if(iceball == 1){
            System.out.println("Le monstre est étourdit, vous gagnez un tour");
            return 10;
        } else {
            return 10;
        }
    }
}
