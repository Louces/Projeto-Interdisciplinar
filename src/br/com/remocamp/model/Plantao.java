
package br.com.remocamp.model;

public class Plantao {

    private int idPlantao;
    
    /*Evento*/
    private String nomeEvento;
    private java.sql.Date inicio;
    private java.sql.Date fim;
    private String responsavel;
    
    /*Destino*/
    private String endereco;
    private String cidade;
    private String estado;
    private String complemento;
    
      /*Equipe*/
    private String medico;
    private String enfermeiro;
    private String motorista;
    private String operador;
    
    /*Ambulancia*/
    private String ambulancia;
    
    private String observacao;

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public java.sql.Date getInicio() {
        return inicio;
    }

    public void setInicio(java.sql.Date inicio) {
        this.inicio = inicio;
    }

    public java.sql.Date getFim() {
        return fim;
    }

    public void setFim(java.sql.Date fim) {
        this.fim = fim;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
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

    public int getIdPlantao() {
        return idPlantao;
    }

    public void setIdPlantao(int idPlantao) {
        this.idPlantao = idPlantao;
    }
}
