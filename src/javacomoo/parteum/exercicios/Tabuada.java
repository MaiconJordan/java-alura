/*
 * @(#)Tabuada.java
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
 * Class Tabuada
 *
 * @author maicon.rocha
 */
public class Tabuada {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero  e eu mostrarei sua tabuada de 1 a 10: ");
        int numero = sc.nextInt();

        int contador = 1;

        while (contador <= 10){

            System.out.println(numero + " + " + contador + " = " + (numero + contador));
            contador++;
        }


    }

}
