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
public class Enfermeiro extends Funcionario{
    
    private String coren;

    public Enfermeiro(String coren, String nome, String CPF, String RG, String Celular, int tipo) {
        super(nome, CPF, RG, Celular, tipo);
        this.coren = coren;
    }

    public String getCoren() {
        return coren;
    }

    public void setCoren(String coren) {
        this.coren = coren;
    }
    
}
