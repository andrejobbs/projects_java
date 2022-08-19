/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.heranca;

/**
 *
 * @author andre
 */
public class Heranca {

    public static void main(String[] args) {
        Pessoa p1=new Pessoa();
        Aluno  p2=new Aluno();
        Professor p3=new Professor();
        Funcionario p4=new Funcionario();
        
        p1.setNome("André");
        p2.setNome("JOAO");
        p3.setNome("MARIA");
        p4.setNome("CARLA");
        
        p1.setSexo("M");
        p2.setSexo("M");
        p3.setSexo("F");
        p4.setSexo("F");
        
        
        p1.setIdade(12);
        p2.setIdade(14);
        p2.setIdade(40);
        p3.setIdade(44);
        p4.setIdade(50);
        
        
        p2.setCurso("Informatica");
        p3.setSalario(2500f);
        p4.setSetor("Escritorio");
        
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
