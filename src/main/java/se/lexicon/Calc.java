package se.lexicon;

public class Calc {

    public static void main(String[] args){
        Calc c = new Calc();
        int x= 40;
        int y = 20;
       int result = c.sub(x,y);
        System.out.println(result);
        result = c.sum(x,y);
        System.out.println(result);
        result = c. mul(x,y);
        System.out.println(result);
        result = c.div(x, y);
        System.out.println(result);
    }

    public int sub(int x,int y) {
        return x - y;
    }

    public int sum (int x,int y) {
        return x + y;
    }
    public int mul( int x,int y){
        return  x*y;

    }
    public  int div(int x, int y){
        return x/y;
    }
}
