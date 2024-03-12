import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class ConexaoAluno {

    // create

    public static void insertData(Connection conn, Aluno a) throws SQLException {
        String sql = "INSERT INTO aluno (nome, cpf, telefone, email, dataNascimento) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, a.getNome());
            pstmt.setString(2, a.getCpf());
            pstmt.setString(3, a.getTelefone());
            pstmt.setString(4, a.getEmail());
            pstmt.setDate(5, a.getDataNascimento());
            pstmt.executeUpdate();
            System.out.println("Dados inseridos com sucesso!");
        }
    }

    // cadastrando aluno

    public static void insAluno(Connection conn) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("NOME: ");
            String nome = scanner.nextLine();

            System.out.print("CPF: ");
            String cpf = scanner.nextLine();

            System.out.print("TELEFONE: ");
            String telefone = scanner.nextLine();

            System.out.print("E-MAIL: ");
            String email = scanner.nextLine();

            System.out.print("DATA DE NASCIMENTO (AAAA-MM-DD): ");
            String dataNascimentoStr = scanner.nextLine();
            Date dataNascimento = Date.valueOf(dataNascimentoStr);

            Aluno newAluno = new Aluno();
            newAluno.setCpf(cpf);
            newAluno.setNome(nome);
            newAluno.setEmail(email);
            newAluno.setTelefone(telefone);
            newAluno.setDataNascimento(dataNascimento);

            insertData(conn, newAluno);

            scanner.close();
        } catch (Exception e) {
            System.out.println("Erro ao inserir aluno!" + e.getMessage());
        }
    }

    // read

    @SuppressWarnings("rawtypes")
    public static ArrayList selectData(Connection conn) throws SQLException {

        String sql = "SELECT * FROM aluno";
        ArrayList<Aluno> listAluno = new ArrayList<>();
        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
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

    // imprimindo alunos

    @SuppressWarnings("unchecked")
    public static void impAluno(Connection conn) {
        try {
            ArrayList<Aluno> listAluno = ConexaoAluno.selectData(conn);
            for (Aluno a : listAluno) {
                a.impAluno();
            }
        } catch (Exception e) {
            System.out.println("Falha ao imprimir Alunos!" + e.getMessage());
        }
    }

    // update

    public static void updateData(Connection conn, Aluno a) throws SQLException {
        String sql = "UPDATE aluno SET nome = ?, cpf = ?, telefone = ?, dataNascimento = ?, email = ? WHERE idAluno = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
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

    // atualizando cadastro

    @SuppressWarnings("unchecked")
    public static void atAluno(Connection conn) throws SQLException {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Informe o ID do Aluno: ");
            int idAluno = scanner.nextInt();
            scanner.nextLine();

            ArrayList<Aluno> listaluno = selectData(conn);
            boolean encontrado = false;
            for (Aluno a : listaluno) {
                if (a.getIdAluno() == idAluno) {
                    encontrado = true;

                    System.out.print("NOME: ");
                    String nome = scanner.nextLine();

                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();

                    System.out.print("TELEFONE: ");
                    String telefone = scanner.nextLine();

                    System.out.print("E-MAIL: ");
                    String email = scanner.nextLine();

                    System.out.print("DATA DE NASCIMENTO (AAAA-MM-DD): ");
                    String dataNascimentoStr = scanner.nextLine();
                    Date dataNascimento = Date.valueOf(dataNascimentoStr);

                    Aluno upAluno = new Aluno();
                    upAluno.setCpf(cpf);
                    upAluno.setNome(nome);
                    upAluno.setEmail(email);
                    upAluno.setTelefone(telefone);
                    upAluno.setDataNascimento(dataNascimento);

                    updateData(conn, upAluno);
                }
            }

            if (!encontrado) {
                System.out.println("Aluno não encontrado!");
            }

            scanner.close();
        } catch (Exception e) {
            System.out.println("Falha ao atualizar Aluno!" + e.getMessage());
        }
    }

    // delete

    public static void deleteData(Connection conn, int a) throws SQLException {
        String sql = "DELETE FROM aluno WHERE idAluno = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, a);
            pstmt.executeUpdate();
            System.out.println("Aluno removido com sucesso!");
        }
    }

    // deletando aluno

    public static void delAluno(Connection conn) throws SQLException {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o ID do aluno a ser deletado: ");
            int idAluno = scanner.nextInt();
            scanner.nextLine();

            deleteData(conn, idAluno);

            scanner.close();
        } catch (Exception e) {
            System.out.println("Erro ao deletar funcionário!" + e.getMessage());
        }
    }
}