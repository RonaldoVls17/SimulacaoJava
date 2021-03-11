/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulaçãomundoreal;

/**
 *
 * @author Pc
 */
public class Torcedor extends Pessoa {
    String time;
    
    public void Campeao(String time, String nome){
        Torcedor torcedor = new Torcedor();
        if (time.contains ("Palmeiras")) {
            System.out.println("Parabéns "+ nome +"! Você é o Atual Campeão de TUDO este Ano!");
        }
        else{
            System.out.println("Que Pena "+ nome +"! Não ganhou nada este ano! Mas pode fazer a piadinha que Palmeiras não tem mundial!");
        }
    }
}