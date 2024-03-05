import java.sql.Date;

public class Aluno {

  private String nome;
  private int idAluno;
  private String cpf;
  private Date dataNascimento;
  private String telefone;
  private String email;

  public void cadAluno(String nome, String cpf, Date dataNascimento, String telefone, String email){
    this.nome = nome;
    this.cpf = cpf;
    this.dataNascimento = dataNascimento;
    this.telefone = telefone;
    this.email = email;
  }

  public void impAluno(){
    System.out.println("-------Aluno-------\n");
    System.out.println("ID: " + this.idAluno);
    System.out.println("NOME: " + this.nome);
    System.out.println("CPF: " + this.cpf);
    System.out.println("DATA DE NASCIMENTO: " + this.dataNascimento);
    System.out.println("TELEFONE: " + this.telefone);
    System.out.println("E-MAIL: " + this.email);
    System.out.println("--------------------");
  }

  //get's

  public String getNome() {
    return nome;
  }
  public int getIdAluno() {
    return idAluno;
  }
  public String getCpf() {
    return cpf;
  }
  public Date getDataNascimento() {
    return dataNascimento;
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
  public void setIdAluno(int idAluno) {
    this.idAluno = idAluno;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
  public void setDataNascimento(Date dataNascimento) {
    this.dataNascimento = dataNascimento;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }
  public void setEmail(String email) {
    this.email = email;
  }
}