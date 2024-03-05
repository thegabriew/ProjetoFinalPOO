import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ConexaoAluno {

    public static void insertData(Connection conn, Aluno a) throws SQLException{
        String sql = "INSERT INTO aluno (nome, cpf, telefone, email, dataNascimento) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, a.getNome());
            pstmt.setString(2, a.getCpf());
            pstmt.setString(3, a.getTelefone());
            pstmt.setString(4, a.getEmail());
            pstmt.setDate(5, a.getDataNascimento());
            pstmt.executeUpdate();
            System.out.println("Dados inseridos com sucesso!");
        }
    }

    @SuppressWarnings("rawtypes")
    public static ArrayList selectData(Connection conn) throws SQLException{
        String sql = "SELECT * FROM aluno";
        ArrayList<Aluno> listAluno = new ArrayList<>();
        try(Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)){
            while (rs.next()) {
                Aluno a = new Aluno();
                a.setIdAluno(rs.getInt("idAluno"));
                a.setNome(rs.getString("nome"));
                a.setCpf(rs.getString("cpf"));
                a.setTelefone(rs.getString("telefone"));
                a.setDataNascimento(rs.getDate("dataNascimento"));
                a.setEmail(rs.getString("email"));
                listAluno.add(a);
            }
        }

        return listAluno;
    }

    public static void updateData(Connection conn, Aluno a) throws SQLException{
        String sql = "UPDATE aluno SET nome = ?, cpf = ?, telefone = ?, dataNascimento = ?, email = ? WHERE idAluno = ?";
        try(PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, a.getNome());
            pstmt.setString(2, a.getCpf());
            pstmt.setString(3, a.getTelefone());
            pstmt.setDate(4, a.getDataNascimento());
            pstmt.setString(5, a.getEmail());
            pstmt.setInt(6, a.getIdAluno());
            pstmt.executeUpdate();
            System.out.println("Dados atualizados com sucesso!");
        }
    }
}