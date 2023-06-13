package mediatorppb;

import java.util.HashMap;
import java.util.Map;

public class Imobiliaria {

    private static Imobiliaria instancia = new Imobiliaria();
    private Map<String, Proprietario> contratos = new HashMap<String, Proprietario>();

    private Imobiliaria() {}

    public static Imobiliaria getInstancia() {
        return instancia;
    }
    public void criarContrato(String numContrato, Proprietario proprietario){
        contratos.put(numContrato,proprietario);
    }

    public void contactarProprietario(String numContrato, String reclamacao, Inquilino inquilino){
        String informacao="Inquilino: "+inquilino.getNome()+" fez a seguinte reclamacao:"+
                "\n"+reclamacao;
        contratos.get(numContrato).setUltimaInformacao(informacao);
    }

}
