package com.mycompany.filmes.app;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet{
    public String Login = "teste";
    public String Password = "12345";
    
    public void doPost(HttpServletRequest request, HttpServletResponse response){
        String login = request.getParameter("login");
        System.out.println(login);
        
        String password = request.getParameter("password");
        System.out.println(password);
        
        if((Login.equals(login)) && (Password.equals(password)))
            System.out.println("User Logado!");
        else 
            System.out.println("User não logado!");
    }
}