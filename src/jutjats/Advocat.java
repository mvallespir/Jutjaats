package jutjats;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MVC & RSM
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
    
    //Afegeix un Judici en cas de que sigui null retorna false sino true.
    public Boolean afegirJudiciAcusacio(Judici nouJudici) {

        if (nouJudici != null) {
            llistaJudicisAcusacio.add(nouJudici);
            return true;
        }

        return false;

    }

    /**
     * Es pasa per parametre l'index del Judici a treure, en cas que l'index
     * sigui major o igual a 0 i menor a la grandaria de la llista retornara el
     * Judici en cas contrari retornara null
     */
    public Judici treureJudiciAcusacio(int index) {

        if (index >= 0 && index < llistaJudicisAcusacio.size()) {

            return llistaJudicisAcusacio.get(index);
        }

        return null;

    }

    public ArrayList<Judici> getLlistaJudicisAcusacio() {
        return llistaJudicisAcusacio;
    }
    
    /**
     * Crea un Array List de Judici provisional on fica tots els judicis com
     * a defensor, com a acusació i retorna l'Array List.
     * @return 
     */
    public ArrayList<Judici> mostraLlistaJudicisComplet(){
        
        ArrayList<Judici> provisional = new ArrayList<>();
        
        for(Judici acu:llistaJudicisAcusacio){
            provisional.add(acu);
        }
        
        for(Judici def:llistaJudicisDefensor){
            provisional.add(def);
        }
        
        return provisional;
    }

    //Afegeix un Judici en cas de que sigui null retorna false sinos true.
    public Boolean afegirJudiciDefensor(Judici nouJudici) {

        if (nouJudici != null) {
            llistaJudicisDefensor.add(nouJudici);
            return true;
        }

        return false;

    }

    /**
     * Es pasa per parametre l'index del Judici a treure, en cas que l'index
     * sigui major o igual a 0 i menor a la grandari de la llista retornara el
     * Judici en cas contrari retornara null
     */
    public Judici treureJudiciDefensor(int index) {

        if (index >= 0 && index < llistaJudicisDefensor.size()) {

            return llistaJudicisDefensor.get(index);
        }

        return null;

    }

    public ArrayList<Judici> getLlistaJudicisDefensor() {
        return llistaJudicisDefensor;
    }
    
    public String getNomComplet() {
        return nom + " " + llinatges;
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

    public String getDireccio() {
        return direccio;
    }

    public void setDireccio(String direccio) {
        this.direccio = direccio;
    }

    public String getPoblacio() {
        return poblacio;
    }

    public void setPoblacio(String poblacio) {
        this.poblacio = poblacio;
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
        return "Advocat: " + "Nom: " + nom + ", Llinatges: " + llinatges + ", Data Naixament: " + dataNaixament + ", Direccio: " + direccio + ", Poblacio: " + poblacio + '.';
    }
    
    
}
