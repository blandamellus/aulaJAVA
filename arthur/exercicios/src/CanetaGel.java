public class CanetaGel extends caneta{
    private String aroma;
    private Boolean glitter;
    private Boolean pontaMacia;

    public CanetaGel(){}
    public String getAroma(){
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
        else{
            pontaMacia = "Caneta sem ponta macia!";
        }
        return pontaMacia;
        }
    
    


    // AREA SETTERS
    //atualiza
    public void setAroma(String aroma){
        this.aroma = aroma;
    }
    public void setGlitter(Boolean glitter){
        this.glitter = glitter;
    }
    public void setPontaMacia(Boolean pontaMacia){
        this.pontaMacia = pontaMacia;
    }

    public String escrever(){
        return "Escrevendo com caneta gel";
    }
    public String colorir(){
        return "Colorindo com caneta gel";
    }
    public String Destacar(){
        return "Destacando com caneta gel";
    }
    
    // toString
    public String toString(){
        String m = "";
        m = super.toString() + "\n\t";
        m += "Caneta Gel \n\tAroma: " + this.aroma;
        m += "\n\tGlitter: " + this.getGlitter();
        m += "\n\tPonta Macia: " + this.getPontaMacia();  
        
        return m;
    }
    

}