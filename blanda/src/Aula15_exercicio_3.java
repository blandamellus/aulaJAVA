import java.util.Scanner;

// Exercício 3 Faça um Programa que leia 4 notas, mostre as notas e a média na tela.

// receber 4 valores do usuário
// salvar em algum lugar
// calcular a media e exibir

public class Aula15_exercicio_3{
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);        
        Double [] vetorNotas = new Double[4];
        Double media;
        Boolean encerrar = false; // true | false
        Double dadoUsuario;
        int posicao = 0;

        while (encerrar == false) { 

            if(posicao == 4){
                System.out.println("Já temos todas as notas. Vamos calcular as medias!");
                break;
            }
            System.out.println("Entre com a nota: [99 = sair] ");
            dadoUsuario = entrada.nextDouble();

            if (dadoUsuario == 99) {
                encerrar = true;   
                System.out.println("Usuário pediu para sair...");
            } else if (posicao >= 0 & posicao < 4){
                vetorNotas[posicao] = dadoUsuario;
                posicao++;
            } else {
                System.out.println("encerramos por aqui");
                break;
            }            
        }
        // {[(nota1 + nota2) / 5] + nota3 * 4} 
        // 1. resultado = nota1 + nota2
        // 2. soma = resultado / 5
        // 3. soma_temporaria = nota3 * 4
        // 4. soma = soma + soma_temporaria
        
        media = (vetorNotas[0] + vetorNotas[1] + vetorNotas[2] + vetorNotas[3]) / vetorNotas.length;
        // media = media / vetorNotas.length;
        
        System.out.println("Média das notas informadas: "+ media);

        for (int i = 0; i < vetorNotas.length; i++) {
            System.out.println(vetorNotas[i]);
        }

    }
}