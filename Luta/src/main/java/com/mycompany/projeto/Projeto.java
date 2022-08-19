/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projeto;
/**
 *
 * @author andre
 */
public class Projeto {
    public static void main(String[] args) {
        Lutador l[]= new Lutador[6];        
        l[0]=new Lutador("André","BR",20,1.80f,80f,10,2,3);
        l[1]=new Lutador("João","ES",25,1.71f,85f,20,5,6);
        l[2]=new Lutador("Marcel","EUA",32,1.61f,60f,5,1,3);
        l[3]=new Lutador("Vagner","UK",24,1.72f,70f,12,7,3);
        l[4]=new Lutador("Xablau","BR",54,1.90f,92f,20,10,5);
        Luta UFC=new Luta();
        UFC.marcarLuta(l[4], l[1]);
        UFC.lutar();
        l[0].status();
        
    }

}

