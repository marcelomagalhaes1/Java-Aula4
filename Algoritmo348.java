/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.imprimemedia;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcelo
 */
public class ImprimeMedia {

    public static void main(String[] args) {
        
        int L;
        Media medias = new Media();
        
        for (L = 0; L <= 4; L++){
            
            medias.nome[L] = JOptionPane.showInputDialog("Digite o "+(L+1)+"º nome: ");
            System.out.println("\nAluno: "+ medias.nome[L]);
            
            medias.pr1[L] = Float.parseFloat(JOptionPane.showInputDialog("Digite a 1ª Nota: "));
            System.out.println("\n1ª Nota: " +medias.pr1[L]);
            
            medias.pr2[L] = Float.parseFloat(JOptionPane.showInputDialog("Digite a 2ª Nota: "));
            System.out.println("\n2ª Nota: " +medias.pr2[L]);
            
            medias.media[L] = (medias.pr1[L] + medias.pr2[L])/ 2;
            
        }
        System.out.println("\n\n\t\tRELACAO FINAL\n");
        
        for (L = 0; L <= 4; L++){
            System.out.println("\n"+ (L+1)+ "º Aluno - "+medias.nome[L]);
            System.out.println("\n 1ª Nota: "+ medias.pr1[L] +"\t 2ª Nota: "+ medias.pr2[L] + "\t Media: "+ medias.media[L]);
        }
        System.out.println("\n");
    }
}
