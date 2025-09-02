
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;

public class PedidoTest {
    Pedido pedido;

    @Before
    public void setUp() {
        pedido = new Pedido();
    }

    @Test
    public void testAdicionarItem4de5com40() {
        pedido.adicionarItem(5.40, 4);

        assertEquals(21.60, pedido.getValorTotal(), 0.1);
        assertEquals(4, pedido.getTotalItens(), 0);
    }

    @Test
    public void testAdicionarItem1de19com30() {
        pedido.adicionarItem(5.40, 4);
        pedido.adicionarItem(19.30, 1);

        assertEquals(40.90, pedido.getValorTotal(), 0.1);
        assertEquals(5, pedido.getTotalItens(), 0);
    }

    @Test
    public void testAdicionarItem3de12com10() {
        pedido.adicionarItem(5.40, 4);
        pedido.adicionarItem(19.30, 1);
        pedido.adicionarItem(12.10, 3);

        assertEquals(77.20, pedido.getValorTotal(), 0.1);
        assertEquals(8, pedido.getTotalItens(), 0);
    }

    @After
    public void testImprimirResumoConta() {
        pedido.imprimirResumoConta();
    }

}
