/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.remocamp.model;

/**
 *
 * @author fabiano
 */
public class NotaFiscal {

    private String TIPO;
    private long NUM_NOTA;
    private String DATA_HORA_EMISSAO;
    private String DIA_EMISSAO;
    private String MES_COMPETENCIA;
    private String SITUACAO_NF;
    private int CODIGO_CIDADE;
    private String USUARIO_CPF_CNPJ;
    private String USUARIO_RAZAO_SOCIAL;
    private String DATA_HORA_CANCELAMENTO;
    private int RPS_EMISSAO;
    private int SUB_EMISSAO;
    private String PRESTADOR_CPF_CNPJ;
    private String PRESTADOR_INSCRICAO_MUNICIPAL;
    private String PRESTADOR_RAZAO_SOCIAL;
    private String PRESTADOR_NOME_FANTASIA;
    private String PRESTADOR_TIPO_LOGRADOURO;
    private String PRESTADOR_LOGRADOURO;
    private String PRESTADOR_PREST_NUMERO;
    private String PRESTADOR_COMPLEMENTO;
    private String PRESTADOR_TIPO_BAIRRO;
    private String PRESTADOR_BAIRRO;
    private int PRESTADOR_CIDADE_CODIGO;
    private String PRESTADOR_CIDADE;
    private String PRESTADOR_UF;
    private String PRESTADOR_CEP;
    private int PRESTADOR_DDD_TELEFONE;
    private String PRESTADOR_TELEFONE;
    private String TOMADOR_CPF_CNPJ;
    private String TOMADOR_RAZAO_SOCIAL;
    private String TOMADOR_TIPO_LOGRADOURO;
    private String TOMADOR_LOGRADOURO;
    private String TOMADOR_NUMERO;
    private String TOMADOR_TIPO_BAIRRO;
    private String TOMADOR_BAIRRO;
    private int TOMADOR_CIDADE_CODIGO;
    private String TOMADOR_CIDADE;
    private String TOMADOR_UF;
    private String TOMADOR_CEP;
    private String TOMADOR_EMAIL;
    private String TOMADOR_OPTANTE_SIMPLES;
    private int TOMADOR_DDD_TELEFONE;
    private String TOMADOR_TELEFONE;
    private double VALOR_NOTA;
    private double VALOR_DEDUCAO;
    private double VALOR_SERVICO;
    private double VALOR_ISS;
    private double VALOR_PIS;
    private double VALOR_COFINS;
    private double VALOR_INSS;
    private double VALOR_IR;
    private double VALOR_CSLL;
    private String ALIQUOTA_PIS;
    private String ALIQUOTA_COFINS;
    private String ALIQUOTA_INSS;
    private String ALIQUOTA_IR;
    private String ALIQUOTA_CSLL;
    private String CODIGO_ATIVIDADE;
    private String DESCRICAO_ATIVIDADE;
    private String GRUPO_ATIVIDADE;
    private String ENQUADRAMENTO_ATIVIDADE;
    private String LOCAL_INCIDENCIA_ATIVIDADE;
    private String TRIBUTAVEL_ATIVIDADE;
    private String DEDUCAO_VALOR_ATIVIDADE;
    private String DEDUCAO_ATIVIDADE;
    private String ATV_ECON_ATV;
    private int COS_SERVICO;
    private String DESCRICAO_SERVICO;
    private String ALIQUOTA;
    private String TIPO_RECOLHIMENTO;
    private String OPERACAO_TRIBUTACAO;
    private String MOTIVO_PAGAMENTO;
    private int CODIGO_REGIME;
    private int CIDADE_CODIGO_PRESTACAO;
    private String CIDADE_PRESTACAO;
    private String UF_PRESTACAO;
    private String DOCUMENTO_PRESTACAO;
    private String SERIE_PRESTACAO;
    private String TRIBUTACAO_PRESTACAO;
    private String DESCRICAO_NOTA;
    private String CODIGO_VERIFICACAO;
    private int ID_NOTA_FISCAL;
    private String VALOR_ISS_RET;
    private String ALIQ_RET;
    private String DESCONTO_RET;
    private String TRIBUTAVEL;
    private String DESCRICAO;
    private String QUANTIDADE;
    private double VALOR_UNITARIO;
    private double VALOR_TOTAL;
    private String DEDUCAO;
    private String VALOR_ISS_UNITARIO;

