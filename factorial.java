import java.util.Scanner;
public class factorial{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        int n=sc.nextInt();
        int i=1,fact=1;
           while(i<=n)
           {
             fact=fact*i;
             i++;

           }
        System.out.println("factorial of the number: "+fact);
    }
}