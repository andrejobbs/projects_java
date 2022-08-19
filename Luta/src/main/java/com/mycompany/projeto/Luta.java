/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto;

import java.util.Random;

/**
 *
 * @author andre
 */
public class Luta {
    
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria())&& l1!=l2){
            this.aprovada=true;
            this.desafiado=l1;
            this.desafiante=l2;
        }else{
            this.aprovada=false;
            this.desafiado=null;
            this.desafiante=null;
        }
        
    }
    public void lutar(){
        if (this.aprovada){
            System.out.println("_____DESAFIADO_____");
            this.desafiado.apresentar();
            System.out.println("_____DESAFIANTE_____");
            this.desafiante.apresentar();
            Random qualquer=new Random();
            int vencedor=qualquer.nextInt(3);//0=empatar   1=ganhar desafiado   2=ganhar defiante
            System.out.println("__________RESULTADO DA LUTA__________");
            switch (vencedor) {
                case 0 -> {
                    System.out.println("Empatou");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                }
                case 1 -> {
                    System.out.println("DESAFIADO WINS");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                }
                case 2 -> {
                    System.out.println("DESIANTE WINS");
                    this.desafiante.perderLuta();
                    this.desafiado.ganharLuta();
                }
                
            }System.out.println("_______________________");
        }else{
            System.out.println("A luta nao podera acontecer");
        }
        
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
