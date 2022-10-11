// entendendo a passagem de parâmetros
public class Calculadora{
    private Double resultado;


    public Double soma(Double vlr1, Double vlr2){
        this.resultado = vlr1 + vlr2;
        return this.resultado;
    }

    public Double subtracao(Double vlr1, Double vlr2){
        this.resultado = vlr1 - vlr2;
        return this.resultado;
    }

    public Double divisao(Double vlr1, Double vlr2){
        this.resultado = vlr1 / vlr2;
        return this.resultado;
    }

    public Double multiplicacao(Double vlr1, Double vlr2){
        return vlr1 * vlr2;
    }

    public Double percentual(Double valor, Double percentual){
        this.resultado = valor * percentual;

        return this.resultado;
    }
            
}