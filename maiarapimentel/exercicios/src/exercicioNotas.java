class Notas{
      int totalNotas;
      String nomeAluno;
      String materia; 

      void somadasnotas (int novanota){
          totalNotas += novanota;

      }
}

public class exercicioNotas {
    public static void main(String[] args) {
        Notas aluno;
        aluno = new Notas();

        aluno.nomeAluno = "Maiara";
        aluno.materia = "matematica";

        //notas do aluno
        aluno.somadasnotas(9);

        System.out.println("O resultado das notas do aluno " + aluno.nomeAluno + "é de " + aluno.totalNotas);
    }
}
