import java.sql.Date;

public class Funcionario {
	
	private int idFuncionario;
	private String cpf;
	private String nome;
	private double salario;
	private String cargo;
	private String telefone;
	private String email;
	private Date dataContratacao;
	private Date dataNascimento;

	//construtor

	public void cadFuncionario(String cpf, String nome, double salario, String cargo, String telefone, String email, Date dataContratacao, Date dataNascimento) {
        this.cpf = cpf;
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
        this.telefone = telefone;
        this.email = email;
        this.dataContratacao = dataContratacao;
        this.dataNascimento = dataNascimento;
    }

	public void impFuncionario(){
		System.out.print("--------------\n");
		System.out.println("ID: " + getIdFuncionario());
		System.out.println("CPF: " + getCpf());
		System.out.println("NOME: " + getNome());
		System.out.println("CARGO: " + getCargo());
		System.out.println("SALÁRIO: " + getSalario());
		System.out.println("E-MAIL: " + getEmail());
		System.out.println("TELEFONE: " + getTelefone());
		System.out.println("DATA DE CONTRATAÇÃO: " + getDataContratacao());
		System.out.println("DATA DE NASCIMENTE: " + getDataNascimento());

	}

	//get's

	public int getIdFuncionario() {
		return idFuncionario;
	}
	public String getCpf() {
		return cpf;
	}
	public String getNome() {
		return nome;
	}
	public double getSalario() {
		return salario;
	}
	public String getCargo() {
		return cargo;
	}
	public String getTelefone() {
		return telefone;
	}
	public String getEmail() {
		return email;
	}
	public Date getDataContratacao() {
		return dataContratacao;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}

	//set's

	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setDataContratacao(Date dataContratacao) {
		this.dataContratacao = dataContratacao;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
}
