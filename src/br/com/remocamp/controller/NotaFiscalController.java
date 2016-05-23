/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.remocamp.controller;

import br.com.remocamp.dao.NotaFiscalDao;
import br.com.remocamp.model.NotaFiscal;
import java.util.ArrayList;

/**
 *
 * @author fabiano
 */
public class NotaFiscalController {
    
    private NotaFiscalDao notaDao = new NotaFiscalDao();
    private ArrayList <NotaFiscal> nota = new ArrayList<>();

    public NotaFiscalController(ArrayList <NotaFiscal> nota) {
        this.nota=nota;
    }
    
    public void adicionaNota(){
        notaDao.adiciona(nota.get(1));
    }
    
}
