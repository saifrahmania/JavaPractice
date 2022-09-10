

import java.util.*;
public class ArrayLists{
    public static void main (String[]args){
        ArrayList <String> language = new ArrayList <String>(3);
        language.add("englisn");
        language.add("french");
        language.add("italian");
        System.out.println(language.size());
        language.add("German");
        System.out.println(language.size());
        //Accessing element indiviually
        System.out.println(language.get(3));        
        
    }
}
