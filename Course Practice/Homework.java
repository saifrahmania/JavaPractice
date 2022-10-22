import java.util.ArrayList;

public class Homework {
    public static void main(String []args){
        ArrayList <String> team = new ArrayList<String>(5);
        team.add("Nela");
        team.add("Nowshin");
        team.add("Afif");
        team.add("Tahsin");
        team.add("Mariam");

        System.out.println("Team Before Windows:  ");
        for(String s :team){
            System.out.println(s);
        }
        team.add("Joy");
        team.add("Bangla");
        team.add("Bongo");

        System.out.println("Team After Windows:  ");
        for(String s :team){
            System.out.println(s);
        }
    }
    
}
