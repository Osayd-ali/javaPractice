package Methods;

public class Studentchallenge2 {
    static void max(int ...x){
        int max_num=x[0];
        for(int i=0; i<x.length; i++){
            if(x[i]>max_num){
                max_num = x[i];
            }
        }
        System.out.println("Max of the numbers is: "+ max_num);
    }
    static void sum(int ...x){
        int sum_n = 0;
        for(int i=0; i<x.length; i++){
            sum_n=sum_n+x[i];
        }
        System.out.println("The sum of numbers is: "+sum_n);
    }
    static double discount(double ...price){
        double sum = 0;
        double discount_price;
        for(int i=0; i<price.length; i++){
            sum = sum + price[i];
        }
        if(sum > 50 && sum <100){
            discount_price = sum * 0.10;
            return discount_price;
        }
        else if(sum>100){
            discount_price = sum * 0.25;
            return discount_price;
        } else {
            discount_price = sum * 0.05;
            return discount_price;
        }
    }
    public static void main(String args[]){
        max(4,6,8,10);
        sum(2,4,6,8);
        System.out.println("The discounted amount is: "+ discount(20,30,40));
    }
}