import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class ConexaoFuncionario {
    
    //Create

    public static void insertData(Connection conn, Funcionario f) throws SQLException{
        String sql = "INSERT INTO funcionario (cpf, nome, cargo, salario, email, telefone, dataNascimento, dataContratacao) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, f.getCpf());
            pstmt.setString(2, f.getNome());
            pstmt.setString(3, f.getCargo());
            pstmt.setDouble(4, f.getSalario());
            pstmt.setString(5, f.getEmail());
            pstmt.setString(6, f.getTelefone());
            pstmt.setDate(7, f.getDataNascimento());
            pstmt.setDate(8, f.getDataContratacao());
            pstmt.executeUpdate();
            System.out.println("Dados inseridos com sucesso!");
        }
    }

    //cadastrando funcionario

    public static void insFuncionario(Connection conn){
        try {
            Scanner scanner = new Scanner(System.in);
            boolean continuar = true;
            while (continuar) {
                System.out.print("CPF: ");
                String cpf = scanner.nextLine();

                System.out.print("NOME: ");
                String nome = scanner.nextLine();

                System.out.print("CARGO: ");
                String cargo = scanner.nextLine();

                System.out.print("SALÁRIO: ");
                double salario = scanner.nextDouble();
                scanner.nextLine();

                System.out.print("E-MAIL: ");
                String email = scanner.nextLine();

                System.out.print("TELEFONE: ");
                String telefone = scanner.nextLine();

                System.out.print("DATA DE NASCIMENTO (AAAA-MM-DD): ");
                String dataNascimentoStr = scanner.nextLine();
                Date dataNascimento = Date.valueOf(dataNascimentoStr);

                System.out.print("DATA DE CONTRATAÇÃO (AAAA-MM-DD): ");
                String dataContratacaoStr = scanner.nextLine();
                Date dataContratacao = Date.valueOf(dataContratacaoStr);

                Funcionario newFun = new Funcionario();
                newFun.setCpf(cpf);
                newFun.setNome(nome);
                newFun.setCargo(cargo);
                newFun.setSalario(salario);
                newFun.setEmail(email);
                newFun.setTelefone(telefone);
                newFun.setDataNascimento(dataNascimento);
                newFun.setDataContratacao(dataContratacao);

                insertData(conn, newFun);

                System.out.print("\nDeseja inserir outro funcionário? (s/n): ");
                String keep = scanner.nextLine();
                if(keep.equals("n")){
                    continuar = false;
                }
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("Erro ao inserir funcionário!" + e.getMessage());
        }
    }

    //read

    @SuppressWarnings("rawtypes")
    public static ArrayList selectData(Connection conn) throws SQLException{
        
        String sql = "SELECT * FROM funcionario";
        ArrayList<Funcionario> listFuncionario = new ArrayList<>();
        try(Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)){
            while (rs.next()) {
                Funcionario f = new Funcionario();
                f.setIdFuncionario(rs.getInt("idFuncionario"));
                f.setCpf(rs.getString("cpf"));
                f.setNome(rs.getString("nome"));
                f.setCargo(rs.getString("cargo"));
                f.setEmail(rs.getString("email"));
                f.setTelefone(rs.getString("telefone"));
                f.setDataNascimento(rs.getDate("dataNascimento"));
                f.setDataContratacao(rs.getDate("dataContratacao"));
                listFuncionario.add(f);
            }
        }
        return listFuncionario;
    }

    //imprimindo funcionarios

    @SuppressWarnings("unchecked")
    public static void impFuncionario(Connection conn){
        try {
            ArrayList<Funcionario> listFuncionario = ConexaoFuncionario.selectData(conn);
            for(Funcionario f: listFuncionario){
                f.impFuncionario();
            }
        } catch (Exception e) {
            System.out.println("Falha ao imprimir funcionários!" + e.getMessage());
        }
    }

    //update

    public static void updateData(Connection conn, Funcionario f) throws SQLException{
        String sql = "UPDATE funcionario SET cpf = ?, nome = ?, cargo = ?, email = ?, telefone = ?, dataNascimento = ?, dataContratacao = ? WHERE idFuncionario = ?";
        try(PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, f.getCpf());
            pstmt.setString(2, f.getNome());
            pstmt.setString(3, f.getCargo());
            pstmt.setString(4, f.getEmail());
            pstmt.setString(5, f.getTelefone());
            pstmt.setDate(6, f.getDataNascimento());
            pstmt.setDate(7, f.getDataContratacao());
            pstmt.setInt(8, f.getIdFuncionario());
            pstmt.executeUpdate();
            System.out.println("Dados atualizados com sucesso!");
        }
    }

    //atualizando cadastro

    @SuppressWarnings("unchecked")
    public static void atFuncionario(Connection conn) throws SQLException{
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Informe o ID do funcionário: ");
            int idFun = scanner.nextInt();
            scanner.nextLine();

            ArrayList<Funcionario> listFuncionario = selectData(conn);
            boolean encontrado = false;
            for(Funcionario f : listFuncionario){
                if(f.getIdFuncionario() == idFun){
                    encontrado = true;
                    boolean continuar = true;
                    while (continuar) {
                        System.out.print("CPF: ");
                        String cpf = scanner.nextLine();

                        System.out.print("NOME: ");
                        String nome = scanner.nextLine();

                        System.out.print("CARGO: ");
                        String cargo = scanner.nextLine();

                        System.out.print("SALÁRIO: ");
                        double salario = scanner.nextDouble();
                        scanner.nextLine();

                        System.out.print("E-MAIL: ");
                        String email = scanner.nextLine();

                        System.out.print("TELEFONE: ");
                        String telefone = scanner.nextLine();

                        System.out.print("DATA DE NASCIMENTO (AAAA-MM-DD): ");
                        String dataNascimentoStr = scanner.nextLine();
                        Date dataNascimento = Date.valueOf(dataNascimentoStr);

                        System.out.print("DATA DE CONTRATAÇÃO (AAAA-MM-DD): ");
                        String dataContratacaoStr = scanner.nextLine();
                        Date dataContratacao = Date.valueOf(dataContratacaoStr);

                        Funcionario upFun = new Funcionario();
                        upFun.setCpf(cpf);
                        upFun.setNome(nome);
                        upFun.setCargo(cargo);
                        upFun.setSalario(salario);
                        upFun.setEmail(email);
                        upFun.setTelefone(telefone);
                        upFun.setDataNascimento(dataNascimento);
                        upFun.setDataContratacao(dataContratacao);

                        updateData(conn, upFun);

                        System.out.print("\nDeseja atualizar outro funcionário? (s/n): ");
                        String keep = scanner.nextLine();
                        if(keep.equals("n")){
                            continuar = false;
                        }
                    }
                }
            }

            if(!encontrado){
                System.out.println("Funcionário não encontrado!");
            }

            scanner.close();
        } catch (Exception e) {
            System.out.println("Falha ao atualizar funcionário!" + e.getMessage());
        }
    }

    //delete

    public static void deleteData(Connection conn, int f) throws SQLException{
        String sql = "DELETE FROM funcionario WHERE idFuncionario = ?";
        try(PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setInt(1, f);
            pstmt.executeUpdate();
            System.out.println("Funcionario removido com sucesso!");
        }
    }

    //deletando funcionario

    public static void delFuncionario(Connection conn) throws SQLException{
        Scanner scanner = new Scanner(System.in);

        try {
            boolean continuar = true;
            while (continuar) {
                System.out.print("Digite o ID do funcionário a ser deletado: ");
                int idFun = scanner.nextInt();
                scanner.nextLine();

                deleteData(conn, idFun);

                System.out.print("Deseja deletar outro funcionário? (s/n): ");
                String keep = scanner.nextLine();
                if(keep.equals("n")){
                    continuar = false;
                }
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("Erro ao deletar funcionário!" + e.getMessage());
        }
    }
}
