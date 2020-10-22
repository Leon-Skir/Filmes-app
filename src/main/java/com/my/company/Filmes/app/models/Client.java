/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.my.company.Filmes.app.models;

/**
 *
 * @author luizl
 */

//Classe Client semelhante à classe User criada pelo professor
public class Client {
    
    private String NomeFull;
    private String Senha;
    private String CPF;
    private String DATANASCIMENTO;
    
    //Foi necessário criar um construtor somente contendo os dois atributos NomeFull e Senha
    //Após isso, foi utilizado na Class Login
    public Client(String NomeFull, String Senha) {
        this.NomeFull = NomeFull;
        this.Senha = Senha;
    }

    
    //Construtor contendo todos os atributos caso precise...
    public Client(String NomeFull, String Senha, String CPF, String DATANASCIMENTO) {
        this.NomeFull = NomeFull;
        this.Senha = Senha;
        this.CPF = CPF;
        this.DATANASCIMENTO = DATANASCIMENTO;
    }

    
    //Métodos getters and setters
    public String getNomeFull() {
        return NomeFull;
    }

    public String getSenha() {
        return Senha;
    }

    public String getCPF() {
        return CPF;
    }

    public String getDATANASCIMENTO() {
        return DATANASCIMENTO;
    }

    public void setNomeFull(String NomeFull) {
        this.NomeFull = NomeFull;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setDATANASCIMENTO(String DATANASCIMENTO) {
        this.DATANASCIMENTO = DATANASCIMENTO;
    }

    
}
