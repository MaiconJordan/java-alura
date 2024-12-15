/*
 * @(#)ContaBanco.java
 *
 * Copyright (c) J-Tech Solucoes em Informatica.
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of J-Tech.
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with J-Tech.
 */
package javacomoo.parteum.desafiofinal;

import java.util.Scanner;

/**
 * Class ContaBanco
 *
 * @author maicon.rocha
 */
public class ContaBanco {

    public static void main(String[] args) {
        String dadosIniciais = """
                    *****************************************
                    Dados Iniciais do Cliente:
                    
                    
                    Nome:           Maicon Jordan S Rocha
                    Tipo conta:     Corrente
                    Saldo Inicial:  R$ 2500,00
                    *****************************************
            """;


        String operacoes = """
                    Operações
                    
                    1 - Consultar Saldo
                    2 - Receber Valor
                    3 - Transferir Valor
                    4 - Sair
                
                """;

        System.out.println(dadosIniciais);
        System.out.println(operacoes);

        Scanner sc = new Scanner(System.in);
        int opcao = 0;



        double saldo = 2500.00;

        while (opcao != 4){
            System.out.println("Digite a opção desejada:");
            opcao = sc.nextInt();

            if (opcao > 3){
                System.out.println("Opção invalida \n");
            }

            if(opcao == 1){
                System.out.println(saldo);
            } else if (opcao == 2) {
                System.out.println("Digite o valor para depositar");
                double valorDepositado = sc.nextDouble();
                saldo += valorDepositado;

            } else if (opcao == 3) {
                System.out.println("Digite o valor que voce quer transferir:");
                double valorTransferido = sc.nextDouble();
                saldo -= valorTransferido;
            }

        }


        sc.close();

    }


}
