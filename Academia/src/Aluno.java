package Academia.src;

import java.util.Scanner;

public class Aluno {

  private String nome;
  private int codAluno;
  private String cpf;
  private String dataNascimento;
  private String pagamento;
  private String plano;
  private String telefone;
  private String email;

  void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  String getTelefone() {
    return this.telefone;
  }

  void setEmail(String email) {
    this.email = email;
  }

  String getEmail() {
    return this.email;
  }

  void setPlano(String plano) {
    this.plano = plano;
  }

  String getPlano() {
    return this.plano;
  }

  void setNome(String nome) {
    this.nome = nome;
  }

  String getNome() {
    return this.nome;
  }

  void setCodAluno(int codAluno) {
    this.codAluno = codAluno;
  }

  int getCodAluno() {
    return this.codAluno;
  }

  void setCpf(String cpf) {
    this.cpf = cpf;
  }

  String getCpf() {
    return this.cpf;
  }

  void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  void setPagamento(String pagamento) {
    this.pagamento = pagamento;
  }

  String getPagamento() {
    return this.pagamento;
  }

  void adicionarAluno() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("*** ADICIONAR ALUNO ***");
    System.out.println("Digite o nome do aluno: ");
    String nome = scanner.nextLine();
    System.out.println("Digite o código do aluno: ");
    int codAluno = scanner.nextInt();
    System.out.println("Digite o CPF do aluno: ");
    String cpf = scanner.nextLine();
    System.out.println("Digite a data de nascimento do aluno: ");
    String dataNascimento = scanner.nextLine();
    System.out.println("Digite o email do aluno: ");
    String email = scanner.nextLine();
    System.out.println("Digite o telefone do aluno: ");
    int telefone = scanner.nextInt();
    System.out.println("Digite o pagamento do aluno: ");
    String pagamento = scanner.nextLine();
    System.out.println("Aluno adicionado");
  }

  void exibirAluno() {
    System.out.println("*** INFORMAÇÕES DO ALUNO ***");

    System.out.println("Nome: " + nome);
    System.out.println("Telefone: " + telefone);
    System.out.println("Email: " + email);
    System.out.println("CPF: " + cpf);
    System.out.println("Data de nascimento: " + dataNascimento);
    System.out.println("Pagamento: " + pagamento);

  }

}
