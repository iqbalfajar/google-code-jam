//Status:
//    C-small: correct
//    C-large: not submitted
package codejam2018.qualification;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class C {
    Scanner sc = new Scanner(getClass().getResourceAsStream(IN));
    static final String PATH = "src/codejam2018/qualification/";
    static final String FILENAME = "C-large";
    static final String IN = FILENAME + ".in";
    static final String OUT = PATH + FILENAME + ".out";
    PrintStream out = System.out;
    PrintWriter outFile;
    boolean writeToFile = true;

    private void solve() throws IOException {

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
