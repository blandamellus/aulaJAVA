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
        System.out.println (familia.toString ());



        
        ContatoEscolar escola = new ContatoEscolar ();
        System.out.println ("Digite S para sim e N para não se amigo");
        String temporaria = "";
        temporaria = entrada.nextLine();
        if (temporaria == "N") {
            escola.setEhAmigo(false);
        }else{
            escola.setEhAmigo(true);
        }
        System.out.println ("Digite S para sim e N para não se colega");
        temporaria = entrada.nextLine();
        if (temporaria == "N") {
            escola.setEhColega (false);
        }else{
            escola.setEhColega (true);
        }
       
        System.out.println ("Digite S para sim e N para não se professor");
        temporaria = entrada.nextLine();
        if (temporaria == "N") {
            escola.setEhProfessor(false);
        }else{
            escola.setEhProfessor(true);
        }

        


        RedeSocial perfil = new RedeSocial (); 
        System.out.println ("Qual a rede social?");
        perfil.setRede (entrada.nextLine());
        System.out.println ("Qual o perfil?");
        perfil.setRede (entrada.nextLine());
        System.out.println (perfil.toString());



        Agenda Data = new Agenda ();
        System.out.println ("Qual a data da última atualização?");
        Data.setDataAtualizacao (entrada.nextLine());



        Email Mail = new Email ();
        System.out.println ("Digite o Email principal.");
        Mail.setEmailPrincipal (entrada.nextLine());
        System.out.println ("Digite o Email secundario.");
        Mail.setEmailSecundario (entrada.nextLine ());



        Aniversario datas = new Aniversario ();
        System.out.println ("Qual o dia do seu nascimento?");
        datas.setDia (entrada.nextInt());
        System.out.println ("Qual o mes do seu nascimento?");
        datas.setMes (entrada.nextInt());
        System.out.println ("Qual o ano do seu nascimento?");
        datas.setAnoNascimento (entrada.nextInt());
        
    



    }
}