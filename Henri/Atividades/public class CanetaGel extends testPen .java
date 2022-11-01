public class CanetaGel extends testPen {
  private String aroma;
  private Boolean glitter;
  private Boolean pontaMacia;

  public String getAroma(){
    String aroma;
    if(this.aroma == true)
    aroma = "caneta com aroma";
    else{
        aroma = "caneta sem aroma";
    }
      return this.aroma;
  }

  public String getGlitter(){
      String glitter;
      if(this.glitter == true)
      glitter = "caneta com glitter";
      else{
          glitter = "caneta sem glitter";
      }
      return this.glitter;
  }

  public String getPontaMacia(){
    String pontaMacia;
    if(this.pontaMacia == true)
    pontaMacia = "caneta com ponta macia";
    else{
        pontaMacia = "caneta sem ponta macia";
    }
      return this.pontaMacia;
  }

  public void setAroma(String aroma){
      aroma = aroma;
  }

  public void setGlitter(Boolean glitter){
      glitter = glitter;
  }

  public void setPontaMacia(Boolean pontaMacia){
      pontaMacia = pontaMacia;
  }

  public String escrever(){
      return "Escrevendo com Caneta de gel";
  }

  public String colorir(){
      return "...Colorindo...";
  }

}