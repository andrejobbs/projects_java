/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorfismo_animais;

/**
 *
 * @author andre
 */
public class Peixe extends Animal {
    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("NADANDO");
          }

    @Override
    public void alimentar() {
        System.out.println("COMENDO SUBSTANCIAS");
            }

    @Override
    public void emitirSom() {
        System.out.println("PEIXE NÃO EMITE SOM");
           }
    
    public void soltarBolha(){
        System.out.println("Soltando bolhas");
        
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
    
}
