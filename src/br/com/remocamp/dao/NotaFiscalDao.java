/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.remocamp.dao;

import br.com.remocamp.jdbc.ConnectionFactory;
import br.com.remocamp.model.NotaFiscal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fabiano
 */
public class NotaFiscalDao {

    private Connection connection;
    private PreparedStatement stmt;
    private ArrayList<NotaFiscal> notasFiscaisXML = new ArrayList<>();

    public NotaFiscalDao(ArrayList<NotaFiscal> notasFiscaisXML) {
        setConnection(new ConnectionFactory().getConnection());
        this.notasFiscaisXML=notasFiscaisXML;
    }

    public NotaFiscalDao() {
        setConnection(new ConnectionFactory().getConnection());     
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public void adicionaNotas() {
        for (int i = 0; i < notasFiscaisXML.size(); i++) {
            adiciona(notasFiscaisXML.get(i));
        }
    }
    
    public void adiciona(NotaFiscal nota) {

        if(contemNota(nota)){
            return;
        }
        String sql = "insert into nfse"
           + "("
                +"TIPO,"
                +"NUM_NOTA,"
                +"DATA_HORA_EMISSAO,"
                +"DIA_EMISSAO,"
                +"MES_COMPETENCIA,"
                +"SITUACAO_NF,"
                +"CODIGO_CIDADE,"
                +"USUARIO_CPF_CNPJ,"
                +"USUARIO_RAZAO_SOCIAL,"
                +"DATA_HORA_CANCELAMENTO,"
                +"RPS_EMISSAO,"
                +"SUB_EMISSAO,"
                +"PRESTADOR_CPF_CNPJ,"
                +"PRESTADOR_INSCRICAO_MUNICIPAL,"
                +"PRESTADOR_RAZAO_SOCIAL,"
                +"PRESTADOR_NOME_FANTASIA,"
                +"PRESTADOR_TIPO_LOGRADOURO,"
                +"PRESTADOR_LOGRADOURO,"
                +"PRESTADOR_PREST_NUMERO,"
                +"PRESTADOR_COMPLEMENTO,"
                +"PRESTADOR_TIPO_BAIRRO,"
                +"PRESTADOR_BAIRRO,"
                +"PRESTADOR_CIDADE_CODIGO,"
                +"PRESTADOR_CIDADE,"
                +"PRESTADOR_UF,"
                +"PRESTADOR_CEP,"
                +"PRESTADOR_DDD_TELEFONE,"
                +"PRESTADOR_TELEFONE,"
                +"TOMADOR_CPF_CNPJ,"
                +"TOMADOR_RAZAO_SOCIAL,"
                +"TOMADOR_TIPO_LOGRADOURO,"
                +"TOMADOR_LOGRADOURO,"
                +"TOMADOR_NUMERO,"
                +"TOMADOR_TIPO_BAIRRO,"
                +"TOMADOR_BAIRRO,"
                +"TOMADOR_CIDADE_CODIGO,"
                +"TOMADOR_CIDADE,"
                +"TOMADOR_UF,"
                +"TOMADOR_CEP,"
                +"TOMADOR_EMAIL,"
                +"TOMADOR_OPTANTE_SIMPLES,"
                +"TOMADOR_DDD_TELEFONE,"
                +"TOMADOR_TELEFONE,"
                +"VALOR_NOTA,"
                +"VALOR_DEDUCAO,"
                +"VALOR_SERVICO,"
                +"VALOR_ISS,"
                +"VALOR_PIS,"
                +"VALOR_COFINS,"
                +"VALOR_INSS,"
                +"VALOR_IR,"
                +"VALOR_CSLL,"
                +"ALIQUOTA_PIS,"
                +"ALIQUOTA_COFINS,"
                +"ALIQUOTA_INSS,"
                +"ALIQUOTA_IR,"
                +"ALIQUOTA_CSLL,"
                +"CODIGO_ATIVIDADE,"
                +"DESCRICAO_ATIVIDADE,"
                +"GRUPO_ATIVIDADE,"
                +"ENQUADRAMENTO_ATIVIDADE,"
                +"LOCAL_INCIDENCIA_ATIVIDADE,"
                +"TRIBUTAVEL_ATIVIDADE,"
                +"DEDUCAO_VALOR_ATIVIDADE,"
                +"DEDUCAO_ATIVIDADE,"
                +"ATV_ECON_ATV,"
                +"COS_SERVICO,"
                +"DESCRICAO_SERVICO,"
                +"ALIQUOTA,"
                +"TIPO_RECOLHIMENTO,"
                +"OPERACAO_TRIBUTACAO,"
                +"MOTIVO_PAGAMENTO,"
                +"CODIGO_REGIME,"
                +"CIDADE_CODIGO_PRESTACAO,"
                +"CIDADE_PRESTACAO,"
                +"UF_PRESTACAO,"
                +"DOCUMENTO_PRESTACAO,"
                +"SERIE_PRESTACAO,"
                +"TRIBUTACAO_PRESTACAO,"
                +"DESCRICAO_NOTA,"
                +"CODIGO_VERIFICACAO,"
                +"ID_NOTA_FISCAL,"
                +"VALOR_ISS_RET,"
                +"ALIQ_RET,"
                +"DESCONTO_RET,"
                +"TRIBUTAVEL,"
                +"DESCRICAO,"
                +"QUANTIDADE,"
                +"VALOR_UNITARIO,"
                +"VALOR_TOTAL,"
                +"DEDUCAO,"
                +"VALOR_ISS_UNITARIO"
           +")"
                
                + " values(?,?,?,?,?,?,?,?,?,?,"
                            + "?,?,?,?,?,?,?,?,?,?,"
                            + "?,?,?,?,?,?,?,?,?,?,"
                            + "?,?,?,?,?,?,?,?,?,?,"
                            + "?,?,?,?,?,?,?,?,?,?,"
                            + "?,?,?,?,?,?,?,?,?,?,"
                            + "?,?,?,?,?,?,?,?,?,?,"
                            + "?,?,?,?,?,?,?,?,?,?,"
                            + "?,?,?,?,?,?,?,?,?,?,"
                            + "?,?"
                            + ")";
        
         try {
         // prepared statement para inserção
          stmt = getConnection().prepareStatement(sql);

          int i=0;
          stmt.setString(++i,nota.getTIPO());
          stmt.setString(++i,nota.getNUM_NOTA()+"");
          stmt.setString(++i,nota.getDATA_HORA_EMISSAO());
          stmt.setString(++i,nota.getDIA_EMISSAO());
          stmt.setString(++i,nota.getMES_COMPETENCIA());
          stmt.setString(++i,nota.getSITUACAO_NF());
          stmt.setString(++i,nota.getCODIGO_CIDADE()+"");
          stmt.setString(++i,nota.getUSUARIO_CPF_CNPJ());
          stmt.setString(++i,nota.getUSUARIO_RAZAO_SOCIAL());
          stmt.setString(++i,nota.getDATA_HORA_CANCELAMENTO());
          stmt.setString(++i,nota.getRPS_EMISSAO()+"");
          stmt.setString(++i,nota.getSUB_EMISSAO()+"");
          stmt.setString(++i,nota.getPRESTADOR_CPF_CNPJ());
          stmt.setString(++i,nota.getPRESTADOR_INSCRICAO_MUNICIPAL());
          stmt.setString(++i,nota.getPRESTADOR_RAZAO_SOCIAL());
          stmt.setString(++i,nota.getPRESTADOR_NOME_FANTASIA());
          stmt.setString(++i,nota.getPRESTADOR_TIPO_LOGRADOURO());
          stmt.setString(++i,nota.getPRESTADOR_LOGRADOURO());
          stmt.setString(++i,nota.getPRESTADOR_PREST_NUMERO());
          stmt.setString(++i,nota.getPRESTADOR_COMPLEMENTO());
          stmt.setString(++i,nota.getPRESTADOR_TIPO_BAIRRO());
          stmt.setString(++i,nota.getPRESTADOR_BAIRRO());
          stmt.setString(++i,nota.getPRESTADOR_CIDADE_CODIGO()+"");
          stmt.setString(++i,nota.getPRESTADOR_CIDADE());
          stmt.setString(++i,nota.getPRESTADOR_UF());
          stmt.setString(++i,nota.getPRESTADOR_CEP());
          stmt.setString(++i,nota.getPRESTADOR_DDD_TELEFONE()+"");
          stmt.setString(++i,nota.getPRESTADOR_TELEFONE());
          stmt.setString(++i,nota.getTOMADOR_CPF_CNPJ());
          stmt.setString(++i,nota.getTOMADOR_RAZAO_SOCIAL());
          stmt.setString(++i,nota.getTOMADOR_TIPO_LOGRADOURO());
          stmt.setString(++i,nota.getTOMADOR_LOGRADOURO());
          stmt.setString(++i,nota.getTOMADOR_NUMERO());
          stmt.setString(++i,nota.getTOMADOR_TIPO_BAIRRO());
          stmt.setString(++i,nota.getTOMADOR_BAIRRO());
          stmt.setString(++i,nota.getTOMADOR_CIDADE_CODIGO()+"");
          stmt.setString(++i,nota.getTOMADOR_CIDADE());
          stmt.setString(++i,nota.getTOMADOR_UF());
          stmt.setString(++i,nota.getTOMADOR_CEP());
          stmt.setString(++i,nota.getTOMADOR_EMAIL());
          stmt.setString(++i,nota.getTOMADOR_OPTANTE_SIMPLES());
          stmt.setString(++i,nota.getTOMADOR_DDD_TELEFONE()+"");
          stmt.setString(++i,nota.getTOMADOR_TELEFONE());
          stmt.setString(++i,nota.getVALOR_NOTA()+"");
          stmt.setString(++i,nota.getVALOR_DEDUCAO()+"");
          stmt.setString(++i,nota.getVALOR_SERVICO()+"");
          stmt.setString(++i,nota.getVALOR_ISS()+"");
          stmt.setString(++i,nota.getVALOR_PIS()+"");
          stmt.setString(++i,nota.getVALOR_COFINS()+"");
          stmt.setString(++i,nota.getVALOR_INSS()+"");
          stmt.setString(++i,nota.getVALOR_IR()+"");
          stmt.setString(++i,nota.getVALOR_CSLL()+"");
          stmt.setString(++i,nota.getALIQUOTA_PIS());
          stmt.setString(++i,nota.getALIQUOTA_COFINS());
          stmt.setString(++i,nota.getALIQUOTA_INSS());
          stmt.setString(++i,nota.getALIQUOTA_IR());
          stmt.setString(++i,nota.getALIQUOTA_CSLL());
          stmt.setString(++i,nota.getCODIGO_ATIVIDADE());
          stmt.setString(++i,nota.getDESCRICAO_ATIVIDADE());
          stmt.setString(++i,nota.getGRUPO_ATIVIDADE());
          stmt.setString(++i,nota.getENQUADRAMENTO_ATIVIDADE());
          stmt.setString(++i,nota.getLOCAL_INCIDENCIA_ATIVIDADE());
          stmt.setString(++i,nota.getTRIBUTAVEL_ATIVIDADE());
          stmt.setString(++i,nota.getDEDUCAO_VALOR_ATIVIDADE());
          stmt.setString(++i,nota.getDEDUCAO_ATIVIDADE());
          stmt.setString(++i,nota.getATV_ECON_ATV());
          stmt.setString(++i,nota.getCOS_SERVICO()+"");
          stmt.setString(++i,nota.getDESCRICAO_SERVICO());
          stmt.setString(++i,nota.getALIQUOTA());
          stmt.setString(++i,nota.getTIPO_RECOLHIMENTO());
          stmt.setString(++i,nota.getOPERACAO_TRIBUTACAO());
          stmt.setString(++i,nota.getMOTIVO_PAGAMENTO());
          stmt.setString(++i,nota.getCODIGO_REGIME()+"");
          stmt.setString(++i,nota.getCIDADE_CODIGO_PRESTACAO()+"");
          stmt.setString(++i,nota.getCIDADE_PRESTACAO());
          stmt.setString(++i,nota.getUF_PRESTACAO());
          stmt.setString(++i,nota.getDOCUMENTO_PRESTACAO());
          stmt.setString(++i,nota.getSERIE_PRESTACAO());
          stmt.setString(++i,nota.getTRIBUTACAO_PRESTACAO());
          stmt.setString(++i,nota.getDESCRICAO_NOTA());
          stmt.setString(++i,nota.getCODIGO_VERIFICACAO());
          stmt.setString(++i,nota.getID_NOTA_FISCAL()+"");
          stmt.setString(++i,nota.getVALOR_ISS_RET());
          stmt.setString(++i,nota.getALIQ_RET());
          stmt.setString(++i,nota.getDESCONTO_RET());
          stmt.setString(++i,nota.getTRIBUTAVEL());
          stmt.setString(++i,nota.getDESCRICAO());
          stmt.setString(++i,nota.getQUANTIDADE());
          stmt.setString(++i,nota.getVALOR_UNITARIO()+"");
          stmt.setString(++i,nota.getVALOR_TOTAL()+"");
          stmt.setString(++i,nota.getDEDUCAO());
          stmt.setString(++i,nota.getVALOR_ISS_UNITARIO());
          
          stmt.execute();
          stmt.close();

     } catch (SQLException e) {
         throw new RuntimeException(e);
     }

    }

    public boolean contemNota(NotaFiscal nota) {
        String sql = "select * from nfse where NUM_NOTA=?";

        try {
            stmt = getConnection().prepareStatement(sql);
            stmt.setString(1, nota.getNUM_NOTA() + "");

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return true;
            }
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return false;
    }
    
    public void consultaAllNotas(){
        String sql = "select * from nfse";
        
        try {
            stmt = getConnection().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            notasFiscaisXML.clear();
            
            while (rs.next()) {
                NotaFiscal nota = new NotaFiscal();
                nota.setNUM_NOTA(rs.getInt("NUM_NOTA"));
                nota.setTOMADOR_RAZAO_SOCIAL(rs.getString("TOMADOR_RAZAO_SOCIAL"));
                nota.setDATA_HORA_EMISSAO(rs.getString("DATA_HORA_EMISSAO"));
                notasFiscaisXML.add(nota);
            }
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
    }
    
    public NotaFiscal nota(int numeroNota){
        String sql = "select * from nfse where NUM_NOTA = ?";
        
        NotaFiscal nota = new NotaFiscal();
        
        try {
            stmt = getConnection().prepareStatement(sql);
            int i=0;
            stmt.setString(1,numeroNota+"");
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                nota.setTIPO(rs.getString("TIPO"));
                nota.setNUM_NOTA(rs.getInt("NUM_NOTA"));
                nota.setDATA_HORA_EMISSAO(rs.getString("DATA_HORA_EMISSAO"));
                nota.setDIA_EMISSAO(rs.getString("DIA_EMISSAO"));
                nota.setMES_COMPETENCIA(rs.getString("MES_COMPETENCIA"));
                nota.setSITUACAO_NF(rs.getString("SITUACAO_NF"));
                nota.setCODIGO_CIDADE(rs.getInt("CODIGO_CIDADE"));
                nota.setUSUARIO_CPF_CNPJ(rs.getString("USUARIO_CPF_CNPJ"));
                nota.setUSUARIO_RAZAO_SOCIAL(rs.getString("USUARIO_RAZAO_SOCIAL"));
                nota.setDATA_HORA_CANCELAMENTO(rs.getString("DATA_HORA_CANCELAMENTO"));
                nota.setRPS_EMISSAO(rs.getInt("RPS_EMISSAO"));
                nota.setSUB_EMISSAO(rs.getInt("SUB_EMISSAO"));
                nota.setPRESTADOR_CPF_CNPJ(rs.getString("PRESTADOR_CPF_CNPJ"));
                nota.setPRESTADOR_INSCRICAO_MUNICIPAL(rs.getString("PRESTADOR_INSCRICAO_MUNICIPAL"));
                nota.setPRESTADOR_RAZAO_SOCIAL(rs.getString("PRESTADOR_RAZAO_SOCIAL"));
                nota.setPRESTADOR_NOME_FANTASIA(rs.getString("PRESTADOR_NOME_FANTASIA"));
                nota.setPRESTADOR_TIPO_LOGRADOURO(rs.getString("PRESTADOR_TIPO_LOGRADOURO"));
                nota.setPRESTADOR_LOGRADOURO(rs.getString("PRESTADOR_LOGRADOURO"));
                nota.setPRESTADOR_PREST_NUMERO(rs.getString("PRESTADOR_PREST_NUMERO"));
                nota.setPRESTADOR_COMPLEMENTO(rs.getString("PRESTADOR_COMPLEMENTO"));
                nota.setPRESTADOR_TIPO_BAIRRO(rs.getString("PRESTADOR_TIPO_BAIRRO"));
                nota.setPRESTADOR_BAIRRO(rs.getString("PRESTADOR_BAIRRO"));
                nota.setPRESTADOR_CIDADE_CODIGO(rs.getInt("PRESTADOR_CIDADE_CODIGO"));
                nota.setPRESTADOR_CIDADE(rs.getString("PRESTADOR_CIDADE"));
                nota.setPRESTADOR_UF(rs.getString("PRESTADOR_UF"));
                nota.setPRESTADOR_CEP(rs.getString("PRESTADOR_CEP"));
                nota.setPRESTADOR_DDD_TELEFONE(rs.getInt("PRESTADOR_DDD_TELEFONE"));
                nota.setTOMADOR_CPF_CNPJ(rs.getString("TOMADOR_CPF_CNPJ"));
                nota.setTOMADOR_RAZAO_SOCIAL(rs.getString("TOMADOR_RAZAO_SOCIAL"));
                nota.setTOMADOR_TIPO_LOGRADOURO(rs.getString("TOMADOR_TIPO_LOGRADOURO"));
                nota.setTOMADOR_LOGRADOURO(rs.getString("TOMADOR_LOGRADOURO"));
                nota.setTOMADOR_NUMERO(rs.getString("TOMADOR_NUMERO"));
                nota.setTOMADOR_TIPO_BAIRRO(rs.getString("TOMADOR_TIPO_BAIRRO"));
                nota.setTOMADOR_BAIRRO(rs.getString("TOMADOR_BAIRRO"));
                nota.setTOMADOR_CIDADE_CODIGO(rs.getInt("TOMADOR_CIDADE_CODIGO"));
                nota.setTOMADOR_CIDADE(rs.getString("TOMADOR_CIDADE"));
                nota.setTOMADOR_UF(rs.getString("TOMADOR_UF"));
                nota.setTOMADOR_CEP(rs.getString("TOMADOR_CEP"));
                nota.setTOMADOR_EMAIL(rs.getString("TOMADOR_EMAIL"));
                nota.setTOMADOR_OPTANTE_SIMPLES(rs.getString("TOMADOR_OPTANTE_SIMPLES"));
                nota.setTOMADOR_DDD_TELEFONE(rs.getInt("TOMADOR_DDD_TELEFONE"));
                nota.setTOMADOR_TELEFONE(rs.getString("TOMADOR_TELEFONE"));
                nota.setVALOR_NOTA(Double.parseDouble(rs.getString("VALOR_NOTA")));
                nota.setVALOR_DEDUCAO(Double.parseDouble(rs.getString("VALOR_DEDUCAO")));
                nota.setVALOR_SERVICO(Double.parseDouble(rs.getString("VALOR_SERVICO")));
                nota.setVALOR_ISS(Double.parseDouble(rs.getString("VALOR_ISS")));
                nota.setVALOR_PIS(Double.parseDouble(rs.getString("VALOR_PIS")));
                nota.setVALOR_COFINS(Double.parseDouble(rs.getString("VALOR_COFINS")));
                nota.setVALOR_INSS(Double.parseDouble(rs.getString("VALOR_INSS")));
                nota.setVALOR_IR(Double.parseDouble(rs.getString("VALOR_IR")));
                nota.setVALOR_CSLL(Double.parseDouble(rs.getString("VALOR_CSLL")));
                nota.setALIQUOTA_PIS(rs.getString("ALIQUOTA_PIS"));
                nota.setALIQUOTA_COFINS(rs.getString("ALIQUOTA_COFINS"));
                nota.setALIQUOTA_INSS(rs.getString("ALIQUOTA_INSS"));
                nota.setALIQUOTA_IR(rs.getString("ALIQUOTA_IR"));
                nota.setALIQUOTA_CSLL(rs.getString("ALIQUOTA_CSLL"));
                nota.setCODIGO_ATIVIDADE(rs.getString("CODIGO_ATIVIDADE"));
                nota.setDESCRICAO_ATIVIDADE(rs.getString("DESCRICAO_ATIVIDADE"));
                nota.setGRUPO_ATIVIDADE(rs.getString("GRUPO_ATIVIDADE"));
                nota.setENQUADRAMENTO_ATIVIDADE(rs.getString("ENQUADRAMENTO_ATIVIDADE"));
                nota.setLOCAL_INCIDENCIA_ATIVIDADE(rs.getString("LOCAL_INCIDENCIA_ATIVIDADE"));
                nota.setTRIBUTAVEL_ATIVIDADE(rs.getString("TRIBUTAVEL_ATIVIDADE"));
                nota.setDEDUCAO_VALOR_ATIVIDADE(rs.getString("DEDUCAO_VALOR_ATIVIDADE"));
                nota.setDEDUCAO_ATIVIDADE(rs.getString("DEDUCAO_ATIVIDADE"));
                nota.setATV_ECON_ATV(rs.getString("ATV_ECON_ATV"));
                nota.setCOS_SERVICO(rs.getInt("COS_SERVICO"));
                nota.setDESCRICAO_SERVICO(rs.getString("DESCRICAO_SERVICO"));
                nota.setALIQUOTA(rs.getString("ALIQUOTA"));
                nota.setTIPO_RECOLHIMENTO(rs.getString("TIPO_RECOLHIMENTO"));
                nota.setOPERACAO_TRIBUTACAO(rs.getString("OPERACAO_TRIBUTACAO"));
                nota.setMOTIVO_PAGAMENTO(rs.getString("MOTIVO_PAGAMENTO"));
                nota.setCODIGO_REGIME(rs.getInt("CODIGO_REGIME"));
                nota.setCIDADE_CODIGO_PRESTACAO(rs.getInt("CIDADE_CODIGO_PRESTACAO"));
                nota.setCIDADE_PRESTACAO(rs.getString("CIDADE_PRESTACAO"));
                nota.setUF_PRESTACAO(rs.getString("UF_PRESTACAO"));
                nota.setDOCUMENTO_PRESTACAO(rs.getString("DOCUMENTO_PRESTACAO"));
                nota.setSERIE_PRESTACAO(rs.getString("SERIE_PRESTACAO"));
                nota.setTRIBUTACAO_PRESTACAO(rs.getString("TRIBUTACAO_PRESTACAO"));
                nota.setDESCRICAO_NOTA(rs.getString("DESCRICAO_NOTA"));
                nota.setCODIGO_VERIFICACAO(rs.getString("CODIGO_VERIFICACAO"));
                nota.setID_NOTA_FISCAL(rs.getInt("ID_NOTA_FISCAL"));
                nota.setVALOR_ISS_RET(rs.getString("VALOR_ISS_RET"));
                nota.setALIQ_RET(rs.getString("ALIQ_RET"));
                nota.setDESCONTO_RET(rs.getString("DESCONTO_RET"));
                nota.setTRIBUTAVEL(rs.getString("TRIBUTAVEL"));
                nota.setDESCRICAO(rs.getString("DESCRICAO"));
                nota.setQUANTIDADE(rs.getString("QUANTIDADE"));
                nota.setVALOR_UNITARIO(Double.parseDouble(rs.getString("VALOR_UNITARIO")));
                nota.setVALOR_TOTAL(Double.parseDouble(rs.getString("VALOR_TOTAL")));
                nota.setDEDUCAO(rs.getString("DEDUCAO"));
                nota.setVALOR_ISS_UNITARIO(rs.getString("VALOR_ISS_UNITARIO"));
            }
            
            
        } catch (SQLException e) {
             throw new RuntimeException(e);
        }
        
       return nota;
    }
    
    public ArrayList<NotaFiscal> getNotasFiscaisXML() {
        return notasFiscaisXML;
    }
    
    public void setNotasFiscaisXML(ArrayList<NotaFiscal> notasFiscaisXML) {
        this.notasFiscaisXML = notasFiscaisXML;
    }

}
