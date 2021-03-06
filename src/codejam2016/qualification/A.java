//Status:
//    A-small: correct
//    A-large: correct
package codejam2016.qualification;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class A {
    Scanner sc = new Scanner(getClass().getResourceAsStream(IN));
    static final String PATH = "src/codejam2016/qualification/";
    static final String FILENAME = "A-small-practice";
    static final String IN = FILENAME + ".in";
    static final String OUT = PATH + FILENAME + ".out";
    PrintStream out = System.out;
    PrintWriter outFile;
    boolean writeToFile = true;

    private void solve() throws IOException {
        int n = sc.nextInt();
        int ans = 0;
        int i = 1;
        Integer[] arr = new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int length = arr.length;

        if (n != 0) {
            while (length > 0) {
                ans = n * i;
                String nString = Integer.toString(ans);

                for (int j = 0; j < arr.length; j++) {
                    for (int k = 0; k < nString.length(); k++) {
                        if (Character.getNumericValue(nString.charAt(k)) == arr[j]) {
                            arr[j] = 99;
                            length -= 1;

                            break;
                        }
                    }

                }

                i++;
            }

            out.println(ans);
            System.out.println(ans);
        } else {
            out.println("INSOMNIA");
            System.out.println("INSOMNIA");
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
