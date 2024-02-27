package Academia.src;

package ACAD;

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

  public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodFuncionario() {
		return codFuncionario;
	}

	public void setCodFuncionario(int codFuncionario) {
		this.codFuncionario = codFuncionario;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getDataContratacao() {
		return dataContratacao;
	}

	public void setDataContratacao(String dataContratacao) {
		this.dataContratacao = dataContratacao;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
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
    System.out.println("*** REGISTRAR FUNCIONÁRIO ***\n");
    System.out.println("\nDigite o nome do funcionário: ");
    nome = scanner.nextLine();
    System.out.println("\nDigite o código do funcionário: ");
    codFuncionario = scanner.nextInt();
    scanner.nextLine();
    System.out.println("\nDigite o CPF do funcionário: ");
    cpf = scanner.nextLine();
    System.out.println("\nDigite a data de nascimento do funcionário: ");
    dataNascimento = scanner.nextLine();
    System.out.println("\nDigite o email do funcionário: ");
    email = scanner.nextLine();
    System.out.println("\nDigite o telefone do funcionário: ");
    telefone = scanner.nextInt();
    System.out.println("\nDigite a data de contratação do funcionário: ");
    dataContratacao = scanner.nextLine();
    scanner.nextLine();
    System.out.println("\nDigite o cargo do funcionário");
    cargo = scanner.nextLine();
    System.out.println("FUNCIONÁRIO CONTRATADO");

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

}
