import java.io.*;
import java.util.*;

class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0, temp = n;
        int lastdigit;
        while (n > 0) {
            lastdigit = n % 10;
            sum = (sum + lastdigit * lastdigit * lastdigit);
            n = n / 10;

        }
        if (sum == temp) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

}
