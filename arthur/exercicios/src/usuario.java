import java.util.Scanner;



public class usuario{
    public static void main(String[] args) throws Exception{
        // receber numeros de usuario
        // armazenar do vetor
        // verificar com um FOR os numeros o vetor e contar quantas vezes aparece
        // Manter o laço da repetição com regra até 100 ou numero = -1 (regra de parada) WHILE
    
        
        Scanner entrada = new Scanner(System.in);

        
    int [] vetorNumero = new int [5];
    int contar1 = 0, contar3=0, contar4=0;
    
    
    

    for(int i = 0; i < 5; i++){
        
        System.out.println("Insira um número de 0 à 9: ");
    vetorNumero[i] = entrada.nextInt();
    
    if (vetorNumero[i] == 1){
        contar1 = contar1 + 1;
        
     
       }
       if (vetorNumero[i] == 3){
         contar3 = contar3 + 1;
      
        }
        if (vetorNumero[i] == 4){
         contar4 = contar4 + 1;
      
        }
        
      


    if(vetorNumero[i] == -1){
        System.out.println("Entrada de dados encerrada");
        break;

        }
    }

    System.out.println("o total de números 1 foi " + contar1);
    System.out.println("o total de números 3 foi " + contar3);
    System.out.println("o total de números 4 foi " + contar4);
    
    


       

            }
          

          }
        
        




    

    
    

    
    

    
