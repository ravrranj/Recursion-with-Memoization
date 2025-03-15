import java.util.Scanner;

public class recursionFibonacci{
  public static int fibonacciOfN(int n){
    if( n== 0){     //base case 1
        return 0;
    } if ( n==1){   //base case 2
        return 1;
    } 

  //recursion call
  return fibonacciOfN(n - 1) + fibonacciOfN( n - 2);

}
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter the value of n :");
int n = sc.nextInt();

System.out.println("Fibonacci series up to " + n + "terms: ");
for(int i = 0 ; i < n; i++){
  System.out.println(fibonacciOfN(i) + " ");
}
sc.close();

}
}