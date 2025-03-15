import java.util.Scanner;

public class recursionPower {
  public static int powerOfX( int x, int n){
  if (n == 0){  //base case
    return 1;
  }

  //recursive call 
  int halfPower = powerOfX(x, n/2);
   if ( n % 2 == 0) {
    return halfPower * halfPower; 
   } else {
    return x * halfPower * halfPower;
   }
  }

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the value of x: ");
    int x = sc.nextInt();

    System.out.print("Enter the value of n: ");
    int n = sc.nextInt();

    int output = powerOfX(x, n);
    System.out.println("Result :" + output);
    sc.close();
  }

}