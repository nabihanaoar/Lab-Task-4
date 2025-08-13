import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String Word = sc.nextLine();
        String reverse = "";
        for (int i = Word.length() - 1; i >= 0; i--) {
            reverse = reverse + Word.charAt(i);
        }
        System.out.println("Reversed Word: "+ reverse);
        sc.close();
    }
}