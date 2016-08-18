/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.remocamp.dao;

import br.com.remocamp.jdbc.ConnectionFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author fabiano
 */
public class FiguraDao {
    
    private Connection connection;
    private PreparedStatement stmt;

    public FiguraDao() {
     setConnection(new ConnectionFactory().getConnection());   
    }
    
     public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
    
    public void adiciona(File[] files, int ID_PLANTAO) {

        for (int i = 0; i < files.length; i++) {
            String sql = "insert into figura(imagem , nome, plantao_IDPLANTAO) values (?,?,?)";

            try {
                // prepared statement para inserção
                stmt = getConnection().prepareStatement(sql);
                
                InputStream is = new FileInputStream(files[i]);
                
                byte[] bytes = new byte[(int) files[i].length()];
                int offset = 0;
                int numRead = 0;
                while (offset < bytes.length
                        && (numRead = is.read(bytes, offset, bytes.length - offset)) >= 0) {
                    offset += numRead;
                }
                
                int j=0;
                stmt.setBytes(++j,bytes);
                stmt.setString(++j,files[i].getName());
                stmt.setString(++j,ID_PLANTAO+"");
                stmt.execute();
                stmt.close();

            } catch (SQLException e) {
                throw new RuntimeException(e);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(FiguraDao.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(FiguraDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public ArrayList<ImageIcon> selectImage(int ID_PLANTAO){
        String sql = "select imagem from figura where plantao_IDPlantao = ? order by nome ASC";
        
        ArrayList<ImageIcon> imagens = new ArrayList<>();
        
        try {
            stmt = getConnection().prepareStatement(sql);
            stmt.setString(1, ID_PLANTAO+"");
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                 byte[] img = rs.getBytes("imagem");
                 ImageIcon image = new ImageIcon(img);
                 imagens.add(image);
            }
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(FiguraDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return imagens;
    }
    
}
