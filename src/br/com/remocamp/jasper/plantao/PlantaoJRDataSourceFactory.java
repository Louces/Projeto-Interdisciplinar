/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.remocamp.jasper.plantao;

import br.com.remocamp.jrdatasource.PlantaoJRDataSource;
import br.com.remocamp.model.Plantao;
import java.util.Vector;
import net.sf.jasperreports.engine.JRDataSource;



/**
 *
 * @author fabiano
 */
public class PlantaoJRDataSourceFactory {

    private static JRDataSource data;    
    
    public static JRDataSource createDatasource(Plantao plantao){
        Vector<Plantao> plantoes =new Vector<Plantao>();
        plantoes.add(plantao);
        return data = new PlantaoJRDataSource(plantoes);
    } 
    
}
