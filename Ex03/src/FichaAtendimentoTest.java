import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FichaAtendimentoTest {
    FichaAtendimento ficha;

    @Before
    public void setUp() {
        ficha = new FichaAtendimento();
    }

    @Test
    public void testAdicionarCliente() {
        ficha.adicionarCliente();
        ficha.adicionarCliente();
        
        assertEquals(2, ficha.getQtdClientes(), 0);
    }
    
    @Test
    public void testAtenderCliente() {
        ficha.adicionarCliente();
        ficha.adicionarCliente();
        ficha.atenderCliente();
        
        assertEquals(1, ficha.getQtdClientes(), 0);
    }
    
    @Test
    public void testVerificarFilaVazia() {
        ficha.adicionarCliente();
        ficha.adicionarCliente();
        ficha.atenderCliente();
        ficha.adicionarCliente();
        ficha.atenderCliente();
        ficha.adicionarCliente();

        assertFalse(ficha.verificarFilaVazia());
    }

    @After
    public void testImprimeTamanhoFila() {
        ficha.imprimeTamanhoFila();
    }
}
