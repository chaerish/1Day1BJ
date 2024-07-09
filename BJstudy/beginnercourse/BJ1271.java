import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class BJ1271 {
    public static void main(String[] args) throws IOException {
        BigInteger n,m;
        Scanner sc = new Scanner(System.in);
        n =sc.nextBigInteger();
        m =sc.nextBigInteger();
        System.out.println(n.divide(m));
        System.out.println(n.remainder(m));
    }
}