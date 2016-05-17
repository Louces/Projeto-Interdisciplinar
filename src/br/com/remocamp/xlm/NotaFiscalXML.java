/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.remocamp.xlm;


import br.com.remocamp.model.NotaFiscal;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.Namespace;
import org.jdom2.input.SAXBuilder;



/**
 *
 * @author fabiano
 */
public class NotaFiscalXML {
    
    private File xml;
    private ArrayList <NotaFiscal> nota = new ArrayList<>();
    public NotaFiscalXML(File xml) {
        this.xml = xml;
    }
    
    public void update(){
    
        SAXBuilder sb = new SAXBuilder();
        Document d = null;
        try {
            d = sb.build(xml);
        } catch (JDOMException ex) {
            Logger.getLogger(NotaFiscalXML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NotaFiscalXML.class.getName()).log(Level.SEVERE, null, ex);
        }
        Element mural = d.getRootElement();
        List elements = mural.getChildren();
        Iterator iterator = elements.iterator();
        
        long inicio = System.currentTimeMillis();
        while(iterator.hasNext()){
            Element element = (Element)iterator.next();
            NotaFiscal notaFiscal = new NotaFiscal();
            notaFiscal.setTIPO(element.getChildText("TIPO"));
            notaFiscal.setNUM_NOTA(Long.parseLong(element.getChildText("NUM_NOTA")));
            notaFiscal.setDATA_HORA_EMISSAO(element.getChildText("DATA_HORA_EMISSAO"));
            notaFiscal.setDIA_EMISSAO(element.getChildText("DIA_EMISSAO"));
            notaFiscal.setMES_COMPETENCIA(element.getChildText("MES_COMPETENCIA"));
            notaFiscal.setSITUACAO_NF(element.getChildText("SITUACAO_NF"));
            notaFiscal.setCODIGO_CIDADE(Integer.parseInt(element.getChildText("CODIGO_CIDADE")));
            notaFiscal.setUSUARIO_CPF_CNPJ(element.getChildText("USUARIO_CPF_CNPJ"));
            notaFiscal.setUSUARIO_RAZAO_SOCIAL(element.getChildText("USUARIO_RAZAO_SOCIAL"));
            notaFiscal.setDATA_HORA_CANCELAMENTO(element.getChildText("DATA_HORA_CANCELAMENTO"));
            notaFiscal.setRPS_EMISSAO(Integer.parseInt(element.getChildText("RPS_EMISSAO")));
            notaFiscal.setSUB_EMISSAO(Integer.parseInt(element.getChildText("SUB_EMISSAO")));
            notaFiscal.setPRESTADOR_CPF_CNPJ(element.getChildText("PRESTADOR_CPF_CNPJ"));
            notaFiscal.setPRESTADOR_INSCRICAO_MUNICIPAL(element.getChildText("PRESTADOR_INSCRICAO_MUNICIPAL"));
            notaFiscal.setPRESTADOR_RAZAO_SOCIAL(element.getChildText("PRESTADOR_RAZAO_SOCIAL"));
            notaFiscal.setPRESTADOR_NOME_FANTASIA(element.getChildText("PRESTADOR_NOME_FANTASIA"));
            notaFiscal.setPRESTADOR_TIPO_LOGRADOURO(element.getChildText("PRESTADOR_TIPO_LOGRADOURO"));
            notaFiscal.setPRESTADOR_LOGRADOURO(element.getChildText("PRESTADOR_LOGRADOURO"));
            notaFiscal.setPRESTADOR_PREST_NUMERO(element.getChildText("PRESTADOR_PREST_NUMERO"));
            notaFiscal.setPRESTADOR_COMPLEMENTO(element.getChildText("PRESTADOR_COMPLEMENTO"));
            notaFiscal.setPRESTADOR_TIPO_BAIRRO(element.getChildText("PRESTADOR_TIPO_BAIRRO"));
            notaFiscal.setPRESTADOR_BAIRRO(element.getChildText("PRESTADOR_BAIRRO"));
            notaFiscal.setPRESTADOR_CIDADE_CODIGO(Integer.parseInt(element.getChildText("PRESTADOR_CIDADE_CODIGO")));
            notaFiscal.setPRESTADOR_CIDADE(element.getChildText("PRESTADOR_CIDADE"));
            notaFiscal.setPRESTADOR_UF(element.getChildText("PRESTADOR_UF"));
            notaFiscal.setPRESTADOR_CEP(element.getChildText("PRESTADOR_CEP"));
            notaFiscal.setPRESTADOR_DDD_TELEFONE(Integer.parseInt(element.getChildText("PRESTADOR_DDD_TELEFONE")));
            notaFiscal.setPRESTADOR_TELEFONE(element.getChildText("PRESTADOR_TELEFONE"));
            notaFiscal.setTOMADOR_CPF_CNPJ(element.getChildText("TOMADOR_CPF_CNPJ"));
            notaFiscal.setTOMADOR_RAZAO_SOCIAL(element.getChildText("TOMADOR_RAZAO_SOCIAL"));
            notaFiscal.setTOMADOR_TIPO_LOGRADOURO(element.getChildText("TOMADOR_TIPO_LOGRADOURO"));
            
            
        }
        long fim = System.currentTimeMillis();
        long tempo = (long) ((fim-inicio)/1000d);
        System.out.println("Tempo total : " + tempo);
    }
    
}
