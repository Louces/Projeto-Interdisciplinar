/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.remocamp.controller;

import br.com.remocamp.dao.FiguraDao;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author fabiano
 */
public class ImagemController {
    
    private File[] files; 
    int ID_PLANTAO;
    private FiguraDao dao = new FiguraDao();

    public ImagemController(File[] files , int ID_PLANTAO) {
        this.files = files;
        this.ID_PLANTAO=ID_PLANTAO;
    }

    public ImagemController(int ID_PLANTAO) {
        this.ID_PLANTAO = ID_PLANTAO;
    }
   
    public void insertImagens(){
        dao.adiciona(files, ID_PLANTAO);
    }
    
    public ArrayList<ImageIcon> getAllImages(){
        return dao.selectImage(ID_PLANTAO);
    }
    
}
