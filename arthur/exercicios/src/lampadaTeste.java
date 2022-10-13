import java.util.Scanner;

public class lampadaTeste{
    public static void main(String[] args) throws Exception{
        Scanner entrada = new Scanner(System.in);
        
        lampada led= new lampada();
        led.setCor("Branca");
        led.setMarca("Elgin");
        led.setTipo("Led");
        led.setPotencia(100);
        led.setVoltagem(220);
        led.setPreço(11.15);
        led.setStatus(false);
        led.toString();
        System.out.println(led.toString());

        lampada florescente = new lampada();
        florescente.setCor("Branca");
        florescente.setMarca("Philips");
        florescente.setTipo("Florescente");
        florescente.setPotencia(350);
        florescente.setVoltagem(110);
        florescente.setPreço(30.00);
        florescente.setStatus(true);
        florescente.toString();
        System.out.println(florescente.toString());

        lampada incandescente = new lampada();
        incandescente.setCor("Amarela");
        incandescente.setMarca("Taschibra");
        incandescente.setTipo("Incandescente");
        incandescente.setPotencia(300);
        incandescente.setVoltagem(220);
        incandescente.setPreço(25.00);
        incandescente.ligar();
        incandescente.toString();
        System.out.println(incandescente.toString());

        String cor, marca, tipo;
        Double preço;
        int voltagem, potencia;
        Boolean status;

        
        System.out.println("Entre com a marca da lâmpada");
        marca = entrada.next();

        System.out.println("Entre com uma cor da lâmpada");
        cor = entrada.next();

        System.out.println("Entre com o preço da lâmpada");
        preço = entrada.nextDouble();

        System.out.println("Entre com a potência da lâmpada");
        potencia = entrada.nextInt();

        System.out.println("Entre com a voltagem da lâmpada");
        voltagem = entrada.nextInt();

        System.out.println("Entre com o tipo da lâmpada");
        tipo = entrada.next();

        System.out.println("Desligada");
        status = entrada.nextBoolean();
        
        

        lampada novaLampada = new lampada(marca, cor, tipo, voltagem, preço, potencia);
        System.out.println(novaLampada.toString());

          String vetor[] = new String[3];
          int vetorInt[] = new int[3];


          
}

}