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
public class JutjatTest {

    public JutjatTest() {
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
     * Es vol provar que afegint un valor null ens retorni false, que no ha
     * estat correcte la inserció
     */
    @Test
    public void testAfegirSala() {
        System.out.println("afegirSala");
        Sala nouSala = null;
        Jutjat instance = new Jutjat(null, null, null);
        Boolean expResult = false;
        Boolean result = instance.afegirSala(nouSala);
        assertEquals(expResult, result);
    }

    /**
     * Test of treureSala method, of class Jutjat.
     *
     * Es vol comprovar un velor fora de index inferior.
     */
    @Test
    public void testTreureSala() {
        System.out.println("treureSala");
        int index = -1;
        Jutjat instance = new Jutjat(null, null, null);
        Sala expResult = null;
        Sala result = instance.treureSala(index);
        assertEquals(expResult, result);
    }

    /**
     * Test of afegirJutge method, of class Jutjat.
     *
     * Es vol provar que afegint un valor null ens retorni false, que no ha
     * estat correcte la inserció
     */
    @Test
    public void testAfegirJutge() {
        System.out.println("afegirJutge");
        Jutge nouJutge = null;
        Jutjat instance = new Jutjat(null, null, null);
        Boolean expResult = false;
        Boolean result = instance.afegirJutge(nouJutge);
        assertEquals(expResult, result);
    }

    /**
     * Test of treureJutge method, of class Jutjat.
     *
     * Es vol comprovar un velor fora de index inferior.
     */
    @Test
    public void testTreureJutge() {
        System.out.println("treureJutge");
        int index = -1;
        Jutjat instance = new Jutjat(null, null, null);
        Jutge expResult = null;
        Jutge result = instance.treureJutge(index);
        assertEquals(expResult, result);
    }

    /**
     * Test of afegirJudici method, of class Jutjat.
     *
     * Es vol provar que afegint un valor null ens retorni false, que no ha
     * estat correcte la inserció
     */
    @Test
    public void testAfegirJudici() {
        System.out.println("afegirJudici");
        Judici nouJudici = null;
        Jutjat instance = new Jutjat(null, null, null);
        Boolean expResult = false;
        Boolean result = instance.afegirJudici(nouJudici);
        assertEquals(expResult, result);
    }

    /**
     * Test of treureJudici method, of class Jutjat.
     *
     * Es vol comprovar un velor fora de index inferior.
     *
     */
    @Test
    public void testTreureJudici() {
        System.out.println("treureJudici");
        int index = -1;
        Jutjat instance = new Jutjat(null, null, null);
        Judici expResult = null;
        Judici result = instance.treureJudici(index);
        assertEquals(expResult, result);
    }
}
