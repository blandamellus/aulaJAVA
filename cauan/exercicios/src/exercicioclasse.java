class nota{
    
    String nomeMateria;
    String nomeAluno;
     
    int resultado;
    
    int nota1;
    int nota2;
    int nota3;
    int nota4;
}


public class exercicioclasse {
    public static void main (String args[]) throws Exception{
        nota minhanota;
       
        minhanota = new nota();
       //informaçoes do aluno e materia
        minhanota.nomeMateria = "Biologia";
        minhanota.nomeAluno = "Cauan";
        //notas e resultado
        minhanota.nota1 = 6;
        minhanota.nota2 = 4;
        minhanota.nota3 = 6;
        minhanota.nota4 = 8;
        minhanota.resultado = minhanota.nota1 + minhanota.nota2 + minhanota.nota3 + minhanota.nota4 ;
       //demonstração final
        System.out.println("A nota de " + minhanota.nomeAluno + " é igual a " + minhanota.resultado + " na media final de " + minhanota.nomeMateria);





    }
    
}
