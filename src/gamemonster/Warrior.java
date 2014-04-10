
package gamemonster;

/**
 *
 * @author 
 */
public class Warrior extends Hero {
    private Enhancer enhancer;

    public Warrior(String nama, Spell spell) {
        super(nama, spell);
        setHpMaximum(1500);
        setHpActual(1500);
        setManaMaximum(300);
        setManaActual(300);
        setAttackDamage(80);
        System.out.println(this);
    }

    @Override
    public void incLevel() {
        super.incLevel();
        setHpMaximum(super.getHpMaximum() + 250);
        double perbandingan = (double) getHpActual() / (getHpMaximum() - 250);
        setHpActual((int) ((double) perbandingan * getHpMaximum()));
        setAttackDamage(getAttackDamage() + 25);
        System.out.println(this);
    }

    public void berserk() {
        if (getManaActual() >= 100) {
            System.out.println(getName() + " is using breserk");
            setHpActual(getHpActual() + 100);
            setManaActual(getManaActual() - 100);
        } else {
            System.out.println(getName() + " is unable to use berserk");
        }

        System.out.println(this);
    }

     public void useEnhancer(Enhancer enhancer) {

        if (this.enhancer == null) { //this. nunjuk ke enhancer milik Wizard 
            this.enhancer = enhancer;

            setHpMaximum(getHpMaximum() + enhancer.getTambahHP());
            setManaMaximum(getManaMaximum() + enhancer.getTambahMana());
            double perbandinganMana = (double) getManaActual() / (getManaMaximum() - enhancer.getTambahMana());
            setManaActual((int) (perbandinganMana * getManaMaximum()));
            double perbandinganHp = (double) getHpActual() / (getHpMaximum() - enhancer.getTambahHP());
            setHpActual((int) (perbandinganHp * getHpMaximum()));
            System.out.println(getName() + " is using " + this.enhancer.getNama());
        } else {
            System.out.printf(getName() + " is replacing " + this.enhancer.getNama());
            System.out.println(" with " + enhancer.getNama());
            //hp dan mana di set seperti sebelum memiliki enhancer (normal)
            setHpActual((int) ((double) getHpActual() / getHpMaximum() * (getHpMaximum() - this.enhancer.getTambahHP())));
            setManaActual((int) ((double) getManaActual() / getManaMaximum() * (getManaMaximum() - this.enhancer.getTambahMana())));
            setHpMaximum(getHpMaximum() - this.enhancer.getTambahHP());
            setManaMaximum(getManaMaximum() - this.enhancer.getTambahMana());
            
            this.enhancer = enhancer;//ubah enhancer
            //ubah hp dan mana setelah ditambah enhancer
            setHpMaximum(getHpMaximum() + enhancer.getTambahHP());
            setManaMaximum(getManaMaximum() + enhancer.getTambahMana());
            double perbandinganMana = (double) getManaActual() / (getManaMaximum() - enhancer.getTambahMana());
            setManaActual((int) (perbandinganMana * getManaMaximum()));
            double perbandinganHp = (double) getHpActual() / (getHpMaximum() - enhancer.getTambahHP());
            setHpActual((int) (perbandinganHp * getHpMaximum()));
        }

        System.out.println(this);
    }


    public void dropEnhancer() {
        if (this.enhancer != null) {
            setHpActual((int) ((double) getHpActual() / getHpMaximum() * (getHpMaximum() - this.enhancer.getTambahHP())));
            setManaActual((int) ((double) getManaActual() / getManaMaximum() * (getManaMaximum() - this.enhancer.getTambahMana())));
            setHpMaximum(getHpMaximum() - this.enhancer.getTambahHP());
            setManaMaximum(getManaMaximum() - this.enhancer.getTambahMana());
            System.out.println(getName() + " is dropping " + this.enhancer.getNama());
            this.enhancer = null;
        } else {
            System.out.println(getName() + "has no enhancer yet");
        }
        System.out.println(this);
    
    }
    public String toString() {
        return ("HP   : (" + getHpActual() + "/" + getHpMaximum() + ")\n" + "mana : (" + getManaActual() + "/" + getManaMaximum() + ")\n");
    }
}

