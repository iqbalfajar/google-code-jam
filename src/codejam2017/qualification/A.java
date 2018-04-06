//Status:
//    A-small: correct
//    A-large: correct
package codejam2017.qualification;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class A {
    Scanner sc = new Scanner(getClass().getResourceAsStream(IN));
    static final String PATH = "src/codejam2017/qualification/";
    static final String FILENAME = "A-large-practice";
    static final String IN = FILENAME + ".in";
    static final String OUT = PATH + FILENAME + ".out";
    PrintStream out = System.out;
    PrintWriter outFile;
    boolean writeToFile = true;

    private void solve() throws IOException {
        int ans = 0;
        StringBuilder stack = new StringBuilder(sc.next());
        int k = sc.nextInt();

        for (int i = 0; i <= stack.length() - k; i++) {
            if (stack.charAt(i) == '+')
                continue;

            for (int j = 0; j < k; j++) {
                if (stack.charAt(i + j) == '-')
                    stack.setCharAt(i + j, '+');
                else
                    stack.setCharAt(i + j, '-');
            }

            ans++;
        }

        for (int i = stack.length() - k + 1; i < stack.length(); i++) {
            if (stack.charAt(i) == '-') {
                ans = -1;
                break;
            }
        }

        if (ans < 0) {
            System.out.println("IMPOSSIBLE");
            out.println("IMPOSSIBLE");
        } else {
            System.out.println(ans);
            out.println(ans);
        }
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
