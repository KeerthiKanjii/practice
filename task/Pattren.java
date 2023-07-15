package task;
import java.util.*;
public class Pattren{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println(i + " " + sum);
        }
    }
}