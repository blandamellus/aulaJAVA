public class Pessoa{
    private String nome;
    private Double altura;
    private int idade;
    private String corOlhos;
    Double peso;

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        if (!nome.contains("teste")) {
            this.nome = nome;
            System.out.println(this.nome);
        } else {
            System.out.println("Nome inválido!");
        }
    }

    public void andar(){
        System.out.println("andando");
    }
    public void comer(){
        System.out.println("comendo hamburguer");
    }
}

class Aluno extends Pessoa {
    String curso;
    String disciplina;
    Boolean preguica;

    public void estudar(){
        System.out.println("estudando");
    }

    // sobrescrição
    public void comer(){
        System.out.println("comendo comida vegana...");
    }

    // sobrecarga
    public void comer(String tipoComida){
        System.out.println("comendo " + tipoComida);
    }

}
