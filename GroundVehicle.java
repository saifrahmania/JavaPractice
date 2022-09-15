public class GroundVehicle extends Vehicle{
    int numWheels;
    String vehicleType;
    public GroundVehicle(int setSpeed, String setColor, double setWeight, boolean tellIfMoving,int setNumWheel, String type){
        super(setSpeed, setColor, setWeight, tellIfMoving);
        numWheels = setNumWheel;
        vehicleType = type;
    }

    public String startMoving(){
        isMoving = true;
        return vehicleType +" is driving";
    }

    public String stoptMoving(){
        isMoving = false;
        return vehicleType +" is not driving";
    }

    public String whatColor(){
        return color;
    }

    
}
