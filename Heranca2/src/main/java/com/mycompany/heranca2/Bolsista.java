/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heranca2;

/**
 *
 * @author andre
 */
public class Bolsista extends Aluno{
    private float bolsa;
    
    public void renovarBolsa(){
        System.out.println("Renovando..."+this.getNome());
        
    }
    @Override
    public void pagarMen(){
        System.out.println(this.getNome()+" Pagou a mensalidade");
              //FINAL NAO PODE SER SOBREPOSTO FUTURAMENTE//
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
}
