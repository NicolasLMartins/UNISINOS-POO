import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AlunoTest {
    Aluno a;
    Aluno b;

    @Before
    public void setUp() {
        a = new Aluno("Maria");
        b = new Aluno("João", 7.4, 8.3, 8.0);
    }

    @Test
    public void testCalculaMediaMaria() {
        a.setNome("Maria");
        a.setNotaUm(8.0);
        a.setNotaDois(9.6);
        a.setNotaTres(8.7);
        a.calculaMedia();

        assertEquals(8.7, a.getMedia(), 0.1);
    }
    
    @Test
    public void testCalculaMediaJoao() {
        b.calculaMedia();
        
        assertEquals(7.9, b.getMedia(), 0.1);
    }
    
    @Test
    public void testCalculaMediaJoaoAlterada() {
        b.setNotaUm(6.0);
        b.setNotaDois(7.2);
        b.setNotaTres(8.2);
        b.calculaMedia();
        
        assertEquals(7.13, b.getMedia(), 0.01);
    }

    @After
    public void testExibirDados() {
        a.exibirDados();
        b.exibirDados();
    }
}
