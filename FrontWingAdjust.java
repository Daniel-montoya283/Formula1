public class FrontWingAdjust extends TeamMember {

    //Contiene 4 atributos:
    //Los ha heredado de TeamMember por lo que le pertenecen a la clase
    //name
    //working
    //team
    //exclusive
    
    public FrontWingAdjust(String name, boolean exclusive, String team){
        super(name, exclusive, team);
    }

    public void decreaseWingTightness(RacingCar actualCar){
        actualCar.adjustFrontWing(actualCar.getFrontWingTightness() - 5);
    }

    public void increaseWingTightness(RacingCar actualCar){
        actualCar.adjustFrontWing(actualCar.getFrontWingTightness() + 5);
    }

    @Override 
    public void toGreet() {
       System.out.println("My name is " + super.name + " and im doing the front wing adjust task!");
    }
}
