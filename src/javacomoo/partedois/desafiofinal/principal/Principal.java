/*
 * @(#)Principal.java
 *
 * Copyright (c) J-Tech Solucoes em Informatica.
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of J-Tech.
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with J-Tech.
 */
package javacomoo.partedois.desafiofinal.principal;

import javacomoo.partedois.desafiofinal.modelos.Musica;
import javacomoo.partedois.desafiofinal.modelos.Podcast;

/**
 * Class Principal
 *
 * @author maicon.rocha
 */
public class Principal {

    public static void main(String[] args) {

        Musica minhMusica = new Musica();
        minhMusica.setTitulo("Forever");
        minhMusica.setCantor("Kiss");

        for (int s = 0; s < 1000; s++) {
            minhMusica.reproduz();
        }

        for (int i = 0; i < 5000; i++) {
            minhMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setApresentador("Junio Master");
        meuPodcast.setTitulo("RedCast");

        for (int i = 0; i < 100; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            meuPodcast.curte();
        }
    }

}
