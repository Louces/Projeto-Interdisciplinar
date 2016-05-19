/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.remocamp.dao;

import br.com.remocamp.jdbc.ConnectionFactory;
import br.com.remocamp.xlm.NotaFiscalXML;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author fabiano
 */
public class NotaFiscalDao {

    private Connection connection;
    private PreparedStatement stmt;
    private ArrayList<NotaFiscalXML> notasFiscaisXML = new ArrayList<>();

    public NotaFiscalDao() {
        setConnection(new ConnectionFactory().getConnection());
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public ArrayList<NotaFiscalXML> getPlantoes() {
        return notasFiscaisXML;
    }
    
    public void adiciona(NotaFiscalXML nota) {

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
                
//  <TRIBUTAVEL>S</TRIBUTAVEL>
//  <DESCRICAO>LOCAÇÃO 01 UTI MÓVEL</DESCRICAO>
//  <QUANTIDADE>1</QUANTIDADE>
//  <VALOR_UNITARIO>1600</VALOR_UNITARIO>
//  <VALOR_TOTAL>1600</VALOR_TOTAL>
//  <DEDUCAO>N</DEDUCAO>
//  <VALOR_ISS_UNITARIO>0</VALOR_ISS_UNITARIO>
           +")"
                
                + " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
         try {
         // prepared statement para inserção
         stmt = getConnection().prepareStatement(sql);
































    
            
     } catch (SQLException e) {
         throw new RuntimeException(e);
     }

    }

}
