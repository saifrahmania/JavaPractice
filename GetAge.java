import java.util.Scanner;

public class GetAge {
    public static void main (String[] args){
        Scanner getAge = new Scanner(System.in);
        System.out.println("How old are you ?");

        int age = getAge.nextInt();
        getAge.close();
        System.out.println("You are "+age+" years old");
    }
}
