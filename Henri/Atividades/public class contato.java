public class contato {
    private String nome;
    private String apelido;
    private String endereço;
    private int telefone;

    //metodo para consulta de informações
    public String getNome(){
        return this.nome;
    }
    public String getApelido(){
        return this.apelido;
    }
    public String getEndereço(){
        return this.endereço;
    }
    public int getTelefone(){
        return this.telefone;
    }
    //metodo para atualizar informação no atributo
    public void setNome(){
        this.nome = nome;
    }
    public void setApelido(){
        this.apelido = apelido;
    }
    public void setEndereço(){
        this.endereço = endereço;
    }
    public void setTelefone(){
        this.telefone = telefone;
    }

    public String toString(){
        String mensagem = "";
        mensagem += "nome: " + this.nome;
        mensagem += "\n\ttelefone"
    }
}