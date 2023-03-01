package Game;

import Game.Shields.HandShield;
import Game.Shields.Armor;
import Game.Weapons.Melee;
import Game.Weapons.Ranged;

public class Main {

    public static void main(String[] args) {

        Team<Footman> squadF = new Team<>();

        squadF.add(new Footman(55, "joe", new Melee("spear", 15)));
        squadF.add(new Footman(55, "moe", new Melee("sword", 10)));
        squadF.add(new Footman(55, "doe", new Melee("axe", 20)));

        /*for (Footman item : squadF) {
            System.out.println(item);
        }
        System.out.println(squadF.getTeamHealth());
        System.out.println(squadF.getMaxRange());
        System.out.println(squadF.getSumDamage());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
*/
        Team<Warriors> squadA = new Team<>();

        squadA.add(new Archer(15, "jonh",
                new Ranged("bow", 5, 50)));
        squadA.add(new Archer(15, "jonathan", new Ranged("crossbow", 15, 25)));
        squadA.add(new Footman(55, "carl", new Melee("sword", 10)));
        squadA.add(new Footman(55, "earl", new Melee("axe", 20)));

       /* for (BaseHero item : squadA) {
            System.out.println(item);
        }
        System.out.println(squadA.getTeamHealth());
        System.out.println(squadA.getMaxRange());
        System.out.println(squadA.getSumDamage());
        Footman footman1 = new Footman(77 , "marks" , new Melee("book"  , 30));
        Footman footman2 = new Footman(66 , "adamS" , new Melee("weights"  , 45));
        while (footman1.getHealth()>0 && footman2.getHealth()> 0){
            footman1.hit(footman2);
            System.out.println(footman2);
            System.out.println("~~~~~~~~");
            footman2.hit(footman1);
            System.out.println(footman1);
            System.out.println("____________");
        }
        if (footman1.getHealth()>0){
            System.out.println(footman1 + " is Winner");
        }
        else {
            System.out.println(footman2 + " is Winner");
        }*/

        Team<Warriors> squadB = new Team<>();
        squadB.add(new Archer(55, "Robin", new Ranged("bow", 10, 55)));
        squadB.add(new Archer(45, "HorseInCoat", new Ranged("bow", 2, 15)));
        squadB.add(new Footman(15, "SirJonathan", new Melee("blade", 5),
                new HandShield("Chair" , 5, true)));
        squadB.add(new Footman(55, "Ronald", new Melee("sword", 20),
                new HandShield("Artur's sword" , 50, true)));


        for (Warriors item : squadB) {
            System.out.println(item);
        }


        System.out.println(squadB.minimalArmorToString(squadB.minimalArmor()));
    }

}