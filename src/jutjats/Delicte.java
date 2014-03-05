package jutjats;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MVC i RSM
 */
public class Delicte {

    private Date data;
    private String descripcio;
    private Acusat acusat;

    public Delicte(String data, String descripcio) {
        this.data = afegirData(data);
        this.descripcio = descripcio;
    }

    //Es pasa per parametre l'acusat, comprova que no sigui null i que no en tengui cap ja insertat.
    public Boolean afegirAcusat(Acusat nouAcusat) {

        if (this.acusat == null && nouAcusat != null) {
            this.acusat = nouAcusat;
            return true;
        }

        return false;

    }

    public Acusat getAcusat() {
        return acusat;
    }

    //Treu la data amb format dia-mes-any amb String.
    public String getData() {
        String format = "dd-MM-yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(data);
    }

    //Pasant-l'hi un string amb la data el transforma i retorna el tipus Date.
    private Date afegirData(String dataDelicte) {
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

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    @Override
    public String toString() {
        return "Delicte{" + "Data: " + getData() + ", Descripcio: " + descripcio + ", Acusat:" + acusat + '}';
    }
}
