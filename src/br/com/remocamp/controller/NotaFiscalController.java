/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.remocamp.controller;

import br.com.remocamp.dao.NotaFiscalDao;
import br.com.remocamp.model.NotaFiscal;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fabiano
 */
public class NotaFiscalController {
    
    private ArrayList <NotaFiscal> nota = new ArrayList<>();
    private NotaFiscalDao notaDao;

    public NotaFiscalController(ArrayList <NotaFiscal> nota) {
        this.nota=nota;
        notaDao=new NotaFiscalDao(nota);
    }

    public NotaFiscalController() {
        
    }
    
    public DefaultTableModel selectNotaFiscalAll(DefaultTableModel  table){
        NotaFiscal nota = new NotaFiscal();
        notaDao=new NotaFiscalDao();
        notaDao.consultaAllNotas();
        ArrayList<NotaFiscal> notas = notaDao.getNotasFiscaisXML();
        
         for(int i=0; i < notas.size();i++){
            nota = notas.get(i);
            Object row[] = new Object[4];
            row[0] = nota.getNUM_NOTA();
            row[1] = nota.getTOMADOR_RAZAO_SOCIAL();
            row[2] = nota.getDATA_HORA_EMISSAO();
            
            table.addRow(row);
        }
       return table;
        
        
    }
    
    public void adicionaNotas(){
        notaDao.adicionaNotas();
    }
    
}
