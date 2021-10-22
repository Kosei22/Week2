package week2.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class WhereIsIt {
    public static void main(String[] args) {
        int[] array = new int[10];
        String str = "Array:";
        for (int i = 0; i < 10; i++) {
            double r = (Math.random() * 50 + 1);
            int random = (int) r;
            array[i] = random;
            str += random + " ";
        }

        System.out.println(str);

        Scanner input = new Scanner(System.in);
        System.out.println("Value to find:");
        int find = input.nextInt();
        int n;
        int notFound = 0;
        for (int i = 0; i < array.length; i ++) {
            if (array[i] == find) {
                n = i;
                System.out.println(find + " is in slot " + i);
            } else {
                notFound ++;
            }             
        }
            if (notFound == array.length){
                System.out.println(find + " is not in the array");

            }
    }
}