    public String getTIPO() {
        return TIPO;
    }

    public void setTIPO(String TIPO) {
        this.TIPO = TIPO;
    }

    public long getNUM_NOTA() {
        return NUM_NOTA;
    }

    public void setNUM_NOTA(long NUM_NOTA) {
        this.NUM_NOTA = NUM_NOTA;
    }

    public String getDATA_HORA_EMISSAO() {
        return DATA_HORA_EMISSAO;
    }

    public void setDATA_HORA_EMISSAO(String DATA_HORA_EMISSAO) {
        this.DATA_HORA_EMISSAO = DATA_HORA_EMISSAO;
    }

    public String getDIA_EMISSAO() {
        return DIA_EMISSAO;
    }

    public void setDIA_EMISSAO(String DIA_EMISSAO) {
        this.DIA_EMISSAO = DIA_EMISSAO;
    }

    public String getMES_COMPETENCIA() {
        return MES_COMPETENCIA;
    }

    public void setMES_COMPETENCIA(String MES_COMPETENCIA) {
        this.MES_COMPETENCIA = MES_COMPETENCIA;
    }

    public String getSITUACAO_NF() {
        return SITUACAO_NF;
    }

    public void setSITUACAO_NF(String SITUACAO_NF) {
        this.SITUACAO_NF = SITUACAO_NF;
    }

    public int getCODIGO_CIDADE() {
        return CODIGO_CIDADE;
    }

    public void setCODIGO_CIDADE(int CODIGO_CIDADE) {
        this.CODIGO_CIDADE = CODIGO_CIDADE;
    }

    public String getUSUARIO_CPF_CNPJ() {
        return USUARIO_CPF_CNPJ;
    }

    public void setUSUARIO_CPF_CNPJ(String USUARIO_CPF_CNPJ) {
        this.USUARIO_CPF_CNPJ = USUARIO_CPF_CNPJ;
    }

    public String getUSUARIO_RAZAO_SOCIAL() {
        return USUARIO_RAZAO_SOCIAL;
    }

    public void setUSUARIO_RAZAO_SOCIAL(String USUARIO_RAZAO_SOCIAL) {
        this.USUARIO_RAZAO_SOCIAL = USUARIO_RAZAO_SOCIAL;
    }

    public String getDATA_HORA_CANCELAMENTO() {
        return DATA_HORA_CANCELAMENTO;
    }

    public void setDATA_HORA_CANCELAMENTO(String DATA_HORA_CANCELAMENTO) {
        this.DATA_HORA_CANCELAMENTO = DATA_HORA_CANCELAMENTO;
    }

    public int getRPS_EMISSAO() {
        return RPS_EMISSAO;
    }

    public void setRPS_EMISSAO(int RPS_EMISSAO) {
        this.RPS_EMISSAO = RPS_EMISSAO;
    }

    public int getSUB_EMISSAO() {
        return SUB_EMISSAO;
    }

    public void setSUB_EMISSAO(int SUB_EMISSAO) {
        this.SUB_EMISSAO = SUB_EMISSAO;
    }

    public String getPRESTADOR_CPF_CNPJ() {
        return PRESTADOR_CPF_CNPJ;
    }

    public void setPRESTADOR_CPF_CNPJ(String PRESTADOR_CPF_CNPJ) {
        this.PRESTADOR_CPF_CNPJ = PRESTADOR_CPF_CNPJ;
    }

    public String getPRESTADOR_INSCRICAO_MUNICIPAL() {
        return PRESTADOR_INSCRICAO_MUNICIPAL;
    }

    public void setPRESTADOR_INSCRICAO_MUNICIPAL(String PRESTADOR_INSCRICAO_MUNICIPAL) {
        this.PRESTADOR_INSCRICAO_MUNICIPAL = PRESTADOR_INSCRICAO_MUNICIPAL;
    }

    public String getPRESTADOR_RAZAO_SOCIAL() {
        return PRESTADOR_RAZAO_SOCIAL;
    }

    public void setPRESTADOR_RAZAO_SOCIAL(String PRESTADOR_RAZAO_SOCIAL) {
        this.PRESTADOR_RAZAO_SOCIAL = PRESTADOR_RAZAO_SOCIAL;
    }

    public String getPRESTADOR_NOME_FANTASIA() {
        return PRESTADOR_NOME_FANTASIA;
    }

