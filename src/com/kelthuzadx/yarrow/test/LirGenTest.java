package com.kelthuzadx.yarrow.test;

import java.util.ArrayList;

public class LirGenTest {
    private static final int[] arr = new int[3];
    private static int k = 0;

    public static int lirGen1(int n) {
        int a = n;
        int b = a + 1;
        int c = b + 2;
        int d = a + b + c;
        long e = d;
        float f = e;
        double g = f;
        short h = (short) g;
        byte i = (byte) h;
        char j = (char) i;
        int k = j;
        k <<= 1;
        k >>>= 3;
        k >>= 3;
        k &= 12;
        k |= 123;
        k ^= 342;
        k &= n;
        k = -12;
        k = -b;
        Object o = new Object();
        o = new int[25];
        o = new StringBuilder[32];
        int[] p = new int[50];
        k += p.length;
        double cmp1 = 123.4d;
        double cmp2 = n + 32.;
        boolean t = cmp1 == cmp2;
        long cmp3 = 21;
        long cmp4 = n + 32;//89
        t = (cmp4 == cmp3);
        Object multi = new int[2][4][5];
        t = multi instanceof Object[];
        o = new ArrayList<>();
        //t = ((ArrayList) o).add(new Object());
        if (true) {
            k = 12 + 23;
        }
        return k;
    }

    public static int lirGen2(int n) {
        int k = n + 1;
        if (k > 20) {
            k = 1 + k;
        } else {
            k = 3 * k;
        }
        switch (k) {
            case 1:
                k += 1;
                break;
            case 2:
                k += 2;
                break;
            case 3:
                k += 3;
                break;
            default:
                k += -1;
        }
        switch (k) {
            case 132:
                k += 13;
                break;
            case 23:
                k += 23;
                break;
            case 32:
                k += 33;
                break;
            default:
                k += -13;
        }
        return k;
    }

    public static int lirGen3(int i) {
        int t;
        if (i > 3) {
            k = 32; // Store
            t = k + 1; // Load
        } else {
            arr[0] = 1;
            arr[1] = 2;
            arr[2] = 3;
            t = arr[0];
            t = arr[1];
            t = arr[2];
            t = 6 - t;
            t = 6 * t;
            t = t / 12;
            t = 6 % t;
        }
        return t;
    }

    public static void foo(String a, String b, int k, double d, char c, byte bb, String p1, String p2, Object p3) {
    }

    public static void lirGen4(int i) {
        int k = i + 2;
        if (k > 100) {
            String s = "sss";
            Object obj = new Object();
            foo("hello", "world", k, 6.28, 's', (byte) 5, "ss", s, obj);
        }
    }


    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            lirGen1(i);
            lirGen2(i);
            lirGen3(i);
            lirGen4(i);
        }
    }
}
