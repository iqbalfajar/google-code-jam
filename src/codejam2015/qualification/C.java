//Status: not finished
package codejam2015.qualification;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class C {
    Scanner sc = new Scanner(getClass().getResourceAsStream(IN));
    static final String PATH = "src/codejam2015/qualification/";
    static final String FILENAME = "A-large";
    static final String IN = FILENAME + ".in";
    static final String OUT = PATH + FILENAME + ".out";
    PrintStream out = System.out;
    PrintWriter outFile;
    boolean writeToFile = true;

    private void solve() throws IOException {
        int ans = 0;
        int sMax = sc.nextInt();
        String persons = sc.next();
        int totalPerson = 0;
        int standingPerson = 0;

        int sumLevel = 0;
        for (int i = 0; i <= sMax; i++) {
            if (i != 0) {
                // System.out.println("standingPerson:"+standingPerson);
                // System.out.println("i:"+i);
                if (standingPerson < i
                        && Character.getNumericValue(persons.charAt(i)) > 0) {
                    int needed = (i - standingPerson);
                    ans += needed;
                    standingPerson += needed;
                }
            }
            // System.out.println("i:"+i);
            // System.out.println("standingPerson:"+standingPerson);
            // System.out.println("s"+Character.getNumericValue(persons.charAt(i)));
            standingPerson += Character.getNumericValue(persons.charAt(i));
            // System.out.println("standingPerson:"+standingPerson);
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
        new C().run();
    }
}