    public void setPRESTADOR_NOME_FANTASIA(String PRESTADOR_NOME_FANTASIA) {
        this.PRESTADOR_NOME_FANTASIA = PRESTADOR_NOME_FANTASIA;
    }

    public String getPRESTADOR_TIPO_LOGRADOURO() {
        return PRESTADOR_TIPO_LOGRADOURO;
    }

    public void setPRESTADOR_TIPO_LOGRADOURO(String PRESTADOR_TIPO_LOGRADOURO) {
        this.PRESTADOR_TIPO_LOGRADOURO = PRESTADOR_TIPO_LOGRADOURO;
    }

    public String getPRESTADOR_LOGRADOURO() {
        return PRESTADOR_LOGRADOURO;
    }

    public void setPRESTADOR_LOGRADOURO(String PRESTADOR_LOGRADOURO) {
        this.PRESTADOR_LOGRADOURO = PRESTADOR_LOGRADOURO;
    }

    public String getPRESTADOR_PREST_NUMERO() {
        return PRESTADOR_PREST_NUMERO;
    }

    public void setPRESTADOR_PREST_NUMERO(String PRESTADOR_PREST_NUMERO) {
        this.PRESTADOR_PREST_NUMERO = PRESTADOR_PREST_NUMERO;
    }

    public String getPRESTADOR_COMPLEMENTO() {
        return PRESTADOR_COMPLEMENTO;
    }

    public void setPRESTADOR_COMPLEMENTO(String PRESTADOR_COMPLEMENTO) {
        this.PRESTADOR_COMPLEMENTO = PRESTADOR_COMPLEMENTO;
    }

    public String getPRESTADOR_TIPO_BAIRRO() {
        return PRESTADOR_TIPO_BAIRRO;
    }

    public void setPRESTADOR_TIPO_BAIRRO(String PRESTADOR_TIPO_BAIRRO) {
        this.PRESTADOR_TIPO_BAIRRO = PRESTADOR_TIPO_BAIRRO;
    }

    public String getPRESTADOR_BAIRRO() {
        return PRESTADOR_BAIRRO;
    }

    public void setPRESTADOR_BAIRRO(String PRESTADOR_BAIRRO) {
        this.PRESTADOR_BAIRRO = PRESTADOR_BAIRRO;
    }

    public int getPRESTADOR_CIDADE_CODIGO() {
        return PRESTADOR_CIDADE_CODIGO;
    }

    public void setPRESTADOR_CIDADE_CODIGO(int PRESTADOR_CIDADE_CODIGO) {
        this.PRESTADOR_CIDADE_CODIGO = PRESTADOR_CIDADE_CODIGO;
    }

    public String getPRESTADOR_CIDADE() {
        return PRESTADOR_CIDADE;
    }

    public void setPRESTADOR_CIDADE(String PRESTADOR_CIDADE) {
        this.PRESTADOR_CIDADE = PRESTADOR_CIDADE;
    }

    public String getPRESTADOR_UF() {
        return PRESTADOR_UF;
    }

    public void setPRESTADOR_UF(String PRESTADOR_UF) {
        this.PRESTADOR_UF = PRESTADOR_UF;
    }

    public String getPRESTADOR_CEP() {
        return PRESTADOR_CEP;
    }

    public void setPRESTADOR_CEP(String PRESTADOR_CEP) {
        this.PRESTADOR_CEP = PRESTADOR_CEP;
    }

    public int getPRESTADOR_DDD_TELEFONE() {
        return PRESTADOR_DDD_TELEFONE;
    }

    public void setPRESTADOR_DDD_TELEFONE(int PRESTADOR_DDD_TELEFONE) {
        this.PRESTADOR_DDD_TELEFONE = PRESTADOR_DDD_TELEFONE;
    }

    public String getPRESTADOR_TELEFONE() {
        return PRESTADOR_TELEFONE;
    }

    public void setPRESTADOR_TELEFONE(String PRESTADOR_TELEFONE) {
        this.PRESTADOR_TELEFONE = PRESTADOR_TELEFONE;
    }

    public String getTOMADOR_CPF_CNPJ() {
        return TOMADOR_CPF_CNPJ;
    }

    public void setTOMADOR_CPF_CNPJ(String TOMADOR_CPF_CNPJ) {
        this.TOMADOR_CPF_CNPJ = TOMADOR_CPF_CNPJ;
    }

