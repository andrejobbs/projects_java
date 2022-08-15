package Src;

public class Monitor {
    public float tamanho;
    public String marca;
    private String entrada_video;
    private boolean tomada;

   public void monitorStatus(){
        System.out.println(" "+this.tamanho+" "+this.marca+" "+this.entrada_video);
        System.out.println("Esta ligado: "+tomada);


    }

    protected void monitorLigado(){
        this.tomada=true;
    }
    protected void monitorDesligado(){
        this.tomada=false;
    }
    protected void statusTomada(){
        if(tomada==true){
            System.out.println("A tela esta ligada, logo esta transmitindo imagem");

        }
        else if(tomada==false){
            System.out.println("A tela não esta desligada, logo não esta transmitindo imagem");
        }
    }

    
}
