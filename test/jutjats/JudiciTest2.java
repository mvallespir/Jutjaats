package jutjats;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MVC i RSM
 */
public class JudiciTest2 {

    public JudiciTest2() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setDelicte method, of class Judici.
     *
     * Cream un nou delicte i li afegim un acusat. DEspres cream un judici i a
     * aquest, l'insertam el delicte anteriorment creat i comprovam que s'ha
     * insertat be el delicte i que a l'acusat se l'hi ha afegit un judici.
     */
    @Test
    public void testSetDelicte() {
        System.out.println("setDelicte");
        Delicte delicte = new Delicte("24-02-2014", "Fuga con atropella.");
        Acusat rafel = new Acusat("Rafel", "Sastre", "20-06-1990", "Caseva,2", "Maria");
        delicte.afegirAcusat(rafel);
        Judici instance = new Judici();
        Boolean expResult = true;
        Boolean result = instance.setDelicte(delicte);

        if (!(expResult.equals(result) && instance.getDelicte() != null && rafel.getLlistaJudicis().size() == 1)) {
            fail("El delicte no s'ha insertat correctament");
        }

    }

    /**
     * Test of setJutge method, of class Judici.
     *
     * Li passam un jutge correcte i ens retorna true. (Ha anat malament).
     */
    @Test
    public void testSetJutge() {
        System.out.println("setJutge");
        Jutge jutge = new Jutge("Pep", "Tura Tot", "12-12-1956");
        Judici instance = new Judici();
        Boolean expResult = true;
        Boolean result = instance.setJutge(jutge);
        assertEquals(expResult, result);
    }

    /**
     * Test of setAdvocatAcusacio method, of class Judici.
     *
     * Li passam un advocat d'acusacio null i ens retorna false. (Ha anat
     * malament).
     */
    @Test
    public void testSetAdvocatAcusacio() {
        System.out.println("setAdvocatAcusacio");
        Advocat advocatAcusacio = new Advocat("Pere", "Pau Xisco", "02-04-1986", "Caseva, 43", "Son Xormes");
        Judici instance = new Judici();
        Boolean expResult = true;
        Boolean result = instance.setAdvocatAcusacio(advocatAcusacio);
        assertEquals(expResult, result);

    }

    /**
     * Test of setAdvocatDefensor method, of class Judici.
     *
     * Li passam un advocat defensor null i ens retorna false. (Ha anat
     * malament).
     */
    @Test
    public void testSetAdvocatDefensor() {
        System.out.println("setAdvocatDefensor");
        Advocat advocatDefensor = new Advocat("Pere", "Pau Xisco", "02-04-1986", "Caseva, 43", "Son Xormes");
        Judici instance = new Judici();
        Boolean expResult = true;
        Boolean result = instance.setAdvocatDefensor(advocatDefensor);
        assertEquals(expResult, result);
    }

    /**
     * Test of setSentencia method, of class Judici.
     *
     * Li passam una sentencia correcte i ens retorna true. (Ha anat be).
     */
    @Test
    public void testSetSentencia() {
        System.out.println("\nsetSentencia");
        Sentencia sentencia = new Sentencia("26-02-2014", "200 anys de preso i 1 €");
        Judici instance = new Judici();
        Boolean expResult = true;
        Boolean result = instance.setSentencia(sentencia);
        assertEquals(expResult, result);

        if (!(expResult.equals(result) && instance.getSentencia().equals(sentencia))) {
            fail("Error insercio sentencia");
        } else {
            System.out.println(instance.getSentencia().toString());
        }

    }

    /**
     * Test of setSala method, of class Judici.
     *
     * Li passam una sala correcte i ens retorna true. (Ha anat be).
     */
    @Test
    public void testSetSala() {
        System.out.println("setSala");
        Sala sala = new Sala(3, 45);
        Judici instance = new Judici();
        Boolean expResult = true;
        Boolean result = instance.setSala(sala);
        assertEquals(expResult, result);

        if (!(expResult.equals(result) && instance.getSala().equals(sala))) {
            fail("Error inserció sala");
        } else {
            System.out.println(instance.getSala().toString());
        }

    }

    /**
     * Test of afegirDate method, of class Judici.
     *
     * Insertam una data i comprovam que retorna true(s'ha insertat be)
     *
     */
    @Test
    public void testAfegirDate() {
        System.out.println("afegirDate");
        String dateNove = "02-03-2013";
        Judici instance = new Judici();
        Boolean expResult = true;
        Boolean result = instance.afegirDate(dateNove);

        if (!(instance.getLlistatDates().size() == 1 && result.equals(expResult))) {
            fail("La data no s'ha insertat correctament");
        }

    }
}
