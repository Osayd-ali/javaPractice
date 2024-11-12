package lambdaExpressions;

interface MyLambda2{
    public int add(int x, int y);
}
public class lambdawithparams {
    public static void main(String[] args){
        MyLambda2 m2 = (a,b)->a+b;
        System.out.println(m2.add(5,2));
    }
}