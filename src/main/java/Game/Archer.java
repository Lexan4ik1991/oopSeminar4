package Game;

import Game.Shields.Armor;
import Game.Weapons.Ranged;

public class Archer extends Warriors<Ranged , Armor> {
    public Archer(int health, String name, Ranged ranged) {
        super(health, name, ranged);

    }

    public Archer(int health, String name, Ranged ranged, Armor protection) {
        super(health, name, ranged, protection);
    }

    @Override
    public Ranged getWeapon() {
        return super.getWeapon();
    }

    public  int range(){
        return ((Ranged)weapon).getRange();

        //weapon.getRange();
    }

    @Override
    public String toString() {
        return /*"Archer{" +
                "weapon=" + weapon +
                "} " +*/ "Archer{" + super.toString() + "\n" +  "~~~";
    }
}