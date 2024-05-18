// import java.util.*;
// public class InvertedAndRotatedHalfPyramid{
//     public static void Inverted(int n){
//         for(int i=1;i<=n;i++){
//             //spaces
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
        
//     }
//     public static void main(String args[]){
//         Inverted(4);
//     }
// }
/*OUTPUT:
   *
  **
 ***
****

*/
//CODE TO PRINT HALF PYRAMID 
// import java.util.*;
// public class InvertedAndRotatedHalfPyramid{
//     public static void HalfPyramid(int n){
//         for(int i=1;i<=n;i++){
//             //spaces
//             for(int j=1;j<=n-i;j++){
//                 System.out.print("");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
        
//     }
//     public static void main(String args[]){
//         Inverted(4);
//     }
// }


/*
OUTPUT:
*
**
***
****


*/ 


// public class JavaBasic{
//   public static void inverted_half_pyramid_withNumbers(int n){
//     for(int i=1;i<=n;i++){
//       //inner - numbers
//       for(int j=1;j<=n-i+1;j++){
//         System.out.print(j);
//       }
//       System.out.println();
//     }
//   }
//   public static void main(String args[]){
//     inverted_half_pyramid_withNumbers(5);
//   }
// }

//OUTPUT:
/*
12345
1234 
123  
12   
1   
 */

//  public class JavaBasic{
//   public static void flyods_triangle(int n){
//     int counter = 1;
//     for(int i=1;i<=n;i++){
//       for(int j=1;j<=i;j++){
//       System.out.print(counter);
//       counter++;
//       }
//       System.out.println();
//     }
//   }

//   public static void main(String args[]){
//     flyods_triangle(4);
//   }
//  }
//OUTPUT:
/*
1
23
456
78910
 */

//  public class JavaBasic{
//   public static void zero_One_triangle(int n){
//     for(int i=1;i<=n;i++){
//       for(int j=1;j<=i;j++){
//         if((i+j)%2==0){
//           System.out.print("1");
//         }else{
//           System.out.print("0");
//         }
//       }
//       System.out.println();
//     }
//   }
//   public static void main(String args[]){
//     zero_One_triangle(5);
//   }
//  }
//  OUTPUT:
// 1
// 01
// 101
// 0101
// 10101

// public class JavaBasic{
//   public static void rhombus(int n){
//     for(int i=1;i<=n;i++){
//       //Spaces-(n-i)
//       for(int j=1;j<=n-i;j++){
//         System.out.print(" ");
//       }
//       //Stars-i
//       for(int j=1;j<=n;j++){
//         System.out.print("*");
//       }
//       System.out.println();
//     }
    
//   }
// public static void main(String args[]){
//   rhombus(5);
// }

// }
//OUTPUT:
// *****
// *****
// *****
// *****
// *****

// public class JavaBasic{
//   public static void hollow_Rhombus(int n){
//     for(int i=1;i<=n;i++){
//       //spaces-(n-i)
//       for(int j=1;j<=(n-i);j++){
//         System.out.print(" ");
//       }
//       //Hollow-RHOMBUS
//       for(int j=1;j<=n;j++){

//         if(i==1||i==n||j==1||j==n){
//           System.out.print("*");
//         }else{
//           System.out.print(" ");
//         }

//       }
//       System.out.println();
//     }
//   }

//   public static void main(String args[]){
//     hollow_Rhombus(5);
//   }
// }

// PS D:\DELTA RESTART\JavaBASICS> cd "d:\DELTA RESTART\JavaBASICS\" ; if ($?) { javac JavaBasic.java } ; if ($?) { java JavaBasic }
//     *****
//    *   *
//   *   *
//  *   *
// *****

//PRINT DIAMOND PATTERN
// public class JavaBasic{
//   public static void diamond(int n){
//     //1st half
//     for(int i=1; i<=n;i++){
//       //spaces-(n-i)
//       for(int j=1;j<=(n-i);j++){
//         System.out.print(" ");
//       }
//       //stars-> (2*i)-1
//       for(int j=1;j<=(2*i)-1;j++){
//         System.out.print("*");
//       }
//       System.out.println();
//     }
//     //2nd half
//     for(int i=n;i>=1;i--){
//       //spaces-(n-i)
//       for(int j=1;j<=(n-i);j++){
//         System.out.print(" ");
//       }
//       //stars-> (2*i)-1
//       for(int j=1;j<=(2*i)-1;j++){
//         System.out.print("*");
//       }
//       System.out.println();
//     }
//     }
//     public static void main(String args[]){
//       diamond(4);
//   }
// }

//OUTPUT:
//    *
//   ***
//  *****
// *******
// *******
//  *****
//   ***
//    *
