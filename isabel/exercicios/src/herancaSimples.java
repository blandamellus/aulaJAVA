class Animal{
    String tipo;
    String cor;
    String tamanho;
    Double peso;
    boolean carnivoro;
    boolean herbivoros;

    
    public void dormir(){
        System.out.println( "dormindo. . . ");
    }
    public void comer(){
        System.out.println ( " comendo. . . ");
    }
}

class Mamifero extends Animal{

    String alimentos;
    String pelos;
    String glandulas;
    String dentes;
} 
    
    class Ave extends Animal {
    String voo;
    String penas;
    String ovo;

    }
    
    class Cachorro extends Mamifero{ 
        String raca;
        boolean bravo; 

        public void latir (){
            System.out.println( "latindo. . .");
        }
        public void parto(){
            System.out.println("Parindo. . .");
        }
    }

    class Gato extends Mamifero{
        String raca;
        String pulo;
        

        public void parto(){
            System.out.println("Parindo. . .");
    }
    }
    class Urubu extends Ave{
    public void voar (){
         System.out.println("voando. . . ");
    }

    }

public class herancaSimples { 
   public static void main(String[] args) {
    Cachorro novoCachorro = new Cachorro ();
    Gato novoGato = new Gato();
    Urubu novoUrubu = new Urubu ();

    novoCachorro.comer();
    novoCachorro.parto();

    novoGato.comer();
    novoGato.parto();

    novoUrubu.comer();
    novoUrubu.voar();



   } 
}
