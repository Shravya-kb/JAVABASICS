
package FunctionandMethods;
/*import java.util.*;

public class functions {
    public static int calculateSum(int num1, int num2){//formal parameters
        int sum = num1+num2;
        return sum;
    }
    public static void main(String args[]){
        System.out.println("Enter 2 no.s:");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int sum = calculateSum(num1, num2);//actual parameters
        System.out.println("sum of 2 no.s are:"+sum);
    }
}

OUTPUT:
Enter 2 no.s:
5
6
sum of 2 no.s are:11

*/

/*IMPORTANT INTERVIEW QUESTION:
 In JAVA WHEN WE PASS A VALUE TO A FUNCTION THEN HOW WILL IT BE PASSED? IS IT 
 PASSED CALL BY VALUE ( copy of the value is passed )OR CALL BY REFERENCE(actual value is passed)?

 ANSWER: In Java always values are passed in call by value
  (always copy of the value is passed and not the actual number).
 
 */

 /*import java.util.*;
 public class functions{
    public static int multiplyVal(int a,int b){
        int multiply = a*b;
        return multiply;
    }
    public static void main(String args[]){
        System.out.println("Enter 2 no.s which u want to multiply:");
        Scanner sc= new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int multiply = multiplyVal(a, b);
        System.out.println("Product of 2 no.s is:"+multiply);
    }
 }
 */
 /*
 OUTPUT:
  Enter 2 no.s which u want to multiply:
5
6
Product of 2 no.s is:30

=== Code Execution Successful ===
  */
/* 
  import java.util.*;
  public class functions{
    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String args[]){
        System.out.println("Factorial is:"+factorial(4));
    }
  }
  */

  /*
   OUTPUT:
 Factorial is: 24
   */