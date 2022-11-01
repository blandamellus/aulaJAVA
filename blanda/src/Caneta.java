public class Caneta{
    private String marca, cor;
    private Double tamanho;

    public Caneta(){}

    public Caneta(String marca){
        this.marca = marca;
    }
    
    public Caneta(String marca, String cor, Double tamanho){
        this.marca = marca;
        this.cor = cor;
        this.tamanho = tamanho;
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

    // setters - atualiza e informa dados nos atributos
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
        return "Caneta \n\tTamanho: " + this.tamanho + "\n\tCor: " + this.cor + "\n\tMarca: " + this.marca;

        // 2022-10-29 ISO
        // 29-10-2022 BR
        // 10-29-2022 ISO 86
    }

}