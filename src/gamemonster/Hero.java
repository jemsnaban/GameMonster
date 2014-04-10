/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gamemonster;

/**
 *
 * @author 
 */
public class Hero {

    private String name;
    private int level = 1;
    private int hpActual = 1000;
    private int hpMaximum = 1000;
    private int manaActual = 500;
    private int manaMaximum = 500;
    private int attack = 80;
    private Spell spell;

    public Hero(String paramString, Spell paramSpell) {
        this.name = paramString;
        this.spell = paramSpell;

        System.out.println("creating a hero: " + paramString + " (lvl " + this.level + ")");
    }

    public String getName() {
        return this.name;
    }

    public int getLevel() {
        return this.level;
    }

    public void incLevel() {
        this.level += 1;
        System.out.println("increase level: " + this.name + " (lvl " + this.level + ")");
    }

    public int getHpActual() {
        return this.hpActual;
    }

    public void setHpActual(int paramInt) {
        if (paramInt <= this.hpMaximum) {
            this.hpActual = paramInt;
        } else {
            this.hpActual = this.hpMaximum;
        }
    }

    public int getHpMaximum() {
        return this.hpMaximum;
    }

    public void setHpMaximum(int paramInt) {
        this.hpMaximum = paramInt;
    }

    public int getManaActual() {
        return this.manaActual;
    }

    public void setManaActual(int paramInt) {
        if (paramInt <= this.manaMaximum) {
            this.manaActual = paramInt;
        } else {
            this.manaActual = this.manaMaximum;
        }
    }

    public int getManaMaximum() {
        return this.manaMaximum;
    }

    public void setManaMaximum(int paramInt) {
        this.manaMaximum = paramInt;
    }

    public int getAttackDamage() {
        return this.attack;
    }

    public void setAttackDamage(int paramInt) {
        this.attack = paramInt;
    }

    public void attack() {
        System.out.println(this.name + " (lvl " + this.level + ")" + " is attacking (" + this.attack + " damage)...");
        System.out.println("HP: (" + this.hpActual + "/" + this.hpMaximum + ")");
        System.out.println("mana: (" + this.manaActual + "/" + this.manaMaximum + ")");
        System.out.println();
    }

    public void castSpell() {
        if (this.manaActual < this.spell.getManaCost()) {
            System.out.println(this.name + " (lvl " + this.level + ")" + " is unable to use spell " + this.spell.getName() + " (" + this.spell.getDamage() + " damage, " + this.spell.getManaCost() + "mana)...");

            System.out.println("HP: (" + this.hpActual + "/" + this.hpMaximum + ")");
            System.out.println("mana: (" + this.manaActual + "/" + this.manaMaximum + ")");
            System.out.println();
        } else {
            this.manaActual -= this.spell.getManaCost();
            System.out.println(this.name + " (lvl " + this.level + ")" + " is using spell " + this.spell.getName() + " (" + this.spell.getDamage() + " damage, " + this.spell.getManaCost() + "mana)...");

            System.out.println("HP: (" + this.hpActual + "/" + this.hpMaximum + ")");
            System.out.println("mana: (" + this.manaActual + "/" + this.manaMaximum + ")");
            System.out.println();
        }
    }

    public void receiveDamage(int paramInt) {
        if (paramInt < this.hpActual) {
            this.hpActual -= paramInt;
        } else {
            this.hpActual = 0;
        }
        System.out.println(this.name + " (lvl " + this.level + ")" + " is attacked (" + paramInt + " damage)...");

        System.out.println("HP: (" + this.hpActual + "/" + this.hpMaximum + ")");
        System.out.println("mana: (" + this.manaActual + "/" + this.manaMaximum + ")");
        System.out.println();
    }

//    @Override
//    public String toString() {
//        return new String("HP   : (" + getHpActual() + "/" + getHpMaximum() + ")\n" + "mana : (" + getManaActual() + "/" + getManaMaximum() + ")\n\n");
//    }

}
