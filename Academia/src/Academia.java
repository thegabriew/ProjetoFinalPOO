import java.util.Scanner;

public class Academia {
  
   private String nome;
  private String cnpj;
  private String UF;
  private int telefone;
  

void setNome(String nome) {
    this.nome = nome;
  }

  String getNome() {
    return this.nome;
  }

  void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  String getCnpj() {
    return this.cnpj;
  }

  void setUF(String UF) {
    this.UF = UF;
  }

  String getUF() {
    return this.UF;
  }

  void setTelefone(int telefone) {
    this.telefone = telefone;
  }

  int getTelefone() {
    return this.telefone;
  }

  void registrarAcademia() {
    Scanner scan = new Scanner (System.in);
    System.out.println("*** REGISTRAR ACADEMIA ***");
    System.out.println("Digite o nome da academia: ");
    nome = scan.nextLine();
    System.out.println("Digite o CNPJ da academia: ");
    cnpj = scan.nextLine();
    System.out.println("Digite a UF da academia: ");
    UF = scan.nextLine();
    System.out.println("Digite o telefone da academia: ");
    telefone = scan.nextInt();
    System.out.println("Academia registrada");
    scan.close();
  }

  void exibirAcademia(){
    System.out.println("*** INFORMAÇÕES DA ACADEMIA ***");
    System.out.println("Nome: " + nome);
    System.out.println("CNPJ: " + cnpj);
    System.out.println("UF: " + UF);
    System.out.println("Telefone: " + telefone);

    
  }

}
