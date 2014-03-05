package jutjats;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MVC i RSM
 */
public class DelicteTest {

    public DelicteTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of afegirAcusat method, of class Delicte.
     *
     * Es comprova que no es pasi un acusat null.
     */
    @Test
    public void testAfegirAcusatCasError() {
        System.out.println("afegirAcusat");
        Acusat nouAcusat = null;
        Delicte instance = new Delicte("24-02-2013", "Robo a mano armado.");
        Boolean expResult = false;
        Boolean result = instance.afegirAcusat(nouAcusat);
        assertEquals(expResult, result);
    }

    /**
     * Test of afegirAcusat method, of class Delicte.
     *
     * Es comprova el cas correcte.
     */
    @Test
    public void testAfegirAcusatCasCorrecte() {
        System.out.println("afegirAcusat");
        Acusat nouAcusat = new Acusat("Miquel", "Vallespir Castello", "04-10-1992", "Creu,68", "Llubi");
        Delicte instance = new Delicte("24-02-2013", "Robo a mano armado.");
        Boolean expResult = true;
        Boolean result = instance.afegirAcusat(nouAcusat);
        assertEquals(expResult, result);
    }

}
