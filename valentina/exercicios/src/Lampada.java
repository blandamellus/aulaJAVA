public class Lampada{
    private String tipo;
    private String cor;
    private int voltagem;
    private String marca;
    private Double preço;
    private int potencia;
    private boolean status;

    public Lampada(){}
    public Lampada(String tipo, String cor, int voltagem, 
    String marca, Double preço, int potencia, boolean status){
        this.tipo = tipo;
        this.cor = cor;
        this.voltagem = voltagem;
        this.marca = marca;
        this.preço = preço;
        this.potencia = potencia;
        this.status = status;
    }
    public String getTipo(){
        return this.tipo;
    }
    public String getCor(){
        return this.cor;
    }
    public int getVoltagem(){
        return this.voltagem;
    }
    public String getMarca(){
        return this.marca;
    }
    public Double getPreço(){
        return this.preço;
    }
    public int getPotencia(){
        return this.potencia;
    }
    public boolean getStatus(){
        return this.status;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public void setVoltagem(int voltagem){
        this.voltagem = voltagem;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setPreço(Double preço){
        this.preço = preço;
    }
    public void setPotencia(int potencia){
        this.potencia = potencia;
    }
    public void setStatus(boolean status){
        this.status = status;
    }

    public String toString(){
        return "lampada \n\tTipo: " + this.tipo + "\n\tMarca: " + this.marca +
        "\n\tVoltagem: " + this.voltagem + "\n\tCor: " + this.cor + "\n\tPreço: " + this.preço + 
        "\n\tPotencia: " + this.potencia + "\n\tStatus: " + this.status;
    }

    public void ligar(){
        this.status = true;
        System.out.println("ligada");
    } 
    public void desligar(){
        this.status = false;
        System.out.println("desligada");
    }




}