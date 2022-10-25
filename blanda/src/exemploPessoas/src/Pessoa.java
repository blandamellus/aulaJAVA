// classe = letra maiuscula
// método = comeca com letra minuscula
// atributo = comeca com letra minuscula
// regra camelCase = primeiraMinuscula e as seguintes maiuscula primeira
// nomeSobrenomeDaPessoaEsperada


public class Pessoa{
    private String nome; // ninguém acessa de fora
    private String sobrenome;
    private Double altura;
    private int idade;
    String corOlhos;
    Double peso;
   
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
        
    }

    public String getNome(){  
        return this.nome + " " + this.sobrenome;
    }

    public void setNome(String nome){
        if (!nome.contains("teste")) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido!");
        }
    }

    public String andar(){
        return "Andando...";
    }

    public String andar(String sapatos){
        return andar() + " com " + sapatos;

    }

    public String comer(){
        return "comendo hamburguer";
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

