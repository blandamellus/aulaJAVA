

public class Caneta{
    public String marca;
    public String cor;
    public  Double tamanho;

    public String getmarca(){
     return this.marca;

    }
    

    public String getCor(){
      return  this.cor;
    
    }
    public Double getTamanho(){
        return  this.tamanho;

    }
 
    public void setMarca(String marca){
        this.marca=marca;
    }
    
     public void setCor(String cor) {
        this.cor=cor;
    }

    public void setTamanho(Double tamanho) {
        this.tamanho = tamanho;
    }

    public String toString(){
        return"Caneta\n\tTamanho:"
        + this.tamanho + "\n\tCor:"
        +this.cor + "\n\tMarca:"
        + this.marca;

    }
            
}



