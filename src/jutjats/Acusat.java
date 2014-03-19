package jutjats;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Mètodes i funcions de l'objecte Acusat.
 *
 * @author MVC i RSM
 */
class Acusat {

    private String nom;
    private String llinatges;
    private Date dataNaixament;
    private String direccio;
    private String poblacio;
    private ArrayList<Judici> llistaJudicis;

    public Acusat(String nom, String llinatges, String dataNaixament, String direccio, String poblacio) {
        this.nom = nom;
        this.llinatges = llinatges;
        this.dataNaixament = afegirDataNaixament(dataNaixament);
        this.direccio = direccio;
        this.poblacio = poblacio;
        llistaJudicis = new ArrayList<>();
    }

    /**
     * Mètode per afegir un judici a l'objecte Acusat.
     *
     * Afegeix un Judici a l'array list, si l'objecte passat es null retorna
     * fals sino retorna true.
     *
     * @return
     */
    public Boolean afegirJudici(Judici nouJudici) {

        if (nouJudici != null) {
            llistaJudicis.add(nouJudici);
            return true;
        }

        return false;

    }

    /**
     * Mètode per treure un judici de l'objecte Acusat.
     *
     * Es pasa per parametre l'index del Judici a treure, en cas que l'index
     * sigui major o igual a 0 i menor a la grandaria de la llista retornara el
     * Judici en cas contrari retornara null.
     *
     * @return
     */
    public Judici treureJudici(int index) {

        if (index >= 0 && index < llistaJudicis.size()) {

            return llistaJudicis.get(index);
        }

        return null;

    }

    /**
     * Mètode per obtenir la llista de judicis de l'objecte Acusat.
     *
     * Agafa la llista de judicis i la retorna.
     *
     * @return
     */
    public ArrayList<Judici> getLlistaJudicis() {
        return llistaJudicis;
    }

    /**
     * Mètode per obtenir el nom complet de l'objecte Acusat.
     *
     * Retorna el nom i llinatges amb un espai enmig.
     *
     * @return
     */
    //Concatena el nom i els llinatges.
    public String getNomComplet() {
        return nom + " " + llinatges;
    }

    /**
     * Mètode per obtenir el nom de l'objecte Acusat.
     *
     * @return
     */
    public String getNom() {
        return nom;
    }

    /**
     * Mètode per assignar el nom de l'objecte Acusat.
     *
     * @return
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Mètode per obtenir els llinatges de l'objecte Acusat.
     *
     * @return
     */
    public String getLlinatges() {
        return llinatges;
    }

    /**
     * Mètode per assignar els llinatges de l'objecte Acusat.
     *
     * @return
     */
    public void setLlinatges(String llinatges) {
        this.llinatges = llinatges;
    }

    /**
     * Mètode per obtenir la direcció de l'objecte Acusat.
     *
     * @return
     */
    public String getDireccio() {
        return direccio;
    }

    /**
     * Mètode per assignar la direcció de l'objecte Acusat.
     *
     * @return
     */
    public void setDireccio(String direccio) {
        this.direccio = direccio;
    }

    /**
     * Mètode per obtenir la població de l'objecte Acusat.
     *
     * @return
     */
    public String getPoblacio() {
        return poblacio;
    }

    /**
     * Mètode per assignar la població de l'objecte Acusat.
     *
     * @return
     */
    public void setPoblacio(String poblacio) {
        this.poblacio = poblacio;
    }

    /**
     * Mètode per obtenir la data de naixament de l'objecte Acusat.
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
     * Mètode per obtenir la data de naixament de l'objecte Acusat.
     *
     * Pasant-l'hi un string amb la data el transforma i retorna al tipus Date.
     *
     * @return
     */
    private Date afegirDataNaixament(String dataDelicte) {
        String format = "dd-MM-yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        //Transforma un String a Date.
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
        return "Acusat:" + "Nom: " + nom + ", Llinatges: " + llinatges + ", Data Naixament: " + getDataNaixament() + ", Direccio: " + direccio + ", Poblacio: " + poblacio + ".";
    }
}
