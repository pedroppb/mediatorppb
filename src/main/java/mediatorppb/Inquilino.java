package mediatorppb;

public class Inquilino {
    private String nome;

    public Inquilino(String nome) {
        this.nome = nome;
    }

    public void FazerReclamacao(String numContrato, String reclamacao){
        Imobiliaria.getInstancia().contactarProprietario(numContrato,reclamacao,this);
    }

    public String getNome() {
        return nome;
    }
}
