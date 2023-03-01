package Game;

import java.util.Random;

public abstract class Warriors<W extends Weapon , E extends  Shield>  {


    private int health;

    private String name;

    protected W weapon;

    protected E protection;

    private boolean protect;

    protected Warriors(int health, String name, W weapon) {
        this.health = health;
        this.name = name;
        this.weapon = weapon;
    }

    protected Warriors(int health, String name, W weapon, E protection) {
        this.health = health;
        this.name = name;
        this.weapon = weapon;
        this.protection = protection;
        this.protect = true;
    }

    public boolean isProtected() {
        return protect;
    }

    public int damageFork(){
        Random random = new Random();
        return random.nextInt(weapon.damage());

    }

    public boolean hit(Warriors recepient){
        int damage = damageFork();

        return ! recepient.reduceHealth(damage);


    }



    public boolean reduceHealth(int damage){
        health -= damage;
        return health>0;
    }


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public W getWeapon() {
        return weapon;
    }

    public void setWeapon(W weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {

        if (protect){
            return "BaseHero{" +
                    "health=" + health +
                    ", name='" + name + '\'' +
                    ", weapon=" + weapon +
                    ", shield=" + protect +
                    '}';
        }
        else {
            return "BaseHero{" +
                    "health=" + health +
                    ", name='" + name + '\'' +
                    ", weapon=" + weapon +
                    '}';
        }
    }

}