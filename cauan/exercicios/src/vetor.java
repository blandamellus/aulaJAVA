import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;
public class vetor {
    public static void main(String[] args) throws Exception{
        Scanner entrada = new Scanner(System.in);
        
        int [] pares = new int [10];
        int numero;

        pares[0] = 2;
        pares[1] = 4;
        pares[2] = 6;
        pares[3] = 8;
        pares[4] = 10;
        pares[5] = 12;
        pares[6] = 14;
        pares[7] = 16;
        pares[8] = 18;
        pares[9] = 20;
        
        for (int i = 0; i < pares.length; i++);
            System.out.println(pares[i]);
        
    




// usuario entra com informação
boolean bandeira = false;

System.out.println("Informe um numero");
numero = entrada.nextInt();
// == igual
// != diferente

while (bandeira != true) {
 
    if (numero%2 == 0){
        vetorNovo [contador] = numero;
        contador++;
    }
    numero = numero + 1;

    if(contador ==9){
        bandeira = true;
    }
}

for(int i = 0; i < vetorNovo.length; i++);

     System.out.println(vetorNovo[i]);


    }

}