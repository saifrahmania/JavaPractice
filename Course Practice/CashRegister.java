import java.util.Scanner;

public class CashRegister {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Product name:");
        String name = input.nextLine();
        System.out.println("Quantity:");
        int Quantity = input.nextInt();
        System.out.println("Price:");
        Double price = input.nextDouble();
        System.out.println("Tax Rate : i.e., 0.045, 0.05, etc");
        Double tax = input.nextDouble();

        System.out.println("Product: " +name);
        System.out.println("Quantity: "+Quantity);
        System.out.println("Price" +price);
        System.out.println("Tax: "+tax);
        double subtotal = price*Quantity;
        System.out.println("Subtotal: " +subtotal);
        double taxamount = subtotal*tax;
        System.out.println("Tax" +taxamount);
        double grandTotal = subtotal + taxamount;
        System.out.println("Grand Total: " +grandTotal);
        input.close();
        



    }
    
}
