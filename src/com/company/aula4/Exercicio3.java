package com.company.aula4;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        //Corrigido
        Scanner teclado = new Scanner(System.in);

        int DiasTrabalhados = teclado.nextInt();
        int ValorFixo = 2;

        int total = DiasTrabalhados * ValorFixo;

        System.out.println("Digite o número de dias da campanha: $" + total);

    }
}
