public class Caneta {
    private String marca;
    private String cor;
    private Double tamanho;
    
    
    public Caneta(){}
    public Caneta (String marca, String cor, Double tamanho){
        this.marca = marca;
        this.cor = cor;
        this.tamanho = tamanho; 
    }
    
    //getters são para consultar os dados atributos

    public String getMarca(){
        return this.marca;
    }

    public String getCor(){
        return this.cor;
    }

    public Double getTamanho(){
        return this.tamanho;
    }

    //setters atualiza e inform dados nos atributos

    public void setMarca (String marca){
        this.marca = marca;   
    }

    public void setCor (String cor){
        this.cor = cor;
    }

    public void setTamanho (Double tamanho){
        this.tamanho = tamanho;
    }
    
    //to string 

    public String toString(){
        return "Caneta \n\tTamanho" + this.tamanho + "\n\tCor:" +this.cor + "\n\tMarca:" + this.marca;

    }
}