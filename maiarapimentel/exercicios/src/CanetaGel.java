public class CanetaGel extends Caneta{
private String aroma;
private boolean glitter;
private boolean pontaMacia;


//busca os dados do atributo aroma
public String getAroma(){
    return this.aroma;
}

//true/false
public String getGlitter(){
    String glitter;
    if(this.glitter == true)
      glitter = "Caneta com Glitter";
    else{
        glitter = "Caneta sem glitter";
    }
    return glitter;
}

public boolean getPontaMacia(){
    String pontaMacia;
    if(this.pontaMacia == true)
       pontaMacia = "caneta com potna macia";
    else{
        pontaMacia = "caneta sem ponta macia";
    }
    return pontaMacia;
  
}

//AREA SETTERS
//atualiza

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

public String destacar(){
    return "destacando o texto";
}

public String toString(){
    return "Caneta gel \n\tAroma: " + this.aroma + "\n\t glitter: " + 
}

}