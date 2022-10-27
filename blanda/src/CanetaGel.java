public class CanetaGel extends Caneta {
    private String aroma;
    private boolean glitter;
    private boolean pontaMacia;

    //AREA GETTERS
    // busca os dados do atributo aroma
    public String getAroma(){
        return this.aroma;
    }

    // true / false
    // public boolean getGlitter(){
    //     return this.glitter;
    // }

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
        if(this.pontaMacia == true){
            pontaMacia = "Caneta com ponta macia";
        }else{
            pontaMacia = "Canea sem ponta macia";
        }
        return pontaMacia;
    }

    //AREA SETTERS
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

    public String escrever(){ 
        return "Escrevendo com caneta gel";
    }

    public String colorir(){
        return "colorindo";
    }

    // fazer método Destacar()

    // fazer método padrão toString()
    public String toString(){
        // m = m + "Caneta gel ..."
        String m = "";
        m = super.toString();
        m += "Caneta Gel \n\tAroma: " + this.aroma;
        m += "\n\tGlitter: " + this.glitter;
        m += "\n\tPonta Fina: " + this.pontaMacia;

        return m;
    }





    


}

// Caneta teste = new Caneta();
