/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jutjats;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author MVC
 */
public class Sala {

    private int numero;
    private int capacitat;
    private ArrayList<Judici> llistaJudicis;

    public Sala(int numero, int capacitat) {
        this.numero = numero;
        this.capacitat = capacitat;
        llistaJudicis = new ArrayList<>();
    }

    /**
     * Recorr tots els judicis de la Sala i va agafant totes les dates ocupades 
     * i les fica dins un array list que al final retorna.
     * @return
     */
    public ArrayList<Date> datesOcupade() {

        ArrayList<Date> llistatDeDatesOcupade = new ArrayList<>();

        for (Judici j : llistaJudicis) {
            for (Date d : j.getLlistatDates()) {
                llistatDeDatesOcupade.add(d);
            }
        }
        return llistatDeDatesOcupade;
    }

    /**
     * Afegeix un Judici a l'array list, si l'objecte passat es null retorna
     * fals sino retorna true.
     */
    public Boolean afegirJudici(Judici nouJudici) {

        if (nouJudici != null) {
            llistaJudicis.add(nouJudici);
            return true;
        }

        return false;

    }

    /**
     * Es pasa per parametre l'index del Judici a treure, en cas que l'index
     * sigui major o igual a 0 i menor a la grandari de la llista retornara el
     * Judic en cas contrari retornara null
     */
    public Judici treureJudici(int index) {

        if (index >= 0 && index < llistaJudicis.size()) {

            return llistaJudicis.get(index);
        }

        return null;

    }

    public ArrayList<Judici> getLlistaJudicis() {
        return llistaJudicis;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacitat() {
        return capacitat;
    }

    public void setCapacitat(int capacitat) {
        this.capacitat = capacitat;
    }

    @Override
    public String toString() {
        return "Sala:" + "Numero: " + numero + ", Capacitat: " + capacitat + '.';
    }
}
