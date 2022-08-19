import java.io.*;
import java.util.Scanner;
public class Storage {
    public static void main( String[] args){
        Scanner grab = new Scanner(System.in);
        System.out.println("What is your name?");
        String name  = grab.nextLine();

        System.out.println("What is your email?");
        String mail  = grab.nextLine();

        System.out.println("What is your favorite band?");
        String band  = grab.nextLine();

        String fname = name.replaceAll(" ", "")+".txt";

        try{
             PrintWriter saver = new PrintWriter(fname);

             saver.println("Name:  "+ name);
             saver.println("Email:   "+ mail);
             saver.println("Band:  "+ band);
             saver.close();            
            }

            catch(FileNotFoundException e){
                System.out.println("Oh no!!, it did not work!");
            }

            System.out.println(name+" | "+mail+" | "+band+" has been stored to "+name+".txt");


    }
}
