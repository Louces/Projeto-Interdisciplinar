package br.com.remocamp.xlm;

import br.com.remocamp.controller.PlantaoController;
import br.com.remocamp.model.Plantao;
import java.io.File;

import java.io.IOException;
import java.sql.Date;
import java.util.Iterator;
import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.Namespace;
import org.jdom2.filter.ElementFilter;
import org.jdom2.input.SAXBuilder;


public class teste {

    public static void main(String[] args) throws  IOException, Exception {

        File f = new File("C:\\Users\\fabiano\\Downloads\\xml_000571938345573083.xml");
        SAXBuilder sb = new SAXBuilder();
        Document d = sb.build(f);
        Element mural = d.getRootElement();
        List elements = mural.getChildren();
        Iterator i = elements.iterator();

        while (i.hasNext()) {
            Element element = (Element) i.next();
            
            
            System.out.println("Nº NOTA :" + element.getChildText("NUM_NOTA"));
            System.out.println("DATA DA EMISS�O :" + element.getChildText("DATA_HORA_EMISSAO"));
            System.out.println("DIA DA EMISSAO :" + element.getChildText("DIA_EMISSAO"));
            System.out.println("PRESTADOR RAZAO SOCIAL :" + element.getChildText("PRESTADOR_RAZAO_SOCIAL"));
            System.out.println("VALOR UNITÁRIO :" + element.getChild("ITENS").getChild("ITEM").getChildText("VALOR_TOTAL")+"\n");
            
        }

    
//    PlantaoDao insert = new PlantaoDao();
//
//    for(int i = 0 ; i<10000 ; i++){
//        
//        Plantao plantao = new Plantao();
//        int i =0;
//        Date dataInicio = new Date(2016/02/01);
//        Date dataFim = new Date(2016/03/01);
//        plantao.setResponsavel("Fabiano Louzada Cesario");
//        plantao.setNomeEvento("Evento teste nº " + i);
//        plantao.setInicio(dataInicio);
//        plantao.setFim(dataFim);
//        plantao.setCidade("Cidade "+i);
//        plantao.setEstado("SP");
//        plantao.setEndereco("Enderedo do evendo é o numero " +i);
//        plantao.setEnfermeiro("Enfermeiro "+i);
//        plantao.setMedico("Medico " + i);
//        plantao.setMotorista("Motorista "+i);
//        plantao.setOperador("fulano");
//        plantao.setAmbulancia("UTI");
//        plantao.setComplemento("N/A");
//        plantao.setObservacao("A observação é uma das etapas do método científico. Consiste em perceber, ver e não interpretar. A observação é relatada como foi visualizada, sem que, a princípio, as idéias interpretativas dos observadores sejam tomadas.\n"
//                + "\n"
//                + "Ela também pode ser entendida como verificação ou constatação de um fato, podendo ser tanto espontânea ou casual, quanto metódica ou planejada.\n"
//                + "\n"
//                + "Hipóteses só serão elaboradas sobre a questão investigada após uma descrição minuciosa do ambiente e dos objetos de estudo. Uma das regras do método científico é a da não interferência do observador no ambiente ou nos processos observados.");
////        insert.adiciona(plantao);
////    }
//         PlantaoController ctl = new PlantaoController();
//       //  ctl.gerarFormulario(plantao);
//         
//      
//    //  teste.setNomeEvento("Relatorio");
//      
//     
////      paciente fabiano  = new paciente("Louzada");
////      List lista = new ArrayList();
////      lista.add(fabiano);
////      
////      JasperReport report = JasperCompileManager .compileReport("C:\\Users\\fabiano\\workspace\\ProjetoInterdisciplinar\\src\\br\\com\\remocamp\\jasper\\reportPlantao.jrxml");
////      
////      JasperPrint print = JasperFillManager.fillReport(report, null, new JRBeanCollectionDataSource(lista));
////      
////      JasperExportManager.exportReportToPdfFile(print, "relatorios/RelatorioClientes.pdf");
////      System.out.println("Relatório gerado.");
//      
      
    }
}
