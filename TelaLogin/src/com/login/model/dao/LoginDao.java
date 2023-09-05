/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.login.model.dao;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author Usuário
 */
public class LoginDao {
    
    public void cadastrarUsuario(String nome, String email, String senha) throws SQLException {
        
        Connection conexao = new Conexao().getConnection();
        String sql = "INSERT INTO login (nome, email, senha) VALUES('"+nome+"','"+email+"','"+senha+"')";
        PreparedStatement statement = conexao.prepareStatement(sql);
        statement.execute();
        conexao.close();
        
    }
    
    public void loginUsuario(String email, String senha) throws SQLException{
        
        Connection conexao = new Conexao().getConnection();
        String sql = "SELECT email,senha FROM login WHERE email = '"+email+"' AND senha = '"+senha+"'";
        PreparedStatement statement = conexao.prepareStatement(sql);
        ResultSet rs = statement.executeQuery();
        conexao.close();
        
    }
    
}
