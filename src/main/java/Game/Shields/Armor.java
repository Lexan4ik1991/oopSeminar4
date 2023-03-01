package Game.Shields;

import Game.Shield;

public class Armor implements Shield {

    String armorName;

    private int damageArmor;

    private boolean isImmovable;

    public Armor(String armorName, int damageArmor, boolean isImmovable) {
        this.armorName = armorName;
        this.damageArmor = damageArmor;
        this.isImmovable = isImmovable;
    }

    public boolean isImmovable() {
        return isImmovable;
    }

    @Override
    public int protectHealth() {
        return damageArmor;
    }

    public int getDamageArmor() {
        return damageArmor;
    }

    @Override
    public String toString() {
        return "Armor{" +
                "armorName='" + armorName + '\'' +
                ", damageArmor=" + damageArmor +
                '}';
    }
}

