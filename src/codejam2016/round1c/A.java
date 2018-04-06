//Status:
//    A-small: 
//    A-large: 
package codejam2016.round1c;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class A {
    Scanner sc = new Scanner(getClass().getResourceAsStream(IN));
    static final String PATH = "src/codejam2016/round1c/";
    static final String FILENAME = "A-test";
    static final String IN = FILENAME + ".in";
    static final String OUT = PATH + FILENAME + ".out";
    PrintStream out = System.out;
    PrintWriter outFile;
    boolean writeToFile = true;

    private void solve() throws IOException {
        int N = sc.nextInt();
        int[] P = new int[N];
        int ascii = 65;
        int senators = 0;
        String ans = "";

        for (int i = 0; i < N; i++) {
            P[i] = sc.nextInt();
            senators += P[i];
        }

        // do logic
        int idx = 0;
        while (senators > 0) {
            if (idx % 2 == 0 && idx != 0) {
                out.print("-");
                System.out.print("-");
            }

            int party = 0;
            int max = 0;
            for (int i = N - 1; i >= 0; i--) {
                if (P[i] >= max) {
                    max = P[i];
                    party = ascii + i;
                }
            }

            char ch = (char) (party);
            out.print(ch);
            System.out.print(ch);

            if (P[party - ascii] <= 1) {
                out.print("-");
                System.out.print("-");
                idx = 0;
            } else {
                idx++;
            }
            P[party - ascii]--;

            senators--;
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
