package jutjats;

import java.util.ArrayList;

/**
 * Classe per dur la gestio dels jutjats.
 *
 * @author MVC i RSM
 */
public class Jutjat {

    /**
     * Atribut nom del Jutjat.
     */
    private String nom;
    /**
     * Atribut direcció del Jutjat.
     */
    private String direccio;
    /**
     * Atribut poblacio on es troba el Jutjat.
     */
    private String poblacio;
    /**
     * LListat dels Judicis celebrats al jutjat.
     */
    private ArrayList<Judici> llistaJudicis;
    /**
     * Llistat dels Jutges del Jutjat.
     */
    private ArrayList<Jutge> llistaJutges;
    /**
     * Llistat de les sales que te el Jutjat.
     */
    private ArrayList<Sala> llistaSales;

    /**
     * Constructor de la classe.
     *
     * @param nom Pasam el nom del jutjat.
     * @param direccio Pasam la direcció del jutjat.
     * @param poblacio Pasam la població on es troba el jutjat.
     */
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
     *
     * @param nouSala Pasam l'objecte de la nova sala.
     * @return Retorna true o false si ha anat be l'inserció.
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
     *
     * @param index Pasam l'index de la sala que es vol treure.
     * @return Retorna l'objecte de la Sala cercat o null si no l'ha trobat.
     */
    public Sala treureSala(int index) {

        if (index >= 0 && index < llistaSales.size()) {

            return llistaSales.get(index);
        }

        return null;

    }

    /**
     * Metode per treure un ArrayList de sala.
     *
     * @return Torna un ArrayList de Sales.
     */
    public ArrayList<Sala> getLlistaSales() {
        return llistaSales;
    }

    /**
     * Afegeix un Jutge a l'array list, si l'objecte passat es null retorna fals
     * sino retorna true.
     *
     * @param nouJutge Pasam l'objecte Jutge per a insertar a l'arraylist.
     * @return Retorna true o false si ha anat be l'inserció.
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
     *
     * @param index Pasam l'index del Jutge que es vol treure.
     * @return Torna un objecte Jutge amb el jutge cercat o null si no l'ha
     * trobat.
     */
    public Jutge treureJutge(int index) {

        if (index >= 0 && index < llistaJutges.size()) {

            return llistaJutges.get(index);
        }

        return null;

    }

    /**
     * Metode per treure un ArrayList de Jutges.
     *
     * @return Torna un ArrayList de Jutges.
     */
    public ArrayList<Jutge> getLlistaJutges() {
        return llistaJutges;
    }

    /**
     * Afegeix un Judici a l'array list, si l'objecte passat es null retorna
     * fals sino retorna true.
     *
     * @param nouJudici
     * @return Retorna true o false si ha anat be l'inserció.
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
     * @param index Pasam l'index del Judici que es vol treure.
     * @return Torna un objecte Judici amb el judici cercat o null si no l'ha
     * trobat.
     */
    public Judici treureJudici(int index) {

        if (index >= 0 && index < llistaJudicis.size()) {

            return llistaJudicis.get(index);
        }

        return null;

    }

    /**
     * Metode per treure un ArrayList de Judicis.
     *
     * @return Torna un ArrayList de Judicis.
     */
    public ArrayList<Judici> getLlistaJudicis() {
        return llistaJudicis;
    }
}
