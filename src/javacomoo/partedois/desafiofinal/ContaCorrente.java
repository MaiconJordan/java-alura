/*
 * @(#)ContaCorrente.java
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
 * Class ContaCorrente
 *
 * @author maicon.rocha
 */
public class ContaCorrente extends ContaBancaria {

    private double tarifaMensal = 10;

    public void cobrarTarifaMensal() {
        saldo -= tarifaMensal;
        System.out.println("Tarifa mensal de " + tarifaMensal + " cobrada. Saldo atual: " + saldo);
    }




}
