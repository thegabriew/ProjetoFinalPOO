import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class ConexaoEquipamentos {

    // create

    public static void insertData(Connection conn, Equipamento e) throws SQLException {
        String sql = "INSERT INTO equipamento (nome, tipo, dataCompra, descricao) VALUES (?, ?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, e.getNome());
            pstmt.setString(2, e.getTipo());
            pstmt.setDate(3, e.getDataCompra());
            pstmt.setString(4, e.getDescricao());
            pstmt.executeUpdate();
            System.out.println("Dados inseridos com sucesso!");
        }
    }

    // cadastrando equipamento

    public static void insEquipamento(Connection conn) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("NOME: ");
            String nome = scanner.nextLine();

            System.out.print("TIPO: ");
            String tipo = scanner.nextLine();

            System.out.print("DATA DA COMPRA (AAAA-MM-DD): ");
            String dataCompraStr = scanner.nextLine();
            Date dataCompra = Date.valueOf(dataCompraStr);

            System.out.print("DESCRIÇÃO: ");
            String descricao = scanner.nextLine();

            Equipamento newEquip = new Equipamento();

            newEquip.setNome(nome);
            newEquip.setTipo(tipo);
            newEquip.setDataCompra(dataCompra);
            newEquip.setDescricao(descricao);

            insertData(conn, newEquip);

            scanner.close();
        } catch (Exception e) {
            System.out.println("Erro ao inserir equipamento!" + e.getMessage());
        }
    }

    // read

    @SuppressWarnings("rawtypes")
    public static ArrayList selectData(Connection conn) throws SQLException {
        String sql = "SELECT * FROM equipamento";
        ArrayList<Equipamento> listEquipamento = new ArrayList<>();
        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Equipamento e = new Equipamento();
                e.setNome(rs.getString("nome"));
                e.setIdEquipamento(rs.getInt("idEquipamento"));
                e.setTipo(rs.getString("tipo"));
                e.setDataCompra(rs.getDate("dataCompra"));
                e.setDescricao(rs.getString("descricao"));
                listEquipamento.add(e);
            }
        }

        return listEquipamento;
    }

    // imprimindo equipamentos

    @SuppressWarnings("unchecked")
    public static void impEquipamento(Connection conn) {
        try {
            ArrayList<Equipamento> listEquipamento = ConexaoEquipamentos.selectData(conn);
            for (Equipamento e : listEquipamento) {
                e.impEquip();
            }
        } catch (Exception e) {
            System.out.println("Falha ao imprimir equipamentos!" + e.getMessage());
        }
    }

    // update

    public static void updateData(Connection conn, Equipamento e) throws SQLException {
        String sql = "UPDATE equipamento SET nome = ?, tipo = ?, dataCompra = ?, descricao = ? WHERE idEquipamento = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, e.getNome());
            pstmt.setString(2, e.getTipo());
            pstmt.setDate(3, e.getDataCompra());
            pstmt.setString(4, e.getDescricao());
            pstmt.setInt(5, e.getIdEquipamento());
            pstmt.executeUpdate();
            System.out.println("Dados atualizados com sucesso!");
        }
    }

    // atualizando cadastro

    @SuppressWarnings("unchecked")
    public static void atEquipamento(Connection conn) throws SQLException {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Informe o ID do equipamento: ");
            int idEquip = scanner.nextInt();
            scanner.nextLine();

            ArrayList<Equipamento> listeEquipamento = selectData(conn);
            boolean encontrado = false;
            for (Equipamento e : listeEquipamento) {
                if (e.getIdEquipamento() == idEquip) {
                    encontrado = true;

                    System.out.print("NOME: ");
                    String nome = scanner.nextLine();

                    System.out.print("TIPO: ");
                    String tipo = scanner.nextLine();

                    System.out.print("DATA DA COMPRA (AAAA-MM-DD): ");
                    String dataCompraStr = scanner.nextLine();
                    Date dataCompra = Date.valueOf(dataCompraStr);

                    System.out.print("DESCRICÃO: ");
                    String descricao = scanner.nextLine();

                    Equipamento upEquip = new Equipamento();
                    upEquip.setNome(nome);
                    upEquip.setTipo(tipo);
                    upEquip.setDataCompra(dataCompra);
                    upEquip.setDescricao(descricao);

                    updateData(conn, upEquip);
                }
            }

            if (!encontrado) {
                System.out.println("Equipamento não encontrado!");
            }

            scanner.close();
        } catch (Exception e) {
            System.out.println("Falha ao atualizar Equipamento!" + e.getMessage());
        }
    }

    // delete

    public static void deleteData(Connection conn, int e) throws SQLException {
        String sql = "DELETE FROM equipamento WHERE idEquipamento = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, e);
            pstmt.executeUpdate();
            System.out.println("Equipamento deletado com sucesso!");
        }
    }

    // deletando equipamento

    public static void delEquip(Connection conn) throws SQLException {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o ID do equipamento a ser deletado: ");
            int idEquip = scanner.nextInt();
            scanner.nextLine();

            deleteData(conn, idEquip);

            scanner.close();
        } catch (Exception e) {
            System.out.println("Erro ao deletar equipamento!" + e.getMessage());
        }
    }
}