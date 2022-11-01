import java.util.Scanner;

public class String_funcoes {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        
        String textoInicial; 
        int vogal = 0;
        
        System.out.println("Entre com um texto:");
        textoInicial = entrada.next();

        // exercício A
        System.out.println("O texto de entrada tem tamanho: " + textoInicial.length());

        // exercicio B 
        System.out.println(textoInicial.toUpperCase());

        // exercicio C
        for(int j = 0; j < textoInicial.length(); j++){

            char carac = textoInicial.charAt(j);
            if(carac == 'a' || carac == 'e' || carac == 'i' || carac == 'o' || carac == 'u'){
                vogal++;
            }
        }
        System.out.println(vogal);

        // exercicio D verifique se a palavra comeca com letra maiscula
        
        char letraInicial = textoInicial.charAt(0);
        System.out.println(letraInicial);

        char letra = Character.toUpperCase(letraInicial);
        System.out.println(letra);

        if(textoInicial.charAt(0) == letra){
            System.out.println("A primeira letra está maiúscula!");
        } else {
            System.out.println("A primeira letra está minúscula!");
        }
        
        // exercicio E
        System.out.println(textoInicial.toUpperCase().endsWith( "RIO" ));
        
        // for(int i = textoInicial.length(); i > 0; i--){
        //     char letraInicial = textoInicial.charAt(0);
        //     System.out.println(i);

        // }
        //boolean final;
        
        // exercício F
        int digitosNaString = 0;
        for(int j = 0; j < textoInicial.length(); j++){
            char carac = textoInicial.charAt(j);
            if(carac == '9' || 
               carac == '8' || 
               carac == '7' || 
               carac == '6' || 
               carac == '5' || 
               carac == '4' || 
               carac == '3' || 
               carac == '2' ||
               carac == '0' ||
               carac == '1'){
                digitosNaString++;
                
            }
        }
        System.out.println("Na minha String tem " + digitosNaString + "digitos");
        


        
        


    }
}