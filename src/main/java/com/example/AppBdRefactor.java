package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.example.Dao.ConnectionManager;
import com.example.Dao.Dao;
import com.example.Dao.EstadoDao;
import com.example.Dao.ProdutoDao;
import com.example.model.Produto;

public class AppBdRefactor {
    public static void main(String[] args) {
        new AppBdRefactor();
    }

    AppBdRefactor(){
        try(var conn = ConnectionManager.getConnection()){
 //           var connection = new ConnectionManager();            
            var estadoDao = new EstadoDao(conn);
            var produtoDao = new ProdutoDao(conn);
            var dao = new Dao(conn);

            estadoDao.listar(); 
            estadoDao.localizar("PR");
            dao.listar("cliente");
        } catch (SQLException | ClassNotFoundException e) {
            System.err.println("Não foi possível conectar ao banco de dados: " + e.getMessage());
        }
    }
    
}
