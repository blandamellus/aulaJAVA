import java.util.Scanner;

/*  Decisão IF/ELSE
    Faça um algoritmo que receba 4 notas, calcule a média e em seguida exiba o conceito do aluno conforme as regras:
    Aluno com nota acima de  8 = A;
    Aluno com nota entre 6 e 7 = B;
    Aluno com nota entre 3 e 5 = C;
    Aluno com nota entre 0 e 2 = D e Reprovado!
*/
public class ConceitoNotas {
    public static void main(String[] args) throws Exception {
        
        Scanner entrada = new Scanner(System.in);
        int nota1, nota2, nota3, nota4, media;
        
        // receba 4 notas
        System.out.println("Informe usa nota: ");
        nota1 = entrada.nextInt();
        System.out.println("Informe usa nota: ");
        nota2 = entrada.nextInt();
        System.out.println("Informe usa nota: ");
        nota3 = entrada.nextInt();
        System.out.println("Informe usa nota: ");
        nota4 = entrada.nextInt();

        // calcule a média
        media = (nota1 + nota2 + nota3 + nota4) / 4;

        /*
        Aluno com nota acima de  8 = A;
        Aluno com nota ent8re 6 e 7 = B;
        Aluno com nota entre 3 e 5 = C;
        Aluno com nota entre 0 e 2 = D e Reprovado!
        */

        if(media >= 8 ){
            System.out.println("Conceito A. Aprovado!");
        } else if(media >= 6 && media <= 7){
            System.out.println("Conceito B. Aprovado!");
        } else if(media >= 3 && media <= 5){
            System.out.println("Conceito C. Aprovado!");
        } else {
            System.out.println("Conceito D. Reprovado!");
        }



  
    }
}