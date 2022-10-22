import java.util.Scanner;

public class Loop {
    public static void main(String[]args){
        // int tracker =0;
        // while(tracker<100){
        //     System.out.println(tracker);
        //     tracker-=5;
        // }
        // Scanner bandName = new Scanner(System.in);
        // String band = " ";
        // while(!band.equals("XXX")){
        //     System.out.println("Name of the band you like or XXX if you want to break the loop");
        //     band = bandName.nextLine();
        //     if(!band.equals("XXX")){
        //         System.out.println(band + "Rocks!!");
        //     }
        //     else{
        //         System.out.println("Loop has been broken!!");
        //     }
        // }

        // for(int i = 0;i<100;i+=5){
        //     System.out.println(i);
        // }

        int height  =1;
        Scanner input = new Scanner(System.in);
        while(height!=0){
            System.out.println("Enter your height");
            height = input.nextInt();
            if (height==0){
                System.out.println("Goodbye");
            }
            else if(height<60){
                System.out.println("Sorry!! You are too short for this ride.");

            }
            else if (height >78){
                System.out.println("Sorry!! You are too tall for safely ride this Roller Coster.");
            }
            else{
                System.out.println("Congratulations!! Have fun in this ride.:-D");
            }

        }
        input.close();
    }
    
}
