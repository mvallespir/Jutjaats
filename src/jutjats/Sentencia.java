package jutjats;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe Sentencia per a gestionar les sentencies del jutjat.
 *
 * @author MVC i RSM
 */
public class Sentencia {

    /**
     * Atribut per emagatzemar la data de la sentencia.
     */
    private Date dataSentencia;
    /**
     * Atribut per guardar la descripció de la sentencia.
     */
    private String Descripcio;

    /**
     * Contructor de la classe sentencia.
     *
     * @param dataSentencia Data de la sentencia.
     * @param Descripcio Descripció de la sentencia.
     */
    public Sentencia(String dataSentencia, String Descripcio) {

        this.dataSentencia = transformarDataSentencia(dataSentencia);
        this.Descripcio = Descripcio;

    }

    /**
     * Pasant-l'hi un string amb la data el transforma i retorna el tipus Date.
     *
     * @param dataSentencia Pasam la data de la sentencia.
     * @return La data amb Date transformade.
     */
    private Date transformarDataSentencia(String dataSentencia) {
        String format = "dd-MM-yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        //Transforma un String a Date
        Date data = null;
        try {
            data = sdf.parse(dataSentencia);
        } catch (ParseException ex) {
            Logger.getLogger(Sentencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }

    /**
     * Treu la data amb format dia-mes-any amb String.
     *
     * @return Treu la data amb String.
     */
    public String getDataSentencia() {
        String format = "dd-MM-yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(dataSentencia);
    }

    /**
     * Geter de l'atribut descripció.
     *
     * @return La descripció amb format String
     */
    public String getDescripcio() {
        return Descripcio;
    }

    /**
     * Retorna l'informació de l'objete amb String.
     *
     * @return
     */
    @Override
    public String toString() {
        return "Sentencia: DataSentencia: " + getDataSentencia() + ", Descripcio: " + Descripcio + '.';
    }
}
