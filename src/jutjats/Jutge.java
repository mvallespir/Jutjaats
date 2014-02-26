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
public class Jutge {

    private String nom;
    private String llinatges;
    private Date dataNaixament;
    private ArrayList<Judici> llistaJudicis;

    public Jutge(String nom, String llinatges, String dataNaixament) {
        this.nom = nom;
        this.llinatges = llinatges;
        this.dataNaixament = afegirDataNaixament(dataNaixament);
        llistaJudicis = new ArrayList<>();
    }

    //Afegeix un Judici en cas de que sigui null retorna false sinos true.
    public Boolean afegirJudici(Judici nouJudici) {

        if (nouJudici != null) {
            llistaJudicis.add(nouJudici);
            return true;
        }

        return false;

    }

    /**
     * Es pasa per parametre l'index del Judici a treure, en cas que l'index
     * sigui major o igual a 0 i menor a la grandari de la llista retornara el
     * Judici en cas contrari retornara null
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

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLlinatges() {
        return llinatges;
    }

    public void setLlinatges(String llinatges) {
        this.llinatges = llinatges;
    }

    //Treu la data amb format dia-mes-any amb String.
    public String getDataNaixament() {
        String format = "dd-MM-yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(dataNaixament);
    }

    //Pasant-l'hi un string amb la data el transforma i retorna el tipus Date
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
        return "Jutge:" + "Nom: " + nom + ", Llinatges: " + llinatges + ", Data Naixament: " + getDataNaixament() + '.';
    }
    
    
}
