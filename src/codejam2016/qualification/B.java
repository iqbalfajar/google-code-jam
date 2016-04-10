//Status:
//    B-small: correct
//    B-large: correct
package codejam2016.qualification;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class B {
    Scanner sc = new Scanner(getClass().getResourceAsStream(IN));
    static final String PATH = "src/codejam2016/qualification/";
    static final String FILENAME = "B-large";
    static final String IN = FILENAME + ".in";
    static final String OUT = PATH + FILENAME + ".out";
    PrintStream out = System.out;
    boolean writeToFile = true;

    private void solve() throws IOException {
        int ans = 0;
        StringBuilder stack = new StringBuilder(sc.next());

        while (stack.toString().contains("-")) {
            for (int i = stack.length(); i > 0; i--) {
                if (stack.charAt(i - 1) == '-') {
                    for (int j = 0; j < i; j++) {
                        if (stack.charAt(j) == '+')
                            stack.setCharAt(j, '-');
                        else
                            stack.setCharAt(j, '+');
                    }
                    ans++;
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
