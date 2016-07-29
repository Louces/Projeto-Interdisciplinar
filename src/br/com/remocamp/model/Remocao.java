package br.com.remocamp.model;

public class Remocao {
    
    private int idRemocao;
    /*Paciente*/
    private String nome;
    private String idade;
    private String vagaConfirmada;
    private java.sql.Date dataSolicitacao;
    private java.sql.Date dataRemocao;
    private String diagnostico;
    
    /*Origem*/
    private String enderecoOrigem;
    private String cidadeOrigem;
    private String estadoOrigem;
    private String complementoOrigem;
    private String horaOrigem;
    
    /*Destino*/
    private String enderecoDestino;
    private String cidadeDestino;
    private String estadoDestino;
    private String complementoDestino;
    
    /*Equipe*/
    private String medico;
    private String enfermeiro;
    private String motorista;
    private String operador;
    
    /*Ambulancia*/
    private String ambulancia;
    
    private String observacao;
    private String responsavel;
    private String unidMedico;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getVagaConfirmada() {
        return vagaConfirmada;
    }

    public void setVagaConfirmada(String vagaConfirmada) {
        this.vagaConfirmada = vagaConfirmada;
    }

    public java.sql.Date getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setDataSolicitacao(java.sql.Date dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    public java.sql.Date getDataRemocao() {
        return dataRemocao;
    }

    public void setDataRemocao(java.sql.Date dataRemocao) {
        this.dataRemocao = dataRemocao;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getEnderecoOrigem() {
        return enderecoOrigem;
    }

    public void setEnderecoOrigem(String enderecoOrigem) {
        this.enderecoOrigem = enderecoOrigem;
    }

    public String getCidadeOrigem() {
        return cidadeOrigem;
    }

    public void setCidadeOrigem(String cidadeOrigem) {
        this.cidadeOrigem = cidadeOrigem;
    }

    public String getEstadoOrigem() {
        return estadoOrigem;
    }

    public void setEstadoOrigem(String estadoOrigem) {
        this.estadoOrigem = estadoOrigem;
    }

    public String getComplementoOrigem() {
        return complementoOrigem;
    }

    public void setComplementoOrigem(String ComplementoOrigem) {
        this.complementoOrigem = ComplementoOrigem;
    }

    public String getHoraOrigem() {
        return horaOrigem;
    }

    public void setHoraOrigem(String horaOrigem) {
        this.horaOrigem = horaOrigem;
    }

    public String getEnderecoDestino() {
        return enderecoDestino;
    }

    public void setEnderecoDestino(String enderecoDestino) {
        this.enderecoDestino = enderecoDestino;
    }

    public String getCidadeDestino() {
        return cidadeDestino;
    }

    public void setCidadeDestino(String cidadeDestino) {
        this.cidadeDestino = cidadeDestino;
    }

    public String getEstadoDestino() {
        return estadoDestino;
    }

    public void setEstadoDestino(String estadoDestino) {
        this.estadoDestino = estadoDestino;
    }

    public String getComplementoDestino() {
        return complementoDestino;
    }

    public void setComplementoDestino(String ComplementoDestino) {
        this.complementoDestino = ComplementoDestino;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getEnfermeiro() {
        return enfermeiro;
    }

    public void setEnfermeiro(String enfermeiro) {
        this.enfermeiro = enfermeiro;
    }

    public String getMotorista() {
        return motorista;
    }

    public void setMotorista(String motorista) {
        this.motorista = motorista;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public String getAmbulancia() {
        return ambulancia;
    }

    public void setAmbulancia(String ambulancia) {
        this.ambulancia = ambulancia;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getUnidMedico() {
        return unidMedico;
    }

    public void setUnidMedico(String unidMedico) {
        this.unidMedico = unidMedico;
    }  

    public int getIdRemocao() {
        return idRemocao;
    }

    public void setIdRemocao(int idRemocao) {
        this.idRemocao = idRemocao;
    }
}
