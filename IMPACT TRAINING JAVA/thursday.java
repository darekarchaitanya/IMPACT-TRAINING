public class thursday {
  
}
/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

// public class Main
// {
// 	public static void main(String[] args) {
// 	    int num = 2556;
	    
// 	    while(num>=10){
// 	        int sum = 0;
// 	        while(num !=0){
// 	            sum+= num % 10;
// 	            num/=10;
// 	        }
// 	        num = sum;
// 	    }
// 		System.out.println(num);
// 	}
// }


// import java.util.*;
// public class Main {
    
//     static int reverse(int num) {
//         int rev = 0;
//         while (num != 0) {
//             rev = rev * 10 + num % 10;
//             num /= 10;
//         }
//         return rev;
//     }

//     public static void main(String[] args) {
//         int num = 12; 

//         int square = num * num;
//         int reverseNum = reverse(num);
//         int reverseSquare = reverseNum * reverseNum;
//         int reverseOfReverseSquare = reverse(reverseSquare);

        
//         if (square == reverseOfReverseSquare) {
//             System.out.println(num + " is an Adam number.");
//         } else {
//             System.out.println(num + " is NOT an Adam number.");
//         }
//     }
// }


// public class Main {
//     public static void main(String[] args) {
//         int num = 1634;  
//         int temp = num;
//         int sum = 0;

//         while (temp > 0) {
//             int digit = temp % 10;
//             sum += digit * digit * digit * digit; 
//             temp = temp / 10;
//         }

//         if (sum == num) {
//             System.out.println(num + " is an Armstrong number.");
//         } else {
//             System.out.println(num + " is NOT an Armstrong number.");
//         }
//     }
// }












// import java.util.*;
// public class Main{
//     public static void main(String[]args){
//         int num = 2357;
//         int temp = num;
//         int sum = 0;
        
//         while(temp > 0){
//             int digit = temp % 10;
//             sum+= digit * digit * digit *digit;
//             temp = temp / 10;
            
            
//         }
//         if (sum == 0){
//             System.out.println(num + "is an ArmStrong number");
//         }else {
//             System.out.println(num + "is not an Armstrong number");
//         }
//     }
// }




















// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         int num = 45;  
//         int square = num * num;
//         int temp = square;
//         int digits = 0;

        
//         while (temp > 0) {
//             digits++;
//             temp /= 10;
//         }

        
//         int power = 1;
//         for (int i = 1; i < digits; i++) {
//             power = power * 10;
//             int left = square / power;
//             int right = square % power;

//             if (right > 0 && left + right == num) {
//                 System.out.println(num + " is a Kaprekar number.");
//                 return;
//             }
//         }
        
//         if(num == 1){
//             System.out.println(num + "is an kaprekar number");
//         }
//         else{
//             System.out.println(num + "is Not an kaprekar number");
//         }

        
       
// //     }
// // }

// import java.util.*;
// public class Main{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int count = 0;
//         int sq = num*num;
//         while (num != 0){
//             num/=10;
//             count++;
//         }
//         int power=(int) Math.pow(10, count);
//         int right=sq%power;
//         int left=sq/power;
//         if((left+right)==temp){
            
        
//             System.out.println("kaprekar Number");
//         }
//         else{
//             System.out.println("Not kaprekar Number");
//         }
//     }
// }


// public class Main {
//     public static void main(String[] args) {
//         int n = 5; 

//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println(); 
//         }
//     }
// }
