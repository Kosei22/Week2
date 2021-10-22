package week2.arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class FindingValueInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            double r = (Math.random() * 100 + 1);
            int random = (int) r;
            arrayList.add(random);
        }
        System.out.println("ArrayList: " + arrayList);

        Scanner find = new Scanner(System.in);
        System.out.println("Value to find: ");
        int num = find.nextInt();

        for (int i = 0; i < 10; i++){
            if(arrayList.get(i) == num){
                System.out.println(num + " is in the list");
            }
        }
    }
}
