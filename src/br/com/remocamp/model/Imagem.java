/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.remocamp.model;

import java.io.File;

/**
 *
 * @author fabiano
 */
public class Imagem {
    
    private int idFigura;
    private int plantao_IDPlantao;
    private File figura;
    private String nome;
    private int nomeClasse;

    public Imagem(int idFigura, int plantao_IDPlantao, File figura, String nome, int nomeClasse) {
        this.idFigura = idFigura;
        this.plantao_IDPlantao = plantao_IDPlantao;
        this.figura = figura;
        this.nome = nome;
        this.nomeClasse = nomeClasse;
    }

    public int getIdFigura() {
        return idFigura;
    }

    public void setIdFigura(int idFigura) {
        this.idFigura = idFigura;
    }

    public int getPlantao_IDPlantao() {
        return plantao_IDPlantao;
    }

    public void setPlantao_IDPlantao(int plantao_IDPlantao) {
        this.plantao_IDPlantao = plantao_IDPlantao;
    }

    public File getFigura() {
        return figura;
    }

    public void setFigura(File figura) {
        this.figura = figura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNomeClasse() {
        return nomeClasse;
    }

    public void setNomeClasse(int nomeClasse) {
        this.nomeClasse = nomeClasse;
    }
    
}
