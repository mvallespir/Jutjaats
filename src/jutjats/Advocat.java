package jutjats;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Mètodes i funcions de l'objecte Advocat.
 *
 * @author MVC i RSM
 */
public class Advocat {

    private String nom;
    private String llinatges;
    private Date dataNaixament;
    private String direccio;
    private String poblacio;
    private ArrayList<Judici> llistaJudicisDefensor;
    private ArrayList<Judici> llistaJudicisAcusacio;

    public Advocat(String nom, String llinatges, String dataNaixament, String direccio, String poblacio) {
        this.nom = nom;//Afegeix un Judici en cas de que sigui null retorna false sino true.
        this.llinatges = llinatges;
        this.dataNaixament = afegirDataNaixament(dataNaixament);
        this.direccio = direccio;
        this.poblacio = poblacio;
        llistaJudicisDefensor = new ArrayList<>();
        llistaJudicisAcusacio = new ArrayList<>();
    }

    /**
     * Mètode per afegir un judici com a acusació a l'objecte Advocat.
     *
     * Afegeix un Judici en cas de que sigui null retorna false sino true.
     *
     * @return
     */
    public Boolean afegirJudiciAcusacio(Judici nouJudici) {

        if (nouJudici != null) {
            llistaJudicisAcusacio.add(nouJudici);
            return true;
        }

        return false;

    }

    /**
     * Mètode per treure un judici com a acusació a l'objecte Advocat.
     *
     * Es pasa per parametre l'index del Judici a treure, en cas que l'index
     * sigui major o igual a 0 i menor a la grandaria de la llista retornara el
     * Judici en cas contrari retornara null.
     *
     * @return
     */
    public Judici treureJudiciAcusacio(int index) {

        if (index >= 0 && index < llistaJudicisAcusacio.size()) {

            return llistaJudicisAcusacio.get(index);
        }

        return null;

    }

    /**
     * Mètode per obtenir un judici com a acusació a l'objecte Advocat.
     *
     * Retorna la llista de judicis com a acusació de l'objecte Advocat.
     *
     * @return
     */
    public ArrayList<Judici> getLlistaJudicisAcusacio() {
        return llistaJudicisAcusacio;
    }

    /**
     * Mètode per mostrar la llista de judicis com a acusació completa a
     * l'objecte Advocat.
     *
     * Crea un Array List de Judici provisional on fica tots els judicis com a
     * defensor, com a acusació i retorna l'Array List.
     *
     * @return
     */
    public ArrayList<Judici> mostraLlistaJudicisComplet() {

        ArrayList<Judici> provisional = new ArrayList<>();

        for (Judici acu : llistaJudicisAcusacio) {
            provisional.add(acu);
        }

        for (Judici def : llistaJudicisDefensor) {
            provisional.add(def);
        }

        return provisional;
    }

    /**
     * Mètode per afegir un judici com a defensor de l'objecte Advocat.
     *
     * Afegeix un Judici en cas de que sigui null retorna false sino true.
     *
     * @return
     */
    public Boolean afegirJudiciDefensor(Judici nouJudici) {

        if (nouJudici != null) {
            llistaJudicisDefensor.add(nouJudici);
            return true;
        }

        return false;

    }

    /**
     * Mètode per mostrar els judicis com a defensor de l'objecte Advocat.
     *
     * Es pasa per parametre l'index del Judici a treure, en cas que l'index
     * sigui major o igual a 0 i menor a la grandaria de la llista retornara el
     * Judici en cas contrari retornara null.
     *
     * @return
     */
    public Judici treureJudiciDefensor(int index) {

        if (index >= 0 && index < llistaJudicisDefensor.size()) {

            return llistaJudicisDefensor.get(index);
        }

        return null;

    }

    /**
     * Mètode per mostrar els judicis com a defensor de l'objecte Advocat.
     *
     * Retorna la llista de judicis com a defensor de l'objecte Advocat.
     *
     * @return
     */
    public ArrayList<Judici> getLlistaJudicisDefensor() {
        return llistaJudicisDefensor;
    }

    /**
     * Mètode per obtenir el nom i llinatges de l'objecte Advocat com a
     * defensor.
     *
     * Retorna el nom i llinatges de l'objecte Advocat com a defensor.
     *
     * @return
     */
    public String getNomComplet() {
        return nom + " " + llinatges;
    }

    /**
     * Mètode per obtenir el nom de l'objecte Advocat com a defensor.
     *
     * Retorna el nom de l'objecte Advocat com a defensor.
     *
     * @return
     */
    public String getNom() {
        return nom;
    }

    /**
     * Mètode per assignar el nom de l'objecte Advocat com a defensor.
     *
     * Assigna el nom a aquest mètode.
     *
     * @return
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Mètode per obtenir els llinatges de l'objecte Advocat com a defensor.
     *
     * Retorna els llinatges de l'objecte Advocat com a defensor.
     *
     * @return
     */
    public String getLlinatges() {
        return llinatges;
    }

    /**
     * Mètode per assignar els llinatges de l'objecte Advocat com a defensor.
     *
     * Assigna els llinatges a aquest mètode.
     *
     * @return
     */
    public void setLlinatges(String llinatges) {
        this.llinatges = llinatges;
    }

    /**
     * Mètode per obtenir la direcció de l'objecte Advocat com a defensor.
     *
     * Retorna la direcció de l'objecte Advocat com a defensor.
     *
     * @return
     */
    public String getDireccio() {
        return direccio;
    }

    /**
     * Mètode per assignar la direcció de l'objecte Advocat com a defensor.
     *
     * Assigna la direcció a aquest mètode.
     *
     * @return
     */
    public void setDireccio(String direccio) {
        this.direccio = direccio;
    }

    /**
     * Mètode per obtenir la població de l'objecte Advocat com a defensor.
     *
     * Retorna la població de l'objecte Advocat com a defensor.
     *
     * @return
     */
    public String getPoblacio() {
        return poblacio;
    }

    /**
     * Mètode per assignar la població de l'objecte Advocat com a defensor.
     *
     * Assigna la població a aquest mètode.
     *
     * @return
     */
    public void setPoblacio(String poblacio) {
        this.poblacio = poblacio;
    }

    /**
     * Mètode per obtenir la data de naixament de l'objecte Advocat com a
     * defensor.
     *
     * Treu la data amb format dia-mes-any amb String.
     *
     * @return
     */
    public String getDataNaixament() {
        String format = "dd-MM-yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(dataNaixament);
    }

    /**
     * Mètode per afegir la data de naixament de l'objecte Advocat com a
     * defensor.
     *
     * Pasant-l'hi un string amb la data el transforma i retorna el tipus Date.
     *
     * @return
     */
    private Date afegirDataNaixament(String dataDelicte) {
        String format = "dd-MM-yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        //Transforma un String a Date
        Date dataNova = null;
        try {
            dataNova = sdf.parse(dataDelicte);
        } catch (ParseException ex) {
            Logger.getLogger(Delicte.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dataNova;
    }

    @Override
    public String toString() {
        return "Advocat: " + "Nom: " + nom + ", Llinatges: " + llinatges + ", Data Naixament: " + dataNaixament + ", Direccio: " + direccio + ", Poblacio: " + poblacio + '.';
    }

}
