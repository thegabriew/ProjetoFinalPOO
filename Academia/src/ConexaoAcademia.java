import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class ConexaoAcademia {
    
    //create

    public static void insertData(Connection conn, Academia c) throws SQLException{
        String sql = "INSERT INTO academia (cnpj, uf, nome, teleforne, email) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, c.getCnpj());
            pstmt.setString(2, c.getUF());
            pstmt.setString(3, c.getNome());
            pstmt.setString(4, c.getTelefone());
            pstmt.setString(5, c.getEmail());
            pstmt.executeUpdate();
            System.out.println("Dados inseridos com sucesso!");
        }
    }

    //cadastrando equipamento

    public static void insAcademia(Connection conn){
        try {
            Scanner scanner = new Scanner(System.in);
            boolean continuar = true;
            while (continuar) {

                System.out.print("CNPJ: ");
                String cnpj = scanner.nextLine();

                System.out.print("UF: ");
                String uf = scanner.nextLine();

                System.out.print("NOME: ");
                String nome = scanner.nextLine();

                System.out.print("TELEFONE: ");
                String telefone = scanner.nextLine();

                System.out.print("E-MAIL: ");
                String email = scanner.nextLine();

                Academia newAcademia = new Academia();
                newAcademia.setCnpj(cnpj);
                newAcademia.setUf(uf);
                newAcademia.setNome(nome);
                newAcademia.setTelefone(telefone);
                newAcademia.setEmail(email);

                insertData(conn, newAcademia);

                System.out.print("\nDeseja inserir outra academia? (s/n): ");
                String keep = scanner.nextLine();
                if(keep.equals("n")){
                    continuar = false;
                }
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("Erro ao inserir academia!" + e.getMessage());
        }
    }

    //read

    @SuppressWarnings("rawtypes")
    public static ArrayList selectData(Connection conn) throws SQLException{
        
        String sql = "SELECT * FROM academia";
        ArrayList<Academia> listAcademia = new ArrayList<>();
        try(Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)){
            while (rs.next()) {
                Academia c = new Academia();
                c.setCnpj(rs.getString("cnpj"));
                c.setUf(rs.getString("uf"));
                c.setNome(rs.getString("nome"));
                c.setTelefone(rs.getString("teleforne"));
                c.setEmail(rs.getString("email"));
                listAcademia.add(c);
            }
        }
        return listAcademia;
    }

    //imprimindo equipamentos

    @SuppressWarnings("unchecked")
    public static void impAcademia(Connection conn){
        try {
            ArrayList<Academia> listAcademia = ConexaoAcademia.selectData(conn);
            for(Academia ac: listAcademia){
                ac.impAcademia();
            }
        } catch (Exception e) {
            System.out.println("Falha ao imprimir academia!" + e.getMessage());
        }
    }

    //update

    public static void updateData(Connection conn, Academia c) throws SQLException{
        String sql = "UPDATE academia SET cnpj = ?, uf = ?, nome = ?, telefone = ?, email = ? WHERE cnpj = ?";
        try(PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, c.getCnpj());
            pstmt.setString(2, c.getUF());
            pstmt.setString(3, c.getNome());
            pstmt.setString(4, c.getTelefone());
            pstmt.setString(5, c.getEmail());
            pstmt.setString(6, c.getCnpj());
            pstmt.executeUpdate();
            System.out.println("Dados atualizados com sucesso!");
        }
    }

    //atualizando cadastro

    @SuppressWarnings("unchecked")
    public static void atAcademia(Connection conn) throws SQLException{
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Informe o CNPJ da academia: ");
            String cnpjac = scanner.nextLine();

            ArrayList<Academia> listAcademia = selectData(conn);
            boolean encontrado = false;
            for(Academia ac : listAcademia){
                if(ac.getCnpj() == cnpjac){
                    encontrado = true;
                    boolean continuar = true;
                    while (continuar) {
                        
                        System.out.print("CNPJ: ");
                        String cnpj = scanner.nextLine();

                        System.out.print("UF: ");
                        String uf = scanner.nextLine();

                        System.out.print("NOME: ");
                        String nome = scanner.nextLine();

                        System.out.print("TELEFONE: ");
                        String telefone = scanner.nextLine();

                        System.out.print("E-MAIL: ");
                        String email = scanner.nextLine();

                        Academia upAcademia = new Academia();
                        
                        upAcademia.setCnpj(cnpj);
                        upAcademia.setUf(uf);
                        upAcademia.setNome(nome);
                        upAcademia.setEmail(email);
                        upAcademia.setTelefone(telefone);

                        updateData(conn, upAcademia);

                        System.out.print("\nDeseja atualizar outro academia? (s/n): ");
                        String keep = scanner.nextLine();

                        if(keep.equals("n")){
                            continuar = false;
                        }
                    }
                }
            }

            if(!encontrado){
                System.out.println("Academia não encontrada!");
            }

            scanner.close();
        } catch (Exception e) {
            System.out.println("Falha ao atualizar dados da academia!" + e.getMessage());
        }
    }

    //delete

    public static void deleteData(Connection conn, String c) throws SQLException{
        String sql = "DELETE FROM academia WHERE cnpj = ?";
        try(PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, c);
            pstmt.executeUpdate();
            System.out.println("Academia removida com sucesso!");
        }
    }

    //deletando academia

    public static void delAcademia(Connection conn) throws SQLException{
        Scanner scanner = new Scanner(System.in);

        try {
            boolean continuar = true;
            while (continuar) {
                System.out.print("Digite o CNPJ da academia a ser deletada: ");
                String cnpjac = scanner.nextLine();

                deleteData(conn, cnpjac);

                System.out.print("Deseja deletar outra academia? (s/n): ");
                String keep = scanner.nextLine();
                if(keep.equals("n")){
                    continuar = false;
                }
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("Erro ao deletar academia!" + e.getMessage());
        }
    }
}
