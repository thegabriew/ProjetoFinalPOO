import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);

        String url = "jdbc:mysql://localhost:3306/academia";
        String user = "root";
        String password = "161003";

        int x = 21;
        while (x != 0) {
            System.out.println("----CREATE----\t\t\t----SHOW----");
            System.out.println("1 - Cadastrar Academia.\t\t 5 - Tabela Academia.");
            System.out.println("2 - Cadastrar Funcionário.\t 6 - Tabela Funcionário.");
            System.out.println("3 - Cadastrar Aluno.\t\t 7 - Tabela Aluno.");
            System.out.println("4 - Cadastrar Equipamento.\t 8 - Tabela Equipamento.");
            System.out.println("-------------------\t\t -------------------\n");

            System.out.println("----UPDATE----\t\t\t\t----DELETE----");
            System.out.println("9 - Atualizar Cadastro Academia.\t 13 - Deletar Cadastro Academia.");
            System.out.println("10 - Atualiza Cadastro Funcionário.\t 14 - Deletar Cadastro Funcionário.");
            System.out.println("11 - Atualizar Cadastro Aluno.\t\t 15 - Deletar Cadastro Cliente.");
            System.out.println("12 - Atualizar Cadastro Equipamento.\t 16 - Deletar Cadastro Equipamento.");
            System.out.println("-------------------\t\t\t -------------------\n");

            System.out.println("0 - Encerrar programa.");

            System.out.print("\nDigite aqui a opção desejada -> ");
            x = scanner.nextInt();
            if(x == 0){
                System.out.println("Programa Encerrado.");
                scanner.close();
                break;
            }
            if (x == 1) {
                try (Connection conn = DriverManager.getConnection(url, user, password)){
                    ConexaoAcademia.insAcademia(conn);
                } catch (Exception e) {
                    System.out.println("Falha na conexão! " + "##" + e.getMessage() + "##");
                }
            }
            if(x == 2) {
                try (Connection conn = DriverManager.getConnection(url, user, password)){
                    ConexaoFuncionario.insFuncionario(conn);
                } catch (Exception e) {
                    System.out.println("Falha na conexão! " + "##" + e.getMessage() + "##");
                }
            }
            if(x == 3) {
                try (Connection conn = DriverManager.getConnection(url, user, password)){
                    ConexaoAluno.insAluno(conn);
                } catch (Exception e) {
                    System.out.println("Falha na conexão! " + "##" + e.getMessage() + "##");
                }
            }
            if(x == 4) {
                try (Connection conn = DriverManager.getConnection(url, user, password)){
                    ConexaoEquipamentos.insEquipamento(conn);
                } catch (Exception e) {
                    System.out.println("Falha na conexão! " + "##" + e.getMessage() + "##");
                }
            }
            if(x == 5) {
                try (Connection conn = DriverManager.getConnection(url, user, password)){
                    ConexaoAcademia.impAcademia(conn);
                } catch (Exception e) {
                    System.out.println("Falha na conexão! " + "##" + e.getMessage() + "##");
                }
            }
            if(x == 6) {
                try (Connection conn = DriverManager.getConnection(url, user, password)){
                    ConexaoFuncionario.impFuncionario(conn);
                } catch (Exception e) {
                    System.out.println("Falha na conexão! " + "##" + e.getMessage() + "##");
                }
            }
            if(x == 7) {
                try (Connection conn = DriverManager.getConnection(url, user, password)){
                    ConexaoAluno.impAluno(conn);
                } catch (Exception e) {
                    System.out.println("Falha na conexão! " + "##" + e.getMessage() + "##");
                }
            }
            if(x == 8) {
                try (Connection conn = DriverManager.getConnection(url, user, password)){
                    ConexaoEquipamentos.impEquipamento(conn);
                } catch (Exception e) {
                    System.out.println("Falha na conexão! " + "##" + e.getMessage() + "##");
                }
            }
            if(x == 9) {
                try (Connection conn = DriverManager.getConnection(url, user, password)){
                    ConexaoAcademia.atAcademia(conn);
                } catch (Exception e) {
                    System.out.println("Falha na conexão! " + "##" + e.getMessage() + "##");
                }
            }
            if(x == 10) {
                try (Connection conn = DriverManager.getConnection(url, user, password)){
                    ConexaoFuncionario.atFuncionario(conn);
                } catch (Exception e) {
                    System.out.println("Falha na conexão! " + "##" + e.getMessage() + "##");
                }
            }
            if(x == 11) {
                try (Connection conn = DriverManager.getConnection(url, user, password)){
                    ConexaoAluno.atAluno(conn);
                } catch (Exception e) {
                    System.out.println("Falha na conexão! " + "##" + e.getMessage() + "##");
                }
            }
            if(x == 12) {
                try (Connection conn = DriverManager.getConnection(url, user, password)){
                    ConexaoEquipamentos.atEquipamento(conn);
                } catch (Exception e) {
                    System.out.println("Falha na conexão! " + "##" + e.getMessage() + "##");
                }
            }
            if(x == 13) {
                try (Connection conn = DriverManager.getConnection(url, user, password)){
                    ConexaoAcademia.delAcademia(conn);
                } catch (Exception e) {
                    System.out.println("Falha na conexão! " + "##" + e.getMessage() + "##");
                }
            }
            if(x == 14) {
                try (Connection conn = DriverManager.getConnection(url, user, password)){
                    ConexaoFuncionario.delFuncionario(conn);
                } catch (Exception e) {
                    System.out.println("Falha na conexão! " + "##" + e.getMessage() + "##");
                }
            }
            if(x == 15) {
                try (Connection conn = DriverManager.getConnection(url, user, password)){
                    ConexaoAluno.delAluno(conn);
                } catch (Exception e) {
                    System.out.println("Falha na conexão! " + "##" + e.getMessage() + "##");
                }
            }
            if(x == 16) {
                try (Connection conn = DriverManager.getConnection(url, user, password)){
                    ConexaoEquipamentos.delEquip(conn);
                } catch (Exception e) {
                    System.out.println("Falha na conexão! " + "##" + e.getMessage() + "##");
                }
            }
        }
    }
}