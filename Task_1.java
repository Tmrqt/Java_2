import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give me final String s:");
        String s = input.next();
        System.out.println("Give me final int[] index:");
        int[] arr = new int [s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = input.nextInt();
        }
        char[] objects = s.toCharArray();
        char clipboard;
        System.out.println("Sample Output");
        for (int i = 0; i < s.length(); i++) {
            clipboard = objects[i];
            objects[i] = objects[arr[i] -1 ];
            objects[arr[i] - 1] = clipboard;
            System.out.print(objects[i]);
        }
    }
}
