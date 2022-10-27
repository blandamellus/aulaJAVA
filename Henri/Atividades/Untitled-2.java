public class Prof{
    private String nome;
    private Double altura;
    private int idade;
    private String corOlhos;
    Double peso;
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        if (!nome.contains("test")) {
            this.nome = nome;
            System.out.println(this.nome);
        } else {
            System.out.println("No! no! that's a invalid one");
        }
    }
    
    public void andar(){
        System.out.println("...andando...");
    }
    public void comer(){
        System.out.println("...comendo um hamburguer...");
     }
}
    
class Aluno extends Pessoa {
     String curso;
       String disciplina;
       Boolean preguica;
    
       public void estudar(){
          System.out.println("...quebrando a cabeça em uma unica matéria...");
       }

       // sobrescrição
 public void comer(){
        System.out.println("...comendo comida vegana...");
     }

  // sobrecarga
      public void comer(String tipoComida){
          System.out.println("comendo " + tipoComida);
    }

 }
