package exercises;
import java.util.Scanner;
public class AreaOfRect {

    public static void main (String[]args) {
        Scanner input = new Scanner((System.in));
        System.out.print("Enter the length: ");
        int l = input.nextInt();
        System.out.print("Enter the width: ");
        int w = input.nextInt();
        System.out.println(w * l + " is the area!");
    }
}
