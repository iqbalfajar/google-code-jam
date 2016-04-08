package codejam2016.qualification;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class B {
    Scanner sc = new Scanner(getClass().getResourceAsStream(IN));
    static final String PATH = "src/codejam2016/qualification/";
    static final String FILENAME = "B";
    static final String IN = FILENAME + ".in";
    static final String OUT = PATH + FILENAME + ".out";
    PrintStream out = System.out;
    boolean writeToFile = true;

    private void solve() throws IOException {
        int ans = 0;
        int diners = sc.nextInt();
        ArrayList<Integer> plates = new ArrayList<Integer>();
        int pancakes = 0;

        System.out.println("diners:" + diners);
        for (int i = 0; i < diners; i++) {
            plates.add(sc.nextInt());
            System.out.println("plates" + i + ":" + plates.get(i));
            pancakes += plates.get(i);
        }

        // while (pancakes > 0) {
        // ans++; //minutes++
        //
        //
        // }

        System.out.println("ans:" + ans);
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
