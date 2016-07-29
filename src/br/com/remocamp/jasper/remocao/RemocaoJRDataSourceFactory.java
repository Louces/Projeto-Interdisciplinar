/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.remocamp.jasper.remocao;

import br.com.remocamp.jrdatasource.RemocaoJRDataSource;
import br.com.remocamp.model.Remocao;
import java.util.Vector;
import net.sf.jasperreports.engine.JRDataSource;

/**
 *
 * @author fabiano
 */
public class RemocaoJRDataSourceFactory {

    private static JRDataSource data;

    public static JRDataSource createDatasource(Remocao remocao) {
        Vector<Remocao> remocoes = new Vector<Remocao>();
        remocoes.add(remocao);
        return data = new RemocaoJRDataSource(remocoes);
    }

}
