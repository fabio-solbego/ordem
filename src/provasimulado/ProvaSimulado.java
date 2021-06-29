/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provasimulado;

import java.util.Scanner;

/**
 *
 * @author Computador
 */
public class ProvaSimulado {

    public static void main(String[] args) {
     
           double num, acum;
        int cont, quant;
        acum = 0;
        Scanner ler = new Scanner(System.in);
        System.out.println("Quantos números você deseja ler?");
        quant = ler.nextInt();

        for (cont = 0; cont < quant; cont++) {
            System.out.println("informe o " + (cont + 1) + "º valor:");
            num = ler.nextInt();
            acum = acum + num;
        }//fim do loop
        System.out.println("A média dos números lido é " + (acum / cont));
        
        
    }
    
}
