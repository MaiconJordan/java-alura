/*
 * @(#)Podcast.java
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
 * Class Podcast
 *
 * @author maicon.rocha
 */
public class Podcast {

    private String apresentador;
    private  String descricao;

    public String getApresentador() {
        return apresentador;
    }
    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
