import java.util.Scanner;

public class ContatoTeste{
    public static void main (String[]args) throws Exception {
        
        Contato pessoal = new Contato ();
        pessoal.setNome ("Thomas Ricardo");
        pessoal.setApelido ("meu thom");
        pessoal.setEndereco ("carlos chagas, 420");
        pessoal.setFone (996886368);
        pessoal.setTelefone (51);
        System.out.println (pessoal.toString());

        Scanner entrada = new Scanner (System.in);
        ContatoFamilia familia = new ContatoFamilia ();
        System.out.println ("Qual o grau de parentesco ?");
        familia.setGrauParentesco(entrada.nextLine());
        System.out.println (familia.toString);
        
        ContatoEscolar escola = new ContatoEscolar ();
        System.out.println ("Digite S para sim e N para não se amigo");
        String temporaria = "";
        temporaria = entrada.nextLine();
        if (temporaria == "N") {
            escola.setAmigo  = false;
        }else{
            escola.setAmigo = true;
        }
        System.out.println ("Digite S para sim e N para não se colega");
        String = "";
        entrada.nextLine();
        if (temporaria == "N") {
            escola.setColega  = false;
        }else{
            escola.setColega = true;
        }



    }
}