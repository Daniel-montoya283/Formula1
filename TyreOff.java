public class TyreOff extends TeamMember{

    //Contiene 4 atributos:
    //Los ha heredado de TeamMember por lo que le pertenecen a la clase
    //name
    //working
    //team
    //exclusive

    private boolean holdingTyre;
    private boolean running;

    public TyreOff(String name){
        super(name);
        this.holdingTyre = false;
        this.running = false;
    }
    
    public void carryTyre(){
        this.holdingTyre = true;
    }

    public void leaveTyre(){
        this.holdingTyre = false;
    }

    public void running(boolean status){
        this.running = status;
    }

    public void tellAction(){

        System.out.println("im " + super.name);

        if(this.holdingTyre == true){
            System.out.print("im actually holding the tyre ");

            if(this.running == true){
                System.out.print("and im running");
                System.out.println();

            } else {
                System.out.print("but im not running");
                System.out.println();
            }

        } else {
            System.out.print("im ready to remove the tyre ");

            if(this.running == true){
                System.out.println("and im actually running to it!");
            } else {

                System.out.println("and im ready to run as fast as possible");
            }
        }
    }
    
    @Override
    public void toGreet() {
       System.out.println("Hi! im " + super.name + " and im a Tyre Off");
    }
}
