public class Contato{
    private String nome;
    private String apelido;
    private String endereco;
    private int telefone; // 8 digitos
    private long fone;    // 11 digitos

    // método para consultar informações dos atributos
    public String getNome(){
        return this.nome;
    }

    public String getApelido(){
        return this.apelido;
    }

    public String getEnderco(){
        return this.endereco;
    }

    public int getTelefone(){
        return this.telefone;
    }

    public long getFone(){
        return this.fone;
    }

    // método para atualizar ou cadastrar informações nos atributos
    public void setFone(long fone){
        this.fone = fone;
    }
    
    public void setNome(String nome){
        this.nome = nome;
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

    public String toString(){
        String mensagem = "";

        mensagem += "Nome: " + this.nome;
        mensagem += "\n\tApelido: " + this.apelido;
        mensagem += "\n\tEndereço: " + this.endereco;
        mensagem += "\n\tTelefone: " + this.telefone;
        mensagem += "\n\tFone: " + this.fone;
        return mensagem;

    }




}