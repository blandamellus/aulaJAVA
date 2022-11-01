public class ContatoTeste {
    public static void main(String[] args) throws Exception {

        Contato pessoal = new Contato();

        pessoal.setNome("Marianna");
        pessoal.setApelido("Mary");
        pessoal.setEndereço("Casa dos Bobos, 00");
        pessoal.setTelefone(985496678);

        System.out.println(pessoal);

        ContatoFamiliar familiar = new ContatoFamiliar();
        familiar.setGrauParentesco("Irmã");

        System.out.println(familiar);

        ContatoEscolar escola = new ContatoEscolar();
        escola.setEhAmigo(true);
        escola.setEhColega(true);
        escola.setEhProfessor(false);

        System.out.println(escola);

        Agenda agenda = new Agenda();
        agenda.setDataAtualizacao("Ontem");

        System.out.println(agenda);

        RedeSocial social = new RedeSocial();
        social.setPerfil("marianna_silva");
        social.setRede("Instagram");

        System.out.println(social);

        Aniversario aniversario = new Aniversario();
        aniversario.setDia(19);
        aniversario.setMes(9);
        aniversario.setAnoNascimento(2009);

        System.out.println(aniversario);

        Email email = new Email();
        email.setEmailPrincipal("mariannasilva@gmail.com");
        email.setEmailSecundario("marianna_silva@gmail.com");

        System.out.println(email);

    }
}