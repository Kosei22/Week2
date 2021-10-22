package week2.arrays;

public class BasicArrays2 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i ++){
            double random = (Math.random() * 100 + 1);
            System.out.println("Slot" + i + "countains a " + Math.round(random));
        }
    }
}
