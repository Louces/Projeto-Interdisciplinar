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
    
    public void getAllNotas(){
    
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
            notaFiscal.setTOMADOR_LOGRADOURO(element.getChildText("TOMADOR_LOGRADOURO"));
            notaFiscal.setTOMADOR_NUMERO(element.getChildText("TOMADOR_NUMERO"));
            notaFiscal.setTOMADOR_TIPO_BAIRRO(element.getChildText("TOMADOR_TIPO_BAIRRO"));
            notaFiscal.setTOMADOR_BAIRRO(element.getChildText("TOMADOR_BAIRRO"));
            notaFiscal.setTOMADOR_CIDADE_CODIGO(Integer.parseInt(element.getChildText("TOMADOR_CIDADE_CODIGO")));
            notaFiscal.setTOMADOR_CIDADE(element.getChildText("TOMADOR_CIDADE"));
            notaFiscal.setTOMADOR_UF(element.getChildText("TOMADOR_UF"));
            notaFiscal.setTOMADOR_CEP(element.getChildText("TOMADOR_CEP"));
            notaFiscal.setTOMADOR_EMAIL(element.getChildText("TOMADOR_EMAIL"));
            notaFiscal.setTOMADOR_OPTANTE_SIMPLES(element.getChildText("TOMADOR_OPTANTE_SIMPLES"));
            notaFiscal.setTOMADOR_DDD_TELEFONE(Integer.parseInt(element.getChildText("TOMADOR_DDD_TELEFONE")));
            notaFiscal.setTOMADOR_TELEFONE(element.getChildText("TOMADOR_TELEFONE"));
            notaFiscal.setVALOR_NOTA(Double.parseDouble(element.getChildText("VALOR_NOTA").replaceAll(",", ".")));
            notaFiscal.setVALOR_DEDUCAO(Double.parseDouble(element.getChildText("VALOR_DEDUCAO").replaceAll(",", ".")));
            notaFiscal.setVALOR_SERVICO(Double.parseDouble(element.getChildText("VALOR_SERVICO").replaceAll(",", ".")));
            notaFiscal.setVALOR_ISS(Double.parseDouble(element.getChildText("VALOR_ISS").replaceAll(",", ".")));
            notaFiscal.setVALOR_PIS(Double.parseDouble(element.getChildText("VALOR_PIS").replaceAll(",", ".")));
            notaFiscal.setVALOR_COFINS(Double.parseDouble(element.getChildText("VALOR_COFINS").replaceAll(",", ".")));
            notaFiscal.setVALOR_INSS(Double.parseDouble(element.getChildText("VALOR_INSS").replaceAll(",", ".")));
            notaFiscal.setVALOR_IR(Double.parseDouble(element.getChildText("VALOR_IR").replaceAll(",", ".")));
            notaFiscal.setVALOR_CSLL(Double.parseDouble(element.getChildText("VALOR_CSLL").replaceAll(",", ".")));
            notaFiscal.setALIQUOTA_PIS(element.getChildText("ALIQUOTA_PIS"));
            notaFiscal.setALIQUOTA_COFINS(element.getChildText("ALIQUOTA_COFINS"));
            notaFiscal.setALIQUOTA_INSS(element.getChildText("ALIQUOTA_INSS"));
            notaFiscal.setALIQUOTA_IR(element.getChildText("ALIQUOTA_IR"));
            notaFiscal.setALIQUOTA_CSLL(element.getChildText("ALIQUOTA_CSLL"));
            notaFiscal.setCODIGO_ATIVIDADE(element.getChildText("CODIGO_ATIVIDADE"));
            notaFiscal.setDESCRICAO_ATIVIDADE(element.getChildText("DESCRICAO_ATIVIDADE"));
            notaFiscal.setGRUPO_ATIVIDADE(element.getChildText("GRUPO_ATIVIDADE"));
            notaFiscal.setENQUADRAMENTO_ATIVIDADE(element.getChildText("ENQUADRAMENTO_ATIVIDADE"));
            notaFiscal.setLOCAL_INCIDENCIA_ATIVIDADE(element.getChildText("LOCAL_INCIDENCIA_ATIVIDADE"));
            notaFiscal.setTRIBUTAVEL_ATIVIDADE(element.getChildText("TRIBUTAVEL_ATIVIDADE"));
            notaFiscal.setDEDUCAO_VALOR_ATIVIDADE(element.getChildText("DEDUCAO_VALOR_ATIVIDADE"));
            notaFiscal.setDEDUCAO_ATIVIDADE(element.getChildText("DEDUCAO_ATIVIDADE"));
            notaFiscal.setATV_ECON_ATV(element.getChildText("ATV_ECON_ATV"));
            notaFiscal.setCOS_SERVICO(Integer.parseInt(element.getChildText("COS_SERVICO")));
            notaFiscal.setDESCRICAO_SERVICO(element.getChildText("DESCRICAO_SERVICO"));
            notaFiscal.setALIQUOTA(element.getChildText("ALIQUOTA"));
            notaFiscal.setTIPO_RECOLHIMENTO(element.getChildText("TIPO_RECOLHIMENTO"));
            notaFiscal.setOPERACAO_TRIBUTACAO(element.getChildText("OPERACAO_TRIBUTACAO"));
            notaFiscal.setMOTIVO_PAGAMENTO(element.getChildText("MOTIVO_PAGAMENTO"));
            notaFiscal.setCODIGO_REGIME(Integer.parseInt(element.getChildText("CODIGO_REGIME")));
            notaFiscal.setCIDADE_CODIGO_PRESTACAO(Integer.parseInt(element.getChildText("CIDADE_CODIGO_PRESTACAO")));
            notaFiscal.setCIDADE_PRESTACAO(element.getChildText("CIDADE_PRESTACAO"));
            notaFiscal.setUF_PRESTACAO(element.getChildText("UF_PRESTACAO"));
            notaFiscal.setDOCUMENTO_PRESTACAO(element.getChildText("DOCUMENTO_PRESTACAO"));
            notaFiscal.setSERIE_PRESTACAO(element.getChildText("SERIE_PRESTACAO"));
            notaFiscal.setTRIBUTACAO_PRESTACAO(element.getChildText("TRIBUTACAO_PRESTACAO"));
            notaFiscal.setDESCRICAO_NOTA(element.getChildText("DESCRICAO_NOTA"));
            notaFiscal.setCODIGO_VERIFICACAO(element.getChildText("CODIGO_VERIFICACAO"));
            notaFiscal.setID_NOTA_FISCAL(Integer.parseInt(element.getChildText("ID_NOTA_FISCAL")));
            notaFiscal.setVALOR_ISS_RET(element.getChildText("VALOR_ISS_RET"));
            notaFiscal.setALIQ_RET(element.getChildText("ALIQ_RET"));
            notaFiscal.setDESCONTO_RET(element.getChildText("DESCONTO_RET"));
            notaFiscal.setTRIBUTAVEL(element.getChild("ITENS").getChild("ITEM").getChildText("TRIBUTAVEL"));
            notaFiscal.setDESCRICAO(element.getChild("ITENS").getChild("ITEM").getChildText("DESCRICAO"));
            notaFiscal.setQUANTIDADE(element.getChild("ITENS").getChild("ITEM").getChildText("QUANTIDADE"));
            notaFiscal.setVALOR_UNITARIO(Double.parseDouble(element.getChild("ITENS").getChild("ITEM").getChildText("VALOR_UNITARIO").replaceAll(",", ".")));
            notaFiscal.setVALOR_TOTAL(Double.parseDouble(element.getChild("ITENS").getChild("ITEM").getChildText("VALOR_TOTAL").replaceAll(",", ".")));
            notaFiscal.setDEDUCAO(element.getChild("ITENS").getChild("ITEM").getChildText("DEDUCAO"));
            notaFiscal.setVALOR_ISS_UNITARIO(element.getChild("ITENS").getChild("ITEM").getChildText("VALOR_ISS_UNITARIO"));
            
            getNota().add(notaFiscal);
            
        }
       
    }

    public ArrayList <NotaFiscal> getNota() {
        return nota;
    }
    
}
