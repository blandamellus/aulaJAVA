public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("AKI");

        Pessoa serHumano = new Pessoa();
        
        //serHumano.altura = 1.80;
        //serHumano.idade = 25;
        serHumano.setNome("Blanda Mello");
        serHumano.getNome();

        //serHumano.nome = "Mateus Andrade da Silva";
        serHumano.peso = 80.0;
        serHumano.comer();

        Aluno aluno = new Aluno();
        aluno.curso = "Técnico de informática";
        aluno.disciplina = "Programação Java";
        aluno.setNome("teste");
        aluno.comer();
        aluno.comer("tapioca");
        


    }
}