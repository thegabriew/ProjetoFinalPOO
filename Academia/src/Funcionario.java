package Academia.src;

import java.util.Scanner;

public class Funcionario {

  private String nome;
  private int codFuncionario;
  private String cpf;
  private String dataNascimento;
  private String email;
  private int telefone;
  private String dataContratacao;
  private float salario;
  private String cargo;
  private String nomeInstrutor;
  private String horarioAula;
  private String descricaoAula;
  
  Aluno a = new Aluno();
  Equipamento e = new Equipamento();

  String nomeAluno = a.getNome();
  int codAluno = a.getCodAluno();
  String nomeEquipamento = e.getNome();

  private String getCargo() {
    return nome;
  }

  private void setCargo(String cargo) {
    this.cargo = cargo;
  }

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

  private void setDataNascimento(String dataNascimento) {
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

  private void setDataContratacao(String dataContratacao) {
    this.dataContratacao = dataContratacao;
  }

  private float getSalario() {
    return salario;
  }

  private void setSalario(float salario) {
    this.salario = salario;
  }

  public void verificarCamposVazios() {
    if (nome == null && nome.isEmpty()) {
      System.out.println("Campo 'Nome do funcionário' não pode estar vazio");
    }
    if (cpf == null && cpf.isEmpty()) {
      System.out.println("Campo 'CPF' não pode estar vazio");
    }
    if (dataNascimento == null && dataNascimento.isEmpty()) {
      System.out.println("Campo 'Data de nascimento' não pode estar vazio");
    }

    if (email == null && email.isEmpty()) {
      System.out.println("O campo 'E-mail' não pode estar vazio");
    }
    if (telefone == 0) {
      System.out.println("O campo 'Telefone' não pode estar vazio");
    }
    if (dataContratacao == null && dataContratacao.isEmpty()) {
      System.out.println("O campo 'Data de contratação' não pode estar vazio");
    }
  }

  void contratarFuncionario() {

    Scanner scanner = new Scanner(System.in);
    System.out.println("*** REGISTRAR FUNCIONÁRIO ***");
    System.out.println("Digite o nome do funcionário: ");
     nome = scanner.nextLine();
    System.out.println("Digite o código do funcionário: ");
     codFuncionario = scanner.nextInt();
    System.out.println("Digite o CPF do funcionário: ");
     cpf = scanner.nextLine();
    System.out.println("Digite a data de nascimento do funcionário: ");
     dataNascimento = scanner.nextLine();
    System.out.println("Digite o email do funcionário: ");
     email = scanner.nextLine();
    System.out.println("Digite o telefone do funcionário: ");
     telefone = scanner.nextInt();
    System.out.println("Digite a data de contratação do funcionário: ");
     dataContratacao = scanner.nextLine();
    System.out.println("Digite o cargo do funcionário");
     cargo = scanner.nextLine();  
    System.out.println("Contratando funcionário");

    scanner.close();
  }

  void exibirFuncionario() {
    System.out.println("*** INFORMAÇÕES DO FUNCIONÁRIO ***");
    System.out.println("Nome: " + nome);
    System.out.println("Código: " + codFuncionario);
    System.out.println("CPF: " + cpf);
    System.out.println("Data de nascimento: " + dataNascimento);
    System.out.println("Email: " + email);
    System.out.println("Telefone: " + telefone);
    System.out.println("Data de contratação: " + dataContratacao);
  }

  void agendarAula() {
	
	Scanner scanner = new Scanner(System.in);
    System.out.println("*** AGENDAR AULA ***");
    System.out.println("Digite o nome do aluno: ");
    nomeAluno = scanner.nextLine();
    System.out.println("Digite o código do aluno: ");
    codAluno = scanner.nextInt();
    System.out.println("Digite os equipamentos usados: ");
    nomeEquipamento = scanner.nextLine();
    System.out.println("Digite o nome do instrutor: ");
    nomeInstrutor = scanner.nextLine();
    System.out.println("Digite o horário da aula: ");
    horarioAula = scanner.nextLine();
    System.out.println("Digite a descrição da aula: ");
    descricaoAula = scanner.nextLine();
  }

  void exibirAula(){
    System.out.println("*** INFORMAÇÕES DA AULA ***");
    System.out.println("Nome do aluno: " + nomeAluno);
    System.out.println("Código do aluno: " + codAluno);
    System.out.println("Equipamentos usados: " + nomeEquipamento);
    System.out.println("Nome do instrutor: " + nomeInstrutor);
    System.out.println("Horário da aula: " + horarioAula);
    System.out.println("Descrição da aula: " + descricaoAula);
  }

}
