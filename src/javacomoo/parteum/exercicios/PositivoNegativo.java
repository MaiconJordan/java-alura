/*
 * @(#)PositivoNegativo.java
 *
 * Copyright (c) J-Tech Solucoes em Informatica.
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of J-Tech.
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with J-Tech.
 */
package javacomoo.parteum.exercicios;

import java.util.Scanner;

/**
 * Class PositivoNegativo
 *
 * @author maicon.rocha
 */
public class PositivoNegativo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero  e eu direi se ele é positivo ou negativo: ");
        int numero = sc.nextInt();

        if (numero > 0){
            System.out.println(" o " + numero + " é positivo") ;
        } else {
            System.out.println("O numero é negativo");
        }

    }

}
