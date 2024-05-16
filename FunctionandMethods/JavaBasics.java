
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
    public static int binCoeffient(int n, int r){
      int num1 =factorial(n);
       int r1=factorial(r);
      int nmr=factorial(n-r);
      int binCoeffient = num1/(nmr*r1);
      return binCoeffient;
    }
    public static void main(String args[]){
      System.out.println("Enter 2 no.s for binomial Coeffient calculation:");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int r=sc.nextInt();
      System.out.println("Binomial Coeffient of 2no. is:"+binCoeffient(n,r));
    }
   }
*/
   /*
OUTPUT:
Enter 2 no.s for binomial Coeffient calculation:
5
2
Binomial Coeffient of 2no. is:10
 */

// import java.util.*;
// public class JavaBasics{
//   public static boolean isPrime(int n) {
//     if(n==2){
//       return true;
//     }
//     for(int i=2;i<=n-i;i++){
//       if(n%i==0){
//         return false;
//       }
//     }
// return true;
// }
// public static void main(String args[]){
//   System.out.println(isPrime(25));
// }
// }
//OUTPUT:
//false

// FIND PRIME NUMBERS WITHIN GIVEN RANGE:

// import java.util.*;
// public class JavaBasics{


// public static boolean isPrime(int n){
  
//     if(n==2){
//       return true;
//     }
//     for( int i=2; i<=n-1; i++){
//       if(n%2==0){
//         return false;
//       }
//     }
//     return true;
// }

// public static void primeInRange(int n){
//   for(int i=2;i<=n-1;i++){
//     if(isPrime(i)){
//     System.out.println(i+" ");
//     }
//   }
// }
// public static void main(String args[]){
//   primeInRange(20);
// }
// }

/*
2 
3 
5 
7 
9 
11 
13 
15 
17 
19 
 */

 //Code to convert Binary Number to Decimal Number:

//  import java.util.*;
// public class JavaBasics{
// public static void bintoDec(int binNum){
//   int myNum = binNum;
//   int pow=0;
//   int decNum=0;
//   while(binNum>0){
//     int lastDigit = binNum%10;
//     decNum=decNum+(lastDigit*(int)Math.pow(2,pow));
//     pow++;
//     binNum = binNum/10;
//   }
//   System.out.println("Decimal of"+myNum+"="+decNum);
  
//  }
// public static void main(String args[]){
//   bintoDec(100);
// }
// }

//OUTPUT:
//Decimal of100=4