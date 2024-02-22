package Academia.src;

import java.util.Scanner;

public class Equipamento {

  private String nome;
  private int codEquipamento;
  private String tipo;
  private String dataCompra;

  void setNome(String nome) {
    this.nome = nome;
  }

  String getNome() {
    return this.nome;
  }

  void setCodEquipamento(int codEquipamento) {
    this.codEquipamento = codEquipamento;
  }

  int getCodEquipamento() {
    return this.codEquipamento;
  }

  void setTipo(String tipo) {
    this.tipo = tipo;
  }

  String getTipo() {
    return this.tipo;
  }

  void setDataCompra(String dataCompra) {
    this.dataCompra = dataCompra;
  }

  String getDataCompra(){
    return this.dataCompra;
  }

  void verificarCamposVazios() {
    if (nome == null && nome.isEmpty()) {
      System.out.println("Campo 'Nome do equipamento' não pode estar vazio");
    }
    if (tipo == null && tipo.isEmpty()) {
      System.out.println("Campo 'Tipo do equipamento' não pode estar vazio");
    }
    if (dataCompra == null && dataCompra.isEmpty()) {
      System.out.println("Campo 'Data de compra' não pode estar vazio");
    }
  }

  void registrarEquipamento() {
    Scanner input = new Scanner(System.in);
    System.out.println("*** REGISTRO DE EQUIPAMENTO ***");
    System.out.println("Nome do equipamento: ");
    nome = input.nextLine();
    System.out.println("Código do equipamento: ");
    codEquipamento = input.nextInt();
    System.out.println("Tipo do equipamento: ");
    tipo = input.nextLine();
    System.out.println("Data de compra: ");
    dataCompra = input.nextLine();
  }

  void exibirEquipamento() {
    System.out.println("*** INFORMAÇÕES DO EQUIPAMENTO ***");
    System.out.println("Nome: " + nome);
    System.out.println("Código: " + codEquipamento);
    System.out.println("Tipo: " + tipo);
    System.out.println("Data de compra: " + dataCompra);
  }
}
