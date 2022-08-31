public class Auladia30 {
    public static void main(String[] args) {

        int numero1;
        int numero=0;
        String minhaString= new String();
        minhaString = "alguma coisa";
        String minhaString2 = "outra coisa";
        String minhaString3 = new String ("alguma coisa");
    System.out.println("minhaString");
    System.out.println("minhaString2");
    System.out.println("minhaString3");
        String s = "Algum texto";
        System.out.println(s);
        s = s.replace("texto", "novo texto");
        System.out.println(s);
        String s2 = "algum texto para validar o uso de strings";
        System.out.println(s2.contains("123"));

        String s3 = " a texto de teste b";
        s3 = s3.trim();
        System.out.println(s3);

        String s4 = "Java";
        System.out.println(s4.length());// Se  botar trim.length tira os espaços e conta caracteres

        System.out.println (s3.toUpperCase()); // bota em letras maisculas
        System.out.println (s3.toLowerCase()); //bota em minusculas

        String s6 = "universidade";
        s6 = s6.substring(7); // subtrai os caracteres do 0 até o indice informado
        System.out.println(s6);

        


        
    }
}
