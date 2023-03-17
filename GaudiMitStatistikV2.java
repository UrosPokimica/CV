import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GaudiMitStatistikV2 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(100);
        }
        int begin = 0;
        for (int i = 0; i <= a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    begin = a[i];
                    a[i] = a[j];
                    a[j] = begin;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}