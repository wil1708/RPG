package fr.dawan.rpg.models;

public class Sorciers extends Aventuriers{

    public Sorciers() {
        this.setPower(20);
        this.setDefense(5);
        this.setCritical(2);
        this.setAlive(true);
        this.setHealth(50);
    }

    public Sorciers(String name, int sex) {
        super(name, sex);
        this.setPower(20);
        this.setDefense(5);
        this.setCritical(2);
        this.setAlive(true);
        this.setHealth(50);

    }
    @Override
    public int spell1(Aventuriers sorciers){
        int critical = (int) (Math.random() * 10 + 1);
        if (critical == 10){
            return ((int) (Math.random() * 2 + 1) * sorciers.getPower()) * sorciers.getCritical();
        }else {
            return ((int) (Math.random() * 2 + 1) * sorciers.getPower());
        }
    }
    @Override
    public void spell2(Aventuriers sorciers){
        System.out.println("Le sorcier lance un sort de guérison");
        if(sorciers.getHealth() == 50 ){
            System.out.println("PV : " + sorciers.getHealth());
        } else if(sorciers.getHealth() >= 41 && sorciers.getHealth()<= 49){
            sorciers.setHealth(50);
            System.out.println("PV : " + sorciers.getHealth());
        } else{
            sorciers.setHealth(sorciers.getHealth() + 10);
            System.out.println("PV : " + sorciers.getHealth());
        }
    }
    @Override
    public int spell3(Aventuriers sorciers){
        int iceball = (int) (Math.random() * 3 + 1);
        if(iceball == 1){
            System.out.println("Le monstre est gelé, vous gagnez un tour");
            return 10;
        } else {
            return 10;
        }
    }


}
