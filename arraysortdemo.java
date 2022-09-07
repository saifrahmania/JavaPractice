import java.util.Arrays;
public class arraysortdemo {
    public static void main(String [] args){
        String[] groceries = {"oranges", "apples", "milk", "butter", "bread", "papper", "salt", "sugar", "pears"};

        System.out.println("Unsorted Array");
        for(int x = 0;x<groceries.length;x++){
            System.out.println(groceries[x]+ ' ');

        }
        System.out.println("Sorted Array");
        Arrays.sort(groceries);
        for(int x = 0;x<groceries.length;x++){
            System.out.println(groceries[x]+ ' ');
        }
        System.out.println();
    }
    
}
