public class prof{
    String materia;
    String horario;
    String Dia_de_aula;
    String Duvidas;

    horario = "27:30";
    materia = "SPAMcamento";

    public void DarAula(String Dia){
        if (Dia == this.Dia_de_aula){
            System.out.println("hoje teremos aula pessoal as " + horario);
        } else {
            System.out.println("hoje não teremos aula pessoal");
        }
        System.out.println("...ensinando " + materia + "...");

    }
   
    public void tirarDuvidas(String mensage){

        if (mensage == this.Duvidas){
            System.out.println("");
        }
    }
}