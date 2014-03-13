package jutjats;

import java.util.ArrayList;
import java.util.Date;

/**
 * Objecte Sala per implementar les sales del Jutjat
 *
 * @author MVC i RSM
 */
public class Sala {

    /**
     * Atribut del numero de la Sala.
     */
    private int numero;
    /**
     * Atribut de la capacitat de la Sala.
     */
    private int capacitat;
    /**
     * Llistat dels judicis selebrats a la sala.
     */
    private final ArrayList<Judici> llistaJudicis;

    /**
     * Constructor de l'objecte Sala.
     *
     * @param numero Numero de Sala.
     * @param capacitat Capacitat de la Sala.
     */
    public Sala(int numero, int capacitat) {
        this.numero = numero;
        this.capacitat = capacitat;
        llistaJudicis = new ArrayList<>();
    }

    /**
     * Recorr tots els judicis de la Sala i va agafant totes les dates ocupades.
     * Les fica dins un array list que al final retorna.
     *
     * @return Retorna un array list de dates
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
     *
     * @param nouJudici Judici que es vol afegir.
     * @return Retorna true o fals segons com a anat la inserció del judici.
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
     * sigui major o igual a 0 i menor a la grandaria de la llista retornara el
     * Judic en cas contrari retornara null.
     *
     * @param index Passam l'index de l'objecte que volem treure.
     * @return Retorna l'objecte judici que s'ha cercat o null si no l'ha
     * trobat.
     */
    public Judici treureJudici(int index) {

        if (index >= 0 && index < llistaJudicis.size()) {

            return llistaJudicis.get(index);
        }

        return null;

    }

    /**
     * Metode per treure tots els judicis d'una sala.
     *
     * @return Retorna un array list de Judicis.
     */
    public ArrayList<Judici> getLlistaJudicis() {
        return llistaJudicis;
    }

    /**
     * Metode per treure el numero de Sala.
     *
     * @return Retorna el numero de sala.
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Metode per afegir el numero de sala.
     *
     * @param numero Numero de la Sala.
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Metode per treure la capacitat de la sala
     *
     * @return Retorna un enter amb la capacitat de la sala.
     */
    public int getCapacitat() {
        return capacitat;
    }

    /**
     * Metode per afegir la capacitat de la Sala.
     *
     * @param capacitat Capacitat de la sala.
     */
    public void setCapacitat(int capacitat) {
        this.capacitat = capacitat;
    }

    /**
     * Metode per mostra informació.
     *
     * @return Retorna un String amb informació de la Sala.
     */
    @Override
    public String toString() {
        return "Sala:" + "Numero: " + numero + ", Capacitat: " + capacitat + '.';
    }
}
