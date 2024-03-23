public class TyreGunner extends TeamMember{

    //Contiene 4 atributos:
    //Los ha heredado de TeamMember por lo que le pertenecen a la clase
    //name
    //working
    //team
    //exclusive

    private String name;

    public TyreGunner(String name){
        super(name);
    }

    public void modifyFrontLeftBolts(RacingCar actualCar, boolean status){ 

        actualCar.frontLeftBoltsStatus(status); 
    }

    public void modifyFrontRightBolts(RacingCar actualCar, boolean status){

        actualCar.frontRightBoltsStatus(status);
    }

    public void modifyRearLeftBolts(RacingCar actualCar, boolean status){

       actualCar.rearLeftBoltsStatus(status);
    }

    public void modifyRearRightBolts(RacingCar actualCar, boolean status){

        actualCar.rearRightBoltsStatus(status);
        
    }

    @Override
    public void toGreet() {
        System.out.println("Hi! im " + super.name + " and im a TyreGunner");
    }
    
}
