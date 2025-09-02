import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MaterialTest {
    Material caneta;
    Material lapis;

    @Before
    public void setUp() {
        caneta = new Material(23, "caneta", 7.5, 20);
        lapis = new Material(67, "lápis", 2.5, 50);
    }

    @Test
    public void testMaterial() {
        assertEquals("23, caneta, 7.50, 20", caneta.toString());
        assertEquals("67, lápis, 2.50, 50", lapis.toString());
    }

    @Test
    public void testVenderMaterial() {
        // caneta.venderMaterial();
        // caneta.venderMaterial();
        // caneta.venderMaterial();
        caneta.venderMaterial(3);

        assertEquals(17, caneta.getQuantidade());
    }

    @Test
    public void testComprarMaterial() {
        // caneta.comprarMaterial();
        // caneta.comprarMaterial();
        // caneta.comprarMaterial();
        // caneta.comprarMaterial();
        // caneta.comprarMaterial();
        // caneta.comprarMaterial();
        // caneta.comprarMaterial();
        // caneta.comprarMaterial();
        // caneta.comprarMaterial();
        // caneta.comprarMaterial();
        caneta.comprarMaterial(10);

        assertEquals(30, caneta.getQuantidade());
    }

    @Test
    public void testSetCodigo() {
        caneta.setCodigo(40);

        assertEquals(40, caneta.getCodigo());
    }

    @Test
    public void testSetNome() {
        caneta.setNome("Teste");

        assertEquals("Teste", caneta.getNome());
    }

    @Test
    public void testSetPreço() {
        lapis.setPreco(2.7);

        assertEquals(2.7, lapis.getPreco(), 0.1);
    }

    @After
    public void testExibirDados() {
        caneta.exibirDados();
        lapis.exibirDados();
    }
}
