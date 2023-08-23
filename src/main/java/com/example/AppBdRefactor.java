package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AppBdRefactor {
    private static final String PASSWORD = "";
    private static final String USERNAME = "gitpod";
    private static final String JDBC_URL = "jdbc:postgresql://localhost/postgres";
    

    public static void main(String[] args) {
        new AppBdRefactor();
    }

    AppBdRefactor(){
        try(var conn = getConnection()){
            //carregarDriverJDBC(); //Não é mais necessário nas versoes modernas do jdbc
            //listaEstados(conn); 
            //localizarEstado(conn,"PR");
            listarDadosTabela(conn,"cliente");
        } catch (SQLException e) {
            System.err.println("Não foi possível conectar ao banco de dados: " + e.getMessage());
        }
    }
    private void inserirProduto(Connection conn, Produto produto){
        var sql = "insert into produto (nome, marcaId, valor) values(?,?,?)";
        try {
            var statement = conn.prepareStatement(sql);
            statement.setString(1, produto.getNome());
            statement.setInt(2, produto.getMarcaId());
            statement.setDouble(3, produto.getValor());

            var result = statement.executeUpdate();

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    private void alterarProduto(Connection conn, Produto produto){
        var sql = "update produto set nome=?, marcaId=?, valor=? where id=?";
        try {
            var statement = conn.prepareStatement(sql);
            statement.setString(1, produto.getNome());
            statement.setInt(2, produto.getMarcaId());
            statement.setDouble(3, produto.getValor());
            statement.setInt(4, produto.getId());

            var result = statement.executeUpdate();
            
        } catch (Exception e) {
            // TODO: handle exception
        }

    }

    private void excluirProduto(Connection conn, long id){
        var sql = "delete from produto where id = ?";
        try {
            var statement = conn.prepareStatement(sql);
            statement.setLong(1, id);
            if(statement.executeUpdate() == 1)
                System.err.println("Produto excluido");
            else
                System.err.println("Erro exclusão");

        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    private void listarDadosTabela(Connection conn, String tabela) {
        var sql = "select * from " + tabela; //pode concatenar pois não vem do usuario
        System.out.println(sql);
        try {
            var statement = conn.createStatement();
            var result = statement.executeQuery(sql);
            var  metadata = result.getMetaData();
            int cols = metadata.getColumnCount();

            for (int i = 1; i < cols; i++) {
                System.out.printf("%-22s | ",metadata.getColumnName(i));
            }

            while(result.next()){
                for (int i = 1; i < cols; i++) {
                    System.out.printf("%-22s | ",result.getString(i));
                }
            }

        } catch (Exception e) {
            // TODO: handle exception
        }
    
    }

    private void localizarEstado(Connection conn, String uf) {
        try{
            //var sql = "select * from estado where uf='" + uf + "'";
            var sql = "select * from estado where uf=?";
            var statement = conn.prepareStatement(sql);
            statement.setString(1, uf);

            System.out.println(sql);
            var result = statement.executeQuery();
            if(result.next()){
                System.out.printf("Id: %d Nome: %s UF: %s\n",result.getInt("id"),result.getString("nome"), result.getString("uf"));
            }
        }catch (SQLException e){
            System.out.println("Erro ao executar consulta sql: " + e.getMessage());
        }
    }
  private void listaEstados(Connection conn) {
        try{
                System.out.println("conexão bem sucedida");

                var statement = conn.createStatement();
                var result = statement.executeQuery("select * from estado");
                
                while(result.next()){
                    System.out.printf("ID: %d Nome: %s UF: %s\n",result.getInt("id"), result.getString("nome"), result.getString("uf"));
                }
        } catch (SQLException e) {
                System.err.println("Não foi possível executar a consulta ao banco de dados: " + e.getMessage());      
        }
    }

    private Connection getConnection() throws SQLException{
        return DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
    }

    private void carregarDriverJDBC() {
        try {
            Class.forName("org.postgresql.Driver"); 
        } catch (ClassNotFoundException e) {
            System.err.println("Não foi possível carregar a biblioteca do banco de dados: " + e.getMessage());
        }
    }
    
}
