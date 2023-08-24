package com.example.Dao;

import java.sql.Connection;

import com.example.model.Produto;

public class ProdutoDao {
    private Connection conn;
    
    public ProdutoDao(Connection conn) {
        this.conn = conn;
    }
    public void inserir(Produto produto){
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
    public void alterar(Produto produto){
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

    public void excluirProduto(long id){
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
}
