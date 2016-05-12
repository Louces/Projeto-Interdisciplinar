package br.com.remocamp.dao;

import br.com.remocamp.jdbc.ConnectionFactory;
import br.com.remocamp.model.Plantao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PlantaoDao {

    private Connection connection;
    private PreparedStatement stmt;
    private ArrayList<Plantao> plantoes = new ArrayList<>();

    public PlantaoDao() {
        setConnection(new ConnectionFactory().getConnection());
    }
    
    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public ArrayList<Plantao> getPlantoes() {
        return plantoes;
    }

    public void adiciona(Plantao plantao) {

        String sql = "insert into plantao"
                + "(nomeEvento,dataInicio,dataFim,responsavel,endereco,cidade,estado,complemento,medico,enfermeiro,motorista,operador,ambulancia,observacao)"
                + " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
         try {
         // prepared statement para inserção
         stmt = getConnection().prepareStatement(sql);
 
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
            stmt = getConnection().prepareStatement(sql);
 
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
            stmt = getConnection().prepareStatement(sql);
            int j=0;
            stmt.setString(1,i+"");
            
            // executa um select
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                plantao.setIdPlantao(rs.getInt("idPlantao"));
                plantao.setNomeEvento(rs.getString("nomeEvento"));
                plantao.setInicio(rs.getDate("dataInicio"));
                plantao.setFim(rs.getDate("dataFim"));
                plantao.setResponsavel(rs.getString("responsavel"));
                plantao.setEndereco(rs.getString("endereco"));
                plantao.setCidade(rs.getString("cidade"));
                plantao.setEstado(rs.getString("estado"));
                plantao.setComplemento(rs.getString("complemento"));
                plantao.setMedico(rs.getString("medico"));
                plantao.setEnfermeiro(rs.getString("enfermeiro"));
                plantao.setMotorista(rs.getString("motorista"));
                plantao.setOperador(rs.getString("operador"));
                plantao.setAmbulancia(rs.getString("ambulancia"));
                plantao.setObservacao(rs.getString("observacao"));
            }
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return plantao;
    }
    
    public Plantao alteraPlantao(Plantao plantao,int i){
         String sql = "update plantao set "
                       +"nomeEvento=?, "
                       +"dataInicio=?, "
                       +"dataFim=?, "
                       +"responsavel=?, "
                       +"endereco=?, "
                       +"cidade=?, "
                       +"estado=?, "
                       +"complemento=?, "
                       +"medico=?, "
                       +"enfermeiro=?, "
                       +"motorista=?, "
                       +"operador=?, "
                       +"ambulancia=?, "
                       +"observacao=? "
                 +"where idPlantao=?";
     
         try {
            // prepared statement para consulta
            int j=0;
            stmt = getConnection().prepareStatement(sql);
            stmt.setString(++j,plantao.getNomeEvento());
            stmt.setString(++j,plantao.getInicio()+"");
            stmt.setString(++j,plantao.getFim()+"");
            stmt.setString(++j,plantao.getResponsavel());
            stmt.setString(++j,plantao.getEndereco());
            stmt.setString(++j,plantao.getCidade());
            stmt.setString(++j,plantao.getEstado());
            stmt.setString(++j,plantao.getComplemento());
            stmt.setString(++j,plantao.getMedico());
            stmt.setString(++j,plantao.getEnfermeiro());
            stmt.setString(++j,plantao.getMotorista());
            stmt.setString(++j,plantao.getOperador());
            stmt.setString(++j,plantao.getAmbulancia());
            stmt.setString(++j,plantao.getObservacao());
            stmt.setString(++j,i+"");
            // executa um update
            stmt.execute();
            stmt.close();
            
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return plantao;
         
    }
}
