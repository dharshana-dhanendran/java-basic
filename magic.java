import java.io.*;
import java.util.*;

public class magic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        if (n > 0 || n > 9) {
            n = sum;
            sum = 0;
        }
        sum += n % 10;
        n += n / 10;

        if (sum == 1)

        {
            System.out.println("magic number");
        } else {
            System.out.println("Not magic number");
        }

    }
}
