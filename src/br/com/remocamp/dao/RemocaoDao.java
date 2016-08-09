/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.remocamp.dao;

import br.com.remocamp.jdbc.ConnectionFactory;
import br.com.remocamp.model.Remocao;
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
public class RemocaoDao {
    
    private Connection connection;
    private PreparedStatement stmt;
    private ArrayList<Remocao> remocoes = new ArrayList<>();

    public RemocaoDao() {
         setConnection(new ConnectionFactory().getConnection());
    }
    
    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
    
    public ArrayList<Remocao> getRemocoes() {
        return remocoes;
    }
    
    public void adiciona(Remocao remocao) {

        String sql = "insert into remocao"
                + "(NOME,"
                + "IDADE,"
                + "VAGACONFIRMADA,"
                + "DATASOLICITACAO,"
                + "DATAREMOCAO,"
                + "DIAGNOSTICO,"
                + "ENDERECOORIGEM,"
                + "CIDADEORIGEM,"
                + "ESTADOORIGEM,"
                + "COMPLEMENTOORIGEM,"
                + "HORAORIGEM,"
                + "ENDERECODESTINO,"
                + "CIDADEDESTINO,"
                + "ESTADODESTINO,"
                + "COMPLEMENTODESTINO,"
                + "MEDICO,"
                + "ENFERMEIRO,"
                + "MOTORISTA,"
                + "OPERADOR,"
                + "AMBULANCIA,"
                + "OBSERVACAO,"
                + "RESPONSAVEL,"
                + "UNIDADEMEDICO)"
                
                + " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
         try {
         // prepared statement para inserção
         stmt = getConnection().prepareStatement(sql);
 
            adicionaStmt(remocao);
            
     } catch (SQLException e) {
         throw new RuntimeException(e);
     }

    }
    
    private void adicionaStmt(Remocao remocao) throws SQLException {
        // seta os valores
        int i=0;
        stmt.setString(++i, remocao.getNome());
        stmt.setString(++i, remocao.getIdade());
        stmt.setString(++i, remocao.getVagaConfirmada());
        stmt.setString(++i, remocao.getDataSolicitacao()+"");
        stmt.setString(++i, remocao.getDataRemocao()+"");
        stmt.setString(++i, remocao.getDiagnostico());
        stmt.setString(++i, remocao.getEnderecoOrigem());
        stmt.setString(++i, remocao.getCidadeOrigem());
        stmt.setString(++i, remocao.getEstadoOrigem());
        stmt.setString(++i, remocao.getComplementoOrigem());
        stmt.setString(++i, remocao.getHoraOrigem());
        stmt.setString(++i, remocao.getEnderecoDestino());
        stmt.setString(++i, remocao.getCidadeDestino());
        stmt.setString(++i, remocao.getEstadoDestino());
        stmt.setString(++i, remocao.getComplementoDestino());
        stmt.setString(++i, remocao.getMedico());
        stmt.setString(++i, remocao.getEnfermeiro());
        stmt.setString(++i, remocao.getMotorista());
        stmt.setString(++i, remocao.getOperador());
        stmt.setString(++i, remocao.getAmbulancia());
        stmt.setString(++i, remocao.getObservacao());
        stmt.setString(++i, remocao.getResponsavel());
        stmt.setString(++i, remocao.getUnidMedico());
        // executa
        stmt.execute();
        stmt.close();
    }

