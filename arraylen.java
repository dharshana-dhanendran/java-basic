// import java.io.*;
// import java.util.*;

// class Arraylen {
//     public static void main(String arg[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         int max = arr[0];
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//         }
//         System.out.println("length" + max);

//     }
// }

import java.util.*;

class Arraylen {

    public static void main(String args[]) {

        int arr1[] = { 2, 5, 1, 3, 0 };
        System.out.println("The Largest element in the array is: " + findLargestElement(arr1));

        int arr2[] = { 8, 10, 5, 7, 9 };
        System.out.println("The Largest element in the array is: " + findLargestElement(ar5r2));
    }

    static int findLargestElement(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}