<%-- 
    Document   : EntradaHome
    Created on : 21 de out. de 2020, 02:32:43
    Author     : luizl
--%>

<%@page import="com.my.company.Filmes.app.models.Client"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
          <% 
           Client client = (Client) session.getAttribute("UserLog");
           if (client == null){
        %>
        <!--Quando a sessão expira, surge esta mensagem-->
            <p style="text-align: center">É preciso fazer login para ter acesso</p>
            <p style="text-align: center">
                Clique <a href="login.jsp">aqui</a> para fazer login
            </p>
        
        <% } else { %>
        
            <h3>Usuário logado: <%=client.getNomeFull() + client.getSenha() %></h3>
            <h1>Locadora Movie World Wide</h1>
            <nav>
                <a href="novo-cliente.jsp">Novo cliente</a>
            </nav>
        <% } %>
    </body>
</html>