    public String getTOMADOR_RAZAO_SOCIAL() {
        return TOMADOR_RAZAO_SOCIAL;
    }

    public void setTOMADOR_RAZAO_SOCIAL(String TOMADOR_RAZAO_SOCIAL) {
        this.TOMADOR_RAZAO_SOCIAL = TOMADOR_RAZAO_SOCIAL;
    }

    public String getTOMADOR_TIPO_LOGRADOURO() {
        return TOMADOR_TIPO_LOGRADOURO;
    }

    public void setTOMADOR_TIPO_LOGRADOURO(String TOMADOR_TIPO_LOGRADOURO) {
        this.TOMADOR_TIPO_LOGRADOURO = TOMADOR_TIPO_LOGRADOURO;
    }

    public String getTOMADOR_LOGRADOURO() {
        return TOMADOR_LOGRADOURO;
    }

    public void setTOMADOR_LOGRADOURO(String TOMADOR_LOGRADOURO) {
        this.TOMADOR_LOGRADOURO = TOMADOR_LOGRADOURO;
    }

    public String getTOMADOR_NUMERO() {
        return TOMADOR_NUMERO;
    }

    public void setTOMADOR_NUMERO(String TOMADOR_NUMERO) {
        this.TOMADOR_NUMERO = TOMADOR_NUMERO;
    }

    public String getTOMADOR_TIPO_BAIRRO() {
        return TOMADOR_TIPO_BAIRRO;
    }

    public void setTOMADOR_TIPO_BAIRRO(String TOMADOR_TIPO_BAIRRO) {
        this.TOMADOR_TIPO_BAIRRO = TOMADOR_TIPO_BAIRRO;
    }

    public String getTOMADOR_BAIRRO() {
        return TOMADOR_BAIRRO;
    }

    public void setTOMADOR_BAIRRO(String TOMADOR_BAIRRO) {
        this.TOMADOR_BAIRRO = TOMADOR_BAIRRO;
    }

    public int getTOMADOR_CIDADE_CODIGO() {
        return TOMADOR_CIDADE_CODIGO;
    }

    public void setTOMADOR_CIDADE_CODIGO(int TOMADOR_CIDADE_CODIGO) {
        this.TOMADOR_CIDADE_CODIGO = TOMADOR_CIDADE_CODIGO;
    }

    public String getTOMADOR_CIDADE() {
        return TOMADOR_CIDADE;
    }

    public void setTOMADOR_CIDADE(String TOMADOR_CIDADE) {
        this.TOMADOR_CIDADE = TOMADOR_CIDADE;
    }

    public String getTOMADOR_UF() {
        return TOMADOR_UF;
    }

    public void setTOMADOR_UF(String TOMADOR_UF) {
        this.TOMADOR_UF = TOMADOR_UF;
    }

    public String getTOMADOR_CEP() {
        return TOMADOR_CEP;
    }

    public void setTOMADOR_CEP(String TOMADOR_CEP) {
        this.TOMADOR_CEP = TOMADOR_CEP;
    }

    public String getTOMADOR_EMAIL() {
        return TOMADOR_EMAIL;
    }

    public void setTOMADOR_EMAIL(String TOMADOR_EMAIL) {
        this.TOMADOR_EMAIL = TOMADOR_EMAIL;
    }

    public String getTOMADOR_OPTANTE_SIMPLES() {
        return TOMADOR_OPTANTE_SIMPLES;
    }

    public void setTOMADOR_OPTANTE_SIMPLES(String TOMADOR_OPTANTE_SIMPLES) {
        this.TOMADOR_OPTANTE_SIMPLES = TOMADOR_OPTANTE_SIMPLES;
    }

    public int getTOMADOR_DDD_TELEFONE() {
        return TOMADOR_DDD_TELEFONE;
    }

    public void setTOMADOR_DDD_TELEFONE(int TOMADOR_DDD_TELEFONE) {
        this.TOMADOR_DDD_TELEFONE = TOMADOR_DDD_TELEFONE;
    }

    public String getTOMADOR_TELEFONE() {
        return TOMADOR_TELEFONE;
    }

    public void setTOMADOR_TELEFONE(String TOMADOR_TELEFONE) {
        this.TOMADOR_TELEFONE = TOMADOR_TELEFONE;
    }

