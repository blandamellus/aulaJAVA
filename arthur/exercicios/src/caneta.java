public class caneta{
    private String marca;
    private String cor;
    private Double tamanho;

    public caneta(){}

    public caneta(String marca){
        this.marca = marca;
    }
    


    public caneta(String marca, String cor, 
    Double tamanho){
        this.tamanho = tamanho;
        this.cor = cor;
        this.marca = marca;
    }

    // getters - consultar os dados dos atributos

    public String getMarca(){
        return this.marca;

    }

    public String getCor(){
        return this.cor;
    }

    public Double getTamanho(){
        return this.tamanho;
    }

    //setters - atualiza e informa dados nos atributos
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public void setTamanho(Double tamanho){
        this.tamanho = tamanho;
    }
    // toString
    public String toString(){
        return "Caneta \n\tTamanho: " +
         this.tamanho + "\n\tCor: " + this.cor +
          "\n\tMarca: " + this.marca;
        
    }
}

