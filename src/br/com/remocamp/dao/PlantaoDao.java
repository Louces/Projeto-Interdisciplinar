package br.com.remocamp.dao;

import br.com.remocamp.jdbc.ConnectionFactory;
import br.com.remocamp.model.Plantao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PlantaoDao {

    private final Connection connection;
    private PreparedStatement stmt;
    private ArrayList<Plantao> plantoes = new ArrayList<>();

    public PlantaoDao() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public ArrayList<Plantao> getPlantoes() {
        return plantoes;
    }

    public void adiciona(Plantao plantao) {

        String sql = "insert into plantao"
                + "(nomeEvento,dataInicio,dataFim,reponsavel,endereco,cidade,estado,complemento,medico,enfermeiro,motorista,operador,ambulancia,observacao)"
                + " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
         try {
         // prepared statement para inserção
         stmt = connection.prepareStatement(sql);
 
         // seta os valores
         int i=0;
         stmt.setString(++i,plantao.getNomeEvento());
         stmt.setString(++i,plantao.getInicio()+"");
         stmt.setString(++i,plantao.getFim()+"");
         stmt.setString(++i,plantao.getResponsavel());
         stmt.setString(++i,plantao.getEndereco());
         stmt.setString(++i,plantao.getCidade());
         stmt.setString(++i,plantao.getEstado());
         stmt.setString(++i,plantao.getComplemento());
         stmt.setString(++i,plantao.getMedico());
         stmt.setString(++i,plantao.getEnfermeiro());
         stmt.setString(++i,plantao.getMotorista());
         stmt.setString(++i,plantao.getOperador());
         stmt.setString(++i,plantao.getAmbulancia());
         stmt.setString(++i,plantao.getObservacao());
         
         System.out.println(sql);
        // executa
         stmt.execute();
         stmt.close();
     } catch (SQLException e) {
         throw new RuntimeException(e);
     }

    }
    
    public void consultaAllTablePlantao() {

        String sql = "select * from plantao";
        
        try {
            // prepared statement para consulta
            stmt = connection.prepareStatement(sql);
 
            // executa um select
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                Plantao plantao = new Plantao();
                plantao.setIdPlantao(rs.getInt("idPlantao"));
                plantao.setNomeEvento(rs.getString("nomeEvento"));
                plantao.setInicio(rs.getDate("dataInicio"));
                plantao.setFim(rs.getDate("dataFim"));
                plantoes.add(plantao);
            }   
           
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    
    public Plantao consultaPlantao(int i) {

        String sql = "select * from plantao where idPlantao = ?";
        Plantao plantao = new Plantao();
        try {
            // prepared statement para consulta
            stmt = connection.prepareStatement(sql);
            stmt.setString(1,i+"");
            // executa um select
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                plantao.setIdPlantao(rs.getInt("idPlantao"));
                plantao.setNomeEvento(rs.getString("nomeEvento"));
                plantao.setInicio(rs.getDate("dataInicio"));
                plantao.setFim(rs.getDate("dataFim"));
            }
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return plantao;
    }
}
