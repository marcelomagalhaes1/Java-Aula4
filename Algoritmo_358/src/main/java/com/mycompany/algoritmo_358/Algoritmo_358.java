/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmo_358;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcelo
 */
public class Algoritmo_358 {

   public static void main(String[] args) {
        
        int A;
        
        Valor preco = new Valor();
        
        for (A = 0; A < 10; A++){
            
            String c =JOptionPane.showInputDialog("Preco de Compra ");
            preco.precocompra[A] =Float.parseFloat(c);
            System.out.println(preco.precocompra[A]);
            
            String v= JOptionPane.showInputDialog("Preco de Venda");
            preco.precovenda[A]= Float.parseFloat(v);
            System.out.println(preco.precovenda[A]);
              
        }
        
        for (A = 0; A < 10; A++){
            
            preco.lucro = (preco.precovenda[A] - preco.precocompra[A]);
            
            if(preco.lucro < 10.0){
                preco.totlucromenor10++;
            }
            else{
                if(preco.lucro <= 20.0){
                    preco.totlucromenor20++;
                }
                else{
                    preco.totlucromaior20++;
                }
            } 
        }
            System.out.println("Total de mercadorias com lucro <10% "+ preco.totlucromenor10);
            System.out.println("Total de mercadorias com 10% <= lucro <=20% "+ preco.totlucromenor20);
            System.out.println("Toal de mercadorias com lucro > 20% " +preco.totlucromaior20);
            
        }
       
    }
