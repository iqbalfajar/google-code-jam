//Saving The Universe Again

package codejam2018.qualification.A;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {

    private static int calcDamage(StringBuilder p) {
        int damage = 0;
        int s = 1;

        for (int j = 0; j < p.length(); j++) {
            if (p.charAt(j) == 'C') {
                s = s * 2;
            } else {
                damage += s;
            }
        }

        return damage;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(
                new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt(); // Scanner has functions to read ints, longs,
                              // strings, chars, etc.
        for (int i = 1; i <= t; ++i) {
            int d = in.nextInt();
            StringBuilder p = new StringBuilder(in.next());
            int ans = 0;

            int damage = calcDamage(p);

            while (damage > d) {
                for (int j = p.length() - 2; j >= 0; j--) {
                    if (p.charAt(j) == 'C' && p.charAt(j + 1) == 'S') {
                        p.setCharAt(j, 'S');
                        p.setCharAt(j + 1, 'C');
                        break;
                    }
                }

                ans++;

                int newDamage = calcDamage(p);

                if (newDamage == damage) {
                    ans = -1;
                    break;
                }

                damage = newDamage;
            }

            if (ans >= 0) {
                System.out.println("Case #" + i + ": " + ans);
            } else {
                System.out.println("Case #" + i + ": " + "IMPOSSIBLE");
            }
        }
    }

}
