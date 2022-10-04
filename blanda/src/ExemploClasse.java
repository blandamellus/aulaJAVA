class Pessoa{
    String nome;
    Double altura;
    Double peso;
    String corOlhos;
    String tipoCabelo;
    Boolean cabelo; // true ou false

    // testar com privado
    public void andar(){
        System.out.println(this.nome + " caminhando em duas pernas...");
    }

    public void andar(String personalizado, Double velocidade){
        
        if (velocidade > 20.0) {
            this.correr(velocidade);
        } else {
            System.out.println(this.nome + " caminhando em duas pernas " + personalizado + " a uma velocidade de " + velocidade + "Km/h" );
        }
    }

    public void correr(Double velocidade){
        System.out.println(this.nome + " caminhando em alta velocidade... a uma velocidade de " + velocidade + " Km/h" );
    }
    
    public void pensar(boolean dormindo){ // true ou false
        if (dormindo == true) {
            System.out.println(this.nome + "...sonhando.... Z.zz.Z.Z..");
        } else{
            System.out.println(this.nome + "....pensando....");
        }
    }

    public void comer(String comida, String bebida, String nome, Boolean vegana){ // parametro com mesmo nome de atributo
        if (vegana == true && (comida.contains("carne") || comida.contains("leite") || comida.contains("ovo"))) {
            System.out.println(this.nome + " é vegana(o) e não come nada de procedência animal!");
        } else {
            System.out.println("mastiga...mastiga...mastiga");
            System.out.println(this.nome + " está comendo " + comida + " e bebendo " + bebida + ". Nome Gourmet: " + nome);
        }    
    }

    public void dormir(Boolean dentesLimpos){ //true ou false
        if (dentesLimpos == true) {
            System.out.println(this.nome + " já está indo para cama dormir");
        } else {
            System.out.println(this.nome + " esqueceu de escovar os dentes, e não pode ir dormir ainda");
        }
    }

    public void estudar(String disciplina, Double horas){
        //System.out.println(this.nome + "está lendo material...");
        System.out.println(this.nome + " está estudando " + disciplina + " a muito tempo, cerca de " + horas + " horas");
    }  
    // hora significa a hora em que a pessoa está saindo de casa
    public void pegarOnibus(Double hora, Boolean mochila){
        // é as 7
        if (mochila == false) {
            System.out.println(this.nome + " esqueceu de pegar a mochila, e tem que voltar!");
        } else { // mochila = verdadeiro

            if (hora < 7) {
                System.out.println(this.nome + " está esperando o ônibus na parada");
            } else {
                System.out.println("Vish..." + this.nome + " perdeu a hora do ônibus, já são " + hora + " horas");
            }
        }
    }

}




public class ExemploClasse{
    public static void main(String[] args) throws Exception {
        
        // criando uma pessoa nova a partir da Classe Pessoa
        Pessoa serHumano = new Pessoa(); 
        serHumano.nome = "Silva da Rosa";
        serHumano.altura = 1.80;
        serHumano.peso = 80.0;
        serHumano.tipoCabelo = "Ondulado";
        serHumano.corOlhos = "Verdes";
        serHumano.cabelo = true;

        // criando uma pessoa nova a partir da Classe Pessoa
        Pessoa alienigena = new Pessoa();
        alienigena.nome = "ET";
        alienigena.altura = 2.0;
        alienigena.peso = 120.0;
        alienigena.tipoCabelo = "Liso";
        alienigena.corOlhos = "Laranja";
        alienigena.cabelo = false;

        // chamando/invocando os métodos que a classe Pessoa tem
        boolean vegana = false;
        serHumano.andar();
        serHumano.comer("Xis carne Salada", "Refrigerante", "Pacote FastFood", vegana);
        serHumano.dormir(true);
        serHumano.pensar(false);

        
        alienigena.comer("Abacate com banana e ovo", "Suco de tamarindo", "EteFood", true);
        alienigena.pensar(true);        
        alienigena.estudar("cósmologia", 10.0);
        alienigena.dormir(false);

        alienigena.pegarOnibus(6.50, false);
        
        alienigena.andar("usando tênis coloridos", 1.0);
        alienigena.andar("usando tênis coloridos", 21.0);

        
    }
}
/*
1 [x] Henri
2 [x] Maiara
6 [x] Valentina
1 [x] Pablo
1 [x] Artur
2 [X] Eric
1 [X] Joao
2 [X] Pedro
1 [X] Nicolas
2 [x] Davi

// 2 [ ] Isabel

*/