import java.util.*;
class Fibonacci{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double no1,no2;
        int n;
        
        System.out.print("Enter 1st number: ");
        no1=sc.nextDouble();
        
        System.out.print("Enter 2st number: ");
        no2=sc.nextDouble();

        System.out.print("Enter nth fibonacci number to find: ");
        n=sc.nextInt();
        for(int i=3;i<=n;i++){
            double temp=no1+no2;
            no1=no2;
            no2=temp;
 //           System.out.println(i+" : "+temp);
        }
        System.out.println(n+"th Fibonacci number : "+no2);
    }
}