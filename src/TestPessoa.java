import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestPessoa {
    @Test 
    public void obterNomeCompleto_deveConcatenarComEspaco(){
        Pessoa p = new Pessoa("Fulano", "Tal");
        assertEquals("Fulano Tal",p.getNomeCompleto());
    }
}