import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ContaBancariaTest {
    private ContaBancaria conta;

    @Before
    public void setUp() {
        conta = new ContaBancaria(1234, 4321, "Nícolas");
    }
    
    @Test
    public void testContaBancaria() {
        assertTrue(conta instanceof ContaBancaria);
    }

    @Test
    public void testDepositar200() {
        conta.depositar(200.0);
        
        assertEquals(200.0, conta.getSaldo(), 0.1);
    }
    
    @Test
    public void testDepositar80com40() {
        conta.depositar(200.0);
        conta.depositar(80.40);
        
        assertEquals(280.40, conta.getSaldo(), 0.1);
    }
    
    @Test
    public void testSacar100() {
        conta.depositar(200.0);
        conta.depositar(80.40);
        conta.sacar(100.0);
        
        assertEquals(180.40, conta.getSaldo(), 0.1);
    }
    
    @Test
    public void testSacar20com50() {
        conta.depositar(200.0);
        conta.depositar(80.40);
        conta.sacar(100.0);
        conta.sacar(20.50);

        assertEquals(159.90, conta.getSaldo(), 0.1);
    }

    @After
    public void testImprimirInfosConta() {
        conta.imprimirInfosConta();
    }
}
