//Status:
//    C-small: correct
//    C-large: not submitted
package codejam2016.qualification;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class C {
    Scanner sc = new Scanner(getClass().getResourceAsStream(IN));
    static final String PATH = "src/codejam2016/qualification/";
    static final String FILENAME = "C-large";
    static final String IN = FILENAME + ".in";
    static final String OUT = PATH + FILENAME + ".out";
    PrintStream out = System.out;
    PrintWriter outFile;
    boolean writeToFile = true;

    private void solve() throws IOException {
        int n = sc.nextInt();
        int j = sc.nextInt();

        long number = pow_int(2, n - 2) + 1;
        // System.out.println("number:" + number);

        for (int i = 0; i < j;) {
            String ans = "";
            String jamcoin = Long.toString(number, 2);
            // System.out.println("jamcoin:" + jamcoin);
            String result = check_jamcoin(jamcoin, n).replace("v", "");

            if (!result.equals("")) {
                ans = jamcoin + result;

                out.println(ans);
                System.out.println(ans);

                i++;
            }

            number++;
        }
    }

    private String check_jamcoin(String jamcoin, int N) {
        // System.out.println("check_jamcoin");
        if (jamcoin.length() != N || jamcoin.charAt(0) != '1'
                || jamcoin.charAt(jamcoin.length() - 1) != '1') {
            return "";
        }

        String result = "v";

        for (int base = 2; base <= 10; base++) {
            long number = parse_number_base(jamcoin, base);

            long div = 2;
            while (number % div != 0) {
                div++;
                if (div >= 100) {
                    return "";
                }
            }
            result += " " + div;
        }

        return result;
    }

    private long pow_int(int number, int pow) {
        // System.out.println("pow_int");
        long result = number;

        for (long i = 0; i < pow; i++) {
            result *= number;
        }

        return result;
    }

    private long parse_number_base(String jamcoin, int base) {
        // System.out.println("parse_number_base");
        try {
            BigInteger bi = new BigInteger(jamcoin, base);

            return bi.longValue();

        } catch (Exception e) {

        }

        return -1;
    }

    private void run() throws Exception {
        if (writeToFile) {
            out = new PrintStream(new FileOutputStream(OUT));
        }
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            out.println("Case #" + i + ": ");
            System.out.println("Case #" + i + ": ");
            solve();
        }
        sc.close();
        out.close();
    }

    public static void main(String args[]) throws Exception {
        new C().run();
    }
}
