/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.heranca2;

/**
 *
 * @author andre
 */
public class Heranca2 {

    public static void main(String[] args) {
        Visitante v1=new Visitante();
        Aluno a1=new Aluno();
        a1.setNome("Andre ");
        a1.setMatricula(1112);
        a1.setCurso("Informatica");
        a1.setIdade(17);
        a1.setSexo("M");
        a1.pagarMen();
        
        
        Bolsista b1 =new Bolsista();
        b1.setMatricula(2123);
        b1.setNome("XAblau");
        b1.setBolsa(43f);
        b1.setSexo("M");
        b1.pagarMen();
        
    }
}
