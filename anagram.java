import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

class anagram {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        int n=str1.length();
        int m=str2.length();
        if(n==m){
            char[]arr1=str1.toCharArray();
            char[]arr2=str2.toCharArray();
        }
        //sort array
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean isAnagram=Arrays.equals(arr1,arr2){
        
            System.out.println("Anagram"+isAnagram);
        }


    }

}
