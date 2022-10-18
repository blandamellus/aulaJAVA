package Xerneas;

public class Lampada {
    private String tipo;
    private int voltagem;
    private String cor;
    private String marca;
    private Double preco;
    private int potencia;
    private boolean status;

    public class Lampada(){

    }
    public Lampada(String tipo,int voltagem,String cor,String marca,Double preco,int potencia,boolean status);{
        this.tipo = tipo;
        this.voltagem = voltagem;
        this.cor = cor;
        this.marca = marca;
        this.preco = preco;
        this.potencia= potencia;
        this.status = status;
    }
    public String getTipo(){
        return this.tipo;
    }
    public int getVoltagem(){
        return this.voltagem;
    }
    public String getCor(){
        return this.cor;
    }
    public String getMarca(){
        return this.marca;
    }
    public Double getPreco(){
        return this.preco;
    }
    public int getPotencia(){
        return this.potencia;
    }
    public boolean getStatus(){
        return this.status;
    }
    public void setTipo(String tipo){
        if(tipo.contains(tipo)){
            this.tipo = tipo;
        }
    }
    public void setVoltagem(int voltagem){
        this.voltagem = voltagem;
    } 
    public void setCor(String cor){
        this.cor = cor;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setPreco(Double preco){
        this.preco = preco;
    }
    public void setPotencia(int potencia){
        this.potencia = potencia;
    }
    public void setStatus(boolean status){
        this.status = status;
    }
    public String toString(){
        return "cor \n\tTipo; " + this.tipo + "marca \n\tMarca: " + this.marca + "voltagem \n\tVoltagem: " + this.voltagem + "preco \n\tPreco: " + this.preco + "potencia \n\tPotencia: " + this.potencia + "status \n\tStatus: " + this.status; 
    }
    public void ascender(boolean status2){
        this.status = true;
    }
    public void apagar(boolean status2){
        this.status = false;
    }
}
