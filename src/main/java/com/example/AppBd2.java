package com.example;

import java.sql.DriverManager;

public class AppBd2 {

   public static void main(String[] args) {
        var calculo = new CalcSoma();
        try {
            Class.forName("org.postgre.Driver");
        } catch (Exception e) {
            // TODO: handle exception
        }
        try {
            var conn = DriverManager.getConnection("jdbc:postgresql://localhost/postgres", "gitpod","");
            var sql = "SELECT * FROM estado where id=?;";
            var statement = conn.prepareStatement(sql);
            statement.setInt(1, 1);
            var result = statement.executeQuery();

            while(result.next()){
                System.out.printf("ID: %d Nome: %s UF: %s\n",result.getInt("id"), result.getString("nome"), result.getString("uf"));
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
