/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gamemonster;

/**
 *
 * @author
 */
public class Spell {

    private String name;
    private int damage;
    private int manaCost;

    public Spell(String paramString, int paramInt1, int paramInt2) {
        this.name = paramString;
        this.damage = paramInt1;
        this.manaCost = paramInt2;
    }

    public String getName() {
        return this.name;
    }

    public int getDamage() {
        return this.damage;
    }

    public int getManaCost() {
        return this.manaCost;
    }
}
