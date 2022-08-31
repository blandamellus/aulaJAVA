public class exercicioRepeticao_Aula7 {
    public static void main(String[] args) throws Exception{
        // espaço para exercicio
        // Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3% e que a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%. Faça um programa que calcule e escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.

        float a = 80000;
        float b = 200000;
        float perctA = (float) 0.015;
        float perctB = (float) 0.003;
        int ano = 0;

        // continua fazendo a verificação do código, enquanto A ainda for menor B
        while (a < b){
            a = a + a * perctA;
            b = b + b * perctB;
            System.out.println(a);
            System.out.println(b);
            ano++;
            System.out.println(ano);
            System.out.println("anos " + ano );
        }
    
        






    }
}