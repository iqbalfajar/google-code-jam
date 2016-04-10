//Status:
//    D-small: correct
//    D-large: wrong try
package codejam2016.qualification;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class D {
    Scanner sc = new Scanner(getClass().getResourceAsStream(IN));
    static final String PATH = "src/codejam2016/qualification/";
    static final String FILENAME = "D-large";
    static final String IN = FILENAME + ".in";
    static final String OUT = PATH + FILENAME + ".out";
    PrintStream out = System.out;
    PrintWriter outFile;
    boolean writeToFile = true;

    private void solve() throws IOException {
        int k = sc.nextInt();
        int c = sc.nextInt();
        int s = sc.nextInt();
        String ans = "";

        if (k == 1) {
            ans = "1";
        } else if (c == 1) {
            if (s < k) {
                ans = "IMPOSSIBLE";
            } else {
                ans = solutions(1, k + 1);
            }
        } else if (s < k - 1) {
            ans = "IMPOSSIBLE";
        } else {
            ans = solutions(2, k + 1);
        }

        out.println(ans);
        System.out.println(ans);
    }

    private String solutions(int start, int end) {
        String result = "";

        for (int number = start; number < end; number++) {
            result += number + " ";
        }

        return result;
    }

    private void run() throws Exception {
        if (writeToFile) {
            out = new PrintStream(new FileOutputStream(OUT));
        }
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            out.print("Case #" + i + ": ");
            System.out.println("Case #" + i + ": ");
            solve();
        }
        sc.close();
        out.close();
    }

    public static void main(String args[]) throws Exception {
        new D().run();
    }
}
