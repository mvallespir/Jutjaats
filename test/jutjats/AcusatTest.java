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
public class AcusatTest {
    
    public AcusatTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of afegirJudici method, of class Acusat.
     * 
     * Li passam un judici null i ens ha de retornar false. (Ha anat malament).
     */
    @Test
    public void testAfegirJudici() {
        System.out.println("afegirJudici");
        Judici nouJudici = null;
        Acusat instance = new Acusat("Joan", "Arrom Fiol", "02-05-1995", "Sa lluna,12", "Buger");
        Boolean expResult = false;
        Boolean result = instance.afegirJudici(nouJudici);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of treureJudici method, of class Acusat.
     * 
     * Li passam un index fora de rang, i ens ha de tornar null.
     */
    @Test
    public void testTreureJudici() {
        System.out.println("treureJudici");
        int index = -1;
        Acusat instance = new Acusat("Joan", "Arrom Fiol", "02-05-1995", "Sa lluna,12", "Buger");
        Judici expResult = null;
        Judici result = instance.treureJudici(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    
     /**
     * Test of afegirJudici method, of class Acusat.
     * 
     * Li passam un judici correcte i ens ha de tornar true. (Ha anat be).
     */
    @Test
    public void testAfegirJudiciCorrecte() {
        System.out.println("afegirJudici");
        Judici nouJudici = new Judici();
        Acusat instance = new Acusat("Joan", "Arrom Fiol", "02-05-1995", "Sa lluna,12", "Buger");
        Boolean expResult = true;
        Boolean result = instance.afegirJudici(nouJudici);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of llistatCasosAcusat method, of class Acusat.
     * 
     * Li passam un judici correcte i ens ha de tornar true. (Ha anat be).
     */
    
    
}
