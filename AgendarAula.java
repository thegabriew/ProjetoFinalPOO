private class AgendarAula{
  private int codEquimaneto;
  private int codAluno;
  private int codInstrutor;
  private String descricao;

  private void setCodEquimaneto(int codEquimaneto) {
    this.codEquimaneto = codEquimaneto;
  }

  private int getCodAluno() {
    return codAluno;
  }

  private void setCodAluno(int codAluno) {
    this.codAluno = codAluno;
  }

  private int getCodInstrutor() {
    return codInstrutor;
  }

  private void setCodInstrutor(int codInstrutor) {
    this.codInstrutor = codInstrutor;
  }

  private String getDescricao() {
    return descricao;
  }

  private void setDescricao(String descricao) {
    this.descricao = descricao;
  }
}
