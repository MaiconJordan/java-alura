/*
 * @(#)Audio.java
 *
 * Copyright (c) J-Tech Solucoes em Informatica.
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of J-Tech.
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with J-Tech.
 */
package javacomoo.partedois.desafiofinal.modelos;

/**
 * Class Audio
 *
 * @author maicon.rocha
 */
public class Audio {

    private String titulo;
    private int totalReproducoes;
    private int totalCurtidas;
    private int classifacao;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }
    public int getTotalCurtidas() {
        return totalCurtidas;
    }
    public double getClassifacao() {
        return classifacao;
    }

    public void curte(){
        this.totalCurtidas++;
    }

    public void reproduz(){
        this.totalReproducoes++;
    }
}
