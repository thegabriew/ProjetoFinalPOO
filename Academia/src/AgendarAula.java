public class AgendarAula {
    private int id;
    private String nome;
    private String descricao;

    //get's
    
    public int getIdAula() {
        return id;
    }
    public String getNomeAula() {
        return nome;
    }
    public String getDescricaoAula() {
        return descricao;
    }

    //set's

    public void setIdAula(int id) {
        this.id = id;
    }
    public void setNomeAula(String nome) {
        this.nome = nome;
    }
    public void setDescricaoAula(String descricao) {
        this.descricao = descricao;
    }
}
