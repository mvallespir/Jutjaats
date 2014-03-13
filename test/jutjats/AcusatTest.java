package jutjats;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 
 * @author MVC i RSM
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
    }

    /**
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
     * Mostrar un llistat dels judicis que esta implicat un acusat.
     */
    @Test
    public void testMostrarJudicisImplicat() {
        System.out.println("\njudicisImplicat");
        Judici casNos = new Judici();
        Acusat instance = new Acusat("Joan", "Arrom Fiol", "02-05-1995", "Sa lluna,12", "Buger");

        casNos.setAdvocatAcusacio(new Advocat("Pere", "Reus Figa", "20-02-1987", "Sa Roca,2", "Petra"));
        casNos.setAdvocatDefensor(new Advocat("Juan", "Lliteres", "04-09-1978", "Creu,90", "Llubi"));
        Delicte roboGros = new Delicte("20-04-2013", "Robo, 500.000€ a La CAIXA");
        roboGros.afegirAcusat(instance);
        casNos.setDelicte(roboGros);
        casNos.setJutge(new Jutge("Miquel", "Vallespir", "04-10-1992"));
        casNos.setSala(new Sala(2, 32));

        assertEquals(instance.getLlistaJudicis().size(), 1);

        for (Judici judici : instance.getLlistaJudicis()) {
            System.out.println(judici.toString());
        }

    }
}
