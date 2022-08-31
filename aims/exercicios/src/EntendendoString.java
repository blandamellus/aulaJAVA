public class EntendendoString {
    public static void main (String[] args) throws Exception {
        int numero;
        int numero1 = 0;

        String minhaString = new String();
        minhaString = "alguma coisa" ;
        String minhaString2 = "they paved the way";

        //substituindo string
        String s = "meu cabelo é vermelho" ;
        System.out.println(s);
        s = s.replace ("meu", "nosso");
        System.out.println(s);

        // verifica dentro da variavel o que eu to procurando
        String s2 = "validando o String";
        System.out.println(s2.contains("validando"));

        //remove espaços de incio e fim da varavel (string)
        String s3= "testando o teste";
        s3= s3.trim();
        System.out.println(s3);

        //conta os caracteres
        String s4 = "Java";
        System.out.println (s4.length());

        //transforma as letras as maisculo
        System.out.println(s3.toUpperCase());

        //subtrai os caracteres de 0 ate o indice informado
        String s6 = "zilliee";
        s.substring(7);
        System.out.println (s6);

        
}
}