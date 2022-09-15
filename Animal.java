public class Animal {
    private static int numberOfAnimals = 0;
    public int length = 19;
    public String color;
    public String name;
    public double weight;
    public boolean hasFur;
    public boolean isHungry;

    public Animal(String Name,int length,double Weight, String Color, boolean fur, boolean Hungry){ 
        /*
         * This is a constructor whose purpose is to create an object of this Animal class
         * when the constructor will be called to create a new object.
         */
        color = Color;
        weight = Weight;
        hasFur = fur;
        isHungry = Hungry;
        name = Name;
        numberOfAnimals ++;

    }

    public String walk(){
        return "Animal is walking";
    }
    
    public String eat(){
        isHungry = false;
        weight+=1;
        return "Animal has eated\n" +"Animal now weight:  " +weight+" pounds";
    }

    public String getLength(){
        return "Animal's length is  "+ length;
    }
}
