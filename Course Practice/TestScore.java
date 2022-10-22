import java.util.Scanner;

public class TestScore{
    public static void main(String [] args){
    System.out.println("Enter your name and three test Scores:  ");
    Scanner input = new Scanner(System.in);

    String name = input.nextLine();
    float testResult1 = input.nextFloat();
    float testResult2 = input.nextFloat();
    float testResult3 = input.nextFloat();

    float total  = testResult1+ testResult2+testResult3;
    float avg = (total/3);
    System.out.println("Your name and total Scores plus average are:  " + name + " "+ total+" "+ avg);
    input.close();
}
}