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
public class Medico extends Funcionario{
    
    private String CRM;

    public Medico(String CRM, String nome, String CPF, String RG, String Celular, int tipo) {
        super(nome, CPF, RG, Celular, tipo);
        this.CRM = CRM;
    }
  
    public String getCRM() {
        return CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }
    
}
