/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.remocamp.jasper.remocao;

import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author fabiano
 */
public class RemocaoGerarRelatorio {
    public static void gerarRelatorio(JRDataSource source) throws JRException {
        Map map = new HashMap();
        JasperFillManager.fillReportToFile("C:\\Users\\fabiano\\workspace\\ProjetoInterdisciplinar\\src\\br\\com\\remocamp\\jasper\\remocao\\Remocao.jasper", map, source);
        JasperViewer.viewReport("C:\\Users\\fabiano\\workspace\\ProjetoInterdisciplinar\\src\\br\\com\\remocamp\\jasper\\remocao\\Remocao.jrprint", false , false);
    }
}
