package week2.arrays;

import java.util.Arrays;

public class CopyingArrays {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        for (int i = 0; i < 10; i ++){
            double r = (Math.random() * 100 + 1);
            int random = (int)r;
            array1[i] = random;
        }

        int[] array2 = array1.clone();
        array1[9] = -7;


        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}
