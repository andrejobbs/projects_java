/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luta;

/**
 *
 * @author andre
 */
public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso,  int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    Lutador() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
    

    public String getNome(/**
 *
 * @author andre
 */) {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public final void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    /**
     *
     */
    public void setCategoria() {
        if (peso<52.2f){
            categoria= "Invalido";
        }
        else if(peso<=70.3f){
            categoria="Leve";
        }
        else if(peso<=83.9f){
            categoria="Medio";
            
        }
        else if (peso<=120.2){
            categoria="Pesado";
            
        }
        else{
            System.out.println("Invalido");
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    public void apresentar(){
        System.out.println("Nome do lutador "+this.getNome());
        System.out.println("Nacionalidade "+this.getNacionalidade());
        System.out.println("Idade "+ this.getIdade());
        System.out.println("Altura "+this.getAltura());
        System.out.println("Peso "+this.getPeso());
        System.out.println("Vitorias "+this.getVitorias());
        System.out.println("Derrotas "+this.getDerrotas());
        System.out.println("Empates "+this.getEmpates());
    }
    public void status(){
        System.out.println(this.getNome());
        System.out.println("Peso  "+this.getCategoria());
        System.out.println(getVitorias()+" Vitorias");
        System.out.println(getDerrotas()+" Derrotas");
        System.out.println(getEmpates()+" Empate");
        
    }
    public void ganharLuta(){
        setVitorias(getVitorias()+1);
        
    }
    public void perderLuta(){
        setDerrotas(getDerrotas()+1);
        
    }
    public void empatarLuta(){
        setEmpates(getEmpates()+1);
        
    }
    
}

