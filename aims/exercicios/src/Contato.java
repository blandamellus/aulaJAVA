public class Contato {
    private String nome;
    private String apelido;
    private String endereco;
    private int telefone; //8 digitos
    private long fone; //11 digitos

//metodo para consultar informações do atributo  nome
    public String getNome(){
        return this.nome;
    }

    public String getApelido(){
        return this.apelido;
    }
    public String getEndereco(){
        return this.endereco;
    }
    public int getTelefone(){
        return this.telefone;
    }
    public getFone(){
        return this.fone;
    }
    //metodo para atualizar ou cadastrar informaçoes nos atributos

    public void setNome(String nome){
        this.nome = nome ;
    }
    public void setApelido(String apelido){
        this.apelido = apelido;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public void setTelefone(int telefone){
        this.telefone = telefone;
    }
    public void setFone(long fone){
        this.fone = fone;
    }    
    
    public String toString(){
        String mensagem = "";
        mensagem += "Nome:" + this.nome;
        mensagem+= "\n\tApelido:" + this.apelido;
        mensagem+= "\n\tEndereço:" + this.endereco;
        mensagem+= "\n\tTelefone:" + this.telefone;
        mensagem+= "\n\tfone:" + this.fone;
        return mensagem;
    }
}

//NOVA CLASSE

class ContatoFamilia extends Contato{
    private String grauParentesco;

    public String getGrauParentesco (){
        return this.grauParentesco;
    }
    public void setGrauParentesco(String GrauParentesco){
        this.grauParentesco = GrauParentesco;
    }

    public String toString(){
    String mensagem = "\n\tGrau de parentesto ?";
        mensagem += ":" + this.grauParentesco;
        return mensagem;
    }

}

//NOVA CLASSE 

class ContatoEscolar extends Contato{
    private boolean ehColega;
    private boolean ehProfessor;
    private boolean ehAmigo;

    public boolean getEhColega(){
        return this.ehColega;
    }
    public void setEhColega(boolean ehColega){
        this.ehColega = ehColega; 
    }
    public  boolean getEhProfessor(){
        return this.ehProfessor;
    }
    public void setEhProfessor(booelan ehProfessor){
        this.ehProfessor = ehProfessor ;
    }
    public boolean getEhAmigo(){
        return this.ehAmigo;
    }
    public  void setEhAmigo(boolean ehAmigo){
        this.ehAmigo = ehAmigo;
    }


    public String toString(){
        String amigo="";

        if (this.ehAmigo == true) {
            amigo = "Sim";
        } else {
            amigo = "Não";
        }
        String mensagem="";
        mensagem = "\n\tÉ amigo? " + amigo;

        if (this.ehColega == false){
            ehColega = "Sim";
        }else{
            ehColega = "Não";
        }
        mensagem += "\n\tÉ colega? " + ehColega; 

        if (this.ehProfessor == false) {
            ehProfessor = "Sim";
        } else{
            ehProfessor = "Não";
        }
        mensagem += "\n\tÉ professor?" + ehProfessor;
    }

}

//NOVA CLASSE 

class RedeSocial {
    private String rede;
    private String perfil;

    public String getRede(){
        return this.rede;
    }
    public void  setRede (String rede){
        this.rede = rede;
    }
    public String getPerfil(){
        return this.perfil;
    }
    public void setPerfil(String perfil){
        this.perfil = perfil; 
    }

    public String toString(){
        String mensagem = "\n\tRede social ?";
        mensagem += "" + this.rede;
        mensagem += "\n\tQual o perfil ?" + this.perfil;
        return mensagem;
    }
}
//NOVA CLASSE 

class Agenda{
    private String dataAtualizacao;
    
    public String getDataAtualizacao(){
        return this.dataAtualizacao;
    }
    public void setDataAtualizacao( String dataAtualizacao){
        this.dataAtualizacao = dataAtualizacao;
    }

    public String toString (){
        String mensagem = "\n\tData de última atualização ?" + this.dataAtualizacao;
        return mensagem; 
    }
}

//NOVA CLASSE 

class Email {
    private String emailPrincipal;
    private String emailSecundario;

    public String getEmailPrincipal (){
        return this. emailPrincipal;
    }
    public void setEmailPrincipal (String emailPrincipal){
        this.emailPrincipal = emailPrincipal;
    }
    public String getEmialSecundario (){
        return this.emailSecundario;
    }
    public void emailSecundario (String emailSecundario){
        this.emailSecundario = emailSecundario;
    }
    public String toString (){
        String mensagem = "\n\tQual o email principal ?" + this.emailPrincipal;
        mensagem += "\n\tQual o email secundario ?" + this.emailSecundario;
        return mensagem; 
    }
}

//NOVA CLASSE 

class Aniversario{
    private int dia;
    private int mes;
    private int anoNascimento;

    public int getDia (){
        return this.dia;
    }
    public void  setDia(int dia){
        this.dia = dia;
    }
    public int getMes (){
        return this.mes;
    }
    public void setMes(int mes ){
        this.mes = mes;
    }
    public int getAnoNascimento(){
        return this.anoNascimento;
    }
    public void setAnoNascimento (int anoNascimento){
        this.anoNascimento = anoNascimento;
    }
    public String toString (){
        String mensagem = "\n\tQual o dia do nascimento ?" + this.dia;
        mensagem += "\n\tQual o mes do nascimento ?" + this.mes;
        mensagem += "\n\tQual o ano de nascimento ? " + this.anoNascimento;
        return mensagem; 
    }
}