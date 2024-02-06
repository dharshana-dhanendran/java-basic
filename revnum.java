import java.io.*;
import java.util.*;

class Revnum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int revnum = 0;
        int lastdigit;
        while (n > 0) {
            lastdigit = n % 10;
            n = n / 10;
            revnum = (revnum * 10) + lastdigit;
            System.out.println(revnum);
        }

    }
}