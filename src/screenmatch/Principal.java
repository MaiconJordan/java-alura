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
package screenmatch;

/**
 * Class Principal
 *
 * @author maicon.rocha
 */
public class Principal {

    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.nome = "Poderoso Chefao";
        meuFilme.anodeLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;

        System.out.println(meuFilme.nome);


    }

}
