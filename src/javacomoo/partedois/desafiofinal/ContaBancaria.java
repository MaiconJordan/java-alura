/*
 * @(#)ContaBancaria.java
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
 * Class ContaBancaria
 *
 * @author maicon.rocha
 */
public class ContaBancaria {


    protected double saldo;



    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valorSaque){
        this.saldo -= valorSaque;
    }

    public void consultarSaldo(){
        System.out.println(this.saldo);
    }


}
