
package gamemonster;

/**
 *
 * @author 
 */

public class Enhancer {

    private String nama;
    private int tambahHP;
    private int tambahMana;

    public Enhancer(String nama, int tambahHP, int tambahMana) {
        this.nama = nama;
        this.tambahHP = tambahHP;
        this.tambahMana = tambahMana;
    }

    public String getNama() {
        return nama;
    }

    public int getTambahHP() {
        return tambahHP;
    }

    public int getTambahMana() {
        return tambahMana;
    }

}
