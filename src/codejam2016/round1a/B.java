//Status:
//    B-small: 
//    B-large: 
package codejam2016.round1a;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class B {
    Scanner sc = new Scanner(getClass().getResourceAsStream(IN));
    static final String PATH = "src/codejam2016/round1a/";
    static final String FILENAME = "B-example";
    static final String IN = FILENAME + ".in";
    static final String OUT = PATH + FILENAME + ".out";
    PrintStream out = System.out;
    boolean writeToFile = true;

    private void solve() throws IOException {
        int N = sc.nextInt();
        int ans = 0;
        int[][] lists = new int[2 * N][N];

        System.out.println(N);
        for (int i = 0; i < (2 * N) - 1; i++) {
            for (int j = 0; j < N; j++) { // lines
                lists[i][j] = sc.nextInt();
                // System.out.print(soldiers[i][j] + " ");
            }
            // System.out.println();
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
