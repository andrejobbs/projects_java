/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorfismo_animais;

/**
 *
 * @author andre
 */
public class Reptil extends Animal{

    @Override
    public void locomover() {
        System.out.println("RASTEJANDO");
         }

    @Override
    public void alimentar() {
        System.out.println("COMENDO VEGETAIS");
            }

    @Override
    public void emitirSom() {
        System.out.println("EMITINDO SOM DE REPTIL");
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
