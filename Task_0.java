import java.util.Scanner;

public class Task_0 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give me jewels:");
        String jewels = input.next();
        System.out.println("Give me stones:");
        String stones = input.next();
        char[] jewel = jewels.toCharArray();
        int[] counter = new int [stones.length()];;
        for (int j = 0; j < jewels.length(); j++) {
            for (int i = 0; i < stones.length(); i++) {
                if (stones.charAt(i) == jewel[j]) {
                counter[j]++;
                }
            }
        }
        System.out.println("Sample Output");
        for (int j = 0; j < jewels.length(); j++) {
        System.out.print(jewel[j]);
        System.out.print(counter[j]);
        }
    }
}