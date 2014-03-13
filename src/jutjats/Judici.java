package jutjats;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MVC i RSM
 */
class Judici {

    private Delicte delicte;
    private Jutge jutge;
    private Advocat advocatAcusacio;
    private Advocat advocatDefensor;
    private Sentencia sentencia;
    private Sala sala;
    private ArrayList<Date> llistatDates;

    public Judici() {
        llistatDates = new ArrayList<>();
    }

    public Delicte getDelicte() {
        return delicte;
    }

    /**
     * Es pasa per parametre l'objecte delicte, es comprova que no sigui null i
     * que no hi hagi cap delicte afegit a aquest judici. Si es compleixen les
     * condicions inserta el delicte a l'objete Judici i afegeix aquest judici a
     * l'acusat implicat. S'accedeix a l'acusat a traves del delicte.
     *
     */
    public Boolean setDelicte(Delicte delicte) {

        if (delicte != null && this.delicte == null) {
            this.delicte = delicte;
            delicte.getAcusat().afegirJudici(this);
            return true;
        }
        return false;

    }

    public Jutge getJutge() {
        return jutge;
    }

    /**
     * Es pasa per parametre l'objecte jutge, es comprova que no sigui null i
     * que no hi hagi cap jutge afegit a aquest judici. Si es compleixen les
     * condicions inserta el jutge a l'objete Judici i afegeix aquest judici al
     * llistat de judicis del Jutge.
     *
     */
    public Boolean setJutge(Jutge jutge) {

        if (jutge != null && this.jutge == null) {
            this.jutge = jutge;
            jutge.afegirJudici(this);
            return true;
        }
        return false;
    }

    public Advocat getAdvocatAcusacio() {
        return advocatAcusacio;
    }

    /**
     * Es pasa per parametre l'objecte Advocat Acusacio, es comprova que no
     * sigui null i que no hi hagi cap advocat de acusacio afegit a aquest
     * judici. Si es compleixen les condicions inserta l'advocat d'acusacio a
     * l'objete Judici i afegeix aquest judici al llistat de judicis com
     * Acusacio de l'advocat.
     *
     */
    public Boolean setAdvocatAcusacio(Advocat advocatAcusacio) {

        if (advocatAcusacio != null && this.advocatAcusacio == null) {
            this.advocatAcusacio = advocatAcusacio;
            advocatAcusacio.afegirJudiciAcusacio(this);
            return true;
        }
        return false;
    }

    public Advocat getAdvocatDefensor() {
        return advocatDefensor;
    }

    /**
     * Es pasa per parametre l'objecte Advocat Defensor, es comprova que no
     * sigui null i que no hi hagi cap advocat defensor afegit a aquest judici.
     * Si es compleixen les condicions inserta l'advocat defensor a l'objete
     * Judici i afegeix aquest judici al llistat de judicis com Defensor de
     * l'advocat.
     *
     */
    public Boolean setAdvocatDefensor(Advocat advocatDefensor) {

        if (advocatDefensor != null && this.advocatDefensor == null) {
            this.advocatDefensor = advocatDefensor;
            advocatDefensor.afegirJudiciDefensor(this);
            return true;
        }
        return false;
    }

    public Sentencia getSentencia() {
        return sentencia;
    }

    /**
     * Es pasa per parametre l'objecte sentencia, es comprova que no sigui null
     * i que no hi hagi cap sentencia afegida a aquest judici. Si es compleixen
     * les condicions inserta la sentencia a l'objete Judici.
     *
     */
    public Boolean setSentencia(Sentencia sentencia) {

        if (sentencia != null && this.sentencia == null) {
            this.sentencia = sentencia;
            return true;
        }
        return false;
    }

    /**
     * Geter de l'objecte sala.
     * @return 
     */
    public Sala getSala() {
        return sala;
    }

    /**
     * Es pasa per parametre l'objecte Sala, es comprova que no sigui null i que
     * no hi hagi cap sala afegida a aquest judici. Si es compleixen les
     * condicions inserta la sala a l'objete Judici i afegeix aquest judici al
     * llistat de judicis de la sala.
     *
     * @return Retorna true o fals segons si ha anat be la inserció de la sala
     */
    public Boolean setSala(Sala sala) {

        if (sala != null && this.sala == null) {
            this.sala = sala;
            sala.afegirJudici(this);
            return true;
        }
        return false;
    }

    public ArrayList<Date> getLlistatDates() {
        return llistatDates;
    }

    //Pasant-l'hi un string amb la data el transforma i retorna el tipus Date.
    public Boolean afegirDate(String dateNove) {
        this.llistatDates = llistatDates;
        try {
            String format = "dd-MM-yyyy";
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            //Transforma un String a Date
            this.llistatDates.add(sdf.parse(dateNove));
            return true;
        } catch (ParseException ex) {
            Logger.getLogger(Delicte.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public String toString() {
        return "Judici{" + "delicte=" + delicte + ", jutge=" + jutge + ", advocatAcusacio=" + advocatAcusacio + ", advocatDefensor=" + advocatDefensor + ", sentencia=" + sentencia + ", sala=" + sala + '}';
    }

}
