package src;
public class App {
    public static void main(String[] args) throws Exception {
        Caneta objCaneta= new Caneta();
        objCaneta.cor="Azul";
        objCaneta.ponta=0.7f;
        objCaneta.status();
        objCaneta.corAzul();
        objCaneta.destampada();
        objCaneta.tampaCaneta();
        

        
        Caneta objCaneta2= new Caneta();
        objCaneta2.status();
        objCaneta2.tampada();
        objCaneta2.tampaCaneta();
        
        
    }
}
