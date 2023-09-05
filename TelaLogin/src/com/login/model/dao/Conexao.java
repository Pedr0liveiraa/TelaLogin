/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.login.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Usuário
 */
public class Conexao {
    
       public Connection getConnection() throws SQLException{
           
           Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/loginBD", "postgres", "10240");
           return conexao;
           
       }
}
