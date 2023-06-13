package mediatorppb;

public class Proprietario {
    private String nome;
    private String cpf;
    private String ultimaInformacao;

    public Proprietario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public boolean equals(Object obj) {

        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        return this.hashCode()==obj.hashCode();

    }

    public int hashCode() {
        String hash = this.getNome()+" "+this.getCpf();
        return hash.hashCode();
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
    public void setUltimaInformacao(String informacao){
        ultimaInformacao=informacao;
    }
    public String getUltimaInformacao() {
        return ultimaInformacao;
    }
}
