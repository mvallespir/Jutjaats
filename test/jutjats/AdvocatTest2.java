package jutjats;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MVC i RSM
 */
public class AdvocatTest2 {

    public AdvocatTest2() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of afegirJudiciAcusacio method, of class Advocat.
     *
     * Li passam un judici correcte i ens ha de retornar true. (Ha anat be).
     */
    @Test
    public void testAfegirJudiciAcusacio() {
        System.out.println("afegirJudiciAcusacio");
        Judici nouJudici = new Judici();
        Advocat instance = new Advocat("Andreu", "Cladera Mas", "12-08-1990", "Garrova, 2", "Buger");
        Boolean expResult = true;
        Boolean result = instance.afegirJudiciAcusacio(nouJudici);
        assertEquals(expResult, result);
    }

    /**
     * Test of treureJudiciAcusacio method, of class Advocat.
     *
     * Li afegim un judici a un advocat i es compara si el resultat es igual a
     * l'objecte que hem insertat a aquella posició.
     */
    @Test
    public void testTreureJudiciAcusacio() {
        System.out.println("treureJudiciAcusacio");
        int index = 0;
        Advocat instance = new Advocat("Andreu", "Cladera Mas", "12-08-1990", "Garrova, 2", "Buger");
        Judici nouJudici = new Judici();
        instance.afegirJudiciAcusacio(nouJudici);
        Judici result = instance.treureJudiciAcusacio(index);

        if (!result.equals(nouJudici)) {
            fail("The test case is a prototype.");
        }

    }

    /**
     * Test of mostraLlistaJudicisComplet method, of class Advocat.
     *
     * Insertam 3 judicis al Advocat i es cride el metode torna judicis
     * complets, l'array list que ens torna em de comprovar que la grandari
     * sigui de 3.
     */
    @Test
    public void testMostraLlistaJudicisComplet() {
        System.out.println("mostraLlistaJudicisComplet");
        Advocat instance = new Advocat("Andreu", "Cladera Mas", "12-08-1990", "Garrova, 2", "Buger");

        Judici primerJudiciAcusacio = new Judici();
        Judici segonJudiciAcusacio = new Judici();
        Judici primerJudiciDefensor = new Judici();
        instance.afegirJudiciAcusacio(primerJudiciAcusacio);
        instance.afegirJudiciAcusacio(segonJudiciAcusacio);
        instance.afegirJudiciDefensor(primerJudiciDefensor);

        ArrayList result = instance.mostraLlistaJudicisComplet();
        if (result.size() != 3) {
            fail("The test case is a prototype.");
        }

    }

    /**
     * Test of afegirJudiciDefensor method, of class Advocat.
     *
     * Li passam un judici correcte i ens retornara true. (Ha anat be).
     */
    @Test
    public void testAfegirJudiciDefensor() {
        System.out.println("afegirJudiciDefensor");
        Judici nouJudici = new Judici();
        Advocat instance = new Advocat("Andreu", "Cladera Mas", "12-08-1990", "Garrova, 2", "Buger");
        Boolean expResult = true;
        Boolean result = instance.afegirJudiciDefensor(nouJudici);
        assertEquals(expResult, result);
    }

    /**
     * Test of treureJudiciDefensor method, of class Advocat.
     *
     * Afegim un advocat com a defensor d'un judici i ens compara el resultat.
     */
    @Test
    public void testTreureJudiciDefensor() {
        System.out.println("treureJudiciDefensor");
        int index = 0;
        Advocat instance = new Advocat("Andreu", "Cladera Mas", "12-08-1990", "Garrova, 2", "Buger");
        Judici expResult = new Judici();
        instance.afegirJudiciDefensor(expResult);
        Judici result = instance.treureJudiciDefensor(index);
        assertEquals(expResult, result);
    }
}
