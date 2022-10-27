public class Lamp{
    private String type;
    private int volts;
    private String color;
    private String marca;
    private Double price;
    private int potency;
    private boolean status;

    public lamp(){}
    public lamp(String type, int volts, String color, String marca, Double price, int potency, boolean status){
        this.type = tipo;
        this.volts = voltagem;
        this.color = cor;
        this.marca = marca;
        this.price = preço;
        this.potency = potencia;
        this.status = status;
    }
    public String GetType(){
        return this.type;
    }
    public String GetVolts(){
        return this.volts;
    }
    public String GetColor(){
        return this.color;
    }
    public String GetMarca(){
        return this.marca;
    }
    public String GetPrice(){
        return this.price;
    }
    public String GetPotency(){
        return this.potency;
    }
    public String GetStatus(){
        return this.status;
    }
    public toString(){}

    public void lightUp(boolean status2){
        this.status = true;
    }
    public void darkUp(boolean status2){
        this.status = false;
    }
}