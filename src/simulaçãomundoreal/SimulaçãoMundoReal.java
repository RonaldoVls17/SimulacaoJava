/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulaçãomundoreal;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class SimulaçãoMundoReal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Torcedor torcedor = new Torcedor();
       Scanner input = new Scanner(System.in);
       String continua = "S";
       while("S".equals(continua)){
            System.out.println("Olá, Qual o seu nome?");
            torcedor.nome = input.nextLine();
            
             System.out.println(" Qual o seu sobrenome?");
            torcedor.sobrenome = input.nextLine();
            
             System.out.println(" Qual time você torce?");
            torcedor.time = input.nextLine();
            
            torcedor.Campeao(torcedor.time, torcedor.nome);
            
             System.out.println(" Deseja continuar o Papo? R:'S' ou 'N'");
             continua = input.nextLine();
       }
      
    }
    
}
