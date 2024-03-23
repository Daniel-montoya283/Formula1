public class RearJack extends TeamMember{

    //Contiene 4 atributos:
    //Los ha heredado de TeamMember por lo que le pertenecen a la clase
    //name
    //working
    //team
    //exclusive
    
    public RearJack(String name, boolean exclusive, String team){
        super(name, exclusive, team);
    }

    public void setUpJack(RacingCar actualCar){
        actualCar.rearJackStatus(true);
    }

    public void removeJack(RacingCar actualCar){
        actualCar.rearJackStatus(false);
    }

    @Override
    public void toGreet() {
        System.out.println("Hi!! im " + super.name + " and im the rear jack");
    }

}
