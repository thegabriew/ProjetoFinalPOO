import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws SQLException {
        Connection con = Conexao.getConexaoMySQL();
        Aluno a1 = new Aluno();
        a1.cadAluno("Guilherme", "406.654.894-17", Date.valueOf("2003-10-16"), "9-9321-0216", "gui@gmail.com");
        ConexaoAluno.insertData(con, a1);
        ArrayList<Aluno> list = ConexaoAluno.selectData(con);
        for(Aluno aluno: list){
            aluno.impAluno();
        }
/*
        UPDATE
        
        a1.setIdAluno(1); // Suponha que você queira atualizar o aluno com ID 1
        a1.setNome("Novo Nome");
        a1.setCpf("Novo CPF");
        a1.setTelefone("Novo Telefone");
        a1.setDataNascimento(java.sql.Date.valueOf("2000-01-01")); // Exemplo de data
        a1.setEmail("novoemail@example.com");

        ConexaoAluno.updateData(con, a1);

        ArrayList<Aluno> list = ConexaoAluno.selectData(con);
        for(Aluno aluno: list){
            aluno.impAluno();
        }
*/
    }
}