private class Aluno{

  private String nome;
  private int codAluno;
  private String cpf;
  private String dataNascimento;
  private String pagamento;
  private String email;
  private int telefone;


  void setNome(String nome){
    this.nome = nome;
  }

  String getNome(){
    return this.nome;
  }

  void setCodAluno(int codAluno){
    this.codAluno = codAluno;
  }

  int getCodAluno(){
    return this.codAluno;
  }

  void setCpf(String cpf){
    this.cpf = cpf;
  }

  String getCpf(){
    return this.cpf;
  }

  void setDataNascimento(date dataNascimento){
    this.dataNascimento = dataNascimento;
  }

  String getDataNascimento(){
    return this.dataNascimento;
  }
  
  void setPagamento(String pagamento){
    this.pagamento = pagamento;
  }

  String getPagamento(){
    return this.pagamento;
  }

  void setEmail(String email){
    this.email = email;
  }

  String getEmail(){
    return this.email;
  }

  void setTelefone(int telefone){
    this.telefone = telefone;
  }

  int getTelefone(){
    return this.telefone;
  }
  }
}
