/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jutjats;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MVC
 */
public class AdvocatTest {
    
    public AdvocatTest() {
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
     * Li passam un judici null i ens ha de retornar false. (No ha anat be).
     */
    @Test
    public void testAfegirJudiciAcusacio() {
        System.out.println("afegirJudiciAcusacio");
        Judici nouJudici = null;
        Advocat instance = new Advocat("Andreu", "Cladera Mas", "12-08-1990", "Garrova, 2", "Buger");
        Boolean expResult = false;
        Boolean result = instance.afegirJudiciAcusacio(nouJudici);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of treureJudiciAcusacio method, of class Advocat.
     * 
     * Li passam un valor fora de rang i ha de tornar null.
     */
    @Test
    public void testTreureJudiciAcusacio() {
        System.out.println("treureJudiciAcusacio");
        int index = -1;
        Advocat instance = new Advocat("Andreu", "Cladera Mas", "12-08-1990", "Garrova, 2", "Buger");
        Judici expResult = null;
        Judici result = instance.treureJudiciAcusacio(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of mostraLlistaJudicisComplet method, of class Advocat.
     * 
     * Si el tamany de la llista es diferent a 0 ha de fallar, perque aquest
     * advocat no te assignat cap judici. (ni defensor, ni acusacio).
     */
    @Test
    public void testMostraLlistaJudicisComplet() {
        System.out.println("mostraLlistaJudicisComplet");
        Advocat instance = new Advocat("Andreu", "Cladera Mas", "12-08-1990", "Garrova, 2", "Buger");
        ArrayList result = instance.mostraLlistaJudicisComplet();

        if(result.size() != 0){
          fail("The test case is a prototype.");  
        }
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of afegirJudiciDefensor method, of class Advocat.
     * 
     * Li passam un judici null i ens retornara fals. (Ha anat malament).
     */
    @Test
    public void testAfegirJudiciDefensor() {
        System.out.println("afegirJudiciDefensor");
        Judici nouJudici = null;
        Advocat instance = new Advocat("Andreu", "Cladera Mas", "12-08-1990", "Garrova, 2", "Buger");
        Boolean expResult = false;
        Boolean result = instance.afegirJudiciDefensor(nouJudici);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of treureJudiciDefensor method, of class Advocat.
     * 
     * Li passam un valor fora de rang i ens ha de tornar null.
     */
    @Test
    public void testTreureJudiciDefensor() {
        System.out.println("treureJudiciDefensor");
        int index = -1;
        Advocat instance = new Advocat("Andreu", "Cladera Mas", "12-08-1990", "Garrova, 2", "Buger");
        Judici expResult = null;
        Judici result = instance.treureJudiciDefensor(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
}