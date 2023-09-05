/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo_351;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcelo
 */
public class Algoritmo_351 {

    public static void main(String[] args) {
        
        int L, num;
        NumeroDaPessoa pessoa = new NumeroDaPessoa();
        
        for (L = 0; L <= 4; L ++){
            pessoa.nome[L] = JOptionPane.showInputDialog("\nnome "+ (L+1)+": ");
            System.out.println("\nnome "+ (L+1)+": "+pessoa.nome[L]);
            
        num = Integer.parseInt(JOptionPane.showInputDialog("\nDigite o numero da pessoa: "));
        
         while(num < 1 || num > 5){
         System.out.println("\nNumero fora do intervalo");           
         num = Integer.parseInt(JOptionPane.showInputDialog("\nDigite o numero da pessoa: "));
        }
         
       System.out.println("\n"+ pessoa.nome[num -1]);
       System.out.println("\n");
    }
}
}