    public double getVALOR_NOTA() {
        return VALOR_NOTA;
    }

    public void setVALOR_NOTA(double VALOR_NOTA) {
        this.VALOR_NOTA = VALOR_NOTA;
    }

    public double getVALOR_DEDUCAO() {
        return VALOR_DEDUCAO;
    }

    public void setVALOR_DEDUCAO(double VALOR_DEDUCAO) {
        this.VALOR_DEDUCAO = VALOR_DEDUCAO;
    }

    public double getVALOR_SERVICO() {
        return VALOR_SERVICO;
    }

    public void setVALOR_SERVICO(double VALOR_SERVICO) {
        this.VALOR_SERVICO = VALOR_SERVICO;
    }

    public double getVALOR_ISS() {
        return VALOR_ISS;
    }

    public void setVALOR_ISS(double VALOR_ISS) {
        this.VALOR_ISS = VALOR_ISS;
    }

    public double getVALOR_PIS() {
        return VALOR_PIS;
    }

    public void setVALOR_PIS(double VALOR_PIS) {
        this.VALOR_PIS = VALOR_PIS;
    }

    public double getVALOR_COFINS() {
        return VALOR_COFINS;
    }

    public void setVALOR_COFINS(double VALOR_COFINS) {
        this.VALOR_COFINS = VALOR_COFINS;
    }

    public double getVALOR_INSS() {
        return VALOR_INSS;
    }

    public void setVALOR_INSS(double VALOR_INSS) {
        this.VALOR_INSS = VALOR_INSS;
    }

    public double getVALOR_IR() {
        return VALOR_IR;
    }

    public void setVALOR_IR(double VALOR_IR) {
        this.VALOR_IR = VALOR_IR;
    }

    public double getVALOR_CSLL() {
        return VALOR_CSLL;
    }

    public void setVALOR_CSLL(double VALOR_CSLL) {
        this.VALOR_CSLL = VALOR_CSLL;
    }

    public String getALIQUOTA_PIS() {
        return ALIQUOTA_PIS;
    }

    public void setALIQUOTA_PIS(String ALIQUOTA_PIS) {
        this.ALIQUOTA_PIS = ALIQUOTA_PIS;
    }

    public String getALIQUOTA_COFINS() {
        return ALIQUOTA_COFINS;
    }

    public void setALIQUOTA_COFINS(String ALIQUOTA_COFINS) {
        this.ALIQUOTA_COFINS = ALIQUOTA_COFINS;
    }

    public String getALIQUOTA_INSS() {
        return ALIQUOTA_INSS;
    }

    public void setALIQUOTA_INSS(String ALIQUOTA_INSS) {
        this.ALIQUOTA_INSS = ALIQUOTA_INSS;
    }

    public String getALIQUOTA_IR() {
        return ALIQUOTA_IR;
    }

    public void setALIQUOTA_IR(String ALIQUOTA_IR) {
        this.ALIQUOTA_IR = ALIQUOTA_IR;
    }

    public String getALIQUOTA_CSLL() {
        return ALIQUOTA_CSLL;
    }

    public void setALIQUOTA_CSLL(String ALIQUOTA_CSLL) {
        this.ALIQUOTA_CSLL = ALIQUOTA_CSLL;
    }

    public String getCODIGO_ATIVIDADE() {
        return CODIGO_ATIVIDADE;
    }

    public void setCODIGO_ATIVIDADE(String CODIGO_ATIVIDADE) {
        this.CODIGO_ATIVIDADE = CODIGO_ATIVIDADE;
    }

    public String getDESCRICAO_ATIVIDADE() {
        return DESCRICAO_ATIVIDADE;
    }

    public void setDESCRICAO_ATIVIDADE(String DESCRICAO_ATIVIDADE) {
        this.DESCRICAO_ATIVIDADE = DESCRICAO_ATIVIDADE;
    }

    public String getGRUPO_ATIVIDADE() {
        return GRUPO_ATIVIDADE;
    }

    public void setGRUPO_ATIVIDADE(String GRUPO_ATIVIDADE) {
        this.GRUPO_ATIVIDADE = GRUPO_ATIVIDADE;
    }

    public String getENQUADRAMENTO_ATIVIDADE() {
        return ENQUADRAMENTO_ATIVIDADE;
    }

