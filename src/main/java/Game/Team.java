package Game;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<T extends Warriors> implements Iterable<T> {

    List<T> dreamTeam = new ArrayList<T>();

    public void add(T t) {
        dreamTeam.add(t);
    }



    @Override
    public Iterator<T> iterator() {
        return dreamTeam.iterator();
    }

    public int getTeamHealth() {
        int teamHealth = 0;
        for (T hero : dreamTeam) {

            teamHealth += hero.getHealth();
        }

        return teamHealth;
    }




    public int getMaxRange() {

        int maxRange = 0;
        for (T hero : dreamTeam) {

            if (hero instanceof Archer) {

                Archer archer = (Archer) hero;

                if (maxRange < archer.range()) {

                    maxRange = archer.range();
                }
            }

        }

        return maxRange;
    }

    public int getSumDamage() {

        int sumDamage = 0;

        for (T hero : dreamTeam) {

            sumDamage += hero.getWeapon().damage();

        }

        return sumDamage;
    }
    public T minimalArmor(){
        T element = null;
        for (T hero : dreamTeam) {
            if (hero.isProtected()) {
                if (element == null) {
                    element = hero;
                }
                Warriors protection = (Warriors) hero;
                if ( element.protection.protectHealth() > protection.protection.protectHealth()) {
                    element = hero;
                }
            }

        }

        return element;
    }
    public String minimalArmorToString(T t){
        if (t == null){
            return "Без защиты";
        }
        return t + " Самая минимальная защита";

    }


}