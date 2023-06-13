package mediatorppb;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class InquilinoTest {

    @Test
    void deveFazerReclamacao() {
        Inquilino inquilino = new Inquilino("jose");

        Proprietario proprietario1 = new Proprietario("pedro","124523123");
        Imobiliaria.getInstancia().criarContrato("1235",proprietario1);

        inquilino.FazerReclamacao("1235","cano do banheiro está quebrado");

        assertEquals("Inquilino: jose fez a seguinte reclamacao:\n" +
                        "cano do banheiro está quebrado",
                proprietario1.getUltimaInformacao());
    }
}
