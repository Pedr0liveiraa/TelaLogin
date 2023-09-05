/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.login.model.controller;

import com.login.model.dao.Conexao;
import com.login.model.dao.LoginDao;
import com.login.view.CadastroView;
import com.login.view.LoginView;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Usuário
 */
public class loginController {
    
    public void novoCadastro(CadastroView view) throws SQLException {
        Connection conexao = new Conexao().getConnection();
        LoginDao cadastro = new LoginDao();
        cadastro.cadastrarUsuario(view.getTxt_nome().getText(), view.getTxt_email().getText(), view.getTxt_senha().getText()); 
    }
    
    public void loginUsuario(LoginView view) throws SQLException {
        Connection conexao = new Conexao().getConnection();
        LoginDao login = new LoginDao();
        login.loginUsuario(view.getTxt_emailLogin().getText(), view.getTxt_senhaLogin().getText()); 
    }
    
}
