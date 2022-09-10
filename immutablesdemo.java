import java.util.List;

import java.util.*;
public class immutablesdemo {
    public static void main(String [] args){
        String[] turn = {"600","800","1024","1280","1366","1920"};
        List <String> list = java.util.Arrays.asList(turn);
        List <String> unmodlist = Collections.unmodifiableList(list);

        for(String p:unmodlist){
            System.out.println(p);
        }
        
        System.out.print(unmodlist.get(0));
        System.out.println();
        
    }
    
}
