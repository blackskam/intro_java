import java.util.Arrays;
import java.util.Random;


public class HomeWork1 {
    public static void main(String[] args) {
        int k = 2000;
        int i = new Random().nextInt(k);
        System.out.println(i);
        int n = Integer.toBinaryString(i).length() - 1;
        System.out.println(n);
        int[] m1 = new int[0];
        for (int s = i; s < Short.MAX_VALUE; s++){
            if (s % n == 0) {
                int[] tmp = new int[m1.length + 1];
                for (int p = 0; p < m1.length; p++) {
                    tmp[p] = m1[p];
                }
                m1 = tmp;
                m1[m1.length - 1] = s;
            }
        }
       for (int s = 0; s < m1.length; s++) {
           System.out.println(m1[s]);
       }
        int[] m2 = new int[0];
        for (int s = Short.MIN_VALUE; s < i; s++){
            if (s % n != 0) {
                int[] tmp = new int[m2.length + 1];
                for (int p = 0; p < m2.length; p++) {
                    tmp[p] = m2[p];
                }
                m2 = tmp;
                m2[m2.length - 1] = s;
            }
        }
        for (int s = 0; s < m2.length; s++) {
            System.out.println(m2[s]);
        }
    }
}
