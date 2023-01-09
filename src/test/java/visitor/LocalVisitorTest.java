package visitor;

import static org.junit.Assert.*;

import org.junit.Test;

public class LocalVisitorTest {

	@Test
    public void deveExibirmapaCidade() {
        Cidade cidade= new Cidade("Juiz de Fora");

        LocalVisitor visitor = new LocalVisitor();
        assertEquals("Mapa da cidade Juiz de Fora", visitor.exibir(cidade));
    }

    @Test
    public void deveExibirMapaEstado() {
    	Estado estado= new Estado("Minas Gerais");

        LocalVisitor visitor = new LocalVisitor();
        assertEquals("Mapa do estado Minas Gerais", visitor.exibir(estado));
    }

    @Test
    public void deveExibirMapaPais() {
        Pais pais = new Pais("Egito");

        LocalVisitor visitor = new LocalVisitor();
        assertEquals("Mapa do País Egito", visitor.exibir(pais));
    }

}
