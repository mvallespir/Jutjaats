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
public class SalaTest {
    
    public SalaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }


    /**
     * Test of afegirJudici method, of class Sala.
     * 
     * Es vol provar que afegint un judici null ens torni fals.
     */
    @Test
    public void testAfegirJudici() {
        System.out.println("afegirJudici");
        Judici nouJudici = null;
        Sala instance = new Sala(5, 34);
        Boolean expResult = false;
        Boolean result = instance.afegirJudici(nouJudici);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of treureJudici method, of class Sala.
     * 
     * Es vol comprovar un velor fora de index inferior.
     * 
     */
    @Test
    public void testTreureJudici() {
        System.out.println("treureJudici");
        int index = -1;
        Sala instance = new Sala(2, 23);
        Judici expResult = null;
        Judici result = instance.treureJudici(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }



}