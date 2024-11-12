package Methods;

public class varargs {
    static void show(int ...A)
    {
        for(int x:A)
        {
            System.out.println(x);
        }
    }
    static void showList(int start, String ...S){
        for(int i=0; i<S.length; i++){
            System.out.println(start + ". "+S[i]);
            start++;
        }
    }
    public static void main(String args[]){
        show();
        show(10,20,30);
        showList(5, "John", "Smith", "Ajay", "Ahmed", "Mark", "Suresh");
    }
}