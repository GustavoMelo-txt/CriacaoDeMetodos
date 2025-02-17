package CriacaoDeMetodos02;

public class Ativ05_01Entitie {
    public int idade;

    public String categoriaIdade () {
        String resultado;

        if (idade <= 12 && idade > 0) {
            resultado = "\nEssa pessoa é uma criança.";
        } else if (idade > 12 && idade <= 17) {
            resultado = "\nEssa pessoa é um adolescente";
        } else if (idade > 17 && idade <= 64) {
            resultado = "\nEssa pessoa é um adulto";
        } else if (idade > 64){
            resultado = "\nEssa pessoa é um idoso";
        } else {
            resultado = "\nIdade Invalida!";
        }

        return resultado;
    }
}