    public void consultaAllTableRemocao() {
        String sql = "select * from remocao ORDER BY ID_PACIENTE DESC";
        
        try {
            stmt = getConnection().prepareStatement(sql);
            
            ResultSet rs = stmt.executeQuery();
            remocoes.clear();
             while (rs.next()) {
                 Remocao remocao = new Remocao();
                 remocao.setIdRemocao(rs.getInt("ID_PACIENTE"));
                 remocao.setNome(rs.getString("NOME"));
                 remocao.setDataRemocao(rs.getDate("DATAREMOCAO"));
                 remocoes.add(remocao);
             }
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void consultaNome(String nome) { 
        String sql = "SELECT * FROM remocao WHERE LOWER(NOME) LIKE ?";

        try {
            stmt = getConnection().prepareStatement(sql);
            stmt.setString(1, "%" + nome + "%");

            ResultSet rs = stmt.executeQuery();
            remocoes.clear();
            while (rs.next()) {
                Remocao remocao = new Remocao();
                remocao.setIdRemocao(rs.getInt("ID_PACIENTE"));
                remocao.setNome(rs.getString("NOME"));
                remocao.setDataRemocao(rs.getDate("DATAREMOCAO"));
                remocoes.add(remocao);
            }
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void consultaEntreDatas(java.sql.Date inicio, java.sql.Date fim){
        String sql ="SELECT * FROM remocao WHERE DATAREMOCAO >= ? AND DATAREMOCAO <= ?";
        
        try {
            stmt = getConnection().prepareStatement(sql);
            stmt.setString(1,inicio+"");
            stmt.setString(2,fim+"");
            
            ResultSet rs = stmt.executeQuery();
            remocoes.clear();
            while(rs.next()){
                Remocao remocao = new Remocao();
                remocao.setIdRemocao(rs.getInt("ID_PACIENTE"));
                remocao.setNome(rs.getString("NOME"));
                remocao.setDataRemocao(rs.getDate("DATAREMOCAO"));
                remocoes.add(remocao);
            }
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void consultaEntreDatasComNome(java.sql.Date inicio, java.sql.Date fim, String nome) {
        String sql = "SELECT * FROM remocao WHERE (DATAREMOCAO >= ? AND DATAREMOCAO <= ?) AND LOWER(NOME) LIKE ?";

        try {
            stmt = getConnection().prepareStatement(sql);
            stmt.setString(1, inicio + "");
            stmt.setString(2, fim + "");
            stmt.setString(3, "%" + nome + "%");

            ResultSet rs = stmt.executeQuery();
            remocoes.clear();
            while (rs.next()) {
                Remocao remocao = new Remocao();
                remocao.setIdRemocao(rs.getInt("ID_PACIENTE"));
                remocao.setNome(rs.getString("NOME"));
                remocao.setDataRemocao(rs.getDate("DATAREMOCAO"));
                remocoes.add(remocao);
            }
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Remocao consultaRemocao(int i) {
        String sql = "select * from remocao where ID_PACIENTE = ?";
        Remocao remocao = new Remocao();
        
        try {
            stmt = getConnection().prepareStatement(sql);
            stmt.setString(1,i+"");
            
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                remocao.setIdRemocao(rs.getInt("ID_PACIENTE"));
                remocao.setNome(rs.getString("NOME"));
                remocao.setIdade(rs.getString("IDADE"));
                remocao.setVagaConfirmada(rs.getString("VAGACONFIRMADA"));
                remocao.setDataSolicitacao(rs.getDate("DATASOLICITACAO"));
                remocao.setDataRemocao(rs.getDate("DATAREMOCAO"));
                remocao.setDiagnostico(rs.getString("DIAGNOSTICO"));
                remocao.setEnderecoOrigem(rs.getString("ENDERECOORIGEM"));
                remocao.setCidadeOrigem(rs.getString("CIDADEORIGEM"));
                remocao.setEstadoOrigem(rs.getString("ESTADOORIGEM"));
                remocao.setComplementoOrigem(rs.getString("COMPLEMENTOORIGEM"));
                remocao.setHoraOrigem(rs.getString("HORAORIGEM"));
                remocao.setEnderecoDestino(rs.getString("ENDERECODESTINO"));
                remocao.setCidadeDestino(rs.getString("CIDADEDESTINO"));
                remocao.setEstadoDestino(rs.getString("ESTADODESTINO"));
                remocao.setComplementoDestino(rs.getString("COMPLEMENTODESTINO"));
                remocao.setMedico(rs.getString("MEDICO"));
                remocao.setEnfermeiro(rs.getString("ENFERMEIRO"));
                remocao.setMotorista(rs.getString("MOTORISTA"));
                remocao.setOperador(rs.getString("OPERADOR"));
                remocao.setAmbulancia(rs.getString("AMBULANCIA"));
                remocao.setObservacao(rs.getString("OBSERVACAO"));
                remocao.setResponsavel(rs.getString("RESPONSAVEL"));
                remocao.setUnidMedico(rs.getString("UNIDADEMEDICO"));
            }
        stmt.close();    
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
      return remocao;
    }

    public Remocao alteraPlantao(Remocao remocao, int i) {
         String sql = "update remocao set "
                        + "NOME=?, "
                        + "IDADE=?, "
                        + "VAGACONFIRMADA=?, "
                        + "DATASOLICITACAO=?, "
                        + "DATAREMOCAO=?, "
                        + "DIAGNOSTICO=?, "
                        + "ENDERECOORIGEM=?, "
                        + "CIDADEORIGEM=?, "
                        + "ESTADOORIGEM=?, "
                        + "COMPLEMENTOORIGEM=?, "
                        + "HORAORIGEM=?, "
                        + "ENDERECODESTINO=?, "
                        + "CIDADEDESTINO=?, "
                        + "ESTADODESTINO=?, "
                        + "COMPLEMENTODESTINO=?, "
                        + "MEDICO=?, "
                        + "ENFERMEIRO=?, "
                        + "MOTORISTA=?, "
                        + "OPERADOR=?, "
                        + "AMBULANCIA=?, "
                        + "OBSERVACAO=?, "
                        + "RESPONSAVEL=?, "
                        + "UNIDADEMEDICO=? "
                 +"where ID_PACIENTE=?";
         
        try {
            int j=0;
            stmt = getConnection().prepareStatement(sql);
            stmt.setString(++j, remocao.getNome());
            stmt.setString(++j, remocao.getIdade());
            stmt.setString(++j, remocao.getVagaConfirmada());
            stmt.setString(++j, remocao.getDataSolicitacao()+"");
            stmt.setString(++j, remocao.getDataRemocao()+"");
            stmt.setString(++j, remocao.getDiagnostico());
            stmt.setString(++j, remocao.getEnderecoOrigem());
            stmt.setString(++j, remocao.getCidadeOrigem());
            stmt.setString(++j, remocao.getEstadoOrigem());
            stmt.setString(++j, remocao.getComplementoOrigem());
            stmt.setString(++j, remocao.getHoraOrigem());
            stmt.setString(++j, remocao.getEnderecoDestino());
            stmt.setString(++j, remocao.getCidadeDestino());
            stmt.setString(++j, remocao.getEstadoDestino());
            stmt.setString(++j, remocao.getComplementoDestino());
            stmt.setString(++j, remocao.getMedico());
            stmt.setString(++j, remocao.getEnfermeiro());
            stmt.setString(++j, remocao.getMotorista());
            stmt.setString(++j, remocao.getOperador());
            stmt.setString(++j, remocao.getAmbulancia());
            stmt.setString(++j, remocao.getObservacao());
            stmt.setString(++j, remocao.getResponsavel());
            stmt.setString(++j, remocao.getUnidMedico());
            stmt.setString(++j, i+"");
            // executa
            stmt.execute();
            stmt.close();
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return  remocao;
    }
    
    public void setHistorico(String historico,int numero){
        String sql = "update remocao set historico = ? where id_Paciente = ?";
        
        try {
            stmt = getConnection().prepareStatement(sql);
            stmt.setString(1, historico);
            stmt.setString(2, numero+"");
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(PlantaoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public String getHistorico(int numero){
        String sql = "select historico from remocao where id_Paciente = ?";
        String out = null;
        
        try {
            stmt = getConnection().prepareStatement(sql);
            stmt.setString(1, numero +" ");
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                out = rs.getString("historico");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(PlantaoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return out;
    }
    
}

