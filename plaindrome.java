import java.io.*;
import java.util.*;

class plaindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        int temp = n;
        int lastdigit;
        while (n > 0) {
            lastdigit = n % 10;
            n = n / 10;
            rev = (rev * 10) + lastdigit;
            System.out.println(rev);
        }
        if (temp == rev) {
            System.out.println("plaindrome");
        } else {
            System.out.println("Not plaindrome");
        }

    }

}
