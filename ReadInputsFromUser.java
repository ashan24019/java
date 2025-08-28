import java.util.Scanner;

public class ReadInputsFromUser {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Name:");
        String name = scanner.nextLine().trim();
        System.out.println("Your name is "+name);
    }
}
