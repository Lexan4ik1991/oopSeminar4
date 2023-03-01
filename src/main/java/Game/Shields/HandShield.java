package Game.Shields;

import Game.Shield;

public class HandShield implements Shield {

    String shieldName;

    private int damageHandShield;

    public int getDamageThreshold() {
        return damageHandShield;
    }

    private boolean isStrapped;

    public HandShield(String shieldName, int damageHandShield, boolean isStrapped) {
        this.shieldName = shieldName;
        this.damageHandShield = damageHandShield;
        this.isStrapped = isStrapped;
    }

    public boolean isStrapped() {
        return isStrapped;
    }

    @Override
    public int protectHealth() {
        return damageHandShield;
    }

    @Override
    public String toString() {
        return "HandShield{" +
                "shieldName='" + shieldName + '\'' +
                ", damageHandShield=" + damageHandShield +
                '}';
    }
}
