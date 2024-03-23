public class FrontJack extends TeamMember{

    //Contiene 4 atributos:
    //Los ha heredado de TeamMember por lo que le pertenecen a la clase
    //name
    //working
    //team
    //exclusive
    
    public FrontJack(String name, boolean exclusive, String team){
        super(name, exclusive, team);
    }

    public void setUpJack(RacingCar actualCar){
        actualCar.frontJackStatus(true);
    }

    public void removeJack(RacingCar actualCar){
        actualCar.frontJackStatus(false);
    }

    @Override
    public void toGreet() {
        System.out.println("nice to meet you, im " + super.name + " and im the front jack");
    }
}
