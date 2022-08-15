package src;


public class Caneta {
    String modelo,cor;
    float ponta;
    boolean tampa;

    void informacoesCaneta(){
        System.out.println("A cor é "+this.cor+" O modelo é "+this.modelo+" O tipo da ponta é "+this.ponta);
    }

    void status(){
        System.out.println(this.cor);
        System.out.println(this.modelo);
        System.out.println(this.ponta);
    }

    void corAzul(){
        if (this.cor=="Azul"){
            System.out.println("A caneta é Azul");
        }
            else { System.out.println("Caneta qualquer");
                
            }
        

    }
    void tampaCaneta(){
        if (this.tampa==true){
            System.out.println("Nao estou escrevendo...");
        }
            else if (this.tampa==false){
                System.out.println("Estou escrevendo...");
            }
        }
        void tampada(){
            this.tampa=true;
        }
        void destampada(){
            this.tampa=false;
        }
    }

