package CriacaoDeMetodos02;

public class Ativ01_01Entitie {
    public int numero;

    public String verificacao () {
        String resposta;

        if (numero > 0) {
            resposta = "O numero é positivo";
        } else if (numero < 0) {
            resposta = "O numero é negativo";
        } else {
            resposta = "O numero é igual a zero";
        }

        return resposta;
    }
}
