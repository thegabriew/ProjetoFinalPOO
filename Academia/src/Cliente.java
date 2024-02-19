package Academia.src;

public class Cliente {
    private int id;
    private int cpf;
    private String nome;
    private String email;
    private String plano;

    //get's

    public int getIdCliente() {
        return id;
    }
    public int getCpfCliente() {
        return cpf;
    }
    public String getNomeCliente() {
        return nome;
    }
    public String getEmailCliente() {
        return email;
    }
    public String getPlanoCliente() {
        return plano;
    }

    //set's

    public void setIdCliente(int id) {
        this.id = id;
    }
    public void setCpfCliente(int cpf) {
        this.cpf = cpf;
    }
    public void setNomeCliente(String nome) {
        this.nome = nome;
    }
    public void setEmailCliente(String email) {
        this.email = email;
    }
    public void setPlanoCliente(String plano) {
        this.plano = plano;
    }

        
}
