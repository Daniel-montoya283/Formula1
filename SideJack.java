public class SideJack extends TeamMember {

    //Contiene 4 atributos:
    //Los ha heredado de TeamMember por lo que le pertenecen a la clase
    //name
    //working
    //team
    //exclusive

    public SideJack(String name, boolean exclusive, String team){
        super(name, exclusive, team);
    }

    public SideJack(String name){
        super(name);
    }
    
    public void setUpJack(RacingCar actualCar, boolean side){

        // true = derecha, false = izquierda
        if(side == true){
            actualCar.rightSideJackStatus(true);
        }
        
        if(side == false){
            actualCar.leftSideJackStatus(true);
        }

    }

    public void removeJack(RacingCar actualCar, boolean side){

        if(side == true){
            actualCar.rightSideJackStatus(false);
        }

        if(side == false){
            actualCar.leftSideJackStatus(false);
        }
    }

    @Override
    public void toGreet() {
        System.out.println("Hi im the side jack man " + super.name);
    }
}
