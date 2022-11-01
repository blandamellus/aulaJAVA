import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class lampadaTeste {
    public static void main(String[] args) throws Exception {

        Lampada led = new Lampada();
        led.setTipo("led");
        led.setVoltagem(220);
        led.setCor("verde");
        led.setMarca("Elgin Supreme");
        led.setPreco(11.15);
        led.setPotencia(100);
        led.setStatus(false);
        led.toString();
        System.out.println(led.toString());

        Lampada florescente = new Lampada("florescente", 110, "branco", "phillips", 30.0, 350, true);
           System.out.println(florescente.toString());


        Lampada incandescente = new Lampada();
        incandescente.setTipo("Incandescente");
        incandescente.setVoltagem(220);
        incandescente.setCor("Amarela");
        incandescente.setMarca("Taschibra");
        incandescente.setPreco(25.0);
        incandescente.setPotencia(300);
        incandescente.ligar(); // método para ligar, atributo status = true

        System.out.println(incandescente.toString());

        lampadas Nlampada = new lampadas(marca, cor, voltagem);
        System.out.println(Nlampada.toString());

        String vetor[] = new String[5];
        Int vetorInt[] = new int[5];
        
        String cor, marca;
        int voltagem;

        

      
      
      
      
      
      
      
         /*
         
         lampadas Nlampada = new lampadas(marca, cor, voltagem);
        System.out.println(Nlampada.toString());

        String vetor[] = new String[5];
        int vetorInt[] = new int[5];
       
       
       
       
         lampadas[] lampadamd = new lampadas[10];
        lampadas[0] = new lampada("Amarela", "Taschibra",  200);
        lampadas[0] = new lampada("Amarela", "Tachibra",  200);
        lampadas[0] = new lampada("Amarela", "Taschibra",  200);*/



        
    }

}
 