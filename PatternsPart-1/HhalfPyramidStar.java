// import java.util.*;
// public class HhalfPyramidStar{
//     public static void main(String args[]){
//         // System.out.println("Enter n:");
//         // Scanner sc=new Scanner(System.in);
//         // int n=sc.nextInt();
//         for(int line=1;line<=4;line++){
//             for(int star=1;star<=line;star++){
//             System.out.print(" * ");
//             }
      
//         System.out.println();
     //   }
  //  }
    
//}

// import java.util.*;
// class HelloWorld {
//     public static void main(String[] args) {
//         System.out.println("Enter the number of lines to be printed:" );
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int star=1;star<=n-i+1;star++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


/*
output:
********
*******
******
*****
****
***
**
*
done 
*/

/* import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Enter the number of lines to be printed:" );
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int star=1;star<=i;star++){
                System.out.print(star);
            }
            System.out.println();
        }
    }
} 
OUTPUT:
Enter the number of lines to be printed:
10
1
12
123
1234
12345
123456
1234567
12345678
123456789
12345678910

=== Code Execution Successful === */

/*import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Enter the number of lines to be printed:" );
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char ch='A';
        for(int i=1;i<=n;i++){
            for(int star=1;star<=i;star++){
                
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}


OUTPUT:

Enter the number of lines to be printed:5
A
BC
DEF
GHIJ
KLMNO


*/