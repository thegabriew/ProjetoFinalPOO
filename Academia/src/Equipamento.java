import java.sql.Date;

public class Equipamento {

  private String nome;
  private int idEquipamento;
  private String tipo;
  private Date dataCompra;
  private String descricao;

  //construtor

  public void cadEquipamento(String nome, String tipo, Date dataCompra, String descricao) {
    this.nome = nome;
    this.tipo = tipo;
    this.dataCompra = dataCompra;
    this.descricao = descricao;
  }

  void impEquip() {
    System.out.print("--------------\n");
    System.out.println("ID: " + getIdEquipamento());
    System.out.println("NOME: " + getNome());
    System.out.println("TIPO: " + getTipo());
    System.out.println("DATA DA COMPRA: " + getDataCompra());
    System.out.println("DESCRIÇÃO: " + getDescricao());
  }

  //get's

  public String getNome() {
    return nome;
  }

  public int getIdEquipamento() {
    return idEquipamento;
  }

  public String getTipo() {
    return tipo;
  }

  public Date getDataCompra() {
    return dataCompra;
  }

  public String getDescricao() {
    return descricao;
  }

  //set's

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setIdEquipamento(int idEquipamento) {
    this.idEquipamento = idEquipamento;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public void setDataCompra(Date dataCompra) {
    this.dataCompra = dataCompra;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }
}