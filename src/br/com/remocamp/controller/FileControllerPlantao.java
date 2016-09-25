/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.remocamp.controller;

import br.com.remocamp.dao.FilePlantaoDao;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author fabiano
 */
public class FileControllerPlantao {
    
    private File file; 
    int ID_PLANTAO;
    private FilePlantaoDao dao = new FilePlantaoDao();

    public FileControllerPlantao(File file , int ID_PLANTAO) {
        this.file = file;
        this.ID_PLANTAO=ID_PLANTAO;
    }

    public FileControllerPlantao(int ID_PLANTAO) {
        this.ID_PLANTAO = ID_PLANTAO;
    }
   
    public void insertFile(){
        dao.adiciona(file, ID_PLANTAO);
    }
    
    public String getNome(){
        return dao.getName(ID_PLANTAO);
    }
    
    public File getFile(String diretorio){
        return dao.getFile(ID_PLANTAO, diretorio);
    }
    
    public void removeFile(){
        dao.removeFile(ID_PLANTAO);
    }
    
//    public ArrayList<ImageIcon> getAllImages(){
//        return dao.selectImage(ID_PLANTAO);
//    }
    
}
