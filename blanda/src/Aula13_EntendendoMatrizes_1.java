import java.util.Scanner;

public class Aula13_EntendendoMatrizes_1 {
    public static void main(String[] args) throws Exception {
        // (0, 0) = 6
        // (1, 0) = 7
        // (0, 1) = 9
        // (1, 1) = 8

        int [][] tabela = new int[2][2];

        // tabela[x][y]
        tabela[0][0] = 6;
        tabela[1][0] = 7;
        tabela[0][1] = 9;
        tabela[1][1] = 8;
        
        for(int i = 0; i < tabela.length; i++){
            
            System.out.print("(");
            for(int j = 0; j < tabela.length; j++){
                System.out.print(tabela[i][j]);
                if(j == 0){
                    System.out.print(",");
                }
            }
            System.out.print(")");
            System.out.println();
        }

    }
}