    public void setENQUADRAMENTO_ATIVIDADE(String ENQUADRAMENTO_ATIVIDADE) {
        this.ENQUADRAMENTO_ATIVIDADE = ENQUADRAMENTO_ATIVIDADE;
    }

    public String getLOCAL_INCIDENCIA_ATIVIDADE() {
        return LOCAL_INCIDENCIA_ATIVIDADE;
    }

    public void setLOCAL_INCIDENCIA_ATIVIDADE(String LOCAL_INCIDENCIA_ATIVIDADE) {
        this.LOCAL_INCIDENCIA_ATIVIDADE = LOCAL_INCIDENCIA_ATIVIDADE;
    }

    public String getTRIBUTAVEL_ATIVIDADE() {
        return TRIBUTAVEL_ATIVIDADE;
    }

    public void setTRIBUTAVEL_ATIVIDADE(String TRIBUTAVEL_ATIVIDADE) {
        this.TRIBUTAVEL_ATIVIDADE = TRIBUTAVEL_ATIVIDADE;
    }

    public String getDEDUCAO_VALOR_ATIVIDADE() {
        return DEDUCAO_VALOR_ATIVIDADE;
    }

    public void setDEDUCAO_VALOR_ATIVIDADE(String DEDUCAO_VALOR_ATIVIDADE) {
        this.DEDUCAO_VALOR_ATIVIDADE = DEDUCAO_VALOR_ATIVIDADE;
    }

    public String getDEDUCAO_ATIVIDADE() {
        return DEDUCAO_ATIVIDADE;
    }

    public void setDEDUCAO_ATIVIDADE(String DEDUCAO_ATIVIDADE) {
        this.DEDUCAO_ATIVIDADE = DEDUCAO_ATIVIDADE;
    }

    public String getATV_ECON_ATV() {
        return ATV_ECON_ATV;
    }

    public void setATV_ECON_ATV(String ATV_ECON_ATV) {
        this.ATV_ECON_ATV = ATV_ECON_ATV;
    }

    public int getCOS_SERVICO() {
        return COS_SERVICO;
    }

    public void setCOS_SERVICO(int COS_SERVICO) {
        this.COS_SERVICO = COS_SERVICO;
    }

    public String getDESCRICAO_SERVICO() {
        return DESCRICAO_SERVICO;
    }

    public void setDESCRICAO_SERVICO(String DESCRICAO_SERVICO) {
        this.DESCRICAO_SERVICO = DESCRICAO_SERVICO;
    }

    public String getALIQUOTA() {
        return ALIQUOTA;
    }

    public void setALIQUOTA(String ALIQUOTA) {
        this.ALIQUOTA = ALIQUOTA;
    }

    public String getTIPO_RECOLHIMENTO() {
        return TIPO_RECOLHIMENTO;
    }

    public void setTIPO_RECOLHIMENTO(String TIPO_RECOLHIMENTO) {
        this.TIPO_RECOLHIMENTO = TIPO_RECOLHIMENTO;
    }

    public String getOPERACAO_TRIBUTACAO() {
        return OPERACAO_TRIBUTACAO;
    }

    public void setOPERACAO_TRIBUTACAO(String OPERACAO_TRIBUTACAO) {
        this.OPERACAO_TRIBUTACAO = OPERACAO_TRIBUTACAO;
    }

    public String getMOTIVO_PAGAMENTO() {
        return MOTIVO_PAGAMENTO;
    }

    public void setMOTIVO_PAGAMENTO(String MOTIVO_PAGAMENTO) {
        this.MOTIVO_PAGAMENTO = MOTIVO_PAGAMENTO;
    }

    public int getCODIGO_REGIME() {
        return CODIGO_REGIME;
    }

    public void setCODIGO_REGIME(int CODIGO_REGIME) {
        this.CODIGO_REGIME = CODIGO_REGIME;
    }

    public int getCIDADE_CODIGO_PRESTACAO() {
        return CIDADE_CODIGO_PRESTACAO;
    }

    public void setCIDADE_CODIGO_PRESTACAO(int CIDADE_CODIGO_PRESTACAO) {
        this.CIDADE_CODIGO_PRESTACAO = CIDADE_CODIGO_PRESTACAO;
    }

    public String getCIDADE_PRESTACAO() {
        return CIDADE_PRESTACAO;
    }

