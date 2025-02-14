package CriacaoDeMetodos01;

public class ProgramEntitie {
    public int a;
    public int b;
    public int c;
    

    public int max() {
        int biggerNum;

        if(a > b && a > c) {
            biggerNum = a;
        } else if(b > c) {
            biggerNum = b;
        } else {
            biggerNum = c;
        }

        return biggerNum;
    }


}
