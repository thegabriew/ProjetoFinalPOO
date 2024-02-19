package Academia.src;

public class Funcionario {

    private int id;
    private String nome;
    private String dataContratacao;
    private String cargo;
    private double salario;

    //get's

    public int getIdFun(){
        return id;
    }

    public String getNomeFun(){
        return nome;
    }

    public String getDataContratacaoFun(){
        return dataContratacao;
    }

    public String getCargoFun(){
        return cargo;
    }

    public double getSalarioFun(){
        return salario;
    }

    //set's

    public void setIdFun(int id){
        this.id = id;
    }

    public void setNomeFun(String nome){
        this.nome = nome;
    }

    public void setDataContratacaoFun(String dataContratacao){
        this.dataContratacao = dataContratacao;
    }

    public void setCargoFun(String cargo){
        this.cargo = cargo;
    }

    public void setSalarioFun(double salario){
        this.salario = salario;
    }
}
