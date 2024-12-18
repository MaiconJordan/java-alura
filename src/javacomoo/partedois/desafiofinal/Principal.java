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
package javacomoo.partedois.desafiofinal;

/**
 * Class Principal
 *
 * @author maicon.rocha
 */
public class Principal {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();

        conta.setNumeroConta(123);
        conta.setSaldo(100.0);
        conta.setTitular("Maicon");

        System.out.println(conta.getTitular());
    }

}
