import java.util.Scanner;

public class memoziationFibonacci{
    //Array to store previoulsy calculated values
    public static int[] memo;

    public static int fibonacciOfN(int n){
    if ( n== 0) return 0;
    if (n ==1) return 1;  //base cases

   // If already calculated return stored value
    if (memo[n] != -1) return memo[n];
    
    // Otherwise, calculate and store the value 
    memo[n] = fibonacciOfN(n - 1) + fibonacciOfN(n - 2);
    return memo[n];
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        //initialize memoization array with -1(indicating uncalculated values)
        memo = new int[n + 1];
        for (int i = 0 ; i <= n; i++){
            memo[i] = -1;
        }

        System.out.println("Fibonacci series up to " + n + " terms:");
        for(int i = 0; i < n; i++) {
            System.out.println(fibonacciOfN(i) + " ");
        }
        sc.close();
    }
}