/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.remocamp.controller;

import br.com.remocamp.dao.PlantaoDao;
import br.com.remocamp.jasper.plantao.PlantaoGerarRelatorio;
import br.com.remocamp.jasper.plantao.PlantaoJRDataSourceFactory;
import br.com.remocamp.model.Plantao;
import br.com.remocamp.view.FormularioPlantao;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;


public class PlantaoController {

    private Plantao plantao = new Plantao();
    private FormularioPlantao formularioPlantao = new FormularioPlantao();
    private PlantaoDao dao = new PlantaoDao();
    private com.toedter.calendar.JDateChooser date;
    
    public PlantaoController() {
    }
       
    public PlantaoController(FormularioPlantao formularioPlantao) {
        this.formularioPlantao = formularioPlantao;
        setPlantao();
    }
 
    public void gravarFormulario(){
        dao.adiciona(plantao);
    }
    
    public void setPlantao(){
        plantao.setIdPlantao(formularioPlantao.getIdPlantao());
        plantao.setNomeEvento(formularioPlantao.getNomeEvento());
        plantao.setInicio(date(formularioPlantao.getDateChoserInicio()));
        plantao.setFim(date(formularioPlantao.getDateChoserFim()));
        plantao.setResponsavel(formularioPlantao.getResponsavel());
        plantao.setEndereco(formularioPlantao.getEndereco());
        plantao.setCidade(formularioPlantao.getCidade());
        plantao.setEstado(formularioPlantao.getEstado());
        plantao.setComplemento(formularioPlantao.getComplemento());
        plantao.setMedico(formularioPlantao.getMedico());
        plantao.setEnfermeiro(formularioPlantao.getEnfermeiro());
        plantao.setMotorista(formularioPlantao.getMotorista());
        plantao.setOperador(formularioPlantao.getOperador());
        plantao.setObservacao(formularioPlantao.getObservacao());
        plantao.setAmbulancia(formularioPlantao.getAmbulancia());
    }
    
    public void setFormularioPlantao(){
        formularioPlantao.setIdPlantao(plantao.getIdPlantao());
        formularioPlantao.setNomeEvento(plantao.getNomeEvento());
        formularioPlantao.setInicio(plantao.getInicio());
        formularioPlantao.setFim(plantao.getFim());
        formularioPlantao.setResponsavel(plantao.getResponsavel());
        formularioPlantao.setEndereco(plantao.getEndereco());
        formularioPlantao.setCidade(plantao.getCidade());
        formularioPlantao.setEstado(plantao.getEstado());
        formularioPlantao.setComplemento(plantao.getComplemento());
        formularioPlantao.setMedico(plantao.getMedico());
        formularioPlantao.setEnfermeiro(plantao.getEnfermeiro());
        formularioPlantao.setMotorista(plantao.getMotorista());
        formularioPlantao.setOperador(plantao.getOperador());
        formularioPlantao.setObservacao(plantao.getObservacao());
        formularioPlantao.setAmbulancia(plantao.getAmbulancia());
        formularioPlantao.btnGravarVisible(false);
        formularioPlantao.btnVisualizarImpressaoVisible(true);
        formularioPlantao.btnEditarImpressaoVisible(true);
        formularioPlantao.statusAllTxtField(false);
    }
    
    public ArrayList selectPlantoesAll(){
        dao.consultaAllTablePlantao();
        return dao.getPlantoes();
    }
    
    public FormularioPlantao selectPlantao(int numero){
        plantao = dao.consultaPlantao(numero);
        setFormularioPlantao();
        return formularioPlantao;
    }
    
    public FormularioPlantao updatePlantao(){
        plantao = dao.alteraPlantao(plantao, plantao.getIdPlantao());
        setFormularioPlantao();
        return formularioPlantao;
    }
    
    public void gerarFormulario(){
        try {
            PlantaoGerarRelatorio.gerarRelatorio(PlantaoJRDataSourceFactory.createDatasource(plantao));
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
