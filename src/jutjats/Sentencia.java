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
public class Sentencia {

    private Date dataSentencia;
    private String Descripcio;

    public Sentencia(String dataSentencia, String Descripcio) {

        this.dataSentencia = transformarDataSentencia(dataSentencia);
        this.Descripcio = Descripcio;

    }

    //Pasant-l'hi un string amb la data el transforma i retorna el tipus Date.
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

    //Treu la data amb format dia-mes-any amb String.
    public String getDataSentencia() {
        String format = "dd-MM-yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(dataSentencia);
    }

    public String getDescripcio() {
        return Descripcio;
    }

    @Override
    public String toString() {
        return "Sentencia: DataSentencia: " + getDataSentencia() + ", Descripcio: " + Descripcio + '.';
    }
}
