public class ligma{
    private String marca = Marca;
    private string cor = Cor;
    private String tamanho = Tamanho;
    public caneta(){
        
    }

    //getters - consultar os dados dos atributos

    public String getMarca(){
        return this.marca;
    }

    public String getCor(){
        return this.cor;
    }

    public Double getTamanho(){
        return this.tamanho;
    }

    //setters - atuaaliza e informa dados nos atributos

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public void getTamanho(Double tamanho){
        this.tamanho = tamanho;
    }

        //toString

        public String toString(){
            return "caneta \nTamanho: " + this.tamanho + "\n\tCor: " + this.cor + "\n\tMarca: " + this.marca;
        }
}