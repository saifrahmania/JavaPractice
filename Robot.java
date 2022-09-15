public class Robot{
    private int speed;
    private int calculations;
    private int chargeLevel = 3;

    public Robot(int MoveSpeed, int Calcs){
        speed = MoveSpeed;
        calculations = Calcs;
    }

    public void Calculate(){
        if (chargeLevel>3){
            chargeLevel --;
            System.out.println("Robot is doing" + calculations + "Calculations. Battery power is now at" + chargeLevel);

        }
        else{
            System.out.println("Robot's Battery is dead, it needs to be recharged");
        }
    }

    public void move(){
        if(chargeLevel>0){
            chargeLevel --;
            System.out.print("Robot is moving at a speed of " +speed+". Battery power is now at "+ chargeLevel);
        }else{
            System.out.println("Battery is dead and it needs to be recharged.");
        }
    }

    public void Charge(){
        chargeLevel = 3;
        System.out.println("Robot is Charged. Battery is now at: " +chargeLevel);
    }

}