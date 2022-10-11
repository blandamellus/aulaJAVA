public class App{

    public static void main(String[] args) {
        
        Pessoa serHumano = new Pessoa();
        //serHumano.altura = 1.80;
        //serHumano.idade = 25;
        //serHumano.nome = "Matheus Andrade";
        
        serHumano.setNome("teste");
        serHumano.getNome();
        serHumano.peso = 80.0;
        serHumano.comer();


        Aluno aluno = new Aluno();
        aluno.curso = "técnico em informática";
        aluno.disciplina = "Programação java";
        aluno.comer();
    }
}