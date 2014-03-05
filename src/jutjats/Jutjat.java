package jutjats;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author MVC i RSM
 */
public class Jutjat {

    private String nom;
    private String direccio;
    private String poblacio;
    private ArrayList<Judici> llistaJudicis;
    private ArrayList<Jutge> llistaJutges;
    private ArrayList<Sala> llistaSales;

    public Jutjat(String nom, String direccio, String poblacio) {
        this.nom = nom;
        this.direccio = direccio;
        this.poblacio = poblacio;
        llistaJudicis = new ArrayList<>();
        llistaJutges = new ArrayList<>();
        llistaSales = new ArrayList<>();
    }

    /**
     * Afegeix una sala a l'array list, si l'objecte passat es null retorna fals
     * sino retorna true.
     */
    public Boolean afegirSala(Sala nouSala) {

        if (nouSala != null) {
            llistaSales.add(nouSala);
            return true;
        }

        return false;

    }

    /**
     * Es pasa per parametre l'index de la Sala a treure, en cas que la sala
     * sigui major o igual a 0 i menor a la grandaria de la llista retornara la
     * Sala en cas contrari retornara null.
     */
    public Sala treureSala(int index) {

        if (index >= 0 && index < llistaSales.size()) {

            return llistaSales.get(index);
        }

        return null;

    }

    public ArrayList<Sala> getLlistaSales() {
        return llistaSales;
    }

    /**
     * Afegeix un Jutge a l'array list, si l'objecte passat es null retorna fals
     * sino retorna true.
     */
    public Boolean afegirJutge(Jutge nouJutge) {

        if (nouJutge != null) {
            llistaJutges.add(nouJutge);
            return true;
        }

        return false;

    }

    /**
     * Es pasa per parametre l'index del Jutge a treure, en cas que l'index
     * sigui major o igual a 0 i menor a la grandaria de la llista retornara el
     * Jutge en cas contrari retornara null.
     */
    public Jutge treureJutge(int index) {

        if (index >= 0 && index < llistaJutges.size()) {

            return llistaJutges.get(index);
        }

        return null;

    }

    public ArrayList<Jutge> getLlistaJutges() {
        return llistaJutges;
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
     * sigui major o igual a 0 i menor a la grandaria de la llista retornara el
     * Judic en cas contrari retornara null.
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
}
