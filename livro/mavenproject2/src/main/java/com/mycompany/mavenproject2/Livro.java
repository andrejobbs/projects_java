/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author andre
 */
public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor,boolean aberto,int pagAtual) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.aberto=false;
        this.pagAtual=pagAtual;
        this.leitor=leitor;
        
    }


    

    
    public void detalhes(){
        System.out.println("O titulos do livro: "+this.getTitulo());
        System.out.println("O autor do livro: "+this.getAutor());
        System.out.println("O total de paginas do livro: "+this.getTotalPaginas());
        System.out.println("Pagina atual do livro: "+this.getPagAtual());
        System.out.println("Esta aberto? "+this.getAberto());
        System.out.println("Leitor: "+leitor.getNome());
        System.out.println("Leitor idade: "+leitor.getIdade());
        System.out.println("Leitor sexo: "+leitor.getSexo());
        
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }



    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    @Override
    public void abrir() {
        this.setAberto(true);
        
    }

    @Override
    public void fechar() {
        this.setAberto(false);
        
    }

    @Override
    public void folhear(int p) {
        System.out.println("O livro esta sendo foleado ");
        if (p>this.totalPaginas){
            this.pagAtual=0;
        }else{
            this.pagAtual=p;
        }
        
        
    }

    @Override
    public void avançarPag() {
                this.setPagAtual(this.getPagAtual()+1);
                
                
       
        }
        
   
    
    @Override
    public void voltarPag() {
        
                this.setPagAtual(this.getPagAtual()-1);
                
        }
        
    }

    
    
    

