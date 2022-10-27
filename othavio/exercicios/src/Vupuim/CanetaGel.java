package Vupuim;

public class CanetaGel extends Caneta {
    private String aroma;
    private boolean glitter;
    private boolean pontaMacia;

//area getters

    public String getGlitter(){
        String glitter;
        if(this.glitter == true)
            glitter = "Caneta com glitter!";
        else{
            glitter = "Caneta sem glitter!";
        }
        return glitter;
    }
    public String getAroma(){
        return this.aroma;
    }
    public String getPontaMacia(){
        String pontaMacia;
        if(this.pontaMacia == true)
            pontaMacia = "Caneta com Ponta Macia!";
        else{
            pontaMacia = "Caneta sem Ponta Macia!";
        }
        return pontaMacia;
    }

//area setters

    public void setAroma(String aroma){
        this.aroma = aroma;
    }
    public void setGlitters(boolean glitter){
        this.glitter = glitter;
    }
    public void setPontaMacia(boolean pontaMacia){
        this.pontaMacia = pontaMacia;
    }

    public String escrever(){
        return  "Escrevendo com caneta gel";
    }
    public String colorir(){
        return  "Colorindo";
    }
    public String destacar(){
        return "Destacando";
    }
    public String toString(){
        String m = " ";
        m += "Caneta gel \n\tAroma: " + this.aroma;
        m += "\n\tGlitter: " + this.glitter;
        m += "\n\tPonta Fina: " + this.pontaMacia;

        return m;
        
    }
    
    
}
