package Academia.src;

public class Equipamento {
    private int id;
    private String nome;
    private String dataCompra;
    private double preco;
    private String descricao;

    //get's

    public int getIdEquip(){
        return id;
    }

    public String getNomeEquip(){
        return nome;
    }

    public String getDataCompraEquip(){
        return dataCompra;
    }

    public double getPrecoEquip(){
        return preco;
    }

    public String getDescricaoEquip(){
        return descricao;
    }

    //set's

    public void setIdEquip(int id){
        this.id = id;
    }

    public void setNomeEquip(String nome){
        this.nome = nome;
    }

    public void setDataCompraEquip(String dataCompra){
        this.dataCompra = dataCompra;
    }

    public void setPrecoEquip(double preco){
        this.preco = preco;
    }

    public void setDescricaoEquipÁ(String descricao){
        this.descricao = descricao;
    }
}
