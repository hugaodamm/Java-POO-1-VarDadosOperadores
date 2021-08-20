package com.company.aula4;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

//        int PremioTotal;
//        double ValorTotal;
//        float imposto1;
//        float imposto2;
//        float imposto3;
//
//        ValorTotal = PremioTotal + imposto1;
//        ValorTotal = PremioTotal + imposto1;
//        ValorTotal = PremioTotal + imposto1;

        Scanner entrada  = new Scanner(System.in);

        double valorPremio = entrada.nextDouble();
        double valorImpostos = (2.45d+15d+3d)/100d;
        double total = valorPremio*valorImpostos;
        DecimalFormat df = new DecimalFormat(".##");
        df.setRoundingMode(RoundingMode.CEILING.DOWN);

        System.out.println("Entre o valor do prêmio!");

        System.out.println(df.format(total));



    }
}
