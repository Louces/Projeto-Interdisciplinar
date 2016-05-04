/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.remocamp.controller;

import br.com.remocamp.dao.PlantaoDao;
import br.com.remocamp.model.Plantao;
import java.util.ArrayList;


public class PlantaoController {

    Plantao plantao;
    
    public PlantaoController() {
    }
 
    public PlantaoController(Plantao plantao) {
    this.plantao=plantao;
    }

    public void gravarFormulario(){
        PlantaoDao dao = new PlantaoDao();
        dao.adiciona(plantao);
    }
    
    public ArrayList selectPlantoesAll(){
        PlantaoDao dao = new PlantaoDao();
        dao.consultaAllTablePlantao();
        return dao.getPlantoes();
    }
    
}
