public class friday2 {
  
}


// // hollowSquare
// public class Main {
//     public static void main(String[] args) {
//         int n = 4; 

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
                
//                 if (i == 0 || i == n-1 || j == 0 || j == n-1) {
//                     System.out.print("* ");
//                 } else {
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println(); 
//         }
//     }
// }

// sum of the size of the array

// import java.util.*;
// public class Main{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter array size");
//         int n = sc.nextInt();
//         int arr[]=new int[n];
//         System.out.println("Enter elements");
//         for(int i = 0; i<n; i++){
//             arr[i] = sc.nextInt();
            
//         }
//         int sum = 0;
//         System.out.println("elements in the array:");
//         for(int i = 0; i<n; i++){
//             sum+=arr[i];
//             System.out.println(arr[i]+"");
//         }
//         System.out.println("sum: "+sum);
//     }
// }



// Give two array and sum this two array and the sum of this two array is same or not

// import java.util.*;
// public class Main{
//     public static void main(string[]args){
//         Scanner sc = new scanner(System.in);
//         System.out.println(s:"Enter the size of array1:");
//         int m = sc.nextInt();
//         System.out.println(s:"Enter the size of array2:");
//         int n = sc.nextInt();
//         int arr1[]=new int [m];
//         int arr2[]=new int[n];
//         int s=0, s1=0;
//         System.out.println(x:"Array");
        
//         for(int i=0; i<m; i++){
//             arr1[i]=sc.nextInt();
//             s+=arr1[i];
//         }
//         System.out.println(x:"array2");
//         for(int i=0; i<n; i++){
//             arr2[i]=sc.nextInt;
//             s1+=arr2[i];
//         }
//     }
// }





// distinct Number

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

        
//         int n = sc.nextInt();
//         int[] arr = new int[n];

        
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

        
//         Set<Integer> set = new HashSet<>();

//         for (int i = 0; i < n; i++) {
//             set.add(arr[i]);
//         }

    
//         System.out.println(set.size());
//     }
// }


// Sort the array in ascending 

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter size of array: ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];

        
//         System.out.println("Enter array elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         Arrays.sort(arr);

//         System.out.println("Sorted array:");
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }


