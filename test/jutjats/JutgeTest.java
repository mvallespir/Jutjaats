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
public class JutgeTest {
    
    public JutgeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of afegirJudici method, of class Jutge.
     * 
     * Es pasa un judici null i ens ha de retorna false (que no es correcte)
     * 
     */
    @Test
    public void testAfegirJudiciNull() {
        System.out.println("afegirJudici");
        Judici nouJudici = null;
        Jutge instance = new Jutge("Miquel", "Vallespir", "04-10-1992");
        Boolean expResult = false;
        Boolean result = instance.afegirJudici(nouJudici);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of treureJudici method, of class Jutge.
     * 
     * Sercar un judici fora de rang, retorna null perque no existeix.
     */
    @Test
    public void testTreureJudici() {
        System.out.println("treureJudici");
        int index = -1;
        Jutge instance = new Jutge("Miquel", "Vallespir", "04-10-1992");
        Judici expResult = null;
        Judici result = instance.treureJudici(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of afegirJudici method, of class Jutge.
     * 
     * Es pasa un judici correcte i ens ha de retorna true (que es correcte)
     * 
     */
    @Test
    public void testAfegirJudiciCorrecte() {
        System.out.println("afegirJudici");
        Judici nouJudici = new Judici();
        Jutge instance = new Jutge("Miquel", "Vallespir", "04-10-1992");
        Boolean expResult = true;
        Boolean result = instance.afegirJudici(nouJudici);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

}