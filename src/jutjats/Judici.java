/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jutjats;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MVC
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
     * que no hi hagui cap delicte afegit a aquest judici. Si es compleixen les
     * condicions inserta el delicte a l'objete Judici i afegeix aquest judici a
     * l'acusat implicat. S'accedeix al acusat a traves del delicte.
     *
     * @param delicte
     * @return
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
     * que no hi hagui cap jutge afegit a aquest judici. Si es compleixen les
     * condicions inserta el jutge a l'objete Judici i afegeix aquest judici al
     * llistat de judicis del Jutge.
     *
     * @param delicte
     * @return
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
     * Es pasa per parametre l'objecte Advocat Acusació, es comprova que no
     * sigui null i que no hi hagui cap advocat de acusació afegit a aquest
     * judici. Si es compleixen les condicions inserta l'advocat d'acusació a
     * l'objete Judici i afegeix aquest judici al llistat de judicis com
     * Acusacio de l'advocat.
     *
     * @param delicte
     * @return
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
     * sigui null i que no hi hagui cap advocat defensor afegit a aquest judici.
     * Si es compleixen les condicions inserta l'advocat defensor a l'objete
     * Judici i afegeix aquest judici al llistat de judicis com Defensor de
     * l'advocat.
     *
     * @param delicte
     * @return
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
     * i que no hi hagui cap sentencia afegida a aquest judici. Si es compleixen
     * les condicions inserta la sentencia a l'objete Judici.
     *
     * @param delicte
     * @return
     */
    public Boolean setSentencia(Sentencia sentencia) {

        if (sentencia != null && this.sentencia == null) {
            this.sentencia = sentencia;
            return true;
        }
        return false;
    }

    public Sala getSala() {
        return sala;
    }

    /**
     * Es pasa per parametre l'objecte Sala, es comprova que no sigui null
     * i que no hi hagui cap sala afegida a aquest judici. Si es compleixen
     * les condicions inserta la sala a l'objete Judici i afegeix aquest judici
     * al llistat de judicis de la sala.
     * @param delicte
     * @return 
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

     //Pasant-l'hi un string amb la data el transforma i retorna el tipus Date
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
//<editor-fold
 //</editor-fold>