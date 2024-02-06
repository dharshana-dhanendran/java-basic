import java.io.*;
import java.util.*;

class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd;
        gcd = (a % b * b);
        System.out.println(gcd);

    }

}
