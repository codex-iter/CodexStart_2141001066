/*
 * Name: Saket Aryan
 * Reg No: 2141001066
 * PS LINK: https://cses.fi/problemset/task/1157/
 */

import java.util.Scanner;

public class Q1_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long y = sc.nextLong();
        long x = sc.nextLong();
        y--;
        x--;
        long m = Math.max(y, x);
        long k = 1;
        while (k * 4 <= m) {
            k *= 4;
        }
        long c = 0;
        while (k > 0) {
            long a = y / k;
            long b = x / k;
            if (a + b == 3) {
                c += 3 * k;
            } else {
                c += Math.abs(a - b) * k;
            }
            y %= k;
            x %= k;
            k /= 4;
        }
        System.out.println(c);
    }
}
