package com.example.Dao;

import java.sql.Connection;
import java.sql.SQLException;

public class EstadoDao {
    private Connection conn;

    public EstadoDao(Connection conn) {
        this.conn = conn;
    } 

    public void localizar(String uf) {
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
    public void listar() {
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

}
