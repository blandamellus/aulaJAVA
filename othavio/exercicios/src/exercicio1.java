class Notas {
    int totalNotas = 0;
    String nomeAluno;
    String materia;

    void somasdasnotas ( int novanota){
        totalNotas += novanota;
    }
}

public class exercicio1 {
    public static void main (String args[]){
        //criei o aluno
        Notas aluno;
        aluno = new Notas();

        aluno.nomeAluno = "Lucas";
        aluno.materia = "Matematica";

        //notas do aluno
        exercicio.somasdasnotas(9);

        System.out.println("O resultado das notas do aluno " + aluno.nomeAluno + " é: " + aluno.somasdasnotas);
    }
} 
