public class Contato {
    private String nome;
    private String apelido;
    private String endereço;
    private long telefone;

    // método para consultar informações do atributo nome
    public String getNome(){
        return this.nome;
    }
    public String getApelido(){
        return this.apelido;
    }
    public String getEndereço(){
        return this.endereço;
    }
    public long getTelefone(){
        return this.telefone;
    }

    // método para atualizar ou cadastrar informações nos atributos
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setApelido(String apelido){
        this.apelido = apelido;
    }
    public void setEndereço(String endereço){
        this.endereço = endereço;
    }
    public void setTelefone(long telefone){
        this.telefone = telefone;
    }

    //
    public String toString(){
        String mensagem = "";

        mensagem += "Nome: " + this.nome;
        mensagem += "\nApelido: " + this.apelido;
        mensagem += "\nEndereço: " + this.endereço;
        mensagem += "\nTelefone: " + this.telefone;
        return mensagem;

    }
    
}

class ContatoFamiliar extends Contato {
    private String grauParentesco;

    public String getGrauParentesco(){
        return this.grauParentesco;
    }
    public void setGrauParentesco(String grauParentesco){
        this.grauParentesco = grauParentesco;
    }

    public String toString(){
        String parente = "";

        parente += "Grau de parentesco: " + this.grauParentesco;
        return parente;
    }
}

class ContatoEscolar extends Contato {
    private Boolean ehColega;
    private Boolean ehProfessor;
    private Boolean ehAmigo;

    public Boolean getEhColega(){
        return this.ehColega;
    }
    public Boolean getEhProfessor(){
        return this.ehProfessor;
    }
    public Boolean getEhAmigo(){
        return this.ehAmigo;
    }

    public void setEhColega(Boolean ehColega){
        this.ehColega = ehColega;
    }
    public void setEhProfessor(Boolean ehProfessor){
        this.ehProfessor = ehProfessor;
    }
    public void setEhAmigo(Boolean ehAmigo){
        this.ehAmigo = ehAmigo;    
    }


    public String verificacao(boolean tipo){

        if(tipo == true){
            return "Sim";
        } else {
            return "Não";
        }
        
    }

    public String toString(){
        String mensagem = "";
        mensagem += "Colega: " + this.verificacao(this.ehColega);
        mensagem += "\nProfessor: " + this.verificacao(this.ehProfessor);
        mensagem += "\nAmigo: " + this.verificacao(this.ehAmigo);
        return mensagem;
    }

}

class Agenda {
    private String dataAtualizacao;

    public String getDataAtualizacao(){
        return this.dataAtualizacao;
    }

    public void setDataAtualizacao(String dataAtualizacao){
        this.dataAtualizacao = dataAtualizacao;
    }

    public String toString(){
        String mensagem = "";
        mensagem += "Data de Atualização: " + this.dataAtualizacao;
        return mensagem;
    }
}

class Email {
    private String emailPrincipal;
    private String emailSecundario;

    public String getEmailPrincipal(){
        return this.emailPrincipal;
    }
    public String getEmailSecundario(){
        return this.emailSecundario;
    }

    public void setEmailPrincipal(String emailPrincipal){
        this.emailPrincipal = emailPrincipal;
    }
    public void setEmailSecundario(String emailSecundario){
        this.emailSecundario = emailSecundario;
    }

    public String toString(){
        String mensagem = "";
        mensagem += "Email Principal: " + this.emailPrincipal;
        mensagem += "\nEmail Secundário: " + this.emailSecundario;
        return mensagem;
    }
}

class Aniversario {
    private int dia;
    private int mes;
    private int anoNascimento;

    public int getDia(){
        return this.dia;
    }
    public int getMes(){
        return this.mes;
    }
    public int getAnoNascimento(){
        return this.anoNascimento;
    }

    public void setDia(int dia){
        this.dia = dia;
    }
    public void setMes(int mes){
        this.mes = mes;
    }
    public void setAnoNascimento(int anoNascimento){
        this.anoNascimento = anoNascimento;
    }

    public String toString(){
        String mensagem = "";
        mensagem = "Data de aniversário: " + dia + "/" + mes + "/" + anoNascimento;
        return mensagem;
    }
}

class RedeSocial {
    private String rede;
    private String perfil;

    public String getRede(){
        return this.rede;
    }
    public String getPerfil(){
        return this.perfil;
    }

    public void setRede(String rede){
        this.rede = rede;
    }
    public void setPerfil(String perfil){
        this.perfil = perfil;
    }

    public String toString(){
        String mensagem = "";
        mensagem = "Rede: " + this.rede;
        mensagem += "\nPerfil: " + this.perfil;
        return mensagem;
    }
}
