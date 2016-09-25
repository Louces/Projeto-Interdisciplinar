/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.remocamp.controller;

import br.com.remocamp.dao.FileRemocaoDao;
import java.io.File;

/**
 *
 * @author fabiano
 */
public class FileControllerRemocao {
    private File file; 
    int ID_REMOCAO;
    private FileRemocaoDao dao = new FileRemocaoDao();

    public FileControllerRemocao(File file , int ID_REMOCAO) {
        this.file = file;
        this.ID_REMOCAO=ID_REMOCAO;
    }
    
    public FileControllerRemocao(int ID_PLANTAO) {
        this.ID_REMOCAO = ID_PLANTAO;
    }
   
    public void insertFile(){
        dao.adiciona(file, ID_REMOCAO);
    }
    
    public String getNome(){
        return dao.getName(ID_REMOCAO);
    }
    
    public File getFile(String diretorio){
        return dao.getFile(ID_REMOCAO, diretorio);
    }
    
    public void removeFile(){
        dao.removeFile(ID_REMOCAO);
    }
    
    
}
