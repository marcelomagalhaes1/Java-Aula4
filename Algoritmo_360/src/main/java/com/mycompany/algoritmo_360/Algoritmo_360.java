/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo_360;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcelo
 */
public class Algoritmo_360 {

    public static void main(String[] args) {
 int data, i, dia, mes;
      
        Valor sign = new Valor();
        
        for( i = 0; i <= 4; i++){
            
            String nome= JOptionPane.showInputDialog("Digite o Signo ");
            sign.signo[i]= nome;
            System.out.println(sign.signo[i]);
            
            String day = JOptionPane.showInputDialog("Digite o ultimo dia ");
            sign.ultdia[i]=Integer.parseInt(day);
        }
        
        data = Integer.parseInt( JOptionPane.showInputDialog("Digite a data no formato ddmm ou 9999 para terminar; "));
        System.out.println(data);
        
        while(data!= 9999){
            dia = data/100;
            mes = data%100;
            mes--;
            
            if (dia> sign.ultdia[mes]){
                 mes = (mes + 1) % 12;   
            }
            
             System.out.println("Signo: " + sign.signo[mes]);
             data = Integer.parseInt(JOptionPane.showInputDialog("\nDigite a data no formato ddmm ou 9999 para terminar: ")); 

            }
        }
    }
