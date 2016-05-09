package br.com.remocamp.jrdatasource;

import br.com.remocamp.model.Plantao;
import java.util.Iterator;
import java.util.Vector;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;

public class PlantaoJRDataSource implements JRDataSource {

    private Iterator<Plantao> iterator;
    private Plantao cursor;

    public PlantaoJRDataSource(Vector<Plantao> plantao) {
        super();
        iterator = plantao.iterator();
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
        Plantao plantao = cursor;
        
        if (nome.getName().equals("nomeEvento")) {
            return plantao.getNomeEvento();
        }
        if (nome.getName().equals("inicio")) {
            return plantao.getInicio();
        }
        if (nome.getName().equals("fim")) {
            return plantao.getFim();
        }
        if (nome.getName().equals("responsavel")) {
            return plantao.getResponsavel();
        }
        if (nome.getName().equals("endereco")) {
            return plantao.getEndereco();
        }
        if (nome.getName().equals("cidade")) {
            return plantao.getCidade();
        }
        if (nome.getName().equals("estado")) {
            return plantao.getEstado();
        }
        if (nome.getName().equals("complemento")) {
            return plantao.getComplemento();
        }
        if (nome.getName().equals("medico")) {
            return plantao.getMedico();
        }
        if (nome.getName().equals("enfermeiro")) {
            return plantao.getEnfermeiro();
        }
        if (nome.getName().equals("motorista")) {
            return plantao.getMotorista();
        }
        if (nome.getName().equals("ambulancia")) {
            return plantao.getAmbulancia();
        }
        if (nome.getName().equals("operador")) {
            return plantao.getOperador();
        }
        if (nome.getName().equals("observacao")) {
            return plantao.getObservacao();
        }
        return null;
    }

}
