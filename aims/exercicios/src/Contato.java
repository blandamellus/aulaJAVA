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
    puclic void setFone(long fone){
        return this.fone;

    }    public String toString(){
        String mensagem = "";
        mensagem += "Nome:" + this.nome;
        mensagem+= "\n\tApelido:" + this.apelido;
        mensagem+= "\n\tEndereço:" + this.endereco;
        mensagem+= "\n\tTelefone:" + this.telefone;
        mensagem+= "\n\tTelefone:" + this.telefone;
        return mensagem;
    }

    }