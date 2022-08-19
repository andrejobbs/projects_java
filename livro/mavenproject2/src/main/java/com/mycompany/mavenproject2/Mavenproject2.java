/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject2;


/**
 *
 * @author andre
 */
public class Mavenproject2 {

    public static void main(String[] args) {
        Pessoa [] p =new Pessoa[2];
        
        
        Livro[] l=new Livro[3];
        p[0]=new Pessoa("Andre",21,"M");
        p[1]=new Pessoa("Joao",22,"M");
        
        
        l[0]=new Livro("Homem invisivel","JOSE",500,p[0], false, 0);
        
        
        l[0].abrir();
        l[0].avançarPag();
        l[0].folhear(10);
        l[0].avançarPag();
        p[0].fazerAniver();
        l[0].detalhes();
        
        
    }
}
