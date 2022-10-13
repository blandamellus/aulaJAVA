public class lampada{
    private String cor, marca, tipo;
    private int voltagem;
    private Double preço;
    private int potencia;
    private Boolean status;

    public lampada(){}
    public lampada(String cor, String marca,
    String tipo, int voltagem, int potencia, Double preço, Boolean status){
        this.cor = cor;
        this.marca = marca;
        this.tipo = tipo;
        this.voltagem = voltagem;
        this.potencia = potencia;
        this.preço = preço;
        this.status = status;
    }
    
    public String getcor(){
        return this.cor;
    }
    public String getMarca(){
        return this.marca;
    }
    public String getTipo(){
        return this.tipo;
    }
    public int getVoltagem(){
        return this.voltagem;
    }
    public Double getPreço(){
        return this.preço;
    }
    public int getPotencia(){
        return this.potencia;
    }
    public Boolean getStatus(){
        return this.status;
    }

    public void setCor(String cor){
        this.cor = cor;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setVoltagem(int voltagem){
        this.voltagem = voltagem;
    }
    public void setPotencia(int potencia){
        this.potencia = potencia;
    }
    public void setPreço(Double preço){
        this.preço = preço;
    }
    public void setStatus(Boolean status){
        this.status = status;
    }
    //to string
    public String toString(){
        return " Lampâda \n\tTipo: " + this.tipo + "\n\tCor: " +
        this.cor + "\n\tMarca: " + this.marca + "\n\tVoltagem: " +
        this.voltagem + "\n\tPotencia: " + this.potencia + "\n\tPreço: " +
        this.preço + "\n\tStatus: " + this.status;
    

    }
    public void ligar(){
        this.status = true;
        System.out.println("Ligada");

    }
    public void desligar(){
        this.status = false;
        System.out.println("Desligada");
    }
}