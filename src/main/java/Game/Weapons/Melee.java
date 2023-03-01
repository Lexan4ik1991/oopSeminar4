package Game.Weapons;

import Game.Weapon;

public class Melee implements Weapon {
    String weaponName;
    private int damagePoint;


    public Melee(String weaponName,int damagePoint) {
        this.damagePoint = damagePoint;
        this.weaponName = weaponName;
    }

    @Override
    public int damage() {
        return damagePoint;
    }

    @Override
    public String toString() {
        return "Melee{" +
                "damagePoint=" + damagePoint +
                ", weaponName='" + weaponName + '\'' +
                '}';
    }
}
