public class Animal {
    private static int numberOfAnimals = 0;
    public int length;
    public String color;
    public double weight;
    public boolean hasFur;
    public boolean isHungry;

    public Animal(int length,double Weight, String Color, boolean fur, boolean Hungry){
        color = Color;
        weight = Weight;
        hasFur = fur;
        isHungry = Hungry;
        numberOfAnimals ++;

    }
    
}