    public void setCIDADE_PRESTACAO(String CIDADE_PRESTACAO) {
        this.CIDADE_PRESTACAO = CIDADE_PRESTACAO;
    }

    public String getUF_PRESTACAO() {
        return UF_PRESTACAO;
    }

    public void setUF_PRESTACAO(String UF_PRESTACAO) {
        this.UF_PRESTACAO = UF_PRESTACAO;
    }

    public String getDOCUMENTO_PRESTACAO() {
        return DOCUMENTO_PRESTACAO;
    }

    public void setDOCUMENTO_PRESTACAO(String DOCUMENTO_PRESTACAO) {
        this.DOCUMENTO_PRESTACAO = DOCUMENTO_PRESTACAO;
    }

    public String getSERIE_PRESTACAO() {
        return SERIE_PRESTACAO;
    }

    public void setSERIE_PRESTACAO(String SERIE_PRESTACAO) {
        this.SERIE_PRESTACAO = SERIE_PRESTACAO;
    }

    public String getTRIBUTACAO_PRESTACAO() {
        return TRIBUTACAO_PRESTACAO;
    }

    public void setTRIBUTACAO_PRESTACAO(String TRIBUTACAO_PRESTACAO) {
        this.TRIBUTACAO_PRESTACAO = TRIBUTACAO_PRESTACAO;
    }

    public String getDESCRICAO_NOTA() {
        return DESCRICAO_NOTA;
    }

    public void setDESCRICAO_NOTA(String DESCRICAO_NOTA) {
        this.DESCRICAO_NOTA = DESCRICAO_NOTA;
    }

    public String getCODIGO_VERIFICACAO() {
        return CODIGO_VERIFICACAO;
    }

    public void setCODIGO_VERIFICACAO(String CODIGO_VERIFICACAO) {
        this.CODIGO_VERIFICACAO = CODIGO_VERIFICACAO;
    }

    public int getID_NOTA_FISCAL() {
        return ID_NOTA_FISCAL;
    }

    public void setID_NOTA_FISCAL(int ID_NOTA_FISCAL) {
        this.ID_NOTA_FISCAL = ID_NOTA_FISCAL;
    }

    public String getVALOR_ISS_RET() {
        return VALOR_ISS_RET;
    }

    public void setVALOR_ISS_RET(String VALOR_ISS_RET) {
        this.VALOR_ISS_RET = VALOR_ISS_RET;
    }

    public String getALIQ_RET() {
        return ALIQ_RET;
    }

    public void setALIQ_RET(String ALIQ_RET) {
        this.ALIQ_RET = ALIQ_RET;
    }

    public String getDESCONTO_RET() {
        return DESCONTO_RET;
    }

    public void setDESCONTO_RET(String DESCONTO_RET) {
        this.DESCONTO_RET = DESCONTO_RET;
    }

    public String getTRIBUTAVEL() {
        return TRIBUTAVEL;
    }

    public void setTRIBUTAVEL(String TRIBUTAVEL) {
        this.TRIBUTAVEL = TRIBUTAVEL;
    }

    public String getDESCRICAO() {
        return DESCRICAO;
    }

    public void setDESCRICAO(String DESCRICAO) {
        this.DESCRICAO = DESCRICAO;
    }

    public String getQUANTIDADE() {
        return QUANTIDADE;
    }

    public void setQUANTIDADE(String QUANTIDADE) {
        this.QUANTIDADE = QUANTIDADE;
    }

    public double getVALOR_UNITARIO() {
        return VALOR_UNITARIO;
    }

    public void setVALOR_UNITARIO(double VALOR_UNITARIO) {
        this.VALOR_UNITARIO = VALOR_UNITARIO;
    }

    public double getVALOR_TOTAL() {
        return VALOR_TOTAL;
    }

    public void setVALOR_TOTAL(double VALOR_TOTAL) {
        this.VALOR_TOTAL = VALOR_TOTAL;
    }

    public String getDEDUCAO() {
        return DEDUCAO;
    }

    public void setDEDUCAO(String DEDUCAO) {
        this.DEDUCAO = DEDUCAO;
    }

    public String getVALOR_ISS_UNITARIO() {
        return VALOR_ISS_UNITARIO;
    }

    public void setVALOR_ISS_UNITARIO(String VALOR_ISS_UNITARIO) {
        this.VALOR_ISS_UNITARIO = VALOR_ISS_UNITARIO;
    }
 
    
}
