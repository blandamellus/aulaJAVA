public class ContatoBeta {
    public static void main(String[] args) throws Exception {
        private String nome;
    private String apelido;
    private String endereco;
    private int telefone;
    private String fone;

    // método pra consultar informações
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


    //método pra atualizar informação no atributo
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
    public String getFone(){
        return this.fone;
    }
    public void setFone(String string){
        this.fone = string;
    }

    public String toString(){
        String mensagem = "";

        mensagem += "Nome: " + this.nome;
        mensagem += "\n\tApelido: " + this.apelido;
        mensagem +="\n\tEndereço: " + this.endereco;
        mensagem += "\n\tTelefone: " + this.telefone;
        mensagem += "\n\tFone: " + this.fone;
        return mensagem;

    }

public class ContatoTeste{
    public static void main(String[] args) throws Exception {

        Contato pessoal = new Contato();

        pessoal.setNome("NAN");
        pessoal.setApelido("Error");
        pessoal.setEndereco("Your mom");
        pessoal.setFone("A");
    }

    }
}
