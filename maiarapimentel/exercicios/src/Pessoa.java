public class Pessoa{
   private String nome;
   private String altura;
   private String idade;
    Double peso;

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        if (!nome.contains("teste")){
            this.nome = nome;
            System.out.println(this.nome);
        } else
            System.out.println("nome invalido");
        }

    public void andar(){
        System.out.println("andando");

    }
    public void comer(){
        System.out.println("comendo");
    }
}

class Aluno extends Pessoa {
    String curso;
    String disciplina;
    Boolean preguiça;

    public void estudar(){
        System.out.println("estudando");
    }
    public void comer(){
        System.out.println("comendo comida vegana...");
    }

}