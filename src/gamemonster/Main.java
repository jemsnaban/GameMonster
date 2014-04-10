/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gamemonster;

/**
 *
 * @author 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Wizard gamakichi = new Wizard("GamaKichi", new Spell("mizumizu", 400, 200));
        gamakichi.castSpell();
        gamakichi.useEnhancer(new Enhancer("Mana-Booster", 0, 250));
        gamakichi.useEnhancer(new Enhancer("HP-Booster", 250, 0));
        gamakichi.incLevel();
        
        gamakichi.dropEnhancer();
        gamakichi.sacrifice();
        for (int i = 0; i < 10; i++) {
            gamakichi.sacrifice();
        }

        Warrior gamabunta = new Warrior("GamaBunta", new Spell("muuk egile", 200, 100));
        gamabunta.attack();
        gamabunta.berserk();
        gamabunta.incLevel();
        gamabunta.useEnhancer(new Enhancer("Mana-Booster", 0, 250));
        gamabunta.useEnhancer(new Enhancer("HP-Booster", 250, 0));

    }
}
