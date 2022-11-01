import java.util.Scanner;

public class LampadaTeste {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Lampada led = new Lampada();
        led.setCor("branca");
        led.setMarca("Elgin Supreme");
        led.setPotencia(100);
        led.setPreço(11.15);
        led.setStatus(false);
        led.setTipo("led");
        led.setVoltagem(200);
        led.toString();

        System.out.println(led.toString());

        Lampada florescente = new Lampada();
        florescente.setCor("branca");
        florescente.setMarca("Philips");
        florescente.setPotencia(350);
        florescente.setPreço(30.00);
        florescente.setStatus(true);
        florescente.setTipo("florescente");
        florescente.setVoltagem(110);
        florescente.toString();

        System.out.println(florescente.toString());

        Lampada incandescente = new Lampada();
        incandescente.setTipo("Incandescente");
        incandescente.setVoltagem(220);
        incandescente.setCor("Amarelo");
        incandescente.setMarca("Taschibra");
        incandescente.setPreço(25.00);
        incandescente.setPotencia(300);
        incandescente.ligar();

        System.out.println(incandescente.toString());

        String tipo, cor, marca;
        int voltagem, potencia;
        Double preço;
        boolean status;

        
        System.out.println("Entre com a marca da lâmpada:");
        marca = entrada.next();
        System.out.println("Entre com a cor da lâmpada:");
        cor = entrada.next();
        System.out.println("Entre com o tipo da lâmpada:");
        tipo = entrada.next();
        System.out.println("Entre com a voltagem da lâmpada:");
        voltagem = entrada.nextInt();
        System.out.println("Entre com a potência da lâmpada:");
        potencia = entrada.nextInt();
        System.out.println("Entre com o preço da lâmpada:");
        preço = entrada.nextDouble();
        status = false;

        Lampada l = new Lampada(tipo, cor, voltagem, marca, preço, potencia, l.desligar());
        





    }
}