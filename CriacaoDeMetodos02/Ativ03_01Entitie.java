package CriacaoDeMetodos02;

public class Ativ03_01Entitie {
    public String palavra;

    public String checagemPalavra() {
        String resultado;

        if (palavra.equals("sim")) {
            resultado = "\nO usuario digitou \"sim\".";
        } else if (palavra.equals("Sim")){
            resultado = "\nO usuario digitou \"Sim\".";
        } else if (palavra.equals("Nao")) {
            resultado = "\nO usuario digitou \"Nao\".";
        } else if (palavra.equals("nao")) {
            resultado = "\nO usuario digitou \"nao\".";
        } else {
            resultado = "\nO usuario não digitou \"Sim\" ou \"Nao\".";
        }

        return resultado;
    }
}
