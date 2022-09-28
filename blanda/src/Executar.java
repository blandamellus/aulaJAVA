class Pessoa{
    Double altura = 0.30;
    Double peso;
    String nome = "";
    String porte = "";

    public void andar(){
        System.out.println("Caminha em duas pernas, velocidade 2km/h");
    }
    
    public void correr(Double velocidade){
        System.out.println(this.nome + " está correndo e..ficando sem ar... a uma velocidade " + velocidade);
    }

    public void andar(Double velocidade){
        if (velocidade > 10) {
            this.correr(velocidade);
        }else{
            System.out.println("Caminha apenas em uma velocidade " + velocidade + " km/h");
            System.out.println("E por causa disso tem um porte " + this.porte);
        }        
    }

    public void comer(String comida, String bebida){
        
        System.out.println("mastiga...mastiga...mastiga");
        System.out.println(this.nome + "está comendo " + comida + " e bebendo " + bebida);
    }

    public void pensar(){
        System.out.println(".....pensando....");
    }
}

public class Executar {
    public static void main(String[] args) throws Exception {

        // Inserindo informações nos atrbutos da classe pessoas
        Pessoa serHumano = new Pessoa();
        serHumano.nome = "Blanda Helena";
        serHumano.altura = 1.71;
        serHumano.peso = 60.0;
        serHumano.porte = "sedentaria";
        
        Pessoa alienigena = new Pessoa();
        alienigena.nome = "ET";
        alienigena.altura = 1.20;
        alienigena.peso = 35.0;
        alienigena.porte = "atlético";

        // métodos da classe
        serHumano.pensar();
        serHumano.andar(2.5);
        serHumano.andar();
        // duas instancias utilizando os mesmos métodos e exibindo suas características
        serHumano.comer("Tofu com grão de bico", "mirtilo");
        alienigena.comer("Sorvete de Morango", "Suco");

        serHumano.andar(5.0);
        alienigena.andar(11.5);


    }
}
