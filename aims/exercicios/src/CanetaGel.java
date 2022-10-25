public class CanetaGel extends Caneta{
    private String aroma;
    private boolean glitter;
    private boolean pontaMacia;


    //GETTERS
    //busca os dados do atributo aroma 

    public String getAroma (){
        return this.aroma;
    }

    public String getGlitter (){
        String glitter;
        if(this.glitter== true){
            glitter = "caneta com glitter";
        }else{
            glitter = "caneta sem glitter";
        }
        return glitter;
    }

    public String getPontaMacia(){
        String pontaMacia;
        if(this.pontaMacia == true){
            pontaMacia = "caneta com ponta macia";
        }else{
            pontaMacia = "caneta sem ponta macia";
    
        }
        return pontaMacia;

    }

    //SETTERS
    // atualiza 

    public void setAroma(String aroma){
        this.aroma = aroma;
    } 

    public void setGlitter(boolean glitter){
        this.glitter = glitter;
    }

    public void setPontaMacia(boolean pontaMacia){
        this.pontaMacia = pontaMacia;
    }

    //metodos

    public String escrever (){
        return "escrevendo com caneta gel";
    }

    public String colorir (){
        return "colorindo com caneta gel";
    }

    public String destacar(){
        return "destacando com caneta gel";
    }

    public String toString(){
        String t = "";
        t += "Caneta \n\t Aroma:" + this.aroma;
        t += "\n\t Glitter:" + this.getGlitter();
        t += "\n\t Ponta:" + this.pontaMacia;
        return t;
    }

}



