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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;


public class PlantaoController {

    private Plantao plantao;
    private PlantaoDao dao = new PlantaoDao();
    
    
    public PlantaoController() {
    }
 
    public PlantaoController(Plantao plantao) {
    this.plantao=plantao;
    }

    public void gravarFormulario(){
        dao.adiciona(plantao);
    }
    
    public ArrayList selectPlantoesAll(){
        dao.consultaAllTablePlantao();
        return dao.getPlantoes();
    }
    
    public Plantao selectPlantao(int numero){
        return dao.consultaPlantao(numero);
    }
    
    public void gerarFormulario(Plantao plantao){
        try {
            PlantaoGerarRelatorio.gerarRelatorio(PlantaoJRDataSourceFactory.createDatasource(plantao));
        } catch (JRException ex) {
            Logger.getLogger(PlantaoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
