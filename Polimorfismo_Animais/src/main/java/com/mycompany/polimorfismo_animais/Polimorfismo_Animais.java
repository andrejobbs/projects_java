/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.polimorfismo_animais;

/**
 *
 * @author andre
 */
public class Polimorfismo_Animais {

    public static void main(String[] args) {
        Mamifero m=new Mamifero();
        Reptil r=new Reptil();
        Peixe p= new Peixe();
        Ave a=new Ave();
        Canguru c=new Canguru();
        
        m.setPeso(90);
        m.locomover();
        c.locomover();
        

    }
}
