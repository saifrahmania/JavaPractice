public class VehicleDriver {
    public static void main(String [] args){
        Vehicle trasnportationMachine = new Vehicle(50, "Blue", 210, false);
        
        System.out.println(trasnportationMachine.startMoving());
        System.out.println(trasnportationMachine.stopMoving());

        GroundVehicle horseAndBuggy = new GroundVehicle(5, "Black", 300, false, 4, "Horse and Buggy");

        String result = horseAndBuggy.startMoving();
        System.out.println(result);
    }
    
}
