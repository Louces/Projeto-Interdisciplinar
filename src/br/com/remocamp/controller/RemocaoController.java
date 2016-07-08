/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.remocamp.controller;

import br.com.remocamp.dao.RemocaoDao;
import br.com.remocamp.model.Remocao;
import br.com.remocamp.view.FormularioPlantao;
import br.com.remocamp.view.FormularioRemocao;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fabiano
 */
public class RemocaoController {

    private Remocao remocao = new Remocao();
    private FormularioRemocao formularioRemocao = new FormularioRemocao();
    private RemocaoDao dao = new RemocaoDao();
    private com.toedter.calendar.JDateChooser date;

    public RemocaoController() {
    }
    
    public RemocaoController(FormularioRemocao formularioRemocao) {
        this.formularioRemocao=formularioRemocao;
        setRemocao();
    }
    
    public void gravarFormulario(){
        dao.adiciona(remocao);
    }
    
    public void setRemocao() {
//        remocao.setIdRemocao(formularioRemocao.getIdRemocao());
//        remocao.setNome();
//        remocao.setIdade();
//        remocao.setVagaConfirmada();
//        remocao.setDataSolicitacao();
//        remocao.setDataRemocao();
//        remocao.setDiagnostico();
//        remocao.setEnderecoOrigem();
//        remocao.setCidadeOrigem();
//        remocao.setEstadoOrigem();
//        remocao.setComplementoOrigem();
//        remocao.setHoraOrigem();
//        remocao.setEnderecoDestino();
//        remocao.setCidadeDestino();
//        remocao.setEstadoDestino();
//        remocao.setComplementoDestino();
//        remocao.setMedico();
//        remocao.setEnfermeiro();
//        remocao.setMotorista();
//        remocao.setOperador();
//        remocao.setAmbulancia();
//        remocao.setObservacao();
//        remocao.setResponsavel();
//        remocao.setUnidMedico();
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
