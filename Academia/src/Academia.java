public class Academia {
  
  private String nome;
  private String cnpj;
  private String uf;
  private String telefone;
  private String email;

  //construtor

  public void cadAcademia(String nome, String cnpj, String uf, String telefone, String email){
    this.nome = nome;
    this.cnpj = cnpj;
    this.uf = uf;
    this.telefone = telefone;
    this.email = email;
  }

  public void impAcademia(){
    System.out.print("--------------\n");
    System.out.println("CNPJ:" + getCnpj());
    System.out.println("UF:" + getUF());
    System.out.println("NOME: " + getNome());
    System.out.println("TELEFONE:" + getTelefone());
    System.out.println("E-MAIL: " + getEmail());
  }

  //get's

  public String getNome() {
    return nome;
  }
  public String getCnpj() {
    return cnpj;
  }
  public String getUF() {
    return uf;
  }
  public String getTelefone() {
    return telefone;
  }
  public String getEmail() {
    return email;
  }

  //set's

  public void setNome(String nome) {
    this.nome = nome;
  }
  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }
  public void setUf(String uf) {
    this.uf = uf;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  
}
