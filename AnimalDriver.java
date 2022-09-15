public class AnimalDriver {
    public static void main(String [] args) {
        Animal myDog= new Animal("Sparky",19, 56.4, "brown", true, true);
        Animal yourDog = new Animal("Rover", 17, 41.8, "grey", true, true);

        System.out.println(myDog.walk());
        System.out.println(myDog.eat());
        System.out.println(myDog.getLength());
        System.out.println(yourDog.walk());
        System.out.println(yourDog.eat());
        System.out.println(yourDog.getLength());
    
    }
}
