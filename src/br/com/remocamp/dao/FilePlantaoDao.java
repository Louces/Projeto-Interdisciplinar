/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.remocamp.dao;

import br.com.remocamp.jdbc.ConnectionFactory;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fabiano
 */
public class FilePlantaoDao {
    
    private Connection connection;
    private PreparedStatement stmt;

    public FilePlantaoDao() {
     setConnection(new ConnectionFactory().getConnection());   
    }
    
     public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
    
    public void adiciona(File file, int ID_PLANTAO) {
            removeFile(ID_PLANTAO);
            String sql = "insert into filePlantao(fileLongBlob , nome, plantao_IDPLANTAO) values (?,?,?)";
            
//            if(file.length() <= 65535){
//                sql = "insert into filePlantao(fileTinyBlob , nome, plantao_IDPLANTAO) values (?,?,?)";
//            }else if(file.length() > 65535 && file.length()<= 16777215 ){
//                sql = "insert into filePlantao(fileMedium , nome, plantao_IDPLANTAO) values (?,?,?)";
//            }else{
//                sql = "insert into filePlantao(fileLongBlob , nome, plantao_IDPLANTAO) values (?,?,?)";
//            }
          try {
                // prepared statement para inserção
                stmt = getConnection().prepareStatement(sql);
                
                InputStream is = new FileInputStream(file);
                
                byte[] bytes = new byte[(int) file.length()];
                int offset = 0;
                int numRead = 0;
                while (offset < bytes.length && (numRead = is.read(bytes, offset, bytes.length - offset)) >= 0) {
                    offset += numRead;
                }
                
                int j=0;
                stmt.setBytes(++j,bytes);
                stmt.setString(++j,file.getName());
                stmt.setString(++j,ID_PLANTAO+"");
                stmt.execute();
                stmt.close();

            } catch (SQLException e) {
                throw new RuntimeException(e);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(FilePlantaoDao.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(FilePlantaoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
    
    public void removeFile(int ID_PLANTAO){
        String sql = "delete from filePlantao where plantao_IDPLANTAO = ?";
         
        try {
            // prepared statement para inserção
            stmt = getConnection().prepareStatement(sql);
            stmt.setString(1,ID_PLANTAO+"");
            stmt.execute();
            stmt.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(FilePlantaoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String getName(int ID_PLANTAO){
        String sql = "select * from filePlantao where plantao_IDPLANTAO = ?";
        String nome = "";
        try {
            stmt = getConnection().prepareStatement(sql);
            stmt.setString(1, ID_PLANTAO+"");
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                nome+=rs.getString("nome");
            }
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(FilePlantaoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return nome;
    }
    
    public File getFile(int ID_PLANTAO, String diretorio){
        String sql = "select * from filePlantao where plantao_IDPLANTAO = ?";
        
        File file = new File(diretorio+"\\"+getName(ID_PLANTAO));
        
        
        try {
            stmt = getConnection().prepareStatement(sql);
            stmt.setString(1, ID_PLANTAO+"");
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                 byte[] bytes = rs.getBytes("fileLongBlob");
                
                 try {
                    BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));
                    bos.write(bytes); 
                    bos.close();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(FilePlantaoDao.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(FilePlantaoDao.class.getName()).log(Level.SEVERE, null, ex);
                }
                 
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(FilePlantaoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        return  file;
    }
    
}
