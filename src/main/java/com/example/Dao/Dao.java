package com.example.Dao;

import java.sql.Connection;

public class Dao {
    private Connection conn;

    public Dao(Connection conn) {
        this.conn = conn;
    }
    public void listar(String tabela) {
        var sql = "select * from " + tabela; //pode concatenar pois não vem do usuario
        System.out.println(sql);
        try {
            var statement = conn.createStatement();
            var result = statement.executeQuery(sql);
            var  metadata = result.getMetaData();
            int cols = metadata.getColumnCount();

            for (int i = 1; i < cols; i++) {
                System.out.printf("%-24s | ",metadata.getColumnName(i));
            }

            while(result.next()){
                for (int i = 1; i < cols; i++) {
                    System.out.printf("%-24s | ",result.getString(i));
                }
            }

        } catch (Exception e) {
            // TODO: handle exception
        }
    
    }
}
