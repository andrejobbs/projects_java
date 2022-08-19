/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorfismo_animais;

/**
 *
 * @author andre
 */
public class Ave extends Animal {
    private String corPena;

    @Override
    public void locomover() {
        System.out.println("VOANDO");
    }

    @Override
    public void alimentar() {
        System.out.println("COMENDO FRUTAS");
    }

    @Override
    public void emitirSom() {
        System.out.println("EMITINDO SOM DE AVE");
    }
    public void fazerNinho(){
        System.out.println("Fazendo ninho");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
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
