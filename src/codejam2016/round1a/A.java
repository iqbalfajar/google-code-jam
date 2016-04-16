//Status:
//    A-small: correct
//    A-large: submitted
package codejam2016.round1a;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class A {
    Scanner sc = new Scanner(getClass().getResourceAsStream(IN));
    static final String PATH = "src/codejam2016/round1a/";
    static final String FILENAME = "A-large";
    static final String IN = FILENAME + ".in";
    static final String OUT = PATH + FILENAME + ".out";
    PrintStream out = System.out;
    PrintWriter outFile;
    boolean writeToFile = true;

    private void solve() throws IOException {
        String S = sc.next();
        String ans = "";

        for (int i = 0; i < S.length(); i++) {
            // do logic
            if (i == 0 || S.charAt(i) >= ans.charAt(0)) {
                ans = S.charAt(i) + ans;
            } else {
                ans += S.charAt(i);
            }
        }

        out.println(ans);
        System.out.println(ans);
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
        new A().run();
    }
}
