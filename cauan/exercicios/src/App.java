public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("AKI");

        bluble serHumano = new bluble();
        
        //serHumano.altura = 1.80;
        //serHumano.idade = 25;
        serHumano.setNome("Cauan Borges");
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
        

        abluble professor = new abluble();
        professor.DiaDeAula = "quinta";
        professor.DarAula("quinta");
        professor.dúvidas = "A nota foi acima da média";
        professor.tirarDuvidas("A nota foi abaixo da média");



    }
}