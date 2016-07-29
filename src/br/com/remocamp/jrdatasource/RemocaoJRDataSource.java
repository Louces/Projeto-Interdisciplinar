/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.remocamp.jrdatasource;

import br.com.remocamp.model.Remocao;
import java.util.Iterator;
import java.util.Vector;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;

/**
 *
 * @author fabiano
 */
public class RemocaoJRDataSource implements JRDataSource{
    
    private Iterator<Remocao> iterator;
    private Remocao cursor;

    public RemocaoJRDataSource(Vector<Remocao> remocao) {
        super();
        iterator = remocao.iterator();
    }

    @Override
    public boolean next() throws JRException {
         boolean retorno = iterator.hasNext();
        if (retorno) {
            cursor = iterator.next();
        }
        return retorno;
    }

    @Override
    public Object getFieldValue(JRField nome) throws JRException {
        Remocao remocao = cursor;
        
        if(nome.getName().equals("nome")){
            return remocao.getNome();
        }
        if(nome.getName().equals("idade")){
            return remocao.getIdade();
        }
        if(nome.getName().equals("vagaConfirmada")){
            return remocao.getVagaConfirmada();
        }
        if(nome.getName().equals("dataSolicitacao")){
            return remocao.getDataSolicitacao();
        }
        if(nome.getName().equals("dataRemocao")){
            return remocao.getDataRemocao();
        }
        if(nome.getName().equals("diagnostico")){
            return remocao.getDiagnostico();
        }
        if(nome.getName().equals("enderecoOrigem")){
            return remocao.getEnderecoOrigem();
        }
        if(nome.getName().equals("cidadeOrigem")){
            return remocao.getCidadeOrigem();
        }
        if(nome.getName().equals("estadoOrigem")){
            return remocao.getEstadoOrigem();
        }
        if(nome.getName().equals("complementoOrigem")){
            return remocao.getComplementoOrigem();
        }
        if(nome.getName().equals("horaOrigem")){
            return remocao.getHoraOrigem();
        }
        if(nome.getName().equals("enderecoDestino")){
            return remocao.getEnderecoDestino();
        }
        if(nome.getName().equals("cidadeDestino")){
            return remocao.getCidadeDestino();
        }
        if(nome.getName().equals("estadoDestino")){
            return remocao.getEstadoDestino();
        }
        if(nome.getName().equals("complementoDestino")){
            return remocao.getComplementoDestino();
        }
        if(nome.getName().equals("medico")){
            return remocao.getMedico();
        }
        if(nome.getName().equals("enfermeiro")){
            return remocao.getEnfermeiro();
        }
        if(nome.getName().equals("motorista")){
            return remocao.getMotorista();
        }
        if(nome.getName().equals("operador")){
            return remocao.getOperador();
        }
        if(nome.getName().equals("ambulancia")){
            return remocao.getAmbulancia();
        }
        if(nome.getName().equals("observacao")){
            return remocao.getObservacao();
        }
        if(nome.getName().equals("responsavel")){
            return remocao.getResponsavel();
        }
        if(nome.getName().equals("unidMedico")){
            return remocao.getUnidMedico();
        }
        
        return null;
    }
    
    
    
    
    
    
}
