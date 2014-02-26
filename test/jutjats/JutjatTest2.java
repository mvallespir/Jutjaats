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
public class JutjatTest2 {

    public JutjatTest2() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of afegirSala method, of class Jutjat.
     *
     * Es vol comprovar que quan el parametre es correcte torne true.
     */
    @Test
    public void testAfegirSala() {
        System.out.println("afegirSala");
        Sala nouSala = new Sala(1, 20);
        Jutjat instance = new Jutjat("Estafa", "Mentiders, 5", "Buger");
        Boolean expResult = true;
        Boolean result = instance.afegirSala(nouSala);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of treureSala method, of class Jutjat.
     * 
     * Es vol comprova que per damunt de index superior no falla.
     */
    @Test
    public void testTreureSala() {
        System.out.println("treureSala");
        int index = 2;
        Jutjat instance = new Jutjat("Estafa", "Mentiders, 5", "Buger");
        Sala expResult = null;
        Sala result = instance.treureSala(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of afegirJutge method, of class Jutjat. Es vol comprovar que quan el
     * parametre es correcte torne true.
     */
    @Test
    public void testAfegirJutge() {
        System.out.println("afegirJutge");
        Jutge nouJutge = new Jutge("Rafel", "Sastre", "25-02-2014");
        Jutjat instance = new Jutjat("Estafa", "Mentiders, 5", "Buger");
        Boolean expResult = true;
        Boolean result = instance.afegirJutge(nouJutge);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of treureJutge method, of class Jutjat.
     * 
     * Es vol comprova que per damunt de index superior no falla.
     */
    @Test
    public void testTreureJutge() {
        System.out.println("treureJutge");
        int index = 3;
        Jutjat instance = new Jutjat("Estafa", "Mentiders, 5", "Buger");
        Jutge expResult = null;
        Jutge result = instance.treureJutge(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of afegirJudici method, of class Jutjat.
     *
     * Es vol comprovar que quan el parametre es correcte torne true.
     */
    @Test
    public void testAfegirJudici() {
        System.out.println("afegirJudici");
        Judici nouJudici = new Judici();
        Jutjat instance = new Jutjat("Estafa", "Mentiders, 5", "Buger");
        Boolean expResult = true;
        Boolean result = instance.afegirJudici(nouJudici);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of treureJudici method, of class Jutjat.
     * 
     * Es vol comprova que per damunt de index superior no falla.
     */
    @Test
    public void testTreureJudici() {
        System.out.println("treureJudici");
        int index = 5;
        Jutjat instance = new Jutjat("Estafa", "Mentiders, 5", "Buger");
        Judici expResult = null;
        Judici result = instance.treureJudici(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
}