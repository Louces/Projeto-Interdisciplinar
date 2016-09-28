/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.remocamp.model;

/**
 *
 * @author fabiano
 */
public class Funcionario {
    
    private String nome;
    private String CPF;
    private String RG;
    private String Celular;
    private int tipo;

    public Funcionario(String nome, String CPF, String RG, String Celular, int tipo) {
        this.nome = nome;
        this.CPF = CPF;
        this.RG = RG;
        this.Celular = Celular;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    
    
}
