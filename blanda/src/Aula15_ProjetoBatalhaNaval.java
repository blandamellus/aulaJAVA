import java.util.Scanner;

public class Aula15_ProjetoBatalhaNaval {
    public static void main(String[] args) {
        
        String [][] campoDeBatalha = new String [5][5];
        //String tabuleiro = "";

        campoDeBatalha[1][0] = "|N|";
        campoDeBatalha[4][0] = "|H|";
        campoDeBatalha[2][2] = "|N|";
        campoDeBatalha[3][2] = "|N|";
        campoDeBatalha[1][3] = "|H|";
        campoDeBatalha[0][4] = "|B|";
        campoDeBatalha[2][4] = "|B|";
        campoDeBatalha[3][4] = "|H|";

        // populou a matriz com água e barcos/navios/helicópteros
        for (int linha = 0; linha < campoDeBatalha.length ; linha++) {
            for (int coluna = 0; coluna < campoDeBatalha.length; coluna++) {
                if(campoDeBatalha[linha][coluna] == null){
                    campoDeBatalha[linha][coluna] = "|A|";
                    System.out.print(campoDeBatalha[linha][coluna]);
                }else{
                    System.out.print(campoDeBatalha[linha][coluna]);
                }
            }
            System.out.println();
        }
        receberCoordenadas(campoDeBatalha);

    }

    public static void receberCoordenadas(String [][] tabuleiro){
    Scanner entrada = new Scanner(System.in);
// SEGUNDA PARTE: receber coordenadas (x, y)
        int x = 0;
        int y = 0;
        String alvo = "";
        System.out.println("Informe coordenada X: ");
        x = entrada.nextInt();
        
        System.out.println("Informe coordenada Y: ");
        y = entrada.nextInt();

        if (x >= 0 && y >= 0) {
            System.out.println(tabuleiro[x][y]);
            alvo = tabuleiro[x][y];
        }

// TERCEIRA PARTE: verificar coordenadas e retornar se acertou
        if (alvo.contains("H")) {
            System.out.println("Você acertou meu Helicóptero!!!");
            tabuleiro[x][y] = "|X|";
        } else if(alvo.contains("B")){
            System.out.println("Você acertou meu Barquinho!!!");
            tabuleiro[x][y] = "|X|";
        } else if(alvo.contains("N")){
            System.out.println("Você acertou meu Navio!!!");
            tabuleiro[x][y] = "|X|";
        } else if(alvo.contains("A")){
            System.out.println("Você errooou!!!");
            tabuleiro[x][y] = "|*|";
        }

// QUARTA PARTE: exibir o tabuleiro atualizado com o chute
        for (int linha = 0; linha < tabuleiro.length ; linha++) {
            for (int coluna = 0; coluna < tabuleiro.length; coluna++) {
                System.out.print(tabuleiro[linha][coluna]);
            }
            System.out.println();
        }
    }
}

/*
[1][0] navio
[4][0] helicoptero
[2][2] navio
[3][2] navio
[1][3] helicoptero
[0][4] barquinho
[2][4] barquinho
[3][4] helicoptero

*/