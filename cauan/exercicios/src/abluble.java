public class abluble {
    String disciplina;
    String DiaDeAula;
    String dúvidas;

public void DarAula(String Dia){
    if (Dia == this.DiaDeAula){
        System.out.println("Correto. Professor dará aula neste dia");
    }else {
       System.out.println("Professor não dará aula neste dia");
    }

}


public void tirarDuvidas(String msg){
    if (msg == this.dúvidas){
        System.out.println("A nota da sua prova foi acima da média.");
    }else {
        System.out.println("A nota da sua prova foi abaixo da média");
    }
    
}
}