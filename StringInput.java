import java.util.Scanner;

public class StringInput {
    public static void main(String[] args){
        System.out.println("What is your name?");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        input.close();
        System.out.println("Hello " + name);
    }
}
