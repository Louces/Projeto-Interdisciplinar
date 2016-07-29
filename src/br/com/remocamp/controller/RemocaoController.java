/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.remocamp.controller;

import br.com.remocamp.dao.RemocaoDao;
import br.com.remocamp.jasper.remocao.RemocaoGerarRelatorio;
import br.com.remocamp.jasper.remocao.RemocaoJRDataSourceFactory;
import br.com.remocamp.model.Remocao;
import br.com.remocamp.view.FormularioPlantao;
import br.com.remocamp.view.FormularioRemocao;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;

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
        remocao.setIdRemocao(formularioRemocao.getIdRemocao());
        remocao.setNome(formularioRemocao.getNome());
        remocao.setIdade(formularioRemocao.getIdade());
        remocao.setVagaConfirmada(formularioRemocao.getvagaConfirmada());
        remocao.setDataSolicitacao(date(formularioRemocao.getDataChooserSolicitacao()));
        remocao.setDataRemocao(date(formularioRemocao.getDataChoserRemocao()));
        remocao.setDiagnostico(formularioRemocao.getDiagnostico());
        remocao.setEnderecoOrigem(formularioRemocao.getEnderecoOrigem());
        remocao.setCidadeOrigem(formularioRemocao.getCidadeOrigem());
        remocao.setEstadoOrigem(formularioRemocao.getEstadoOrigem());
        remocao.setComplementoOrigem(formularioRemocao.getComplementoOrigem());
        remocao.setHoraOrigem(formularioRemocao.getHoraOrigem());
        remocao.setEnderecoDestino(formularioRemocao.getEnderecoDestino());
        remocao.setCidadeDestino(formularioRemocao.getCidadeDestino());
        remocao.setEstadoDestino(formularioRemocao.getEstadoDestino());
        remocao.setComplementoDestino(formularioRemocao.getComplementoDestino());
        remocao.setMedico(formularioRemocao.getMedico());
        remocao.setEnfermeiro(formularioRemocao.getEnfermeiro());
        remocao.setMotorista(formularioRemocao.getMotorista());
        remocao.setOperador(formularioRemocao.getOperador());
        remocao.setAmbulancia(formularioRemocao.getAmbulancia());
        remocao.setObservacao(formularioRemocao.getObservacao());
        remocao.setResponsavel(formularioRemocao.getResponsavel());
        remocao.setUnidMedico(formularioRemocao.getUnidMedico());
    }
    
    public void setFormularioRemocao() {
        formularioRemocao.setIdRemocao(remocao.getIdRemocao());
        formularioRemocao.setNome(remocao.getNome());
        formularioRemocao.setIdade(remocao.getIdade());
        formularioRemocao.setVagaConfirmada(remocao.getVagaConfirmada());
        formularioRemocao.setSolicitacao(remocao.getDataSolicitacao());
        formularioRemocao.setRemocao(remocao.getDataRemocao());
        formularioRemocao.setDiagnostico(remocao.getDiagnostico());
        formularioRemocao.setEnderecoOrigem(remocao.getEnderecoOrigem());
        formularioRemocao.setCidadeOrigem(remocao.getCidadeOrigem());
        formularioRemocao.setEstadoOrigem(remocao.getEstadoOrigem());
        formularioRemocao.setComplementoOrigem(remocao.getComplementoOrigem());
        formularioRemocao.setHoraOrigem(remocao.getHoraOrigem());
        formularioRemocao.setEnderecoDestino(remocao.getEnderecoDestino());
        formularioRemocao.setCidadeDestino(remocao.getCidadeDestino());
        formularioRemocao.setEstadoDestino(remocao.getEstadoDestino());
        formularioRemocao.setComplementoDestino(remocao.getComplementoDestino());
        formularioRemocao.setMedico(remocao.getMedico());
        formularioRemocao.setEnfermeiro(remocao.getEnfermeiro());
        formularioRemocao.setMotorista(remocao.getMotorista());
        formularioRemocao.setOperador(remocao.getOperador());
        formularioRemocao.setAmbulancia(remocao.getAmbulancia());
        formularioRemocao.setObservacao(remocao.getObservacao());
        formularioRemocao.setResponsavel(remocao.getResponsavel());
        formularioRemocao.setUnidMedico(remocao.getUnidMedico());
        formularioRemocao.btnGravarVisible(false);
        formularioRemocao.btnVisualizarImpressaoVisible(true);
        formularioRemocao.btnEditarVisible(true);
        formularioRemocao.statusAllTxtField(false);
    }
    
    public DefaultTableModel selectRemocaoAll(DefaultTableModel  table){
        Remocao remocao;
        dao.consultaAllTableRemocao();
        ArrayList<Remocao> remocoes = dao.getRemocoes();
        
        for(int i=0; i < remocoes.size();i++){
            remocao = remocoes.get(i);
            Object row[] = new Object[4];
            row[0] = remocao.getIdRemocao();
            row[1] = remocao.getNome();
            row[2] = remocao.getDataRemocao();
         
            table.addRow(row);
        }
       return table;
    }
    
    public DefaultTableModel selectRemocaoNome(DefaultTableModel  table, String nomeRemocao){
        Remocao remocao;
        dao.consultaNome(nomeRemocao);
        
        ArrayList<Remocao> remocoes = dao.getRemocoes();
        
        for(int i=0; i < remocoes.size();i++){
            remocao = remocoes.get(i);
            Object row[] = new Object[4];
            row[0] = remocao.getIdRemocao();
            row[1] = remocao.getNome();
            row[2] = remocao.getDataRemocao();
            
            table.addRow(row);
        }
       return table;
    }
    
    public DefaultTableModel selectRemocaoData(DefaultTableModel  table,java.sql.Date  inicio,java.sql.Date fim){
        Remocao remocao;
        dao.consultaEntreDatas(inicio, fim);
        ArrayList<Remocao> remocoes = dao.getRemocoes();
        
        for(int i=0; i < remocoes.size();i++){
            remocao = remocoes.get(i);
            Object row[] = new Object[4];
            row[0] = remocao.getIdRemocao();
            row[1] = remocao.getNome();
            row[2] = remocao.getDataRemocao();
            
            table.addRow(row);
        }
       return table;
    }
    
    public DefaultTableModel selectRemocaoDataNome(DefaultTableModel  table,java.sql.Date  inicio,java.sql.Date fim, String nomeEvento){
        Remocao remocao;
        dao.consultaEntreDatasComNome(inicio, fim, nomeEvento);
        ArrayList<Remocao> remocoes = dao.getRemocoes();
        
        for(int i=0; i < remocoes.size();i++){
            remocao = remocoes.get(i);
            Object row[] = new Object[4];
            row[0] = remocao.getIdRemocao();
            row[1] = remocao.getNome();
            row[2] = remocao.getDataRemocao();

            table.addRow(row);
        }
       return table;
    }
    
    public FormularioRemocao selectRemocao(int numero){
        remocao = dao.consultaRemocao(numero);
        setFormularioRemocao();
        return formularioRemocao;
    }
    
    public FormularioRemocao updateRemocao(){
        remocao = dao.alteraPlantao(remocao, remocao.getIdRemocao());
        setFormularioRemocao();
        return formularioRemocao;
    }
    
    public void gerarFormulario(){
        try {
            RemocaoGerarRelatorio.gerarRelatorio(RemocaoJRDataSourceFactory.createDatasource(remocao));
        } catch (JRException ex) {
            Logger.getLogger(PlantaoController.class.getName()).log(Level.SEVERE, null, ex);
        }
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
