package fr.dawan.rpg.models;

public class Chasseurs extends Aventuriers {

    public Chasseurs() {
        this.setPower(15);
        this.setDefense(10);
        this.setCritical(2);
        this.setAlive(true);
        this.setHealth(75);
    }

    public Chasseurs(String name, int sex) {
        super(name, sex);
        this.setPower(15);
        this.setDefense(10);
        this.setCritical(2);
        this.setAlive(true);
        this.setHealth(75);

    }
    @Override
    public int spell1(Aventuriers chasseurs){
        int critical = (int) (Math.random() * 10 + 1);
        if (critical == 10){
            return ((int) (Math.random() * 2 + 1) * chasseurs.getPower()) * chasseurs.getCritical();
        }else {
            return ((int) (Math.random() * 2 + 1) * chasseurs.getPower());
        }
    }
    @Override
    public void spell2(Aventuriers chasseurs){
        System.out.println("Le chasseur prend une potion");
        if(chasseurs.getHealth() == 75 ){
            System.out.println("PV : " + chasseurs.getHealth());
        } else if(chasseurs.getHealth() >= 66 && chasseurs.getHealth()<= 74){
            chasseurs.setHealth(75);
            System.out.println("PV : " + chasseurs.getHealth());
        } else{
            chasseurs.setHealth(chasseurs.getHealth() + 10);
            System.out.println("PV : " + chasseurs.getHealth());
        }
    }
    @Override
    public int spell3(Aventuriers chasseurs){
        int iceball = (int) (Math.random() * 3 + 1);
        if(iceball == 1){
            System.out.println("Le monstre est piégé, vous gagnez un tour");
            return 10;
        } else {
            return 10;
        }
    }

}
