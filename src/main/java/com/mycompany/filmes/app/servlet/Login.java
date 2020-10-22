package com.mycompany.filmes.app.servlet;

//Importado classe Client
//Não foi importado o HttpSession
import com.my.company.Filmes.app.models.Client;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Init")
public class Login extends HttpServlet{
    
    public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
        //Meu objeto request traz para NomeFull e Senha os valores do file html
        String NomeFull = request.getParameter("login");
        String Senha = request.getParameter("password"); 
        
        //Faz conferência
        if(NomeFull.equalsIgnoreCase("Leonardo") && Senha.equals("123")){
            //Cria um objeto da classe Client
            //Cria uma sessão desse objeto
            Client client = new Client(NomeFull, Senha);
            //Não foi possível settar a Senha e exibir no console, somente o nome.
            //client.setNomeFull(NomeFull);
            //client.setSenha(Senha);
            //System.out.println(client.getSenha());
            HttpSession sessao = request.getSession();
            //Anteriormente era utilizado resp ao invés de sessao em sessao.setAttribute...
            sessao.setAttribute("UserLog", client);
            response.sendRedirect("EntradaHome.jsp");
        }else{ 
            System.out.println("Usuário não conectado!");
        }
    }
}