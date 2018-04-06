//Status:
//    B-small: correct
//    B-large: 
package codejam2017.qualification;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class B {
    Scanner sc = new Scanner(getClass().getResourceAsStream(IN));
    static final String PATH = "src/codejam2017/qualification/";
    static final String FILENAME = "B-Sample";
    static final String IN = FILENAME + ".in";
    static final String OUT = PATH + FILENAME + ".out";
    PrintStream out = System.out;
    boolean writeToFile = true;

    private void solve() throws IOException {
        // TODO: Optimization for Large Dataset
        long ans = 0;
        StringBuilder nString = new StringBuilder(sc.next());
        long n = Long.parseLong(nString.toString());

        if (n < 10) {
            ans = n;
        } else if (n == 10) {
            ans = n - 1;
        } else {
            for (long i = n; i > 0; i--) {
                String iString = Long.toString(i);
                int countTrue = 0;

                for (int j = iString.length() - 1; j > 0; j--) {
                    if (Character
                            .getNumericValue(iString.charAt(j)) >= Character
                                    .getNumericValue(iString.charAt(j - 1))) {
                        countTrue++;
                    }
                }

                if (countTrue == iString.length() - 1) {
                    ans = i;
                    break;
                }
            }
        }

        System.out.println(ans);
        out.println(ans);
    }

    private void run() throws Exception {
        if (writeToFile) {
            out = new PrintStream(new FileOutputStream(OUT));
        }
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            System.out.println("Case #" + i + ": ");
            out.print("Case #" + i + ": ");
            solve();
        }
        sc.close();
        out.close();
    }

    public static void main(String args[]) throws Exception {
        new B().run();
    }
}
