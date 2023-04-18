import java.util.Scanner;
import java.util.Arrays;

public class Task_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();  
        String[] recipes = new String[n]; 
        for (int i = 0; i < n; i++) {
            recipes[i] = input.next();
        } 
        int m = input.nextInt();
        String[] replases = new String[m];
        for (int j = 0; j < m; j++) {
            replases[j] = input.next();
        } 
        String[] sep_replases = new String[2];
        for (int j = 0; j < m; j++) {
            sep_replases = replases[j].split("-");
            //System.out.println(Arrays.toString(sep_replases));
        }
        String[] new_recipes = new String[n];
        for(int i = 0; i < n; i++) {
            new_recipes[i] = recipes[i].replace(sep_replases[0], sep_replases[1]);
        } 
    }
}
