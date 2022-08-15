package Src;

public class App {
    public static void main(String[] args) throws Exception {
        Monitor monitor1=new Monitor();
        monitor1.marca="Acer";
        monitor1.tamanho=22f;
      
        monitor1.monitorLigado();
        monitor1.monitorStatus();
        monitor1.statusTomada();

        
    }
}
