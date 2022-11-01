public class CanetaGel extends Caneta {
    private String aroma;
    private boolean glitter;
    private boolean pontaMacia;

    public String getAroma(){
        String aroma;
        return this.aroma;
    }

    public String getGlitter(){
        String glitter;
        if(this.glitter == true) 
            glitter = "Caneta com glitter!";
        else{
            glitter = "Caneta sem glitter!";
        }
        return glitter;
    }

    public String getPontaMacia(){
        String pontaMacia;
        if(this.pontaMacia == true)
            pontaMacia = "Caneta com ponta macia!";
         else {
            pontaMacia = "Caneta sem ponta macia!";
        }
        return pontaMacia;
    
    }

    public void setAroma(String aroma){
        this.aroma = aroma;
    }

    public void setGlitter(boolean glitter){
        this.glitter = glitter;
    }

    public void setPontaMacia(boolean pontaMacia){
        this.pontaMacia = pontaMacia;
    }

    public String escrever(){
        return "Escrevendo com a caneta gel";
    }

    public String colorir(){
        return "Colorindo";
    }

    public String destacar(){
        return "Destacando";
    }

    public String toString(){
        String caneta = "";
        caneta = super.toString() + "\n\t";
        caneta += "Caneta Gel \n\tAroma: " + this.aroma; 
        caneta += "\n\tGlitter: " + this.getGlitter(); 
        caneta += "\n\tPonta Fina: " + this.getPontaMacia();    
        return caneta;
    }
    


}