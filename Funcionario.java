private class Funcionario {

private String nome;
private int codFuncionario;
private String cpf;
private String dataNascimento;
private String email;
private int telefone;
private String dataContratacao;
private float salario;

  private String getNome() {
    return nome;
  }

  private void setNome(String nome) {
    this.nome = nome;
  }

  private int getCodFuncionario() {
    return codFuncionario;
  }

  private void setCodFuncionario(int codFuncionario) {
    this.codFuncionario = codFuncionario;
  }

  private String getCpf() {
    return cpf;
  }

  private void setCpf(String cpf) {
    this.cpf = cpf;
  }

  private String getDataNascimento() {
    return dataNascimento;
  }

  private void setDataNascimento(Date dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  private String getEmail() {
    return email;
  }

  private void setEmail(String email) {
    this.email = email;
  }

  private int getTelefone() {
    return telefone;
  }

  private void setTelefone(int telefone) {
    this.telefone = telefone;
  }

  private String getDataContratacao() {
    return dataContratacao;
  }

  private void setDataContratacao(Date dataContratacao) {
    this.dataContratacao = dataContratacao;
  }

  private float getSalario() {
    return salario;
  }

  private void setSalario(float salario) {
    this.salario = salario;
  }
  
}
