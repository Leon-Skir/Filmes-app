/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.filmes.app.servlet;

import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
//Gerou duplicidade de servlet, dando erro na hora de deploye
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author luizl
 */
//Erro alegado na linha 11, portanto comentado.
//@WebServlet("/criar-sessao")
public class InitSession extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        //Criar ou recuperar uma sessão
        HttpSession sessao = req.getSession();
        //Adicionando um atributo(informação) na sessão
        sessao.setAttribute("meuNome", "Zezinho da sessão");
        //Setando o tempo máximo(em segundos) de inatividade entre requisições.
        //Transcorrido este tempo, a sessão irá para pedra.
        sessao.setMaxInactiveInterval(5);
        
        ServletContext context = getServletContext();
        context.setAttribute("meuNome2", "Zezinho do contexto");
        
        // Mata a sessão (Todos os atributos serão perdidos)
        //session.invalidate();
        
    }
    
    
    
}
