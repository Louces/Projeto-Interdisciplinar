/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.remocamp.controller;

import br.com.remocamp.dao.NotaFiscalDao;
import br.com.remocamp.model.NotaFiscal;
import br.com.remocamp.view.FormularioPlantao;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
     public DefaultTableModel select_NFSE_RazaoSocial(DefaultTableModel  table, String nomeRazaoSocial){
        NotaFiscal nota;
        notaDao=new NotaFiscalDao();
        notaDao.consultaNomeRazaoSocial(nomeRazaoSocial);
        
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
     
    public DefaultTableModel select_NFSE_Data(DefaultTableModel table, java.sql.Date inicio, java.sql.Date fim) {
        NotaFiscal nota;
        notaDao = new NotaFiscalDao();
        notaDao.consultaEntreDatas(inicio, fim);

        ArrayList<NotaFiscal> notas = notaDao.getNotasFiscaisXML();

        for (int i = 0; i < notas.size(); i++) {
            nota = notas.get(i);
            Object row[] = new Object[4];
            row[0] = nota.getNUM_NOTA();
            row[1] = nota.getTOMADOR_RAZAO_SOCIAL();
            row[2] = nota.getDATA_HORA_EMISSAO();

            table.addRow(row);
        }
        return table;

    }
    
    public DefaultTableModel select_NFSE_DataNomeRazaoSocial(DefaultTableModel  table,java.sql.Date  inicio,java.sql.Date fim, String nomeRazaoSocial){
        NotaFiscal nota;
        notaDao = new NotaFiscalDao();
        notaDao.consultaEntreDatasComNome(inicio, fim, nomeRazaoSocial);
        
        ArrayList<NotaFiscal> notas = notaDao.getNotasFiscaisXML();

        for (int i = 0; i < notas.size(); i++) {
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
    
    public NotaFiscal getNota (int numeroNota){
        notaDao = new NotaFiscalDao();
        return notaDao.nota(numeroNota);
    }
    
        public java.sql.Date date(com.toedter.calendar.JDateChooser dateChooser) {
        String strDate = DateFormat.getDateInstance().format(dateChooser.getDate());
        java.sql.Date sqlDate = null;
        try {
            Date utilDate = new SimpleDateFormat("dd/MM/yyyy").parse(strDate);
            sqlDate = new java.sql.Date(utilDate.getTime());
            return sqlDate;
        } catch (ParseException ex) {
            Logger.getLogger(FormularioPlantao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sqlDate;
    }
    
}
